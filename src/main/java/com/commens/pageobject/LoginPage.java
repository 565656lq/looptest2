package com.commens.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {

    WebDriver driver;
    WebDriverWait wait;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 15);
    }

    // 账号
    @FindBy(how = How.XPATH, using = "//input[@placeholder='账号']")
    WebElement usernameTextBox;

    // 密码
    @FindBy(how = How.XPATH, using = "//input[@placeholder='密码']")
    WebElement passwordTextBox;

    // 登录
    @FindBy(how = How.CLASS_NAME, using = "login_btn")
    WebElement signinButton;

    // 动作
    // 输入用户名
    public void setUsernameTextBox(String username) {
        wait.until(ExpectedConditions.elementToBeClickable(usernameTextBox));
        usernameTextBox.sendKeys(username);
    }

    // 输入密码
    public void setPassword(String strPassword) {
        wait.until(ExpectedConditions.elementToBeClickable(passwordTextBox));
        passwordTextBox.sendKeys(strPassword);
    }

    // 点击登录
    public void clickOnLoginButton() {
        wait.until(ExpectedConditions.elementToBeClickable(signinButton));
        signinButton.click();
    }

}
