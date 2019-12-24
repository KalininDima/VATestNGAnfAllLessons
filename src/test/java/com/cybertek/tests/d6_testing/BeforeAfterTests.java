package com.cybertek.tests.d6_testing;

import com.cybertek.tests.d6_css.CssLocatorDemoTest;
import org.testng.annotations.*;

public class BeforeAfterTests {

    @Test
    public void test1(){
        System.out.println("This is test one");
    }

    @Test
    public void test2(){
        System.out.println();
    }

    @BeforeMethod
    public void setupMethod(){
        System.out.println("BEFORe METHOD");
    }

    @AfterMethod
    public void terdownMEthod(){
        System.out.println("After ");
    }

    @BeforeClass
    public void setupClass (){
        System.out.println("Before class : runnig only one time");
    }

    @AfterClass
    public void teardownClass(){
        System.out.println("After class: Running only once");
    }
}
