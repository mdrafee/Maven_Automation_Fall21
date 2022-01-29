package DAY6_12192021;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FindElement_Exmaples {
    public static void main(String[] args) throws InterruptedException {
        //property of Chorme always
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        //set chrome options
        ChromeOptions options = new ChromeOptions();
        // Use options arguments
        // maximize is for driver
        options.addArguments("start-maximized");
        options.addArguments("incognito");
        //options.addArguments("headless");

        //set headless

        //define the drivers
        WebDriver driver = new ChromeDriver(options);

        //call website
        driver.navigate().to("https://www.yahoo.com");
        Thread.sleep(2000);

        ////click on the new link to find element
        driver.findElements(By.xpath("//*[contains(@class,'_yb_1rhax')]")).get(1).click();


    }
}
