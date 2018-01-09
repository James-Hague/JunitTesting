
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;

import static org.junit.Assert.assertEquals;


public class ChromeDriverTestTest {

        @Test
        public void testGoogleSearch() throws InterruptedException {
            // Optional, if not specified, WebDriver will search your path for chromedriver.
            System.setProperty("webdriver.chrome.driver", "C:/Users/James/Desktop/QA_Software/chromedriver_win32/chromedriver.exe");

            WebDriver driver = new ChromeDriver();
            driver.get("https://www.qa.com/");
            String targetURL = driver.getCurrentUrl();

            Thread.sleep(3000);  // Let the user actually see something!
            WebElement searchBox = driver.findElement(By.name("q"));
            //searchBox.sendKeys("ChromeDriver");
            //searchBox.submit();
            Thread.sleep(3000);  // Let the user actually see something!

            assertEquals(targetURL, "https://www.qa.com/");
            System.out.println("Twan sucks");
            driver.quit();
        }

    }



