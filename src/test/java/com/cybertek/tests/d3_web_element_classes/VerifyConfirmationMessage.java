package com.cybertek.tests.d3_web_element_classes;

import com.cybertek.utilites.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VerifyConfirmationMessage {
    /**

     go to http://practice.cybertekschool.com/forgot_password
     enter any email
     click on Retrieve password
     verify that confirmation message says 'Your e-mail's been sent!'


     */
    public static void main(String[] args) {
        //open browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        //go to --> http://practice.cybertekschool.com/forgot_password
        driver.get("http://practice.cybertekschool.com/forgot_password");

        //--> enter any email
        WebElement emailInput = driver.findElement(By.name("email"));

        //send keys ---> given text
        String expectedEmail = "qwert@gmail.com";
        emailInput.sendKeys(expectedEmail);

        //click on retrive password
        String actualEmail = emailInput.getAttribute("value");
        if(expectedEmail.equals(actualEmail)){
            System.out.println("Pass");
        } else {
            System.out.println("false");
            System.out.println("Expected result "+ expectedEmail);
            System.out.println("Actual result " + actualEmail);
        }

        //click on retrive password

        WebElement retrievePassword = driver.findElement(By.id("form_submit"));
        retrievePassword.click();

        //verify that confirmation message says "Your email has been sent"

        String expectMessage = "Your e-mail's been sent!";
        WebElement messageElement = driver.findElement(By.name("confirmation_message"));
        String actualMessage = messageElement.getText();

        if(expectMessage.equals(actualMessage)){
            System.out.println("PASS");
        } else {
            System.out.println("Fail");
            System.out.println("Expected MEssage: " + expectMessage);
            System.out.println("Actual Meassaga " + actualMessage);

        }

    }
}
