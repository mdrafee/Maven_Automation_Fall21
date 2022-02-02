package Assignment;

import Express_Page_Object.ExpHomepage;
import Express_Page_Object.baseClass;
import Reusable_Library.Reusuable_Annotations;
import USPS_Page_Object.BaseClass;
import com.relevantcodes.extentreports.LogStatus;
import org.testng.annotations.Test;


public class SmTst_ExpressPOM extends Reusuable_Annotations {
    @Test
    public void Express_Women_Dresses_wrong_Payment_Purchase() {
        //add comment test
        //add second

        //navitage to express
        logger.log(LogStatus.INFO,"Navigate to Express");
        driver.navigate().to("https://www.express.com/");

        // hover over womnes
        baseClass.homepage().hoverwomenstab();
        //click on dress
        baseClass.homepage().womendresses();
        //click on dressindex
        baseClass.dressestab().womensdressclickindex();

    }
}
