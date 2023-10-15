package OmniFood.OmniFood_1;

import OmniFood.BaseHelper;
import org.Helper.LoginHelper.LoginHelper;
import org.Helper.RedirectHelper.java.MealsRedirectHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class MealsNavbar extends MealsRedirectHelper {

    private String username = "Prathamesh";
    private String password = "12345";
    WebDriver driver;
    LoginHelper loginHelper = new LoginHelper();

    @Test
    public void test_how_it_works() throws InterruptedException{
        BaseHelper.setUp();
        driver = BaseHelper.getDriver();
        loginHelper.login(username, password, driver);
        meals(driver);
        howItWorks(driver);

    }

    @Test
    public void test_meals() throws InterruptedException{
        BaseHelper.setUp();
        driver = BaseHelper.getDriver();
        loginHelper.login(username, password, driver);
        meals(driver);
        meals(driver);
    }

    @Test
    public void test_cart() throws InterruptedException{
        BaseHelper.setUp();
        driver = BaseHelper.getDriver();
        loginHelper.login(username, password, driver);
        meals(driver);
        cart(driver);
    }


}
