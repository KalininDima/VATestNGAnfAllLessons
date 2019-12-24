package com.cybertek.tests.d11_upload_action_class;

import com.cybertek.utilites.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ActionsExamplesTest {

    WebDriver driver;

    @BeforeMethod
    public void setupMethod() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        //wait when trying to find element
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS );
    }


    @Test
    public void hoverTest() {
        /*
         go to website http://practice.cybertekschool.com/hovers
         hover over the first image
         verify text view profile is displayed
         */
        driver.get("http://practice.cybertekschool.com/hovers");
        WebElement img1 = driver.findElement(By.tagName("img"));
// Actions ---> class that contains all the user interactions
        Actions actions = new Actions(driver);
        // moveToElement() ---> moves the mouse on top of the given element
        //perform() --> complete the action

        actions.moveToElement(img1).perform();

        Assert.assertTrue(driver.findElement(By.linkText("View profile")).isDisplayed());
    }


    @Test
    public void draganddrop() throws InterruptedException {
        driver.get("https://demos.telerik.com/kendo-ui/dragdrop/index");
        //source---> we will drag this element
        WebElement source = driver.findElement(By.id("draggable"));
        //target---> we drop here
        WebElement target = driver.findElement(By.id("droptarget"));

        Actions actions = new Actions(driver);

        Thread.sleep(2000);

        //draganddrop---> drags the source to target
        actions.dragAndDrop(source,target).perform();
    }

    @Test
    public void draganddroppbychaining() throws InterruptedException {
        driver.get("https://demos.telerik.com/kendo-ui/dragdrop/index");
        //source---> we will drag this element
        WebElement source = driver.findElement(By.id("draggable"));
        //target---> we drop here
        WebElement target = driver.findElement(By.id("droptarget"));

        Actions actions = new Actions(driver);

        Thread.sleep(2000);
        // we can chain multiple actions
        //at the end we call tje built().perform()
        actions.moveToElement(source).clickAndHold().moveToElement(target).release().build().perform();

    }
}
