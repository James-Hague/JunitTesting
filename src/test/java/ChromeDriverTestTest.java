import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class ChromeDriverTestTest {


    static WebDriver driver;
    Actions builder = new Actions(driver);

    @BeforeClass
    public static void beforeTest() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:/Users/Admin/Desktop/QATESTING/chromedriver_win32/chromedriver.exe");
        driver = new ChromeDriver();
    }

    @AfterClass
    public static void closeApp() throws InterruptedException {

        driver.quit();


    }

    @Test
    public void testGoogleSearch() throws InterruptedException {
        // Optional, if not specified, WebDriver will search your path for chromedriver.

        driver.get("http://demoqa.com/");
        //String targetURL = driver.getCurrentUrl();
        // MOUSE CLICKS
        driver.findElement(By.cssSelector("#menu-item-140 > a")).click();
        WebElement dragStuff = driver.findElement(By.cssSelector("#draggable"));
        Thread.sleep(2000);
        builder.dragAndDropBy(dragStuff, 200, 0).perform();
        Thread.sleep(4000);

    }

    @Test
    public void droppableTest() throws InterruptedException {


        driver.get("http://demoqa.com/");
        driver.findElement(By.cssSelector("#menu-item-141 > a")).click();
        WebElement draganddrop = driver.findElement(By.cssSelector("#draggableview"));
        Thread.sleep(2000);
        builder.dragAndDropBy(draganddrop, 150, 0).perform();
        Thread.sleep(4000);

    }

    @Test
    public void sizeable1() throws InterruptedException {

        driver.get("http://demoqa.com/");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("#menu-item-143 > a")).click();
        Thread.sleep(2000);
        WebElement changeSize = driver.findElement(By.cssSelector("#resizable > div.ui-resizable-handle.ui-resizable-se.ui-icon.ui-icon-gripsmall-diagonal-se"));
        builder.dragAndDropBy(changeSize, 200, 300).perform();
        Thread.sleep(2000);

    }

    @Test
    public void selectable() throws InterruptedException {


        driver.get("http://demoqa.com/");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("#menu-item-142 > a")).click();
        WebElement select = driver.findElement(By.cssSelector("#selectable >li:nth-child(1)"));
        builder.dragAndDropBy(select, 0, 400).perform();
        Thread.sleep(4000);

    }

    @Test
    public void sortable() throws InterruptedException {

        driver.get("http://demoqa.com/");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("#menu-item-151 > a")).click();
        WebElement sortMove = driver.findElement(By.cssSelector("#sortable > li:nth-child(7)"));
        builder.dragAndDropBy(sortMove, 0, -200).perform();
        for (int i = 0; i < 6; i++) {
            Thread.sleep(500);
            builder.dragAndDropBy(driver.findElement(By.cssSelector("#sortable > li:nth-child(7)")), 0, -200).perform();
        }
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







