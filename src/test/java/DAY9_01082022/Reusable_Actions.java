package DAY9_01082022;

import com.sun.jna.WString;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.awt.desktop.SystemEventListener;
import java.util.ArrayList;

public class Reusable_Actions {

    private static String scroll;

    //create a reusable method for WebDriver and ChromeOptions
    public static WebDriver setDriver(){
        //setup chrome driver
        WebDriverManager.chromedriver().setup();
        //declare and define the chrome options
        ChromeOptions options = new ChromeOptions();
        //declare all the arguments you need
        //to maximize my driver
        options.addArguments("start-maximized");
        //set as incognito mode
        options.addArguments("incognito");
        //set as headless(running the driver on background)
        //options.addArguments("headless");
        //define the web driver you are using
        WebDriver driver = new ChromeDriver(options);
        return driver;

    }//end of Webdriver Method

    //creating void click method for any web element
    public static void clickMethod(WebDriver driver, String xpath, String elementName){
        //declare local explicit wait
        WebDriverWait wait = new WebDriverWait(driver,15);
        System.out.println("Clicking on element " + elementName);
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath))).click();
        } catch (Exception e) {
            System.out.println("Unable to click on " + elementName + " Error:" + e);
        }//end of exception
    }//end of click method

    //creating void sendkeys method for any web element
    public static void sendKeysMethod(WebDriver driver, String xpath, String userData, String elementName){
        //declare local explicit wait
        WebDriverWait wait = new WebDriverWait(driver,15);
        System.out.println("Typing on element " + elementName);
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
            //clear first
            element.clear();
            //enter user data
            element.sendKeys(userData);
        } catch (Exception e) {
            System.out.println("Unable to type on " + elementName + " Error:" + e);
        }
    }//end of click sendKeysMethod

    //creating scroll method
    public static void scrollMethod(WebDriver driver, String x, String y, String scroll){
        System.out.println("Performed" + scroll);
        try {
            //scroll to window
            JavascriptExecutor jse = (JavascriptExecutor) driver;
            //scroll by pixels
            jse.executeScript("scroll("+x+","+y+")");

        } catch (Exception e) {
            System.out.println("Unable to " + scroll + " Error:" + e);
        }
    }//end of click scroll







    //creating void submit method for any web element
    public static void submitMethod(WebDriver driver, String xpath, String elementName){
        //declare local explicit wait
        WebDriverWait wait = new WebDriverWait(driver,15);
        System.out.println("Submitting on element " + elementName);
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath))).submit();
        } catch (Exception e) {
            System.out.println("Unable to submit on " + elementName + " Error:" + e);
        }//end of exception
    }//end of submit method


        //create select method
    public static String selectMethod (WebDriver driver, String xpath, String value, String elementname){
        //explicit wait
        WebDriverWait wait = new WebDriverWait(driver, 15);
        System.out.println("Select ELEMENT"+ elementname);
        String result = "";
        /*
        - Get the element with the dropdown items (ul)
        - From there get the elements inside of that object
        - Do a for loop for all those elements and check if the text is equal to the text you're searching for
        - if it matches, you want to click on that element, you also want to exit out of the for loop.
         */
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
            element.sendKeys(value);
        }catch (Exception e) {
            System.out.println("unable to select"+elementname+"Error"+e);
        }
        return result;
    } //select method



    //creating return getText method for any text web element
    public static String gettextMethod (WebDriver driver, String xpath, String elementName){
        //declare local explicit wait
        WebDriverWait wait = new WebDriverWait(driver,15);
        System.out.println("Capturing text on element " + elementName);
        //declare a global variable to capture the text so I can return it
        String result = "";

        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
            //capture text
            result = element.getText();
        } catch (Exception e) {
            System.out.println("Unable to capture text on " + elementName + " Error:" + e);
        }
        return result;
    }//end of click getTextMethod

}//end of java class
