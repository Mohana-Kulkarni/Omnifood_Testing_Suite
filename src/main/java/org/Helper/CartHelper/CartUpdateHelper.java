package org.Helper.CartHelper;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartUpdateHelper {

    WebElement addItemElement;
    WebElement subItemElement;
    WebElement count;
    WebElement item;
    WebElement total;
    int value1=0, value2=0, itemCount1=0, itemCount2=0, totalValue1=0, totalValue2=0;

    public void addItem(WebDriver driver) throws InterruptedException{
        count = driver.findElement(By.cssSelector("p#qty-1"));
        total = driver.findElement(By.cssSelector("p#total"));
        item = driver.findElement(By.cssSelector("p#checkout-1"));
        value1 = Integer.parseInt(count.getText());
        totalValue1 = Integer.parseInt(total.getText().replaceAll("[^0-9]", ""));
        itemCount1 = Integer.parseInt(item.getText());
        addItemElement = driver.findElement(By.cssSelector("[onclick='add_qty(1)']"));
        addItemElement.click();
        Thread.sleep(1000);
        value2 = Integer.parseInt(count.getText());
        totalValue2 = Integer.parseInt(total.getText().replaceAll("[^0-9]", ""));
        itemCount2 = Integer.parseInt(item.getText());
        if(value2>value1 && totalValue2==2*(totalValue1) && itemCount2>itemCount1){
            System.out.println("Add functionality works.");
        }else{
            System.out.println("Add functionality does not work.");
        }
    }

    public void subItem(WebDriver driver) throws InterruptedException{
        count = driver.findElement(By.cssSelector("p#qty-1"));
        total = driver.findElement(By.cssSelector("p#total"));
        item = driver.findElement(By.cssSelector("p#checkout-1"));
        value1 = Integer.parseInt(count.getText());
        totalValue1 = Integer.parseInt(total.getText().replaceAll("[^0-9]", ""));
        itemCount1 = Integer.parseInt(item.getText());
        subItemElement = driver.findElement(By.cssSelector("[onclick='sub_qty(1)']"));
        subItemElement.click();
        Thread.sleep(1000);
        value2 = Integer.parseInt(count.getText());
        totalValue2 = Integer.parseInt(total.getText().replaceAll("[^0-9]", ""));
        itemCount2 = Integer.parseInt(item.getText());
        if(value2<value1 && 2*totalValue2==(totalValue1) && itemCount2<itemCount1){
            System.out.println("Subtract functionality works.");
        }else{
            System.out.println("Subtract functionality does not work.");
        }

    }

    public void setQuantity(WebDriver driver, String quantity) throws InterruptedException{
        count = driver.findElement(By.cssSelector("p#qty-1"));
        total = driver.findElement(By.cssSelector("p#total"));
        item = driver.findElement(By.cssSelector("p#checkout-1"));
        value1 = Integer.parseInt(count.getText());
        totalValue1 = Integer.parseInt(total.getText().replaceAll("[^0-9]", ""));
        itemCount1 = Integer.parseInt(item.getText());
        addItemElement = driver.findElement(By.cssSelector("[onclick='add_qty(1)']"));
        addItemElement.sendKeys(quantity);
    }
    
}
