package com.petclinic;

import org.junit.Assert;
import org.junit.Test;

public class PetsPageTest extends TestBase {
    public NavigationPage navigationPage;
    public PetsPage petsPage;
    public EditPet editPetPage;


    @Test
    public void addNewPet() {
        navigationPage = new NavigationPage(webDriver);
        navigationPage.goToPetsPage();

        petsPage = new PetsPage(webDriver);
        petsPage.clickAddPet(webDriver);
        petsPage.enterPetType(webDriver, "turtle");
        petsPage.clickSavePet(webDriver);

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    //}

   // @Test
   // public void editNewPet(){
        navigationPage = new NavigationPage(webDriver);
        navigationPage.goToPetsPage();

        petsPage = new PetsPage(webDriver);
        petsPage.editNewPet(webDriver, "turtle");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        editPetPage = new EditPet(webDriver);
        editPetPage.editToNewName(webDriver, "newTurtle");
        editPetPage.clickUpdatePet(webDriver);

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    //}

   // @Test
    //public void removeNewPet(){
        navigationPage = new NavigationPage(webDriver);
        navigationPage.goToPetsPage();

        petsPage = new PetsPage(webDriver);
        petsPage.deleteNewPet(webDriver, "newTurtle");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Assert.assertFalse("The pet is not present after delete!", petsPage.isPetPresent("newTurtle", webDriver));
   // }

   // @Test
   // public void goToHomepageFromPets(){
        navigationPage = new NavigationPage(webDriver);
        navigationPage.goToPetsPage();

        petsPage = new PetsPage(webDriver);
        petsPage.goToHomepage(webDriver);

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}