package com.petclinic;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class EditVet {
    WebElement addSpecialty;
    WebElement addRadiology;
    WebElement saveVet;
    WebElement firstName;


    public EditVet(WebDriver webDriver) {
        //addSpecialty = webDriver.findElement(By.xpath("//*[contains(@class, 'mat-input-infix mat-form-field-infix')]"));
        addSpecialty = webDriver.findElement(By.className("mat-select-arrow-wrapper"));
        saveVet = webDriver.findElement(By.xpath("//*[contains(text(),'Save Vet')]"));
        firstName = webDriver.findElement(By.id("firstName"));
    }

    public void addSecondSpecialty(WebDriver driver){
        addSpecialty.click();
        addRadiology = driver.findElement(By.xpath("//*[contains(@class, 'mat-option-text')][contains(text(), 'radiology')]"));
        addRadiology.click();
//        addRadiology.sendKeys(Keys.ESCAPE);
        Actions actions = new Actions(driver);
        actions.moveToElement(firstName);
        actions.click();
        actions.build().perform();
    }

    public void clickSaveVet(WebDriver webDriver){
        saveVet.click();
    }
}