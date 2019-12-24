package com.cybertek.tests.d14_properties_driver_class_base_class;

import com.cybertek.utilites.ConfigurationReader;
import com.cybertek.utilites.Driver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class SingletonTest {

    @Test
    public void test1(){
      //  Singleton s = new Singleton();
        String s1 = Singleton.getInstance();

        String s2 = Singleton.getInstance();

        System.out.println("s1 = "+ s1);
        System.out.println("s1 = "+ s2);

    }

    @Test
    public void test2(){
        // this is how we create webdriver object from now on
        //the type of the driver will come from the properties file

        WebDriver driver = Driver.get();

        String url = ConfigurationReader.get("url");
        Driver.get().get(url);
     //   driver.get(url);

        System.out.println(Driver.get().getTitle());
      //we use this method to close the driver
        Driver.closeDriver();
    }
}
