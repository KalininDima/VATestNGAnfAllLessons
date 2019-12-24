package com.cybertek.tests.d17_extends_reports;

import com.cybertek.pages.LoginPage;
import com.cybertek.utilites.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NegativeLoginTEstWithReports  extends TestBase {



    @Test
    public void wrongPasswordTest(){
        // if we dont add extentLogger = report.createTest ,this test will not be in the html report
        extentLogger = report.createTest("Wrong password test");
        LoginPage loginPage = new LoginPage();
        extentLogger.info("Enter username: salesmanager101");
        loginPage.userName.sendKeys("salesmanager101");
        extentLogger.info("Enter password: greatpassword");
        loginPage.password.sendKeys("greatpassword");
        extentLogger.info("Click submit");
        loginPage.submit.click();
        extentLogger.info("Verify page url");
        Assert.assertEquals(driver.getCurrentUrl(), "https://qa3.vytrack.com/user/login");
        extentLogger.pass("PASS: Wrong password test");
    }

    // this test will fail
    @Test
    public void wrongUsernameTest(){
        // if we dont add extentLogger = report.createTest ,this test will not be in the html report
        extentLogger = report.createTest("Wrong username test");
        LoginPage loginPage = new LoginPage();
        extentLogger.info("Enter username: salesmanager11");
        loginPage.userName.sendKeys("salesmanager11");
        extentLogger.info("Enter password: greatpassword");
        loginPage.password.sendKeys("greatpassword");
        extentLogger.info("Click submit");
        loginPage.submit.click();
        extentLogger.info("Verify page url");
        Assert.assertEquals(driver.getCurrentUrl(), "https://qa3.vytrack.com/user/login");//https://google.com/
        extentLogger.pass("PASS: Wrong username test");
    }
}