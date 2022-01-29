package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;

public class bing_assignemnt {
        public static void main(String[] args) throws InterruptedException {
            //array
            String[] sports = new String[5];

            sports[0] = "golfer";
            sports[1] = "football";
            sports[2] = "soccer";
            sports[3] = "cricket";
            sports[4] = "giants baseball";

                //set property of the location which his chrome driver
                System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");

                //DEFINE WEBDRIVER using the NEW chrome driver
                WebDriver driver = new ChromeDriver();  //initializing chrome drive beucase you need it thats it man

                for(int i=0; i<sports.length; i++) {

                    //driver.navigate
                    driver.navigate().to("https://www.bing.com");

                    //maximazie driver
                    driver.manage().window().maximize();

                    //wait time
                    Thread.sleep(2000);
                    //search in bing
                    driver.findElement(By.xpath("//*[@name='q']")).sendKeys(sports[i]); // //*this means to search= // anywhere, wildcard= *
                                     // wildcard variables doensot have to be exact
                                    // with out wild card only the specific term will be identified
                    //search food dont forget the @ in name
                    driver.findElement(By.xpath("//*[@name='q']")).submit();

                    Thread.sleep(2000);

                    //capture the search result and store it as a variable
                    String result = driver.findElement(By.xpath("//*[@id='b_tween']")).getText();

                    //declatre the array vairb;le to split the result
                    String[] arrayResult = result.split(" ");
                    //learn list set and data set

                    // now print the search number only
                    System.out.println(" My search result for " + sports[i] + " " + arrayResult[0]);
                } //loopend
            // clost it
           // driver.quit();
        }
        }
