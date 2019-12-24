package com.cybertek.tests.d3_web_element_classes;

import com.cybertek.utilites.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Verify URL not changed
 * open browser
 * go to http://practice.cybertekschool.com/forgot_password
 * click on Retrieve password
 * verify that url did not change
 */
public class VerifyIRLNotChanged {

    public static void main(String[] args) {

        //open chrome

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        //http://practice.cybertekschool.com/forgot_password
        driver.get("http://practice.cybertekschool.com/forgot_password");


        //save the expected url
        String expectedURL = driver.getCurrentUrl();

        //click on Retrieve password
        WebElement retrievePassword  =driver.findElement(By.id("form_submit"));

        retrievePassword.click();

        // verufy that url did not change
        String actualUrl = driver.getCurrentUrl();

        if (actualUrl.equals(expectedURL)){
            System.out.println("PASS");
        } else {
            System.out.println("Fail");
        }
    }




}
