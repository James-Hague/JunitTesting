

import java.io.File;
import java.io.IOException;

//import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;



public class FireFoxDriverTest {
    WebDriver driver;
    ExtentReports report;
    ExtentTest test;



    @Test
    public void testFireFoxSearch() throws InterruptedException {
        // Optional, if not specified, WebDriver will search your path for firefox driver.

        System.setProperty("webdriver.gecko.driver", "C:/Users/James/Desktop/QA_Software/FireFoxDriver/geckodriver.exe");
        driver = new FirefoxDriver();
        driver.get("http://demoqa.com/");
        Thread.sleep(2000);
        //WebElement search = driver.findElement(By.name("q"));
        //search.sendKeys("superman");
        // MOUSE CLICKS


        // pass scenario
    }


          @Test(priority = 1, enabled = true)
        public void verifyHomePageTitle() {

            // where to create the report file
            report = new ExtentReports(
                    "C:/Users/James/QA_WORK/Logs/automationreport.html",
                    true);
            // init/start the test
            test = report.startTest("Verify application Title");
            System.setProperty("webdriver.gecko.driver",
                    "C:/Users/James/Desktop/QA_Software/FireFoxDriver/geckodriver.exe");
            driver = new FirefoxDriver();
            driver.manage().window().maximize();
            // add a note to the test
            test.log(LogStatus.INFO, "Browser started");
            driver.get("https://www.qa.com/");

            String title = driver.getTitle();
            System.out.println(title);
            if (title.equals(
                    "IT Training | Project Management Training | Business Skills Training | QA")) {
                // report the test as a pass
                test.log(LogStatus.PASS, "verify Title of the page");
            } else {
                test.log(LogStatus.FAIL, "verify Title of the page");
            }
            report.endTest(test);
            report.flush();
            driver.quit();
        }

}


