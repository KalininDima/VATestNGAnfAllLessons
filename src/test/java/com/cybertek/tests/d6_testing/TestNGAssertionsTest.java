package com.cybertek.tests.d6_testing;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGAssertionsTest {
    @Test
    public void Test1 (){
        Assert.assertEquals("one","one");

        Assert.assertEquals(3,5);

    }

    @Test
    public void test2 (){
        Assert.assertNotEquals("one","two");
    }

    @Test
    public void test3 (){
        String expected = "cbt";
        String actual = "cbt";
        Assert.assertTrue(expected.startsWith(actual));
        Assert.assertTrue("kalinin@nisid".contains("@"));
        Assert.assertTrue(1>0);

        //System.out.println(1==1);

    }

    @Test
    public void test4 (){
        Assert.assertFalse(1<0);

    }

    @Test
    public void test5(){
        Assert.assertEquals("dvdf", "asdf", "Holly Molly");

        Assert.assertTrue("mas$cbt.com".contains("@"),"All emails mmmmust");

    }
}
