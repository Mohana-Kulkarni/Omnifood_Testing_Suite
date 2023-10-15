package org.Helper.LoginHelper;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignUpHelper{
    WebElement registerElement;
    WebElement userElement;
    WebElement emailElement;
    WebElement passwordElement;
    WebElement signUpElement;
    LoginHelper loginHelper = new LoginHelper();

    public void signUp(String username, String password, String email, WebDriver driver) throws InterruptedException{
        registerElement = driver.findElement(By.cssSelector(".signup-link"));
        registerElement.click();

        userElement = driver.findElement(By.cssSelector("input#user-name"));
        userElement.sendKeys(username);

        emailElement = driver.findElement(By.cssSelector("input#email-id"));
        emailElement.sendKeys(email);

        passwordElement = driver.findElement(By.cssSelector("input#pass-word"));
        passwordElement.sendKeys(password);

        signUpElement = driver.findElement(By.cssSelector(".login-btn"));
        signUpElement.click();        
    }
}
