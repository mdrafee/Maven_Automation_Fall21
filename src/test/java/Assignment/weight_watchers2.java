package Assignment;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.sql.Driver;
import java.util.ArrayList;
import java.util.List;

public class weight_watchers2 {
    public static void main(String[] args) throws InterruptedException {
        ArrayList<String> zip = new ArrayList<>();
        zip.add("11311");
        zip.add("11322");
        zip.add("11333");

        //setup webdrive
        WebDriverManager.chromedriver().setup();
        //chrome optoins
        ChromeOptions options = new ChromeOptions();
        //optoins arguemtn
        options.addArguments("start-maximized");
        options.addArguments("incognito");

        //set up webdriver
        WebDriver driver = new ChromeDriver(options);

        for( int i=0; i < zip.size(); i++ ) {

            //navigate teo weight watchers
            try {
                driver.navigate().to("https://www.weightwatchers.com/us/");
            }catch(Exception e) {
                System.out.println("Did not search for Wegiht watchers" + e);
            }// try catch exception a

            //click on attend
            try {
                driver.findElement(By.xpath("//*[@class='MenuItem_menu-item__angle-wrapper__1XaUv']")).click();
            }catch(Exception e) {
                System.out.println("Did not click first attend command clicking on second" + e);

                Thread.sleep(1000);
            }// try catch exception b

            //click on unlimited workshop
            try {
                driver.findElement(By.xpath("//*[contains(@class,'MenuItem_subtitle__3LoiE')]")).click();
            }catch(Exception e) {

               //click on new attend tab
                driver.findElement(By.xpath("//*[@data-e2e-name='attend']")).click();
                //clicking unlimited workshop
                driver.findElement(By.xpath("//*[contains(@class,'MenuItem_subtitle__3LoiE')]")).click();

                System.out.println("Did not click unlimited workshop so running second command" + e);
            }// try catch exception c
            Thread.sleep(2000);

            //click on studio
            try {
                driver.findElement(By.xpath("//*[contains(@class,'studioIcon-2TdMR')]")).click();
            }catch(Exception e) {
                System.out.println("Did not click studio" + e);
            }// try catch exception d
            Thread.sleep(1000);

            // type zip code
            try {
                driver.findElement(By.xpath("//*[contains(@id,'location-search')]")).sendKeys(zip.get(i));

            }catch(Exception e) {
                System.out.println("Did not enter zip" + e);
            } // try catch exception e

            // click enters
            try {

                driver.findElement(By.xpath("//*[@class='rightArrow-daPRP']")).click();
            }catch(Exception e) {
                System.out.println("Did not enter zip" + e);
            } // try catch exception 
            Thread.sleep(1000);

            Thread.sleep(3000);

            // listing all links and clicking appropriately
            try {
                List<WebElement> myList = driver.findElements(By.xpath("//*[@class='distance-OhP63']"));

                if (i == 0) {
                    myList.get(2).click();

                } else if (i == 2) {

                    myList.get(1).click();

                } else if (i == 1) {
                    myList.get(2).click();
                } //end of else if

            } catch(Exception e) {
                System.out.println("didinot click on link" + e);
                }// clicking links

           Thread.sleep(2000);

            try {
                //collect the address
                String address = driver.findElement(By.xpath("//*[contains(@class,'locationName-1jro_')]")).getText();
                // now print the search number only
                System.out.println(" My search result for " + zip.get(i) + " is " + address );
                Thread.sleep(3000);

            } catch(Exception e){
                System.out.println("did not collect OR print address " + e);

            } //

            //scroll
            try {
                JavascriptExecutor jse = (JavascriptExecutor) driver;
                jse.executeScript("scroll(0,550)");
            } catch (Exception e){
                System.out.println("diidnot scroll");
            }//scroll
            Thread.sleep(3000);


          //table collect
            try {
               String table = String.valueOf(driver.findElement(By.xpath("//*[@class='scheduleContainerMobile-1RfmF']")).getText());
               System.out.println(table);

            }catch (Exception e){
                System.out.println("did not print table" + e);
            }// schedule table printing




        }//loop
    }//main
}//class
