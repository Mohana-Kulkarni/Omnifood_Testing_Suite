package org.Helper.HomePageHelper;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BookTableHelper {
    WebElement bookTableElement;
    WebElement dateElement;
    WebElement timeElement;
    WebElement personCountElement;
    WebElement reserveButton;

    public void bookTable(String date, String time, String personCount, WebDriver driver) throws InterruptedException{
        bookTableElement = driver.findElement(By.cssSelector(".reserve-link"));
        bookTableElement.click();

        dateElement = driver.findElement(By.cssSelector("input#date"));
        dateElement.sendKeys(date);

        timeElement = driver.findElement(By.cssSelector("input#time"));
        timeElement.sendKeys(time);

        personCountElement = driver.findElement(By.cssSelector("input#person-count"));
        personCountElement.sendKeys(personCount);

        reserveButton = driver.findElement(By.cssSelector(".reserve-btn"));
        reserveButton.click();        
    }
}
