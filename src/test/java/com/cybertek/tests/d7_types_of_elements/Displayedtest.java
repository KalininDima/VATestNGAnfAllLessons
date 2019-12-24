package com.cybertek.tests.d7_types_of_elements;


import com.cybertek.utilites.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Displayedtest {

    @Test
    public void test(){
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/radio_buttons");

        WebElement blue = driver.findElement(By.id("id"));

        //verify is element displayed on screen, verify if visible
        Assert.assertTrue(blue.isDisplayed());

        driver.get("http://practice.cybertekschool.com/dynamic_loading/1/");

      //  verify element is displayed
        WebElement home = driver.findElement(By.id("Home"));
        Assert.assertTrue(home.isDisplayed());

        //  verify element is not displayed
        WebElement username = driver.findElement(By.id("username"));
        Assert.assertTrue(username.isDisplayed());


    }

}
