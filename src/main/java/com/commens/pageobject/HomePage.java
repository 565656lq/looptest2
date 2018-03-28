package com.commens.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * User: zuoxiaoqi
 * Date: 2018/3/19
 * Time: 下午4:47
 */
public class HomePage {
    WebDriver driver;
    WebDriverWait wait;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 15);
    }

    // 获取用户名，用于 判断登录 员工是否为 设定员工
    @FindBy(how = How.XPATH, using = "//*[@id=\"LoopApplicationWorkshop\"]/div[1]/div[1]/div[6]/div[1]")
    WebElement EmployeeName;

    //员工名称
    public String EmployeeName() {
        wait.until(ExpectedConditions.elementToBeClickable(EmployeeName));
        String username = EmployeeName.getText();
        return username;
    }

}
