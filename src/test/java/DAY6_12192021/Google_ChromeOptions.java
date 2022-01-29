package DAY6_12192021;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Google_ChromeOptions {
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
        //call website using driver
        driver.navigate().to("https://www.google.com");
        Thread.sleep(2000);
        System.out.println("navigated to google");

        //enter a keyword on google search
        driver.findElement(By.xpath("//*[@name='q']")).sendKeys("cars");
        System.out.println("Entered keyword car on google search");

    }
}
