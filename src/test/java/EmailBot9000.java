import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class EmailBot9000 {

    static WebDriver driver;
    Actions builder = new Actions(driver);

    @BeforeClass
    public static void beforeTest() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:/Users/Admin/Desktop/QATESTING/chromedriver_win32/chromedriver.exe");
        driver = new ChromeDriver();
    }


    @Test
    public void createEmail() {

    }

    @Test
    public void sendEmail() {

    }


    @AfterClass
    public static void closeApp() throws InterruptedException {

        driver.quit();
    }


}