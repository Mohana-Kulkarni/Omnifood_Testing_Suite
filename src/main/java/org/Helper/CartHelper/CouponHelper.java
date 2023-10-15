package org.Helper.CartHelper;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CouponHelper {
    
    WebElement viewCouponElement;
    WebElement total;
    WebElement apply;
    WebElement offer;
    int total1=0,total2=0, discount=0;

    public void addCoupon(WebDriver driver) throws InterruptedException{
        total = driver.findElement(By.cssSelector("p#total"));
        total1 = Integer.parseInt(total.getText().replaceAll("[^0-9]", ""));
        viewCouponElement = driver.findElement(By.linkText("View all coupons →"));
        viewCouponElement.click();
        offer = driver.findElement(By.cssSelector(".coupon-discount"));
        discount =Integer.parseInt(offer.getText().replaceAll("[^0-9]", ""));
        apply = driver.findElement(By.cssSelector("button#apply-coupon-btn"));
        apply.click();
        Thread.sleep(1000);
        total2 = Integer.parseInt(total.getText().replaceAll("[^0-9]", ""));
        discount = total1 - ((total1*discount)/100);
        if(discount==total2){
            System.out.println("Coupon Functionality Works");
        }else{
            System.out.println("Coupon Functionality Does Not Work");
        }

        
    }
}
