
import jdk.nashorn.internal.ir.Block;
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
            driver.get("http://thedemosite.co.uk/");
            String targetURL = driver.getCurrentUrl();

            Thread.sleep(3000);  // Let the user actually see something!
            driver.get("http://thedemosite.co.uk/addauser.php");
            Thread.sleep(5000);  // Let the user actually see something!
            //WebElement searchBox = driver.findElement(By.name("q"));
            //searchBox.sendKeys("ChromeDriver");
            //searchBox.submit();
            // USERNAME
            WebElement userName = driver.findElement(By.name("username"));
            userName.sendKeys("BobRoss");
            WebElement userPassword = driver.findElement(By.name("password"));
            userPassword.sendKeys("BobPassword");
            WebElement addUser = driver.findElement(By.name("FormsButton2"));
            addUser.click();
            Thread.sleep(5000);  // Let the user actually see something!
            // LOGIN
            driver.get("http://thedemosite.co.uk/login.php");
            WebElement loginUser = driver.findElement(By.name("username"));
            loginUser.sendKeys("BobRoss");
            WebElement enterPassword = driver.findElement(By.name("password"));
            enterPassword.sendKeys("BobPassword");
            WebElement logIn = driver.findElement(By.name("FormsButton2"));
            logIn.click();
            Thread.sleep(5000);  // Let the user actually see something!
            WebElement Succes = driver.findElement(By.cssSelector("body > table > tbody > tr > td.auto-style1 > big > blockquote > blockquote > font > center > b"));

            assertEquals(Succes.getText(), "**Successful Login**");

            //assertEquals(targetURL, "https://www.qa.com/");
            System.out.println("assert win");
            driver.quit();
        }

    }



