package regressionTest;

import java.time.Duration;

import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class CreateNewAccount extends BaseTest {
    By tryForFree = By.xpath("//a[contains(text(),'Try for free')]");
    By notAMemberYet = By.xpath("//a[contains(text(),'Not a member yet ?')]");
    By usernameInput = By.xpath("//input[@id='user-name']");
    By emailInput = By.xpath("//input[@id='email-id']");
    By passwordInput = By.xpath("//input[@id='pass-word']");
    By signupBtn = By.xpath("//button[contains(text(), Signup)]");
    By loginBtn = By.xpath("//button[contains(text(), Login)]");

    @Test
    public void test1_CreateNewAccount() throws InterruptedException {
        String usernameText = generateRandomString();
        String emailText = generateRandomEmail();
        String passwordText = generateRandomString();

        click(tryForFree);

        // Implicit Wait
        // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        // Explicit Wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.presenceOfElementLocated(notAMemberYet));

        click(notAMemberYet);

        // Registration
        type(usernameInput, usernameText);
        type(emailInput, emailText);
        type(passwordInput, passwordText);

        Thread.sleep(2000);

        click(signupBtn);

        // Login
        type(usernameInput, usernameText);
        type(passwordInput, passwordText);

        Thread.sleep(2000);
        
        click(loginBtn);
    }

    private WebElement find(By locator) {
        return driver.findElement(locator);
    }

    private void click(By locator) {
        find(locator).click();
    }

    private void type(By locator, String text) {
        find(locator).sendKeys(text);
    }

    private String generateRandomEmail() {
        return RandomStringUtils.random(5, true, true) + "@email.com";
    }

    private String generateRandomString() {
        return RandomStringUtils.random(7, true, true);
    }
}

