package OmniFood.OmniFood_1;

import java.time.Duration;

import org.Helper.LoginHelper.LoginHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import OmniFood.BaseHelper;
import OmniFood.TestInfo;

public class LoginInvalid extends LoginHelper {
    WebElement errorMessage;
    WebDriver driver;
    
    @TestInfo(TestCaseID = "TC012", FunctionalArea = "Login", Description = "Error Validation")

    @Test
    public void test_InvalidPassword() throws InterruptedException{
        String username = "Prathamesh";
        String password = "123456";
        BaseHelper.setUp();
        driver = BaseHelper.getDriver();
        login(username, password, driver);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//p[contains(text(), 'Incorrect Password')]")));
        errorMessage = driver.findElement(By.xpath("//p[contains(text(), 'Incorrect Password')]"));
        Assert.assertEquals(errorMessage.getText(), "Incorrect Password");
    }

    @Test
    public void test_InvalidUser() throws InterruptedException{
        String username = "Prathamesh123";
        String password = "123456";
        BaseHelper.setUp();
        driver = BaseHelper.getDriver();
        login(username, password, driver);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//p[contains(text(), 'Enter a valid Username')]")));
        errorMessage = driver.findElement(By.xpath("//p[contains(text(), 'Enter a valid Username')]"));
        Assert.assertEquals(errorMessage.getText(), "Enter a valid Username");
    }
}
