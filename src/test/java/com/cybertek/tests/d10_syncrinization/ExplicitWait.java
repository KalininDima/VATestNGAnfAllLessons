package com.cybertek.tests.d10_syncrinization;

import com.cybertek.utilites.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ExplicitWait {

    WebDriver driver;

    @BeforeMethod
    public void setupMethod() {
        driver = WebDriverFactory.getDriver("firefox");
    }

    @AfterMethod
    public void teardownMethod() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }

    @Test
    public void test1WaitForVisible(){
        driver.get("http://practice.cybertekschool.com/dynamic_loading/1");

        // click on start
        driver.findElement(By.tagName("button")).click();

        // finding element that is not visible
        WebElement username = driver.findElement(By.id("username"));

        // Create explicit wait object
        WebDriverWait wait = new WebDriverWait(driver, 10);
        // actually
        wait.until(ExpectedConditions.visibilityOf(username));
        username.sendKeys("Bibish (sorry Tural)");
    }

    @Test
    public void test2ToBeEnabled(){
        driver.get("http://practice.cybertekschool.com/dynamic_controls");
        //click enable
        driver.findElement(By.cssSelector("button[onclick='swapInput()']")).click();
        // find the input field

        WebElement input = driver.findElement(By.cssSelector("input[type='text']"));

        WebDriverWait wait = new WebDriverWait(driver, 10);

        //wait for element to be clickable
        wait.until(ExpectedConditions.elementToBeClickable(input));

        input.sendKeys("Olessya Foxborn");


    }
}