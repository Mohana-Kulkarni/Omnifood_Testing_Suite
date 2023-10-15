package org.Helper.CartHelper;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutHelper {
    WebElement  checkout;
    Boolean result;

    public void checkout(WebDriver driver){
        checkout = driver.findElement(By.cssSelector(".checkout-btn"));
        checkout.click();
        result =  driver.findElement(By.cssSelector(".delivery-img")).isDisplayed();
        if(result){
            System.out.println("CheckOut Functionality Works");
        }else{
            System.out.println("CheckOut Functionality Does Not Work");
        }
    }
}
