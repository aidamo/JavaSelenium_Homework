package com.petclinic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddVet {
    WebElement firstName;
    WebElement lastName;
    WebElement type;
    WebElement specialty;
    WebElement saveVet;

    public AddVet(WebDriver webDriver) {
        firstName = webDriver.findElement(By.id("firstName"));
        lastName = webDriver.findElement(By.id("lastName"));
        type = webDriver.findElement(By.id("specialties"));
        specialty = webDriver.findElement(By.xpath("//*[contains(text(),'surgery')]"));
        saveVet = webDriver.findElement(By.xpath("//*[contains(text(),'Save Vet')]"));
    }

    public void add (WebDriver webDriver) {
        firstName.sendKeys("Radu");
        lastName.sendKeys("Ionescu");
        specialty.click();

    }
    public void clickSaveVet(WebDriver webDriver){
        saveVet.click();
    }

}

