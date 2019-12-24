package VyTrackTasksFromAsia;

import com.cybertek.utilites.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Negative {

    public static void main(String[] args) throws InterruptedException {


        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://qa2.vytrack.com/user/login");
        driver.findElement(By.name("_username")).sendKeys("WrongUserName");
        driver.findElement(By.name("_password")).sendKeys("WrongPassword");
        driver.findElement(By.name("_submit")).click();
        Thread.sleep(1000);
        WebElement error = driver.findElement(By.xpath("//*[@id=\"login-form\"]/fieldset/div[1]"));
        String errormesssage = error.getText();

        if(errormesssage.equals("Invalid user name or password.")) {
            System.out.println("Check negative credentials");
            System.out.println("Pass");
            System.out.println("Acctual result: " + errormesssage);
            System.out.println("Epected result: Invalid user name or password.");
        }

        else {
            System.out.println("Check negative credentials");
            System.out.println("Fail");
            System.out.println("Acctual result: " + errormesssage);
            System.out.println("Epected result: Invalid user name or password.");
        }
        driver.quit();


    }
}
