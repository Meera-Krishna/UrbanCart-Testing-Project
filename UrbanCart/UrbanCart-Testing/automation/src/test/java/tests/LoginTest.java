package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTest extends BaseTest {

    @Test
    public void testValidLogin() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterEmail("testuser@urbancart.com");
        loginPage.enterPassword("ValidPass123!");
        loginPage.clickLogin();
        
        Assert.assertEquals(driver.getTitle(), "UrbanCart - Home", "User is not navigated to homepage on valid login");
    }

    @Test
    public void testInvalidLogin() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterEmail("invalid@urbancart.com");
        loginPage.enterPassword("WrongPass!");
        loginPage.clickLogin();
        
        Assert.assertEquals(loginPage.getErrorMessage(), "Invalid Email or Password");
    }
}
