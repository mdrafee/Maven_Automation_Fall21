package DAY5_12182021;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleAutomation {

    public static void main(String[] args) throws InterruptedException {

        // set the property of the chromedriver
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        // DEFINE WEBDRIVER
        WebDriver driver = new ChromeDriver();

        //Simpkly open google
        driver.navigate().to("https://www.google.com");

        //maaximize your your browser
        driver.manage().window().maximize();

        Thread.sleep(2000);

        //searching for cars on google search field
        driver.findElement(By.xpath("//*[@name='q']")).sendKeys("cars");

        //hit submit on google search button
        driver.findElement(By.xpath("//*[@name='q']")).submit();

        //wait time
        Thread.sleep(3000);

        //capture the search result and store it as a variable
        String result = driver.findElement(By.xpath("//*[@id='result-stats']")).getText();

        //declatre the array vairb;le to split the result
        String[] arrayResult = result.split(" ");

        // now print the search number only
        System.out.println("My search result is " + arrayResult[1]);

        // clost it
        driver.quit();
    }//end mani

}//class
