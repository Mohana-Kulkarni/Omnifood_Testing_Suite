package OmniFood.OmniFood_1;

import org.Helper.LoginHelper.LoginHelper;
import org.Helper.LoginHelper.SignUpHelper;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import OmniFood.BaseHelper;
import OmniFood.TestInfo;

public class Signup extends SignUpHelper {

    private String username = "User91";
    private String email = "user91@gmail.com";
    private String password = "12345";
    LoginHelper login = new LoginHelper();
    WebDriver driver;
    

    @TestInfo(TestCaseID = "TC002", FunctionalArea = "SignUp", Description = "SignUp Functionality")

    @Test
    public void test() throws InterruptedException{
        BaseHelper.setUp();
        driver = BaseHelper.getDriver();
        signUp(username, password, email, driver);
        login.login(username, password, driver);
        
    }

    
}
