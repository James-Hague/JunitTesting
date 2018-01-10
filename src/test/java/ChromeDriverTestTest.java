
import jdk.nashorn.internal.ir.Block;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.sql.Driver;

import static org.junit.Assert.assertEquals;


public class ChromeDriverTestTest {
    WebDriver driver = new ChromeDriver();
    Actions builder = new Actions(driver);

    @Test
    public void testGoogleSearch() throws InterruptedException {
        // Optional, if not specified, WebDriver will search your path for chromedriver.
        System.setProperty("webdriver.chrome.driver", "C:/Users/James/Desktop/QA_Software/chromedriver_win32/chromedriver.exe");
        driver.get("http://demoqa.com/");
        //String targetURL = driver.getCurrentUrl();
        // MOUSE CLICKS
        driver.findElement(By.cssSelector("#menu-item-140 > a")).click();
        WebElement dragStuff = driver.findElement(By.cssSelector("#draggable"));
        Thread.sleep(2000);
        builder.dragAndDropBy(dragStuff, 200, 0).perform();
        Thread.sleep(4000);
        driver.quit();
    }


    @Test
    public void droppableTest() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:/Users/James/Desktop/QA_Software/chromedriver_win32/chromedriver.exe");
        driver.get("http://demoqa.com/");
        driver.findElement(By.cssSelector("#menu-item-141 > a")).click();
        WebElement draganddrop = driver.findElement(By.cssSelector("#draggableview"));
        Thread.sleep(2000);
        builder.dragAndDropBy(draganddrop, 150, 0).perform();
        Thread.sleep(4000);
        driver.quit();


    }


    @Test
    public void sizeable1() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:/Users/James/Desktop/QA_Software/chromedriver_win32/chromedriver.exe");
        driver.get("http://demoqa.com/");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("#menu-item-143 > a")).click();
        Thread.sleep(2000);
        WebElement changeSize = driver.findElement(By.cssSelector("#resizable > div.ui-resizable-handle.ui-resizable-se.ui-icon.ui-icon-gripsmall-diagonal-se"));
        builder.dragAndDropBy(changeSize, 200, 300).perform();
        Thread.sleep(2000);
        driver.quit();


    }
    @Test
    public void Selectable() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:/Users/James/Desktop/QA_Software/chromedriver_win32/chromedriver.exe");
        driver.get("http://demoqa.com/");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("#menu-item-142 > a")).click();
        WebElement select = driver.findElement(By.cssSelector("#selectable >li:nth-child(2)"));
        builder.dragAndDropBy(select,0,400).perform();
        Thread.sleep(4000);
        driver.quit();
    }

}


    //PREVIOUS STUFF
/*
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
            System.out.println("assert win"); */







