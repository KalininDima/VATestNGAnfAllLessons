package com.cybertek.tests.d12_review;

import com.cybertek.utilites.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NullTest {

    String string;
    @BeforeMethod
    public void setupMethod(){
       string = "A";
    }

    @AfterMethod
    public void tearDown(){

    }

    @Test
    public void test(){
        System.out.println(string.toLowerCase());
    }
}
