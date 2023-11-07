package org.Helper.RedirectHelper;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartRedirectHelper {
    WebElement howItWorksElement;

    WebElement mealsElement;

    WebElement cartElement;


    public void howItWorks(WebDriver driver) throws InterruptedException {
        howItWorksElement = driver.findElement(By.cssSelector("li:nth-of-type(1) > .main-nav-link"));
        howItWorksElement.click();
        Thread.sleep(1500);
    }

    public void meals(WebDriver driver) throws InterruptedException{
        mealsElement = driver.findElement(By.cssSelector("li:nth-of-type(2) > .main-nav-link"));
        mealsElement.click();
        Thread.sleep(1500);
    }

    public void cart(WebDriver driver) throws InterruptedException{
        cartElement = driver.findElement(By.cssSelector("li:nth-of-type(3) > .main-nav-link"));
        cartElement.click();
        Thread.sleep(1500);
    }
    
}
