package com.cybertek.tests.d18_data_driving_testing;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDriverTestWithDataProvider {

@DataProvider
    public Object[] [] testDAta() {
    String[][] data = {

            {"Kung Fury", "10"},
            {"Titanic", "1"},
            {"Intestellar", "2"},
            {"I am legend", "10"}
    };
return data;
}

@Test(dataProvider = "testData")
public void test1(String name, String rating){
    System.out.println("Movie "+name+" has rating "+ rating);
}

}
