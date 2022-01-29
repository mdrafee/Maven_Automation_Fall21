package DAY7_12252021;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Scroll_MortgageCalc {
    public static void main(String[] args) throws InterruptedException {

        //open chrtome drive
        WebDriverManager.chromedriver().setup();
        //   chrome optoins
        ChromeOptions options = new ChromeOptions();
        //
        options.addArguments("start-maximized");
        options.addArguments("incognito");

    }//main
}//class
