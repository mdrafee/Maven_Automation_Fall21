package DAY10_01092022;

import DAY9_01082022.Reusable_Actions;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

import java.util.ArrayList;

public class TestNG_GoogleSearch {
    /*
   precondition - set the driver and navigate to google website
   test 1 - verify the google title and search for google keyword and hit submit
   test 2 - capture search result and only print out the search number
   post condition - quit your driver
 */
/*
    //declare the webdriver outside of the annotation methods so it can be called on all the methods
    WebDriver driver;

    @BeforeSuite
    public void SetTheDriver(){
        driver = Reusable_Actions.setDriver();
        //navigate google page
        driver.navigate().to("https://www.google.com");
    }//end of precondition

    @Test(priority = 1)
    public void SearchForAKeyword(){
        //verify the title says 'Google'
        String actualTitle = driver.getTitle();
        if(actualTitle.equals("Google")){
            System.out.println("Title matches as 'Google'");
        } else {
            System.out.println("Title doesn't match. Actual title is " + actualTitle);
        }

        //search for a keyword
        Reusable_Actions.sendKeysMethod(driver,"//*[@name='q']","Cars","Google Search");
        //submit
        Reusable_Actions.submitMethod(driver,"//*[@name='btnK']","Submit Button");

    }//end of test 1

    @Test(priority = 2)
    public void CaptureSearchNumber(){
        String result = Reusable_Actions.getTextMethod(driver,"//*[@id='result-stats']","Search Result");
        String[] arrayResult = result.split(" ");
        System.out.println("My search number for cars is " + arrayResult[1]);
    }//end of test 2

    @AfterSuite
    public void quitSession(){
        driver.quit();
    }

    @BeforeMethod
    public void beforeTest(){
        System.out.println("This executes before each test");
    }

    @AfterMethod
    public void afterTest(){
        System.out.println("This executes after each test");
    }
    //declare the webdriver outside of the annotation methods so it can be called on all the methods
   // WebDriver driver;

    @BeforeSuite
    public void SetTheDriver(){
        driver = Reusable_Actions.setDriver();
    }//end of precondition

    @Test
    public void googleSearchLoop(){
        ArrayList<String > cars = new ArrayList<>();
        cars.add("BMW");
        cars.add("Mercedes");
        cars.add("Tesla");

        for(int i = 0; i < cars.size(); i++){
            //navigating to google
            driver.navigate().to("https://www.google.com");
            //entering a unique keyword from array list
            Reusable_Actions.sendKeysMethod(driver,"//*[@name='q']",cars.get(i),"Search Field");



        }


    }//end of test
    /*

    @AfterSuite
    public void endSession(){
        driver.quit();
    }
*/
}

