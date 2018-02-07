package com.test.cases;


import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import com.commens.pageobject.LoginPage;
import com.commens.pageobject.OrderNavigation;
import com.test.base.TestBase;

public class LoginPageTest extends TestBase {

    @Test
    public void init() throws Exception {

        //driver.get("https://www.facebook.com");
        LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
        loginpage.setUsernameTextBox("yuy");
        loginpage.setPassword("123456");
        loginpage.clickOnLoginButton();
    }

}
