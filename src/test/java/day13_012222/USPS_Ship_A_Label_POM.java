package day13_012222;

import Reusable_Library.Reusuable_Annotations;
import Reusable_Library.Reusuable_Annotations;
import USPS_Page_Object.BaseClass;
import com.relevantcodes.extentreports.LogStatus;
import org.testng.annotations.Test;

public class USPS_Ship_A_Label_POM extends Reusuable_Annotations {

    @Test
    public void USPS_Verify_Tabs_Then_Ship_A_Label(){

        //navigate to usps
        logger.log(LogStatus.INFO,"Navigating to USPS home page");
        driver.navigate().to("https://www.usps.com");

        //verify the tabs count
        BaseClass.homepage().getNavigationTabsCount();

        //click on Send tab
        BaseClass.homepage().clickOndSendTab();

        //click on print a Label
        BaseClass.sendMailAndPackages().clickOnPrintLabelButton();



    }



}
