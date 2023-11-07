package org.Helper.LoginHelper;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogOutHelper {

    WebElement logOutElement;

    public void logOut(WebDriver driver) throws InterruptedException{ 
        logOutElement = driver.findElement(By.linkText("Logout"));
        logOutElement.click();
        Thread.sleep(1500);
    }
    
}
