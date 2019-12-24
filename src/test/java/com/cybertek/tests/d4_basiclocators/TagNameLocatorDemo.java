package com.cybertek.tests.d4_basiclocators;

import com.cybertek.utilites.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TagNameLocatorDemo {
    public static void main(String[] args) {


        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("http://practice.cybertekschool.com/sign_up");

        WebElement fullName = driver.findElement(By.tagName("input"));
        fullName.sendKeys("Dmytroo");

        WebElement email = driver.findElement(By.name("email"));
        email.sendKeys("name@mail.com");

        WebElement buton = driver.findElement(By.tagName("button"));
        buton.click();

    }



}
