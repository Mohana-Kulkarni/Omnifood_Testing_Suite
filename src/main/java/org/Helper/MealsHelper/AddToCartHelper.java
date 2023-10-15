package org.Helper.MealsHelper;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddToCartHelper {
    
    WebElement mealBtnElement;
    WebElement addBtnElement;
    WebElement cartBtnElement;

    public void openMealMenu(WebDriver driver){
        mealBtnElement = driver.findElement(By.cssSelector("li:nth-of-type(2) > .main-nav-link"));
        mealBtnElement.click();
    }

    public void AddMeal(WebDriver driver){
        openMealMenu(driver);
        addBtnElement = driver.findElement(By.cssSelector("[onclick='add_to_cart(1)']"));
        addBtnElement.click();
    }

    public void gotoCart(WebDriver driver){
        AddMeal(driver);
        cartBtnElement = driver.findElement(By.cssSelector(".cart-btn > img[alt='cart-icon']"));
        cartBtnElement.click();

    }
}
