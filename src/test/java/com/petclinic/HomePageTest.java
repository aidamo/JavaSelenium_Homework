package com.petclinic;

import org.junit.Assert;
import org.junit.Test;

public class HomePageTest extends TestBase {
    public HomePage homePage;
    public NavigationPage navigationPage;
    public OwnersPage ownersPage;

    @Test
    public void findElement() {
        homePage = new HomePage(webDriver);
        Assert.assertTrue( homePage.TitleIsDisplayed());
        Assert.assertEquals("Welcome", homePage.GetHeaderText());
        Assert.assertTrue(homePage.ImageIsDisplayed());
        try {
            Thread.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void findOwner () {
        navigationPage = new NavigationPage(webDriver);
        navigationPage.GoToOwner();
        ownersPage = new OwnersPage(webDriver);
        Assert.assertTrue( ownersPage.isOwnerPresent("Betty Davis"));
    }





}
