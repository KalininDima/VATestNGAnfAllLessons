package com.cybertek.tests.d8_SelectList;

import com.cybertek.utilites.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class SelectClass {
    @Test
    public void printAllOptions(){
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/dropdown");
        // Locate the element with the select tag
        WebElement element = driver.findElement(By.id("state"));
        // Create Select object by passing the element from step 2 as constructor
        Select stateList = new Select(element);
        // getOptions() --> returns all the available options from the dropdown list
        List<WebElement> options = stateList.getOptions();
        for (WebElement option : options) {
            System.out.println(option.getText());
        }
    }
    @Test
    public void selectAndVerifySelected() throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/dropdown");
        // create a select object.
        //1 locate the webelement with the select tag
        // create Select class object by passing that webelement as a constructor
        Select stateList = new Select(driver.findElement(By.id("state")));
        // verify that by default Select a State is selected
        // getFirstSelectedOption() --> returns what is currently selected, returns WEBELEMENT
        // getFirstSelectedOption().getText() --> returns the text of what is currently selected,
        String actualSelection = stateList.getFirstSelectedOption().getText();
        System.out.println("actualSelection = " + actualSelection);
        Assert.assertEquals(actualSelection, "Select a State");
        Thread.sleep(1000);
        // SELECT USING VISIBLE TEXT
        // selectByVisibleText() --> selects using the visible text
        stateList.selectByVisibleText("Ohio");
        actualSelection = stateList.getFirstSelectedOption().getText();
        Assert.assertEquals(actualSelection, "Ohio");
    }
}