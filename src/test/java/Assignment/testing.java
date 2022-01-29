package Assignment;

import DAY9_01082022.Reusable_Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.lang.model.element.Element;
import java.sql.Driver;

public class testing {
    public static void main(String[] args) throws InterruptedException {
     //call driver
        WebDriver driver;
        //setup driver
        driver = Reusable_Actions.setDriver();


    //Simpkly open google
        driver.navigate().to("https://www.google.com");

    //maaximize your your browser
        driver.manage().window().maximize();

        Thread.sleep(1000);

    //searching for cars on google search field
        driver.findElement(By.xpath("//*[@name='q']")).sendKeys("cars");

    //hit submit on google search button
        driver.findElement(By.xpath("//*[@name='q']")).submit();

    //wait time
        Thread.sleep(1000);

    //capture the search result and store it as a variable
   //String result = driver.findElement(By.xpath("//*[@id='result-stats']")).getText();
 String result= Reusable_Actions.gettextMethod(driver,"//*[@id='result-stats']", "getText search result");
    //declatre the array vairb;le to split the result
    String[] arrayResult = result.split(" ");

    // now print the search number only
        System.out.println("My search result is " + arrayResult[1]);

    // clost it
        driver.quit();
}//end mani




        
        

}
