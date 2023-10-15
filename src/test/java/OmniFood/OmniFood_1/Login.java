package OmniFood.OmniFood_1;




import org.Helper.LoginHelper.LoginHelper;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import OmniFood.BaseHelper;
import OmniFood.TestInfo;


public class Login extends LoginHelper{

    private String username = "Prathamesh";
    private String password = "12345";
    WebDriver driver;
    
    
    
    



    @TestInfo(TestCaseID = "TC001", FunctionalArea = "Login", Description = "LogIn Functionality")


    @Test
    public void test() throws InterruptedException{
        BaseHelper.setUp();
        driver = BaseHelper.getDriver();
        login(username, password, driver);
       

    }

    

    

    
    


    

    
}
