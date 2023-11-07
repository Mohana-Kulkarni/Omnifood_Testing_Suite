package org.Helper.CartHelper;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SubscribeCouponHelper {

    WebElement pricingElement;
    WebElement subscriptionElement;
    WebElement confirmBtnElement;
    String status;
    
    public void subscribe(WebDriver driver) throws Exception{
        pricingElement = driver.findElement(By.cssSelector("li:nth-of-type(4) > .main-nav-link"));
        pricingElement.click();
        subscriptionElement = driver.findElement(By.cssSelector("button#complete-btn"));
        status = subscriptionElement.getText();
        if(status.equals("Get Subscription")){
            subscriptionElement.click();
            Thread.sleep(1500);
            confirmBtnElement = driver.findElement(By.cssSelector("[onclick='confirmPurchase()']"));
            confirmBtnElement.click();
            Thread.sleep(1500);
        } 
    }

    public void subscribe_starter(WebDriver driver) throws Exception{
        pricingElement = driver.findElement(By.cssSelector("li:nth-of-type(4) > .main-nav-link"));
        pricingElement.click();
        subscriptionElement = driver.findElement(By.cssSelector("button#starter-btn"));
        status = subscriptionElement.getText();
        if(status.equals("Get Subscription")){
            subscriptionElement.click();
            Thread.sleep(1500);
            confirmBtnElement = driver.findElement(By.cssSelector("[onclick='confirmPurchase()']"));
            confirmBtnElement.click();
            Thread.sleep(1500);
        } 
    }

    public void unsubscribe(WebDriver driver) throws Exception{
        pricingElement = driver.findElement(By.cssSelector("li:nth-of-type(4) > .main-nav-link"));
        pricingElement.click();
        subscriptionElement = driver.findElement(By.cssSelector("button#complete-btn"));
        status = subscriptionElement.getText();
        if(status=="Already Subscribed"){
            subscriptionElement.click();
            Thread.sleep(1500);
            confirmBtnElement = driver.findElement(By.cssSelector("[onclick='confirmPurchase()']"));
            confirmBtnElement.click();
            Thread.sleep(1500);
        } 
    }

}
