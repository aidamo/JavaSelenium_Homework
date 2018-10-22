package com.petclinic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NavigationPage{
    private WebElement Owners;
    private WebElement allOwners;
    private WebElement allVets;
    private WebElement AddNewOwner;
    private WebElement AddVet;
    //private WebElement PetTypes;
    private WebElement Veterinarians;
    private WebElement specialtiesPage;
    private WebElement petsPage;

    public  NavigationPage (WebDriver webDriver) {
        Owners = webDriver.findElement(By.className("dropdown-toggle"));
        AddNewOwner= webDriver.findElement(By.xpath("//a[@href='/petclinic/owners/add']"));
        allOwners = webDriver.findElement(By.xpath("//a[@href='/petclinic/owners']"));
        allVets = webDriver.findElement(By.xpath("//a[@href='/petclinic/vets']"));
        petsPage = webDriver.findElement(By.xpath("//a[@href='/petclinic/pettypes']"));
        specialtiesPage = webDriver.findElement(By.xpath("//a[@href='/petclinic/specialties']"));
        Veterinarians = webDriver.findElement(By.xpath("//*[contains(text(),'Veterinarians')]"));
        AddVet = webDriver.findElement(By.xpath("//a[@href='/petclinic/vets/add']"));
        //PetTypes=webDriver.findElement(By.className("dropdown"));

    }
public void GoToOwner() {
        Owners.click();
        allOwners.click();
    }
    public void GoClickAdd() {
        Owners.click();
        AddNewOwner.click();
    }
    public void GoClickAddOwner() {
        Owners.click();
        AddNewOwner.click();
    }
    public void GoToVetAndAdd() {
        Veterinarians.click();
        AddVet.click();
    }

    public void goToVetsPage(){
        Veterinarians.click();
        allVets.click();
    }

    public void goToPetsPage(){
        petsPage.click();
    }

    public void goToSpecialtiesPage(){
        specialtiesPage.click();
    }

    }





