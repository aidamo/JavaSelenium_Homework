package com.petclinic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SpecialtiesPage {
    WebElement addSpecialty;
    WebElement enterSpecialtyName;
    WebElement saveSpecialty;
    WebElement editPet;

    public SpecialtiesPage(WebDriver webDriver){
        addSpecialty = webDriver.findElement(By.xpath("(//*[contains(text(), 'Add')])[3]"));
    }


    public void enterSpecialtyType(WebDriver driver, String specialtyName){
        enterSpecialtyName = driver.findElement(By.xpath("//*[contains(@id, 'name')]"));
        enterSpecialtyName.click();
        enterSpecialtyName.sendKeys(specialtyName);
    }

    public void editNewSpecialty(WebDriver driver, String specialtyName){
        editPet = driver.findElement(By.xpath("//*[contains(@ng-reflect-model, '"+specialtyName+"')]/../..//*[contains(text(),'Edit')]"));
        editPet.click();
    }

    public void deleteNewPet(WebDriver driver, String specialty){
        editPet = driver.findElement(By.xpath("//*[contains(@ng-reflect-model, '"+specialty+"')]/../..//*[contains(text(),'Delete')]"));
        editPet.click();
    }

    public void clickAddSpecialty(WebDriver driver){
        addSpecialty.click();
    }

    public void clickSaveSpecialty(WebDriver driver){
        saveSpecialty = driver.findElement(By.xpath("//*[contains(text(), 'Save')]"));
        saveSpecialty.click();
    }

    public boolean isSpecialtyPresent(String specialty, WebDriver driver){
        if(driver.findElements(By.xpath("//*[contains(@ng-reflect-model,'"+specialty+"')]")).size() > 0){
            return true;}
        else {
            return false;
        }
    }

}
