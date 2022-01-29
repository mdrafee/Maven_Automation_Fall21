package DAY9_01082022;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait_UPS {
    public static void main(String[] args) {
    WebDriver driver = Reusable_Actions.setDriver();
       // WebDriverManager.chromedriver().setup();
        //chrome optoins
      //  ChromeOptions options = new ChromeOptions();
        //optoins arguemtn
      //  options.addArguments("start-maximized");
      //  options.addArguments("incognito");

        //set up webdriver
      //  WebDriver driver = new ChromeDriver(options);
        driver.navigate().to("https://www.ups.com/us");

        //declaring explicit wait
        WebDriverWait wait = new WebDriverWait(driver, 10);

        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Tracking']"))).click();
        } catch (Exception e) {
            System.out.println("unable to click on Trackingg " + e);
        }

        try {
            //click on track
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Track a Package']"))).click();
        }catch (Exception e) {
            System.out.println("unable to click on track " + e);
        }


    }
}
