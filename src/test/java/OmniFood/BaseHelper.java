package OmniFood;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseHelper {

    public static  WebDriver driver;

    
    public static void setUp() {
        String mohana = "C:\\Users\\Kulkarni\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe";
        String jay = "D:/Assignment/BE Assignments/chromedriver-win64/chromedriver-win64/chromedriver.exe";
        String prathamesh = "C:\\Users\\Lenovo\\eclipse-workspace\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe";

        System.setProperty("webdriver.chrome.driver",jay);
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--start-maximized");
        chromeOptions.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(chromeOptions);
        driver.get("http://localhost/online_food_ordering_system/Omnifood-2.0/Omnifood-2.0/login.php");
    }

    public static WebDriver getDriver(){
        return driver;
    }
    
    public static void tearDown() {
        driver.quit();
    } 
    
}
