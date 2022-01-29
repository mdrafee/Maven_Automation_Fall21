package Assignment;

import Reusable_Library.Reusable_Actions_Loggers;
import Reusable_Library.Reusuable_Annotations;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.sql.Driver;

public class Express_Excel_Reuse_Annotation extends Reusuable_Annotations {



    @Test()
    public void ExpressTest() throws InterruptedException, BiffException, IOException, WriteException {
        //Step 1: read the data from the excel sheet you created
        Workbook readableFile = Workbook.getWorkbook(new File("src/main/resources/express.xls"));

        //step2: locating the worksheet that you created for the workbook
        Sheet readableSheet = readableFile.getSheet(0);

    /*    //will return the physical rows present on the sheet
        int rowCount = readableSheet.getRows();
        int columncount = readableSheet.getColumns();
        System.out.println("My readable row count is " + rowCount);
        System.out.println("My readable row count is " + columncount);
*/

        ///Step 3: create a writable file to mimic readable but you can also write back the results to this file
        WritableWorkbook writableFile = Workbook.createWorkbook(new File("src/main/resources/express_Results.xls"),readableFile);
        WritableSheet writableSheet = writableFile.getSheet(0);


        //will return the physical rows present on the sheet
        int rowCount2 = writableSheet.getRows();
        int columncount2 = writableSheet.getColumns();

        System.out.println("My writable row count is " + rowCount2);
        System.out.println("My writable coloumn count is " + columncount2);


//generate the for/while loop
        int i = 1;
        while( i < rowCount2) {

            //size
            String size = writableSheet.getCell(0,i).getContents();
            //quantity
            String quantity = writableSheet.getCell(1,i).getContents();
            //firstName
            String firstName = writableSheet.getCell(2,i).getContents();
            //lastName
            String lastName = writableSheet.getCell(3,i).getContents();
            //email
            String email = writableSheet.getCell(4,i).getContents();
            //phoneNumber
            String phoneNumber = writableSheet.getCell(5,i).getContents();
            //address
            String address = writableSheet.getCell(6,i).getContents();
            //zipcode
            String zipcode = writableSheet.getCell(7,i).getContents();
            //city
            String city = writableSheet.getCell(8,i).getContents();
            //state
            String state = writableSheet.getCell(9,i).getContents();
            //cardNumber
            String cardNumber = writableSheet.getCell(10,i).getContents();
            //card month
            String expMonth = writableSheet.getCell(11,i).getContents();
            //card year
            String expYear = writableSheet.getCell(12,i).getContents();
            //card cvv
            String cvv = writableSheet.getCell(13,i).getContents();


            logger = reports.startTest("Track a package on EXPRESS");
            //navigate to express
            logger.log(LogStatus.INFO, "Navigate to Express home page");
            driver.navigate().to("https://express.com");

            //veriufy the actual tiitle
            String actualTitle = driver.getTitle();
            if (actualTitle.equals( "Express - Men's & Women's Clothing")) {
                System.out.println("the title matched");
                logger.log(LogStatus.PASS,"the title matched");
            } else { System.out.println("Title didinto match and real title " + actualTitle);
                logger.log(LogStatus.FAIL,"the title DIDINOT MATCH");
            }

            //hover over the womens tab
            Reusable_Actions_Loggers.mouseHover(driver, "//*[text()='Women']", logger, "hovering over women's tab");
            //On the dropdown click on dresses
            Reusable_Actions_Loggers.clickMethod(driver, "//*[text()='Dresses']", logger, "clicking on dresses on drop down");
            Thread.sleep(500);

            //click on second womens dress

            //   Reusable_Actions_Loggers.clickByIndex(driver, "//*[@class='_1vuRDTYH _3jxErwTw']", 1, logger, "click on second image on womens dress");
            //  Thread.sleep(2000);

            //click on the pop than womens dress

            //   Thread.sleep(1000);
            Reusable_Actions_Loggers.clickMethod(driver, "//*[contains(@name,'bluecoreCloseButton')]", logger, "click on pop out");
            //    Thread.sleep(1000);
            Reusable_Actions_Loggers.clickByIndex(driver, "//*[@class='_1vuRDTYH _3jxErwTw']", 1, logger, "click on second image on womens dress");



            //click on size
            // Reusable_Actions_Loggers.clickMethod(driver, "//*[text()='"+size+"']", logger,"click on dress size");
            Reusable_Actions_Loggers.clickMethod(driver, "//*[text()='" + size + "']", logger, "size");
            //click on add to bag
            Reusable_Actions_Loggers.clickMethod(driver, "//*[text()='Add to Bag']", logger, "click add to bag");
            //click on view bag after putting item in cart
            Reusable_Actions_Loggers.clickMethod(driver, "//*[text()='View Bag']", logger, "click view bag");
            //click on check out
            Reusable_Actions_Loggers.clickMethod(driver, "//*[text()='Checkout']", logger, "click on check out");
            //click on continue as guest
            Reusable_Actions_Loggers.clickMethod(driver, "//*[text()='Checkout as Guest']", logger, "click on continue as guest ");
            //enter first name
            Reusable_Actions_Loggers.sendKeysMethod(driver,"//*[@id='contact-information-firstname']", firstName,logger,"enter first n ame ");
            //enter last name
            Reusable_Actions_Loggers.sendKeysMethod(driver,"//*[@name='lastname']", lastName,logger,"enter last name ");
            //email
            Reusable_Actions_Loggers.sendKeysMethod(driver,"//*[@name='email']", email,logger,"enter last name ");
//comfirm email
            Reusable_Actions_Loggers.sendKeysMethod(driver,"//*[@name='confirmEmail']", email,logger,"enter last name ");
//phone numebr
            Reusable_Actions_Loggers.sendKeysMethod(driver,"//*[@name='phone']", phoneNumber,logger,"enter last name ");
//continue
            Reusable_Actions_Loggers.clickMethod(driver, "//*[text()='Continue']", logger, "click on check out");
//address
            Reusable_Actions_Loggers.sendKeysMethod(driver,"//*[@name='shipping.line1']", address,logger,"enter address ");
            // zip
            Reusable_Actions_Loggers.sendKeysMethod(driver,"//*[@name='shipping.postalCode']", zipcode,logger,"enter address ");
            //city
            Reusable_Actions_Loggers.sendKeysMethod(driver,"//*[@name='shipping.city']", city,logger,"enter address ");

            //select on drop down STATE

            Reusable_Actions_Loggers.dropDownByText(driver,"//*[@id='rvndd--shipping.state--3']",state,logger,"selecing state on dropdown");
            //*[@id="rvndd--shipping.state--3"]

//Thread.sleep(10000);
            //click continue
            Reusable_Actions_Loggers.clickMethod(driver, "//*[text()='Continue']", logger, "click continue on shipment page");

            //  Thread.sleep(1000);

            //click continue at delivery options page
            Reusable_Actions_Loggers.clickMethod(driver, "//*[text()='Continue']", logger, "click continue on delivery options page");
            //enter card info
            Reusable_Actions_Loggers.sendKeysMethod(driver,"//*[@id='creditCardNumberInput']",cardNumber,logger,"enter card number");
            //   Thread.sleep(1000);
            //click n on month drop down
            Reusable_Actions_Loggers.dropDownByText(driver,"//*[@name='expMonth']",expMonth,logger,"click on card month");
            //   Thread.sleep(1000);
            //click on card year
            Reusable_Actions_Loggers.dropDownByText(driver,"//*[@id='rvndd--expYear--5']",expYear,logger,"click on card year");
            //  Thread.sleep(1000);
            //enter cvv
            Reusable_Actions_Loggers.sendKeysMethod(driver,"//*[@name='cvv']",cvv,logger,"enter card cvv");
            //     Thread.sleep(1000);
            //place order
            Reusable_Actions_Loggers.clickMethod(driver,"//*[text()='Place Order']",logger,"place order");
            //     Thread.sleep(1000);

            //capture error mssg
            String results = Reusable_Actions_Loggers.getTextMethod(driver,"//*[@id='rvn-note-NaN']",logger,"colclcting the error mssg");
            //   String[] arraysplit = results.split(" ");

            //label
            Label label = new Label(14,i,results);
            System.out.println(label);
            //write on sheet
            writableSheet.addCell(label);


            Thread.sleep(5000);

            driver.manage().deleteAllCookies();
            i=i+1;

        }//loop
        writableFile.write();
        writableFile.close();


    }//end of test

}
