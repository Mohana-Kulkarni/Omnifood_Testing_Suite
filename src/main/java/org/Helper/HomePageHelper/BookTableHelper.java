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
        Thread.sleep(1500);

        dateElement = driver.findElement(By.cssSelector("input#date"));
        dateElement.sendKeys(date);
        Thread.sleep(1500);

        timeElement = driver.findElement(By.cssSelector("input#time"));
        timeElement.sendKeys(time);
        Thread.sleep(1500);

        personCountElement = driver.findElement(By.cssSelector("input#person-count"));
        personCountElement.sendKeys(personCount);
        Thread.sleep(1500);

        reserveButton = driver.findElement(By.cssSelector(".reserve-btn"));
        reserveButton.click();        
        Thread.sleep(1500);
    }
}
