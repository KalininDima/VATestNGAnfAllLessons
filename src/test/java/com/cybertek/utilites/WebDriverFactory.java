package com.cybertek.   utilites;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverFactory {

    //write a method that takes a string parameter
    //based on he value of the parameter
    //the method must return chromedriver orr firefoxdriver object-
    //name: getDriver

    public static WebDriver getDriver (String browserType)
    {
        WebDriver driver = null;

        switch(browserType.toLowerCase()){
            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;
            case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();

        }
            return driver;
    }

}
