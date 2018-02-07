package com.commens.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;

public class Navigation {

    WebDriver driver;

    public Navigation(WebDriver driver) {
        this.driver = driver;
    }

    // 订单管理
    @FindBy(how = How.XPATH, using = "//*[@id=\"nav_menuId\"]/div/ul/li[1]")
    WebElement orderManage;

    // 仓库管理
    @FindBy(how = How.XPATH, using = "//*[@id=\"nav_menuId\"]/div/ul/li[2]")
    WebElement warehouseManage;

    // 运输管理
    @FindBy(how = How.XPATH, using = "//*[@id=\"nav_menuId\"]/div/ul/li[3]")
    WebElement transportManage;

    // 计费管理
    @FindBy(how = How.XPATH, using = "//*[@id=\"nav_menuId\"]/div/ul/li[4]")
    WebElement chargingManage;

    // 报表中心
    @FindBy(how = How.XPATH, using = "//*[@id=\"nav_menuId\"]/div/ul/li[5]")
    WebElement reportCenter;

    // 基础档案
    @FindBy(how = How.XPATH, using = "//*[@id=\"nav_menuId\"]/div/ul/li[6]")
    WebElement basicArchives;

    // 用户中心
    @FindBy(how = How.XPATH, using = "//*[@id=\"nav_menuId\"]/div/ul/li[6]")
    WebElement userCenter;

    // 右侧按钮
    @FindBy(how = How.CLASS_NAME, className = "topMenuBtn menuBtnRight")
    WebElement rightButton;

    // 左侧按钮
    @FindBy(how = How.CLASS_NAME, className = "topMenuBtn menuBtnLeft")
    WebElement leftButton;

    // 定义动作

    public void clickOnOrderManage() {
        orderManage.click();
    }

    public void clickOnWarehouseManage() {
        warehouseManage.click();
    }

    public void clickOnTransportManage() {
        transportManage.click();
    }

    public void clickOnChargingManage() { chargingManage.click(); }

    public void clickOnReportCenter() {
        reportCenter.click();
    }

    public void clickOnBasicArchives() {
        basicArchives.click();
    }

    public void clickOnUserCenter() { userCenter.click(); }

    public void clickOnRightButton() {
        rightButton.click();
    }

    public void clickOnLeftButton(){
        leftButton.click();
    }


}

