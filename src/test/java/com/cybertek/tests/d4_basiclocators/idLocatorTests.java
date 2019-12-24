package com.cybertek.tests.d4_basiclocators;

import com.cybertek.utilites.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class idLocatorTests {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("http://practice.cybertekschool.com/multiple_buttons");

       // WebElement element = driver.findElement(By.id("button_cool"));

        WebElement element = driver.findElement(By.id("disappearing_button"));

        String txt = element.getText();
        System.out.println("text : "+txt);
        element.click();

        driver.quit();
    }

}
