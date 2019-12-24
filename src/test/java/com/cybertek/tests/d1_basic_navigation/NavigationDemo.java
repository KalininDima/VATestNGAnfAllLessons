package com.cybertek.tests.d1_basic_navigation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationDemo {

    public static void main(String[] args) throws InterruptedException{
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        //open website

        driver.get("https://cybertekschool.com/");
    System.out.println(driver.getTitle());
   //this is not from selenium
        Thread.sleep(1000);

        driver.navigate().to("https://amazon.com/");

        driver.navigate().back();
        System.out.println(driver.getTitle());//returns of the title of the page

        //this is not from selenium, its not from java/ Its pauses the program
        Thread.sleep(1000);
        //driver.navigate().forward()-->goes forward after going back
        driver.navigate().forward();
        System.out.println(driver.getTitle());

        Thread.sleep(1000);
        driver.navigate().refresh();
        System.out.println(driver.getTitle());
    }
}
