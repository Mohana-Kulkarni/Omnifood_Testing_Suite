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

        passwordElement = driver.findElement(By.xpath("/html//input[@id='pass-word']"));
        passwordElement.sendKeys(password);
        
        loginElement = driver.findElement(By.cssSelector(".login-btn"));
        loginElement.click();
       

    }
    
}
