package DAY5_12182021;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_Array_Loop {

    //search multiple cities and ech time capture the serach number from the result page

    public static void main(String[] args) throws InterruptedException {
        // set array
        String[] cities = new String[3];

        cities[0] = "Brooklyn";
        cities[1] = "Queens";
        cities[2] = "bronx ";
   //     cities[3] = "Bronx";

        // set the property of the chromedriver
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        // DEFINE WEBDRIVER
        WebDriver driver = new ChromeDriver();

        for(int i=0; i<cities.length; i++){

            //Simpkly open google
            driver.navigate().to("https://www.google.com");

            //maaximize your your browser
            driver.manage().window().maximize();

            Thread.sleep(2000);

            //searching for cars on google search field
            driver.findElement(By.xpath("//*[@name='q']")).sendKeys(cities[i]);

            //hit submit on google search button
            driver.findElement(By.xpath("//*[@name='q']")).submit();

            //wait time
            Thread.sleep(3000);

            //initialize result with the text
            String result = driver.findElement(By.xpath("//*[@class='address-2PZwW']")).getText();

            //declare the array vairble to split the result
            String[] arrayResult = result.split(" ");

            // now print the search number only
            System.out.println("My address is"+ cities[i] + " is "+ arrayResult[4] );

            // clost it

        };// end of for loop
        driver.quit();
    }//end mian
}//end of class
