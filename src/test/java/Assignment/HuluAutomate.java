package Assignment;

import DAY6_12192021.FindElement_Exmaples;
import DAY7_12252021.Scroll;
import DAY9_01082022.Reusable_Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class HuluAutomate {


        WebDriver driver;

        @BeforeSuite
        public void setDriver() {

            driver = Reusable_Actions.setDriver();

        } // end of condition


        @Test(priority = 1)
        public void SearchHULU() throws InterruptedException {
            ArrayList<String>  email = new ArrayList<>();
           email.add("m1rafee900@gmail.com");
           email.add("m2rafee900@gmail.com");

           ArrayList<String>  pass = new ArrayList<>();
           pass.add("12345@Md");
            pass.add("123456@Md");

            ArrayList<String> name = new ArrayList<>();
            name.add("md");
            name.add("islam");

            ArrayList<String>  birthday_month = new ArrayList<>();
            birthday_month.add("January");
            birthday_month.add("February");

            ArrayList<String>  birthday_day = new ArrayList<>();
            birthday_day.add("1");
            birthday_day.add("2");

            ArrayList<String>  birthday_year = new ArrayList<>();
            birthday_year.add("1990");
            birthday_year.add("2000");

            ArrayList<String>  gender = new ArrayList<>();
            gender.add("Male");
            gender.add("Female");


            driver.navigate().to("https://www.hulu.com");
            String actualTitle = driver.getTitle();

            if (actualTitle.equals("Stream TV and Movies Live and Online | Hulu")) {
                System.out.println("Title matches " + actualTitle);
            } else {
                System.out.println("Title doesn't match. Actual title is " + actualTitle);
            } //ends actual titile stuff

            //scroll
        /*   try {
                JavascriptExecutor jse = (JavascriptExecutor) driver;
                jse.executeScript("scroll(0,3000)");
            } catch (Exception e){
                System.out.println("diidnot scroll");
            }//scroll
            Thread.sleep(3000);

         */
            //SCORLL
            Reusable_Actions.scrollMethod(driver,"0", "900", "Scroll");


            //clicking on most popular plan
           // driver.findElement(By.xpath("//*[contains(@class,'button--cta button--black plan-card__cta plan-card__0_cta button--black ')]")).click();
            Reusable_Actions.clickMethod(driver,"//*[contains(@class,'button--cta button--black plan-card__cta plan-card__0_cta button--black ')]","click pupular plan");

            //sending keys to create account
            //email
            Reusable_Actions.sendKeysMethod(driver,"//*[@id='email']", email.get(0),"entering email");
            //pass
            Reusable_Actions.sendKeysMethod(driver,"//*[@id='password']", pass.get(0),"entering email");
            //name
            Reusable_Actions.sendKeysMethod(driver,"//*[@id='firstName']", name.get(0),"entering name");
            //month
            //click on month
            Reusable_Actions.clickMethod(driver,"//*[@class='selector-selected input__text placeholder']","Month click step1");
            Reusable_Actions.selectMethod(driver,"//*[@id='birthdayMonth-menu']", "January", "click month");

            //click on date
            Reusable_Actions.clickMethod(driver,"//*[@class='selector-selected input__text placeholder']","date click step1");
            Reusable_Actions.selectMethod(driver,"//*[@id='birthdayDay-menu']", "1", "click date");

            //click on year
            Reusable_Actions.clickMethod(driver,"//*[@class='selector-selected input__text placeholder']","year click step1");
            Reusable_Actions.selectMethod(driver,"//*[@id='birthdayYear-menu']","2000", "click year");

            //click on year
            Reusable_Actions.clickMethod(driver,"//*[@class='selector-selected input__text placeholder']","year click step1");
            Reusable_Actions.selectMethod(driver,"//*[@class='options']","Male", "click gender");

            //click continue
            Reusable_Actions.clickMethod(driver,"//*[contains(@class,'button button--continue ')]","Click continue");







        }//ends of test 1
    //



}//class
