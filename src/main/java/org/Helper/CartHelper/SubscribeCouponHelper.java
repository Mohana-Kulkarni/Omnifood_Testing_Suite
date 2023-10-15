package org.Helper.CartHelper;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SubscribeCouponHelper {

    WebElement pricingElement;
    WebElement subscriptionElement;
    WebElement confirmBtnElement;
    String status;
    
    public void subscribe(WebDriver driver){
        pricingElement = driver.findElement(By.cssSelector("li:nth-of-type(4) > .main-nav-link"));
        pricingElement.click();
        subscriptionElement = driver.findElement(By.cssSelector("button#complete-btn"));
        status = subscriptionElement.getText();
        if(status.equals("Get Subscription")){
            subscriptionElement.click();
            confirmBtnElement = driver.findElement(By.cssSelector("[onclick='confirmPurchase()']"));
            confirmBtnElement.click();
        } 
    }

    public void unsubscribe(WebDriver driver){
        pricingElement = driver.findElement(By.cssSelector("li:nth-of-type(4) > .main-nav-link"));
        pricingElement.click();
        subscriptionElement = driver.findElement(By.cssSelector("button#complete-btn"));
        status = subscriptionElement.getText();
        if(status=="Already Subscribed"){
            subscriptionElement.click();
            confirmBtnElement = driver.findElement(By.cssSelector("[onclick='confirmPurchase()']"));
            confirmBtnElement.click();
        } 
    }

}
