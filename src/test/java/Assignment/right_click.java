package Assignment;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class right_click {
    public static void main(String[] args) {

//Set system properties
        WebDriverManager.chromedriver().setup();
// Create a new instance of the Firefox driver
        WebDriver driver = new ChromeDriver();

// Visiting the URL
        driver.get("https://www.browserstack.com/");

//Maximise browser window
        driver.manage().window().maximize();

//Instantiating the Actions Class
        Actions actions = new Actions(driver);

// Fetching or locating WebElement to perform right-click using the desired locators
        WebElement btnElement = driver.findElement(By.id("id-value"));

//Right click the button to display Context Menu
        actions.contextClick(btnElement).perform();

        System.out.println("Context Menu displayed");


// Code To click on a specific option from the Context menu once right-click is performed.
        WebElement elementOpen = driver.findElement(By.xpath("<Xpath of the specific option"));
        elementOpen.click();

// Accept the Alert
        driver.switchTo().alert().accept();

        System.out.println("Right click Alert Accepted Successfully ");

// Terminating the operation
        driver.close();

    }

}

