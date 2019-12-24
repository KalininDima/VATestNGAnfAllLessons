package VyTrackTasksFromAsia;

import com.cybertek.utilites.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VytrackTitle {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://qa2.vytrack.com/user/login");

        WebElement findUser = driver.findElement(By.id("prependedInput"));
        findUser.sendKeys("user23");

        WebElement findPassword = driver.findElement(By.id("prependedInput2"));
        findPassword.sendKeys("UserUser123");

        WebElement findBut = driver.findElement(By.id("_submit"));
        findBut.click();

        Thread.sleep(3000);


        driver.findElement(By.className("dropdown-toggle")).click();
        driver.findElement(By.xpath("//*[@id=\"user-menu\"]/ul/li[2]/a")).click();
        Thread.sleep(3000);
    String title = driver.getTitle();

    WebElement getName = driver.findElement(By.xpath("//*[@id=\"user-menu\"]/a"));
    String name = getName.getText();
    if(title.contains(name)){
        System.out.println("Pass");
        System.out.println("Name: "+name);
        System.out.println("Title: "+ title);
    } else {
        System.out.println("Fail");
        System.out.println("Name: "+name);
        System.out.println("Title: "+ title);
    }
driver.quit();

    }

}
