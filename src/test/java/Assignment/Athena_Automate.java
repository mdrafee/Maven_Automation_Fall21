package Assignment;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import java.nio.channels.WritableByteChannel;
import java.sql.Driver;
import java.util.ArrayList;
import java.util.List;

public class Athena_Automate {

    public static void main(String[] args) throws InterruptedException {

        //setup chrome
        WebDriverManager.chromedriver().setup();
        //   chrome optoins initall
        ChromeOptions options = new ChromeOptions();
        //options command
        options.addArguments("start-maximized");
        options.addArguments("incognito");

        //initialize webdriver
        WebDriver driver = new ChromeDriver(options);

        /*
        //go to athena
        driver.navigate().to("https://www.aetna.com/individuals-families.html");

        //click on shop plans
          driver.findElement(By.xpath("//*[contains(@class,'megamenu__primary--item--btn')]")).click();

          Thread.sleep(1000);


          //click on feed back
        driver.findElement(By.xpath("//*[contains(@id,'QSIFeedbackButton-btn')]")).click();

        Thread.sleep(1000);

        //click on the x
        driver.findElement(By.xpath("//*[contains(@id,'QSIFeedbackButton-close-btn')]")).click();
//QSIFeedbackButton-close-btn
      //  id="QSIFeedbackButton-survey-iframe"

        Thread.sleep(1000);

        //click on medicare
        //driver.findElement(By.xpath("//*[contains(@class,'megamenu__primary--item--btn')]")).click();
        driver.findElement(By.xpath("//*[contains(@class,'megamenu__secondary--link megamenu__secondary--inactive secondary__link--selected')]")).click();

        //class="megamenu__secondary--link megamenu__secondary--inactive secondary__link--selected"
        //click on find a doc
        driver.findElement(By.xpath("//*[contains(@class,'megamenu__tertiary--link link__text--inline--tertiary')]")).click();  */


        driver.navigate().to("https://www.aetna.com/dsepublic/#/contentPage?page=providerSearchLanding&site_id=medicare&language=en");
        Thread.sleep(1000);
        //click on 2021 FIND YOUR INSURANCE
        driver.findElement(By.xpath("//*[contains(text(),'2021 Medicare plans you purchase yourself')]")).click();
        Thread.sleep(2000);
      //  String zip1= new String(3);
       // zip1(1)="11355";
        //send keys to zip
        //  driver.findElement(By.xpath("//*[@id='medZip']")).sendKeys(zip1);
Thread.sleep(2000);
        List<WebElement> searchResult = driver.findElements(By.xpath("//*[contains(@class,'dropdown-menu')]"));

        //if (searchResult == zip1) {
        //    searchResult.get(1).click();
      //  }




        //      WebElement zip = driver.findElement(By.xpath("//*[contains(class,'form-control customStyle typeHead_block ng-pristine ng-valid ng-empty ng-touched')]"));
    //    zip.click();
  //      zip.sendKeys(zip1);





    }//main

}//class
