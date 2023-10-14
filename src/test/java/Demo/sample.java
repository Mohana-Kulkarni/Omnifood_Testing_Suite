package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kulkarni\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://omnifood-meals.000webhostapp.com/");
        System.out.println(driver.getTitle());
        driver.findElement(By.linkText("Start eating well")).click();
        driver.findElement(By.id("3")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div/section/div/div/form/div[1]/div[1]/input")).sendKeys("jay");
        driver.findElement(By.id("//*[@id=\"login\"]/div/div/form/button")).click();
//        driver.quit();

    }

}
