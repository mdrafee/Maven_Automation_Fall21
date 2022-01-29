package DAY9_01082022;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class MouseAction_USPS_title {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        //chrome optoins
        ChromeOptions options = new ChromeOptions();
        //optoins arguemtn
        options.addArguments("start-maximized");
        options.addArguments("incognito");

        //set up webdriver
        WebDriver driver = new ChromeDriver(options);
        driver.navigate().to("https://www.usps.com");

        //verify the welcome page title appears as expected
        String actualTitle = driver.getTitle();
        //by using if else to compare expected with actual title
        if(actualTitle.equals("Welcome | USPS")){
            System.out.println("Title matches " + actualTitle);
        } else {
            System.out.println("Title doesn't match. Actual title is " + actualTitle);
        }


        //declare mouse actoing
        Actions mouseAction = new Actions(driver);

        //hover over tab
        try {
            WebElement senTab = driver.findElement(By.xpath("//*[text()='Send'"));
            mouseAction.moveToElement(senTab).perform();
        } catch (Exception e){
            System.out.println("unable to hover to sent tab " + e);
        }

//click on zip from dorp down
        try {
            WebElement senTab = driver.findElement(By.xpath("//*[text()='Look Up a ZIP Code']"));
            mouseAction.moveToElement(senTab).perform();
        } catch (Exception e){
            System.out.println("unable to hover to sent tab" + e);
        }

    }
}
