package com.cybertek.tests.d17_extends_reports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ExtentDemoTest {

    //ExtentReports report;    -->>    this class is used for starting and building the reports.
    ExtentReports report;
    //ExtentHtmlReporter htmlReporter;  -->>    this class is used to create the HTML report file
    ExtentHtmlReporter htmlReporter;
    //ExtentTest extentLogger; -->>    (used the most) this class will define a test, enables adding logs, authors etc..
    ExtentTest extentLogger;

    @BeforeMethod
    public void setUp(){
        //initialize the classes
        report = new ExtentReports();

        // create report path
        // System.getProperty("user.dir")    -->> returns the location of my project
        // "/test-output/report.html"   -->> report will be in test output folder, name ->> report.html
        String path = System.getProperty("user.dir") + "/test-output/report.html";

        //initialize the html reporter with the report path
        htmlReporter = new ExtentHtmlReporter(path);

        //attach the html report to the report object
        report.attachReporter(htmlReporter);

        //optional
        // set the title of the report
        htmlReporter.config().setReportName("VyTrack smoke tests");

        //set the environment information
        report.setSystemInfo("Environment ", "QA");
        report.setSystemInfo("browser", "chrome");
        report.setSystemInfo("whats my name", "jerry b goodwhyNoob");

    }

    @Test
    public void test1(){
        // give name to the current test
        extentLogger = report.createTest("TC001: Login as driver test");
        // info() -->> write test steps
        extentLogger.info("Open chrome");
        extentLogger.info("go to url");
        extentLogger.info("enter driver login info");
        extentLogger.info("click submit");
        extentLogger.info("click verify logged in");
        // pass() -->> marks the test case as passed
        extentLogger.pass("TC001 passed");
    }



    @AfterMethod
    public void close(){
        //this is when report is actually created.
        //this line must run after everything else.
        report.flush();

    }

}

