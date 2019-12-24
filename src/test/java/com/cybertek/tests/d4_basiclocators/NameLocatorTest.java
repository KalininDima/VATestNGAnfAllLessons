package com.cybertek.tests.d4_basiclocators;

import com.cybertek.utilites.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NameLocatorTest {
    public static void main(String[] args) {


        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("http://practice.cybertekschool.com/sign_up");

        WebElement fullName  = driver.findElement(By.name("full_name"));
        fullName.sendKeys("Dmytro");

        WebElement email = driver.findElement(By.name("email"));
        email.sendKeys("dmytro@gmail.com");

        WebElement button = driver.findElement(By.name("wooden_spoon"));
        button.click();

    }


}
