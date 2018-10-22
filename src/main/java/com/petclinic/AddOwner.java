package com.petclinic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddOwner {
    WebElement firstName;
    WebElement lastName;
    WebElement address;
    WebElement city;
    WebElement telephone;
    WebElement error;
    WebElement addOwnerButton;

    public AddOwner(WebDriver webDriver) {
        firstName = webDriver.findElement(By.id("firstName"));
        lastName = webDriver.findElement(By.id("lastName"));
        address = webDriver.findElement(By.id("address"));
        city = webDriver.findElement(By.id("city"));
        telephone = webDriver.findElement(By.id("telephone"));
        addOwnerButton = webDriver.findElement(By.xpath("//button[contains(text(),'Add Owner')]"));
    }

    public boolean addError(WebDriver webDriver) {
        firstName.sendKeys("Matei");
        lastName.sendKeys("Popescu");
        address.sendKeys("Muresilor nr.5");
        city.sendKeys("Bucuresti");
        telephone.sendKeys("hdhddudn");

        error = webDriver.findElement(By.className("help-block"));
        return error.isDisplayed();
    }
    public void add (WebDriver webDriver) {
        firstName.sendKeys("Matei");
        lastName.sendKeys("Popescu");
        address.sendKeys("Muresilor nr.5");
        city.sendKeys("Bucuresti");
        telephone.sendKeys("098766986");
    }
    public void removeChars(){
        telephone.clear();
    }
    public void clickAddButton(){
        addOwnerButton.click();
    }

}

