import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

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
    public void Test() throws InterruptedException, IOException {


        driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "C:/Users/James/Desktop/QA_Software/chromedriver_win32/chromedriver.exe");
        //LOAD SITE
        driver.get("https://www.amazon.co.uk/ref=nav_logo/258-8646541-4617941");
        Thread.sleep(1000);

        // SAVE COOKIE TO FILE
        File f = new File("browser.data");
        f.delete();
        f.createNewFile();
        BufferedWriter bos = new BufferedWriter(new FileWriter(f));

        for(Cookie ck : driver.manage().getCookies()) {
            bos.write((ck.getName()+";"+ck.getValue()+";"+ck.getDomain()
                    +";"+ck.getPath()+";"+ck.getExpiry()+";"+ck.isSecure()));
            bos.newLine();
        }
        // READ COOKIE





        // LOGIN
        driver.findElement(By.cssSelector("#nav-link-yourAccount")).click();
        driver.findElement(By.id("ap_email")).sendKeys("jameshague3dartist@gmail.com");
        driver.findElement(By.id("ap_password")).sendKeys(System.getenv("AMAZON_PASSWORD"));
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("#signInSubmit")).click();
        Thread.sleep(3000);




        driver.quit();



    }

    @After
    public void tearDown() throws Exception {
    }
}