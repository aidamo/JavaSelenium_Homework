package com.petclinic;

import org.junit.Assert;
import org.junit.Test;

public class SpecialtiesPageTest extends TestBase {
    public NavigationPage navigationPage;
    public SpecialtiesPage specialtiesPage;
    public EditSpecialties editSpecialtiesPage;


    @Test
    public void testSpecialtiesPage() {
        navigationPage = new NavigationPage(webDriver);
        navigationPage.goToSpecialtiesPage();


        specialtiesPage = new SpecialtiesPage(webDriver);
        specialtiesPage.clickAddSpecialty(webDriver);
        specialtiesPage.enterSpecialtyType(webDriver,"emergency" );
        specialtiesPage.clickSaveSpecialty(webDriver);

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //edit Specialty
        navigationPage = new NavigationPage(webDriver);
        navigationPage.goToSpecialtiesPage();

        specialtiesPage = new SpecialtiesPage(webDriver);
        specialtiesPage.editNewSpecialty(webDriver, "emergency");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        editSpecialtiesPage = new EditSpecialties(webDriver);
        editSpecialtiesPage.editToNewName(webDriver, "newEmergency");
        editSpecialtiesPage.clickUpdateSpecialty(webDriver);

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //delete specialty
        navigationPage = new NavigationPage(webDriver);
        navigationPage.goToSpecialtiesPage();

        specialtiesPage = new SpecialtiesPage(webDriver);
        specialtiesPage.deleteNewPet(webDriver, "newEmergency");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Assert.assertFalse("The pet is not present after delete!", specialtiesPage.isSpecialtyPresent("newTurtle", webDriver));

    }
}