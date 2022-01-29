package DAY4_121221;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class open_google {
    public static void main(String[] args) {

        // set the property of the chromedriver
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        // DEFINE WEBDRIVER
        WebDriver driver = new ChromeDriver();

        //Simpkly open google
        driver.navigate().to("https://www.google.com");

        //maaximize your your browser
        driver.manage().window().maximize();

    }//end mani
}// end class
