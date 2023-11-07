package OmniFood.OmniFood_1;

import java.time.Duration;

import org.Helper.CartHelper.SubscribeCouponHelper;
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

public class Subscription extends SubscribeCouponHelper {
    private String username = "Prathamesh";
    private String password = "12345";
    WebDriver driver;
    LoginHelper loginHelper = new LoginHelper();
    WebElement subscribeBtn;

    @TestInfo(TestCaseID = "TC011", FunctionalArea = "Pricing", Description = "Subscription Functionality")

    @Test
    public void test_subscription_complete() throws Exception {
        BaseHelper.setUp();
        driver = BaseHelper.getDriver();
        loginHelper.login(username, password, driver);
        subscribe(driver);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.textToBe(By.cssSelector("button#complete-btn"), "Already Subscribed"));
        subscribeBtn = driver.findElement(By.cssSelector("button#complete-btn"));
        Assert.assertEquals(subscribeBtn.getText(), "Already Subscribed");
        BaseHelper.tearDown();
    }

    @Test
    public void test_subscription_starter() throws Exception {
        BaseHelper.setUp();
        driver = BaseHelper.getDriver();
        loginHelper.login(username, password, driver);
        subscribe_starter(driver);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.textToBe(By.cssSelector("button#starter-btn"), "Already Subscribed"));
        subscribeBtn = driver.findElement(By.cssSelector("button#starter-btn"));
        Assert.assertEquals(subscribeBtn.getText(), "Already Subscribed");
        BaseHelper.tearDown();
    }
}
