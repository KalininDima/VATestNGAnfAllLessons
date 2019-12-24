package com.cybertek.tests.d10_syncrinization;

import com.cybertek.utilites.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ThreadSleepExample {
    WebDriver driver;
    @AfterMethod
    public void teardownMehod()throws InterruptedException{
        Thread.sleep(3000);
        driver.quit();
    }

    @BeforeMethod
    public void setupMethod (){
        driver = WebDriverFactory.getDriver("chrome");
    }


    @Test
    public void switchWindowsTest() throws InterruptedException {
        driver.get("http://practice.cybertekschool.com/dynamic_loading/3");
        Thread.sleep(6000);
        driver.findElement(By.id("username")).sendKeys("gooduername");
    }
}
