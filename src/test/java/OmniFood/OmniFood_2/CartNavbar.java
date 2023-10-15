package OmniFood.OmniFood_2;

import OmniFood.BaseHelper;
import OmniFood.TestInfo;

import org.Helper.LoginHelper.LoginHelper;
import org.Helper.RedirectHelper.CartRedirectHelper;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class CartNavbar extends CartRedirectHelper {

    private String username = "Prathamesh";
    private String password = "12345";
    WebDriver driver;
    LoginHelper loginHelper = new LoginHelper();

    @TestInfo(TestCaseID = "TC010", FunctionalArea = "Cart", Description = "Navigation Functionality")

    @Test
    public void test_how_it_works() throws InterruptedException{
        BaseHelper.setUp();
        driver = BaseHelper.getDriver();
        loginHelper.login(username, password, driver);
        meals(driver);
        cart(driver);
        howItWorks(driver);
        BaseHelper.tearDown();
    }

    @Test
    public void test_meals() throws InterruptedException{
        BaseHelper.setUp();
        driver = BaseHelper.getDriver();
        loginHelper.login(username, password, driver);
        meals(driver);
        cart(driver);
        meals(driver);
        BaseHelper.tearDown();
    }

    @Test
    public void test_cart() throws InterruptedException{
        BaseHelper.setUp();
        driver = BaseHelper.getDriver();
        loginHelper.login(username, password, driver);
        meals(driver);
        cart(driver);
        cart(driver);
        BaseHelper.tearDown();
    }

}
