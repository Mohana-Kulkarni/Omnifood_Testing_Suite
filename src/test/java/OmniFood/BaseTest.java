package OmniFood;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    protected WebDriver driver;

    @BeforeMethod
    public void setUp() {
        String mohana = "C:\\Users\\Kulkarni\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe";
        String jay = "D:/Assignment/BE Assignments/chromedriver-win64/chromedriver-win64/chromedriver.exe";
        String prathamesh = "C:\\Users\\Lenovo\\eclipse-workspace\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe";

        System.setProperty("webdriver.chrome.driver",prathamesh);
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--start-maximized");
        chromeOptions.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(chromeOptions);
        driver.get("https://omnifood-meals.000webhostapp.com/");
    }

    @AfterMethod
    public void tearDown() {
        // driver.quit();
    }
}
