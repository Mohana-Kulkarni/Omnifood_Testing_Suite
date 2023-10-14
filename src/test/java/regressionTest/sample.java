package regressionTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class sample {

    @Test
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kulkarni\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://omnifood-meals.000webhostapp.com/");
        System.out.println(driver.getTitle());
        driver.findElement(By.linkText("Start eating well")).click();
        driver.findElement(By.id("3")).click();
//        driver.findElement(By.id("//*[@id=\"login\"]/div/div/form/button")).click();
//        driver.quit();
        By notAMemberYet = By.xpath("//input[@id='user-name']");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.presenceOfElementLocated(notAMemberYet));
        driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("abcd");

        driver.findElement(By.linkText("Not a member yet ? Signup")).click();

    }

}
