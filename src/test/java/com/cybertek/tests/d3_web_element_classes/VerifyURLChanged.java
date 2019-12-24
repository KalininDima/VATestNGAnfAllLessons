package com.cybertek.tests.d3_web_element_classes;

import com.cybertek.utilites.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VerifyURLChanged {

    /**
     * open browser
     * go to http://practice.cybertekschool.com/forgot_password
     * enter any email
     * click on Retrieve password
     * verify that url changed to http://practice.cybertekschool.com/email_sent
     */
    public static void main(String[] args) {


        //open browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        //go to http://practice.cybertekschool.com/forgot_password
        driver.get("http://practice.cybertekschool.com/forgot_password");
        //enter any email
        WebElement emailInput = driver.findElement(By.name("email"));
        //sendKeys ---> enter given text

        emailInput.sendKeys("qwerty@gmail.com");

        //click on retrive password

        WebElement retrivePassword = driver.findElement(By.id("form_submit"));
        retrivePassword.click();

        //verify to url changed

        String expected = " http://practice.cybertekschool.com/email_sent ";
        String actual = driver.getCurrentUrl();

        if(expected.equals(actual)){
            System.out.println("Pass");
        } else {
            System.out.println("fail");
        }


    }
}
