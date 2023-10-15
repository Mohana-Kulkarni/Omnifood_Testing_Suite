package org.Helper.RedirectHelper.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartRedirectHelper {
    WebElement howItWorksElement;

    WebElement mealsElement;

    WebElement cartElement;


    public void howItWorks(WebDriver driver) {
        howItWorksElement = driver.findElement(By.cssSelector("li:nth-of-type(1) > .main-nav-link"));
        howItWorksElement.click();
    }

    public void meals(WebDriver driver){
        mealsElement = driver.findElement(By.cssSelector("li:nth-of-type(2) > .main-nav-link"));
        mealsElement.click();
    }

    public void cart(WebDriver driver){
        cartElement = driver.findElement(By.cssSelector("li:nth-of-type(3) > .main-nav-link"));
        cartElement.click();
    }
    
}
