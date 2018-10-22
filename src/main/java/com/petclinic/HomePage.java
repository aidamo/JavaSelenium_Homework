package com.petclinic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {  //declararea elementelor
    private WebElement title;
    private WebElement header;
    private WebElement image;

    public HomePage (WebDriver webDriver){ //instantierea elementelor
        title=webDriver.findElement(By.xpath("//app-welcome/h1"));
        header=webDriver.findElement(By.xpath("//h2[contains(text(),'Welcome')]"));
        image=webDriver.findElement(By.className("img-responsive"));
    }
    public boolean TitleIsDisplayed() { return title.isDisplayed(); }
    public String GetHeaderText() {
        return header.getText();
    }
    public boolean ImageIsDisplayed () {
            return image.isDisplayed();
    }





}
