package com.cybertek.tests.d12_review;

import com.cybertek.utilites.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class HoverTest {
WebDriver driver;
Actions action;
    @BeforeMethod
    public void setupMethod(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/hovers");
        action=new Actions(driver);

    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

    @Test
    public void test() throws InterruptedException {
// hover over the each image
        // verify user1,user2,user3

       for (int i =1;i<=3;i++){
           System.out.println("Check "+i+" image");
           WebElement image = driver.findElement(By.xpath("//div[@class='figure']["+i+"]"));
           action.moveToElement(image).perform();
           WebElement text = driver.findElement(By.xpath("//h5[.='name: user"+i+"']"));
           action.pause(2000);
           System.out.println("Check user"+i+" displayed text");
           System.out.println("user"+i+" "+text.isDisplayed());
           Assert.assertTrue(text.isDisplayed());
       }


        /*
        for (int i = 0;i<3;i++){
            System.out.println(i);
        }

        WebElement image = driver.findElement(By.tagName("img"));
        actions.moveToElement(image).perform();
        //yjis is like calling thread.sleep
        actions.pause(2000);
        WebElement text = driver.findElement(By.xpath("//h5[.='name: user1']"));
        Assert.assertTrue(text.isDisplayed());
        System.out.println(text.getText());

         */
    }




    @Test
    public void Test2 (){
        WebElement input = driver.findElement(By.name("q"));
        input.sendKeys("wooden spoon"+ Keys.ENTER);
        Assert.assertTrue(driver.findElement(By.id("resultStats")).isDisplayed());
        driver.navigate().back();
        //go to gooogle 2nd time
        input = driver.findElement(By.name("q"));
        input.sendKeys("books"+Keys.ENTER);
        
    }
}
