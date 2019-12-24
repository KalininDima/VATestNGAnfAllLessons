package VyTrackTasksFromAsia;

import com.cybertek.utilites.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Positive {

    public static void main(String[] args) {

 /**Each student automate the positive test case blow :
 * •Go to the login page of VyTrack
 * •Enter valid credential (can be any role)
 * •Click login button
 * •Verify that the user login successfully
 *
 */
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://qa2.vytrack.com/user/login");
        driver.findElement(By.name("_username")).sendKeys("user24");

        driver.findElement(By.name("_password")).sendKeys("UserUser123");

        driver.findElement(By.name("_submit")).click();

        String ActualTitle = driver.getTitle();
        String ExpectedTitle = "Dashboard";
        if(ExpectedTitle.equals(ActualTitle)){
            System.out.println("Pass log in");
        } else {
            System.out.println("false log in");
            System.out.println("Expected result "+ ExpectedTitle);
            System.out.println("Actual result " + ActualTitle);
        }
        driver.close();
    }

}
