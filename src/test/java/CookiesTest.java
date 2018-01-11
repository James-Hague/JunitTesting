import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.sql.Driver;
import java.util.Scanner;

import static org.junit.Assert.*;

public class CookiesTest {
    //DRIVER SET UP
    //String password = CookiesTest.scan();
    WebDriver driver;
    //Actions builder = new Actions(driver);

    public static String scan() {

        //PASSWORD SCANNER INPUT
        System.out.print("Enter Password: ");
        Scanner EnterPass = new Scanner(System.in);
        String passInput;
        passInput = EnterPass.nextLine();
        return passInput;

    }



    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void Test() throws InterruptedException {


        driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "C:/Users/James/Desktop/QA_Software/chromedriver_win32/chromedriver.exe");
        driver.get("https://www.amazon.co.uk/ref=nav_logo/258-8646541-4617941");
        Thread.sleep(1000);





        driver.findElement(By.cssSelector("#nav-link-yourAccount")).click();
        driver.findElement(By.id("ap_email")).sendKeys("jameshague3dartist@gmail.com");
        // LOGIN
        System.out.println(System.getenv("AMAZON_PASSWORD"));
        driver.findElement(By.id("ap_password")).sendKeys(System.getenv("AMAZON_PASSWORD"));
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("#signInSubmit")).click();
        Thread.sleep(3000);
        // saves cookie to file



        driver.quit();



    }

    @After
    public void tearDown() throws Exception {
    }
}