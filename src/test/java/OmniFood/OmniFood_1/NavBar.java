package OmniFood.OmniFood_1;

import org.Helper.HomePageHelper.NavBarHelper;
import org.Helper.LoginHelper.LoginHelper;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import OmniFood.BaseHelper;
import OmniFood.TestInfo;

public class NavBar extends NavBarHelper {

    private String username = "Prathamesh";
    private String password = "12345";
    WebDriver driver;
    LoginHelper loginHelper = new LoginHelper();

    
    
    
    



    @TestInfo(TestCaseID = "TC001", FunctionalArea = "Login", Description = "LogIn Functionality")


    @Test
    public void test() throws InterruptedException{
        BaseHelper.setUp();
        driver = BaseHelper.getDriver();
        loginHelper.login(username, password, driver);
        howItWorks(driver);
       

    }
    
}
