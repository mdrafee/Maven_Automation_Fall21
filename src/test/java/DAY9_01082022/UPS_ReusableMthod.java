package DAY9_01082022;

import org.openqa.selenium.WebDriver;

public class UPS_ReusableMthod {

    public static void main(String[] args) {
        WebDriver driver = Reusable_Actions.setDriver();

        //navigate to usps
        driver.navigate().to("https://www.ups.com/us");

        //click on track
        Reusable_Actions.clickMethod(driver,"//*[text()='Tracking']", "Track");

        //click on track a package
        Reusable_Actions.clickMethod(driver,"//*[text()='Track a Package']", "Track a Package");




    }//method test
}//class
