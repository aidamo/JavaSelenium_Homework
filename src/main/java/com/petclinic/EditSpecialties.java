package com.petclinic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EditSpecialties {
    WebElement updateSpecialty;
    WebElement nameField;


    public EditSpecialties(WebDriver webDriver){
        updateSpecialty = webDriver.findElement(By.xpath("//*[contains(text(),'Update')]"));
        nameField = webDriver.findElement(By.xpath("//*[contains(@name,'name')]"));

    }


    public void editToNewName(WebDriver driver, String specialty){
        nameField.click();
        nameField.clear();
        nameField.sendKeys(specialty);
    }

    public void clickUpdateSpecialty(WebDriver driver){
        updateSpecialty.click();
    }


}
