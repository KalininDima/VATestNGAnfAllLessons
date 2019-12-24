package VyTrackTasksFromAsia;

import com.cybertek.utilites.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GoogleTitle {
    public static void main(String[] args) throws InterruptedException {

List<String> list = new ArrayList<>(Arrays.asList("Selenium","JUnit","Java"));
WebDriver driver = WebDriverFactory.getDriver("chrome");
driver.get("https://google.com");
WebElement find = driver.findElement(By.name("q"));


for (int i = 0; i<list.size();i++) {
    find.sendKeys(list.get(i));
    find.submit();

    driver.manage().window().maximize();
    WebElement link = driver.findElement(By.partialLinkText(list.get(i)));
    WebElement text = driver.findElement(By.tagName("cite"));
    String texts = text.getText()+"/";
    link.click();
    Thread.sleep(200);
    String url = driver.getCurrentUrl();
   // String newurl = url.substring(0,url.indexOf("/"));

    if(url.equals(texts)){
        System.out.println("Pass");
        System.out.println("original url: "+url);
        System.out.println("copied link: "+ texts);
    } else {
        System.out.println("FALLS");
        System.out.println("original url: "+url);
        System.out.println("copied link: "+ texts);
    }

driver.navigate().back();
    find = driver.findElement(By.name("q"));
    find.clear();




        }



    }

}
