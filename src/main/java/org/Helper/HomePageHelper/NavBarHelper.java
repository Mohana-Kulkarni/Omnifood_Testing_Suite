package org.Helper.HomePageHelper;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NavBarHelper {
    WebElement howItWorksElement;
    WebElement sectionHow;
    WebElement Meals;
    WebElement Testimonials;
    WebElement Pricing;

    public void howItWorks(WebDriver driver) throws Exception{
        howItWorksElement = driver.findElement(By.cssSelector("li:nth-of-type(1) > .main-nav-link"));
        howItWorksElement.click();
        Thread.sleep(1500);
        sectionHow = driver.findElement(By.cssSelector("#testimonials"));
        if(sectionHow.isDisplayed()){
            System.out.println("Nav Worked");
        }else{
            System.out.println("It Didnt");
        }

    }

    public void meals(WebDriver driver) throws Exception{
        Meals = driver.findElement(By.cssSelector("li:nth-of-type(2) > .main-nav-link"));
        Meals.click();
        Thread.sleep(1500);
    }

    public void testimonials(WebDriver driver) throws Exception {
        Testimonials = driver.findElement(By.cssSelector("li:nth-of-type(3) > .main-nav-link"));
        Testimonials.click();
        Thread.sleep(1500);
    }

    public void pricing(WebDriver driver) throws Exception{
        Pricing = driver.findElement(By.cssSelector("li:nth-of-type(4) > .main-nav-link"));
        Pricing.click();
        Thread.sleep(1500);
    }
}
