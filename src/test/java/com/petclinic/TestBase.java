package com.petclinic;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class TestBase {
    WebDriver webDriver;

    @Before
    public void init() {
        webDriver= new ChromeDriver( );
        webDriver.get("http://j3r3my.mywire.org:81/petclinic/");
//        webDriver.get("http://bhdtest.endava.com/petclinic/");
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
    @After
    public void tearDown() {
        webDriver.quit();

    }
}
