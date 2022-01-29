package DAY7_12252021;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.sql.Driver;

public class Scroll {
    public static void main(String[] args) throws InterruptedException {

        //webdriver manager to open by driver
        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();

        //start maximized
        options.addArguments("start-maximized");

        //setup driver
        WebDriver driver = new ChromeDriver(options);

        //navigate to mortgage calc
        driver.navigate().to("https://www.mortgagecalculator.org");
        Thread.sleep(2500);

        //driver.manage()window().fullscreen();
        JavascriptExecutor jse = (JavascriptExecutor) driver;

        jse.executeScript("scroll(0,450)");




    }
}
