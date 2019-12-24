package com.cybertek.tests.d7_types_of_elements;

import com.cybertek.utilites.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;


public class RadioButtonsTest {


    @Test
    public void Test (){
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/radio_buttons");

        WebElement blue = driver.findElement(By.id("blue"));
        WebElement red = driver.findElement(By.id("red"));

        System.out.println("is bluw selected "+blue.isSelected());
        System.out.println("is red selected "+red.isSelected());

        System.out.println("Selecting red button ");

        red.click();

        System.out.println("is bluw selected "+blue.isSelected());
        System.out.println("is red selected "+red.isSelected());


        //verify is blue  notselected
        Assert.assertFalse(blue.isSelected());

        //verify is red is selected
        Assert.assertTrue(red.isSelected());


    }

}
