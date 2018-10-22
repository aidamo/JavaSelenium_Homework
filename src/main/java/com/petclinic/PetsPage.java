package com.petclinic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class PetsPage {
    private List<WebElement> vetsList;
    WebElement addPet;
    WebElement enterPetName;
    WebElement savePet;
    WebElement editPet;
    WebElement homepageButton;

    public PetsPage(WebDriver webDriver){
        addPet = webDriver.findElement(By.xpath("(//*[contains(text(), 'Add')])[3]"));
        homepageButton = webDriver.findElement(By.xpath("(//*[contains(text(),'Home')])[2]"));

    }


    public void enterPetType(WebDriver driver, String petName){
        enterPetName = driver.findElement(By.xpath("//*[contains(@id, 'name')]"));
        enterPetName.click();
        enterPetName.sendKeys(petName);
    }

    public void editNewPet(WebDriver driver, String petName){
        editPet = driver.findElement(By.xpath("//*[contains(@ng-reflect-model, '"+petName+"')]/../..//*[contains(text(),'Edit')]"));
        editPet.click();
    }

    public void deleteNewPet(WebDriver driver, String petName){
        editPet = driver.findElement(By.xpath("//*[contains(@ng-reflect-model, '"+petName+"')]/../..//*[contains(text(),'Delete')]"));
        editPet.click();
    }

    public void clickAddPet(WebDriver driver){
        addPet.click();
    }

    public void goToHomepage(WebDriver driver){
        homepageButton.click();
    }

    public void clickSavePet(WebDriver driver){
        savePet = driver.findElement(By.xpath("//*[contains(text(), 'Save')]"));
        savePet.click();
    }

    public boolean isPetPresent(String vet, WebDriver driver){
        if(driver.findElements(By.xpath("//*[contains(@ng-reflect-model,'"+vet+"')]")).size() > 0){
            return true;}
        else {
            return false;
        }
    }

}
