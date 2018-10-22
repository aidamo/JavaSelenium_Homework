package com.petclinic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class VetsPage {
    private List<WebElement> vetsList;
    WebElement editVet;
    WebElement deleteVet;

    public VetsPage(WebDriver webDriver){
        vetsList = webDriver.findElements(By.xpath("*//tr/td[1]"));

    }

    public boolean isVetPresent(String vet, WebDriver driver){
        if(driver.findElements(By.xpath("*//tr[td//text()[contains(., '" + vet + "')]]")).size() > 0){
            return true;}
            else {
            return false;
        }
    }

    public void editVet(WebDriver driver){
        editVet = driver.findElement(By.xpath("*//tr[td//text()[contains(., 'Radu Ionescu')]]/td[3]//button[1]"));
        editVet.click();
    }

    public void deleteVet(WebDriver driver){
        deleteVet = driver.findElement(By.xpath("*//tr[td//text()[contains(., 'Radu Ionescu')]]/td[3]//button[2]"));
        deleteVet.click();
    }


}
