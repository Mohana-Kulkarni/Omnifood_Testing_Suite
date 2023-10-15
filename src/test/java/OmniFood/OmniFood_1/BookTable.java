package OmniFood.OmniFood_1;

import org.Helper.HomePageHelper.BookTableHelper;
import org.Helper.LoginHelper.LoginHelper;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import OmniFood.BaseHelper;
import OmniFood.TestInfo;

public class BookTable extends BookTableHelper {
    WebDriver driver;
    private String username = "Prathamesh";
    private String password = "12345";
    private String date = "10-12-23";
    private String time = "10 am";
    private String personCount = "5";
    LoginHelper loginHelper = new LoginHelper();
    
    @TestInfo(TestCaseID = "TC008", FunctionalArea = "Home", Description = "Book Table Functionality")

    @Test
    public void test_book_table() throws InterruptedException {
        BaseHelper.setUp();
        driver = BaseHelper.getDriver();
        loginHelper.login(username, password, driver);
        bookTable(date, time, personCount, driver);
        BaseHelper.tearDown();
    }
}
