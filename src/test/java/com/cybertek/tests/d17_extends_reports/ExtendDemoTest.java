package com.cybertek.tests.d17_extends_reports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.google.gson.internal.bind.util.ISO8601Utils;
import org.apache.commons.lang3.builder.ToStringExclude;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ExtendDemoTest {

    // ExtentReports---> this class id used for starting and building the reports
    ExtentReports report;

    //this class is used to create the HTML report
    ExtentHtmlReporter htmlReporter;

    //this will define a test, enables adding logs, authors, test info, etc.
    ExtentTest extentLogger;

    @BeforeMethod
    public void setUp(){
        //initialize classes
        report = new ExtentReports();
        //create report path
        //System.getProperty("user.dir");-->returns the location/path of my project
        //"/test-output/report.html" ---> report will be in test output folder, name --> folder.html
        String path = System.getProperty("user.dir")+"/test-output/report.html";

        //intialize the html reporter with the report path
        htmlReporter = new ExtentHtmlReporter(path);

        //atach the html report to the report object
        report.attachReporter(htmlReporter);


        htmlReporter.config().setReportName("Vytrack smoke test");

        //set environment information
        report.setSystemInfo("Environment", "QA");
        report.setSystemInfo("browser","chrome");


    }

    @Test
    public void test1(){
        // give name to the current test
        extentLogger = report.createTest("TC001Login test: driver test");

        //test steps
        extentLogger.info("Open chrome");
        extentLogger.info("go to url");
        extentLogger.info("enter driver login info");
        extentLogger.info("click submit");
        extentLogger.info("click verify logged in");
        extentLogger.pass("TC001 passed");
    }

    @AfterMethod
    public void close(){
        // this is when the report is actually
        //this is
        report.flush();
    }



}
