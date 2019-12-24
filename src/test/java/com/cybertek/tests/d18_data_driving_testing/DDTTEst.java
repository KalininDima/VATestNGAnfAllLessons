package com.cybertek.tests.d18_data_driving_testing;

import com.cybertek.pages.DashboardPage;
import com.cybertek.pages.LoginPage;
import com.cybertek.utilites.ExcelUtil;
import com.cybertek.utilites.TestBase;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DDTTEst extends TestBase {
    @DataProvider()
    public Object [] [] userList(){
        //read from excel in 2d array format
        ExcelUtil qa3Short = new ExcelUtil("/Users/dmitriykalinin/IdeaProjects/Summer2019VATestNGSeleniumProject/src/test/Resources/Vytrack testusers.xlsx","QA3-short");
        String [][] dataArray = qa3Short.getDataArray();
        //return 2d array
        return dataArray;
    }

    @Test (dataProvider = "userList")
    public void test (String execute, String username, String password, String firstname, String lastname){
        extentLogger=report.createTest("Tsting",firstname+" "+lastname);
        //login using
        LoginPage loginPage= new LoginPage();
        loginPage.login(username, password);
        //get the actual
        String actualName = new DashboardPage().getUserName();


        //expected comes from excel data
        String expected = firstname+" "+lastname;
        Assert.assertEquals(actualName,expected);

        //we are ignoring the variable execute


    }




}
