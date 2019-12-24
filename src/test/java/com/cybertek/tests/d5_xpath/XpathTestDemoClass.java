package com.cybertek.tests.d5_xpath;

import com.cybertek.utilites.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class XpathTestDemoClass {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("http://practice.cybertekschool.com/multiple_buttons");

        WebElement link  = driver.findElement(By.xpath("/html/body/nav/ul/li/a"));
        System.out.println(link.getText());

        WebElement newE = driver.findElement(By.xpath("//h3[.='Multiple buttons']"));
        String newES = newE.getText();
        System.out.println(newES);

        WebElement newlink = driver.findElement(By.xpath("//button[@onclick='button()1']"));

        System.out.println(newlink.getText());
    }
}
