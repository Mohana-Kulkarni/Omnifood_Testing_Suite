package OmniFood.OmniFood_1;

import org.Helper.LoginHelper.LoginHelper;
import org.Helper.MealsHelper.AddToCartHelper;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import OmniFood.BaseHelper;
import OmniFood.TestInfo;

public class Meals extends AddToCartHelper{

    private String username = "Prathamesh";
    private String password = "12345";
    WebDriver driver;
    LoginHelper loginHelper = new LoginHelper();
    
    
    
    



    @TestInfo(TestCaseID = "TC004", FunctionalArea = "Meals", Description = "Meals Functionality")


    @Test
    public void test() throws InterruptedException{
        BaseHelper.setUp();
        driver = BaseHelper.getDriver();
        loginHelper.login(username, password, driver);
        gotoCart(driver);
        

       

    }
    
}
