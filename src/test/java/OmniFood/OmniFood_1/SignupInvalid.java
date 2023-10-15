package OmniFood.OmniFood_1;

import java.time.Duration;

import org.Helper.LoginHelper.LoginHelper;
import org.Helper.LoginHelper.SignUpHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import OmniFood.BaseHelper;

public class SignupInvalid extends SignUpHelper {
    LoginHelper login = new LoginHelper();
    WebElement errorMessage;
    WebDriver driver;

    @Test
    public void test_email_already_exists() throws InterruptedException{
        String username = "User91";
        String email = "user91@gmail.com";
        String password = "12345";
        BaseHelper.setUp();
        driver = BaseHelper.getDriver();
        signUp(username, password, email, driver);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("p"))); 
        errorMessage = driver.findElement(By.cssSelector("p"));
        Assert.assertEquals(errorMessage.getText(), "Email already exists");
    }
    
    @Test
    public void test_valid_email() throws InterruptedException{
        String username = "User91";
        String email = "user91@gmail";
        String password = "12345";
        BaseHelper.setUp();
        driver = BaseHelper.getDriver();
        signUp(username, password, email, driver);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("p"))); 
        errorMessage = driver.findElement(By.cssSelector("p"));
        Assert.assertEquals(errorMessage.getText(), "Enter valid email");
    }
    
}
