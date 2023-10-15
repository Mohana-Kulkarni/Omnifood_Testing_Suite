package OmniFood.OmniFood_1;

import org.Helper.HomePageHelper.NavBarHelper;
import org.Helper.LoginHelper.LoginHelper;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import OmniFood.BaseHelper;
import OmniFood.TestInfo;

public class HomeNavbar extends NavBarHelper {

    private String username = "Prathamesh";
    private String password = "12345";
    WebDriver driver;
    LoginHelper loginHelper = new LoginHelper();

    @TestInfo(TestCaseID = "TC007", FunctionalArea = "Home", Description = "Navigation Functionality")

    @Test
    public void test_how_it_works() throws InterruptedException{
        BaseHelper.setUp();
        driver = BaseHelper.getDriver();
        loginHelper.login(username, password, driver);
        howItWorks(driver);
        BaseHelper.tearDown();
    }

    @Test
    public void test_meals() throws InterruptedException{
        BaseHelper.setUp();
        driver = BaseHelper.getDriver();
        loginHelper.login(username, password, driver);
        meals(driver);
        BaseHelper.tearDown();
    }

    @Test
    public void test_testimonials() throws InterruptedException{
        BaseHelper.setUp();
        driver = BaseHelper.getDriver();
        loginHelper.login(username, password, driver);
        testimonials(driver);
        BaseHelper.tearDown();
    }

    @Test
    public void test_pricing() throws InterruptedException{
        BaseHelper.setUp();
        driver = BaseHelper.getDriver();
        loginHelper.login(username, password, driver);
        pricing(driver);
        BaseHelper.tearDown();
    }
    
}
