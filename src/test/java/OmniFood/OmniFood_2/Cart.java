package OmniFood.OmniFood_2;

import org.Helper.CartHelper.SubscribeCouponHelper;
import org.Helper.CartHelper.CartUpdateHelper;
import org.Helper.CartHelper.CheckoutHelper;
import org.Helper.CartHelper.CouponHelper;
import org.Helper.LoginHelper.LoginHelper;
import org.Helper.MealsHelper.AddToCartHelper;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import OmniFood.BaseHelper;
import OmniFood.TestInfo;

public class Cart extends CartUpdateHelper{

    private String username = "Prathamesh";
    private String password = "12345";
    WebDriver driver;
    LoginHelper loginHelper = new LoginHelper();
    AddToCartHelper addToCartHelper = new AddToCartHelper();
    SubscribeCouponHelper subscribeCouponHelper = new SubscribeCouponHelper();
    CouponHelper couponHelper = new CouponHelper();
    CheckoutHelper checkoutHelper = new CheckoutHelper();
    
    @TestInfo(TestCaseID = "TC005", FunctionalArea = "Cart", Description = "Quantity Functionality")

    @Test
    public void test_meal_quantity() throws Exception{
        BaseHelper.setUp();
        driver = BaseHelper.getDriver();
        loginHelper.login(username, password, driver);
        subscribeCouponHelper.subscribe(driver);
        addToCartHelper.gotoCart(driver);
        addItem(driver);
        subItem(driver);
        BaseHelper.tearDown();
    }

    @TestInfo(TestCaseID = "TC006", FunctionalArea = "Cart", Description = "Checkout Functionality")
    
    @Test
    public void test_checkout() throws Exception{
        BaseHelper.setUp();
        driver = BaseHelper.getDriver();
        loginHelper.login(username, password, driver);
        subscribeCouponHelper.subscribe(driver);
        addToCartHelper.gotoCart(driver);
        checkoutHelper.checkout(driver);
        BaseHelper.tearDown();
    }

    @TestInfo(TestCaseID = "TC014", FunctionalArea = "Cart", Description = "Coupon Functionality")

    @Test
    public void test_add_coupon() throws Exception{
        BaseHelper.setUp();
        driver = BaseHelper.getDriver();
        loginHelper.login(username, password, driver);
        subscribeCouponHelper.subscribe(driver);
        addToCartHelper.gotoCart(driver);
        couponHelper.addCoupon(driver);
        BaseHelper.tearDown();
    }

    @Test
    public void test_remove_coupon() throws Exception{
        BaseHelper.setUp();
        driver = BaseHelper.getDriver();
        loginHelper.login(username, password, driver);
        subscribeCouponHelper.subscribe(driver);
        addToCartHelper.gotoCart(driver);
        couponHelper.addCoupon(driver);
        couponHelper.removeCoupon(driver);
        BaseHelper.tearDown();
    }
}
