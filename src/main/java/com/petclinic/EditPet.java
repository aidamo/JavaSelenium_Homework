package com.petclinic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EditPet {
    WebElement updatePet;
    WebElement nameField;


    public EditPet(WebDriver webDriver){
        updatePet = webDriver.findElement(By.xpath("//*[contains(text(),'Update')]"));
        nameField = webDriver.findElement(By.xpath("//*[contains(@name,'name')]"));

    }


    public void editToNewName(WebDriver driver, String petName){
        nameField.click();
        nameField.clear();
        nameField.sendKeys(petName);
    }

    public void clickUpdatePet(WebDriver driver){
        updatePet.click();
    }


}
