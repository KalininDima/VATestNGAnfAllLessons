package com.cybertek.tests.d11_upload_action_class;

import com.cybertek.utilites.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class JavaScriptExecutorTest {

    WebDriver driver;

    @BeforeMethod
    public void setupMethod() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        //wait when trying to find element
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS );
    }

    @AfterMethod
    public void AfterM() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }

    @Test
    public void click(){
        driver.get("http://practice.cybertekschool.com/");
        WebElement element = driver.findElement(By.linkText("Home"));
        //this how the JavascriptExecuter object is created
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        // executeScript ---> method used to pass js command
        //first string argument is the javascript code
        //second argument is the webelement on which the action will be take
        jse.executeScript("arguments[0].click();", element);
    }

    @Test
    public void Type () throws InterruptedException {
        driver.get("http://practice.cybertekschool.com/dynamic_controls");
        WebElement element = driver.findElement(By.cssSelector("button[onclick='swapInput()']"));

        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].click();", element);
        //element.sendKeys(str)
        String str = "Hello";
        Thread.sleep(3000);
        jse.executeScript("arguments[0].setAttribute('value', '"+str+"');",driver.findElement(By.xpath("//input[@type='text']")));

    }

    @Test
    public void scroll() throws InterruptedException {
        driver.get("http://practice.cybertekschool.com/infinite_scroll");

        JavascriptExecutor jse = (JavascriptExecutor) driver;

        for (int i = 0;i<5;i++){
            jse.executeScript("scroll(0, 500)");
            Thread.sleep(1000);
        }
    }
}
