package VyTrackTasksFromAsia;

import com.cybertek.utilites.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class VyTruckShortCutFunctionality {

    public static void main(String[] args) throws InterruptedException {


        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://qa2.vytrack.com/user/login");
        driver.manage().window().maximize();
        driver.findElement(By.id("prependedInput")).sendKeys("salesmanager125");
        driver.findElement(By.id("prependedInput2")).sendKeys("UserUser123");

        driver.findElement(By.id("_submit")).click();

        String title = driver.getTitle();
        String D = "Dashboard";

        if(title.contains("D")){
            System.out.println("Check Dashboard page");
            System.out.println("Pass");
            System.out.println("Title: "+title);
            System.out.println();
        } else {
            System.out.println("Check Dashboard page");
            System.out.println("Fail");
            System.out.println("Title: "+title);
            System.out.println("Should contain: "+ D);
            System.out.println();
        }
        Thread.sleep(3000);
        driver.findElement(By.className("fa-share-square")).click();
        driver.findElement(By.linkText("See full list")).click();

       List<String> list = new ArrayList<>();
       Thread.sleep(2000);
      driver.findElement(By.partialLinkText("Opportunities")).click();

     String url = driver.getCurrentUrl();

     if(url.contains("by_opportunities")){
         System.out.println("Check Opportunities page");
         System.out.println("Pass");
         System.out.println("current url: "+url);
         System.out.println();
     }
     else{
         System.out.println("Check Opportunities page");
         System.out.println("Fail");
         System.out.println("current url: "+url);
         System.out.println();
     }

        Thread.sleep(2000);
        driver.findElement(By.className("fa-share-square")).click();
        driver.findElement(By.linkText("See full list")).click();

        Thread.sleep(1000);
        String urlbeforeclick = driver.getCurrentUrl();
        String beforeclicktitle = driver.getTitle();
        driver.findElement(By.linkText("Vehicle Services Logs")).click();
        Thread.sleep(1000);

        WebElement text = driver.findElement(By.className("message"));
        String errorM = text.getText();

        if(errorM.contains("You do not have permission to perform this action.")){
            System.out.println("Check error message");
            System.out.println("Pass");
            System.out.println("Actual: "+ errorM);
            System.out.println("Expected: You do not have permission to perform this action." );
            System.out.println();
        } else {
            System.out.println("Check error message");
            System.out.println("Fail");
            System.out.println("Actual: "+ errorM);
            System.out.println("Expected: You do not have permission to perform this action." );
            System.out.println();
        }

        String urlafterclick = driver.getCurrentUrl();
        String afterclicktitle = driver.getTitle();
        String resulturl;
        String resulttitle;
        if (urlafterclick.equals(urlbeforeclick)){
            System.out.println("Check short cuts page after click");
            System.out.println("Pass");
            System.out.println("Before click: "+ urlbeforeclick);
            System.out.println("After click: "+ urlafterclick);
            System.out.println();
            resulturl="Pass";
        } else {
            System.out.println("Check short cuts page after click");
            System.out.println("Fail");
            System.out.println("Before click: "+ urlbeforeclick);
            System.out.println("After click: "+ urlafterclick);
            System.out.println();
            resulturl="Fail";
        }

        if (afterclicktitle.equals(beforeclicktitle)){
            System.out.println("Check short cuts title after click");
            System.out.println("Pass");
            System.out.println("Before click: "+ beforeclicktitle);
            System.out.println("After click: "+ afterclicktitle);
            System.out.println();
            resulttitle="Pass";
        } else {
            System.out.println("Check short cuts title after click");
            System.out.println("Fail");
            System.out.println("Before click: "+ beforeclicktitle);
            System.out.println("After click: "+ afterclicktitle);
            System.out.println();
            resulttitle="Fail";
        }

        if(resulttitle.equals(resulturl)&&!resulttitle.contains("Falls")){
            System.out.println("Pass last two tests");
            System.out.println("Check title result: "+resulttitle);
            System.out.println("Check url result: "+resulturl);
        } else if(!resulttitle.equals(resulturl)) {
            System.out.println("One of two last tests has fail, check it");
            System.out.println("Check title result: "+resulttitle);
            System.out.println("Check url result: "+resulturl);
        } else {
            System.out.println("Both last tests failed");
            System.out.println("Check title result: "+resulttitle);
            System.out.println("Check url result: "+resulturl);
        }

driver.quit();
    }
}
