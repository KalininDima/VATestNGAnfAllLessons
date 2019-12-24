package VyTrackTasksFromAsia;

import com.cybertek.utilites.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EtsySearch {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://ebay.com");
        WebElement findSearch = driver.findElement(By.id("gh-ac"));
        findSearch.sendKeys("wooden spoon");
        WebElement searchBut = driver.findElement(By.id("gh-btn"));
        searchBut.click();
        WebElement count = driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/div/div[2]/div/div[1]/h1/span[1]"));
        String c = count.getText().replace(",","");

        int firstCount = Integer.parseInt(c);

        WebElement All = driver.findElement(By.linkText("All"));
        All.click();
        WebElement count2 = driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/div/div[2]/div/div[1]/h1/span[1]"));
        c= count2.getText().replace(",","");
        int secondCount = Integer.parseInt(c);

        if(secondCount>firstCount){
            System.out.println("Pass");
            System.out.println("first result: "+ firstCount);
            System.out.println("second result: "+ secondCount);
        } else{
            System.out.println("first result: "+ firstCount);
            System.out.println("second result: "+ secondCount);
        }





    }
}
