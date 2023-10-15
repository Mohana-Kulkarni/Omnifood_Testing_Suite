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

    public void howItWorks(WebDriver driver){
        howItWorksElement = driver.findElement(By.cssSelector("li:nth-of-type(1) > .main-nav-link"));
        howItWorksElement.click();
        sectionHow = driver.findElement(By.cssSelector("#testimonials"));
        if(sectionHow.isDisplayed()){
            System.out.println("Nav Worked");
        }else{
            System.out.println("It Didnt");
        }

    }

    public void meals(WebDriver driver){
        Meals = driver.findElement(By.cssSelector("li:nth-of-type(2) > .main-nav-link"));
        Meals.click();
    }

    public void testimonials(WebDriver driver){
        Testimonials = driver.findElement(By.cssSelector("li:nth-of-type(3) > .main-nav-link"));
        Testimonials.click();
    }

    public void pricing(WebDriver driver){
        Pricing = driver.findElement(By.cssSelector("li:nth-of-type(4) > .main-nav-link"));
        Pricing.click();
    }
}
