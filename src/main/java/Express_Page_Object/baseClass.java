package Express_Page_Object;

import Reusable_Library.Reusuable_Annotations;
import USPS_Page_Object.Homepage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class baseClass extends Reusuable_Annotations{
    public baseClass(WebDriver driver){
        PageFactory.initElements(driver,this);
    }//constructor

    //create static reference for usps home page
    public static ExpHomepage homepage(){
        ExpHomepage homepage = new ExpHomepage(driver);
        return  homepage;
    }


    //create a static ref for dress
    public static Womens_Dresses dressestab() {
        Womens_Dresses dressestab = new Womens_Dresses(driver);
        return dressestab;
    }//static ref end dresestab


}
