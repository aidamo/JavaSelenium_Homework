package com.petclinic;

import org.junit.Assert;
import org.junit.Test;

public class VetPageTest extends TestBase{
    public NavigationPage navigationPage;
    public AddVet addVet;
    public VetsPage vetsPage;
    public VetsPage vetsPage2;
    public EditVet editVetPage;


    @Test
    public void addNewVet () {
        navigationPage = new NavigationPage(webDriver);
        navigationPage.GoToVetAndAdd();

        addVet = new AddVet(webDriver);
        addVet.add(webDriver);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        addVet.clickSaveVet(webDriver);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
        @Test
    public void editAddedVet(){
        navigationPage = new NavigationPage(webDriver);
        navigationPage.goToVetsPage();
        vetsPage = new VetsPage(webDriver);
        vetsPage.editVet(webDriver);

        editVetPage = new EditVet(webDriver);
        editVetPage.addSecondSpecialty(webDriver);
        editVetPage.clickSaveVet(webDriver);

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    @Test
    public void removeAddedVet () {
        navigationPage = new NavigationPage(webDriver);
        navigationPage.goToVetsPage();
        vetsPage = new VetsPage(webDriver);
        vetsPage.deleteVet(webDriver);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        vetsPage2 = new VetsPage(webDriver);
        Assert.assertFalse("The vet is not present after delete!", vetsPage2.isVetPresent("Radu Ionescu", webDriver));

    }


}
