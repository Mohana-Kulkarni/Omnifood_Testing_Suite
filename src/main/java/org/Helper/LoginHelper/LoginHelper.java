package org.Helper.LoginHelper;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginHelper {

    WebElement userElement;
    WebElement passwordElement;
    WebElement loginElement;

    public void login(String username, String password, WebDriver driver) throws InterruptedException{
        
        userElement = driver.findElement(By.xpath("/html//input[@id='user-name']"));
        userElement.sendKeys(username);
        Thread.sleep(1500);

        passwordElement = driver.findElement(By.xpath("/html//input[@id='pass-word']"));
        passwordElement.sendKeys(password);
        Thread.sleep(1500);
        
        loginElement = driver.findElement(By.cssSelector(".login-btn"));
        loginElement.click();
        Thread.sleep(1500);
        
    }
    
}
