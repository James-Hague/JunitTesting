


import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;



public class FireFoxDriverTest {
    WebDriver driver;


    @Test
    public void testFireFoxSearch() throws InterruptedException {
        // Optional, if not specified, WebDriver will search your path for firefox driver.

        System.setProperty("webdriver.gecko.driver", "C:/Users/James/Desktop/QA_Software/FireFoxDriver/geckodriver.exe");
        driver = new FirefoxDriver();
        driver.get("https://uk.yahoo.com/");
        Thread.sleep(4000);
        //WebElement search = driver.findElement(By.name("q"));
        //search.sendKeys("superman");
        driver.quit();
    }

}
