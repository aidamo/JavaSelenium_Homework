package com.petclinic;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class OwnersPageTest extends TestBase {
    public NavigationPage navigationPage;
    public AddOwner addOwner;
    public OwnersPage ownersPage;

    @Test
    public void addNewOwner () {
        navigationPage = new NavigationPage(webDriver);
        navigationPage.GoClickAdd();
        addOwner = new AddOwner(webDriver);

       //addOwner.add(webDriver);
        Assert.assertTrue(addOwner.addError(webDriver));
//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
    }
    @Test
    public void add() {
        navigationPage = new NavigationPage(webDriver);
        navigationPage.GoClickAdd();
        addOwner = new AddOwner(webDriver);
        addOwner.add(webDriver);
        addOwner.clickAddButton();
        ownersPage = new OwnersPage(webDriver);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Assert.assertTrue(ownersPage.isOwnerPresent("Matei Popescu"));




    }


}
