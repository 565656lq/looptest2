package com.commens.pageobject;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;

import java.util.List;

public class OrderNavigation {

    WebDriver driver;

    public OrderNavigation(WebDriver driver) {
        this.driver = driver;
    }

    // 商品
    @FindAll({@FindBy(how = How.XPATH, using = "//*[@id=\"nav_menuId\"]/div/ul/li[1]/ul/li/div[1]/div[2]/a")})
    List<WebElement> goods;

    // 仓库
    @FindAll({@FindBy(how = How.XPATH, using = "//*[@id=\"nav_menuId\"]/div/ul/li[1]/ul/li/div[2]/div[2]/a")})
    List<WebElement> warehouses;

    // 仓储盘点
    @FindAll({@FindBy(how = How.XPATH, using = "//*[@id=\"nav_menuId\"]/div/ul/li[1]/ul/li/div[3]/div[2]/a")})
    List<WebElement> warehousingCount;

    // 仓储服务
    @FindAll({@FindBy(how = How.XPATH, using = "//*[@id=\"nav_menuId\"]/div/ul/li[1]/ul/li/div[4]/div[2]/a")})
    List<WebElement> warehousingService;

    // 定义动作

    // 商品
    // 销售APN
    public void clickOnSaleAPN() {
        goods.get(0).click();
    }
    // 销售EO
    public void clickOnSaleEO() {
        goods.get(1).click();
    }
    // 采购APN
    public void clickOnPurchaseAPN() {
        goods.get(2).click();
    }
    // 采购EO
    public void clickOnPurchaseEO() {
        goods.get(3).click();
    }


    // 仓库
    // 入库APN
    public void clickOnInboundAPN() {
        warehouses.get(0).click();
    }
    // 入库EO
    public void clickOnInboundEO() {
        warehouses.get(1).click();
    }
    // 出库APN
    public void clickOnOutboundAPN() {
        warehouses.get(2).click();
    }
    // 出库EO
    public void clickOnOutboundEO() {
        warehouses.get(3).click();
    }

    // 仓储盘点
    // 入库APN
    public void clickOnPhysicalCountAPN() {
        warehousingCount.get(0).click();
    }
    // 入库EO
    public void clickOnPhysicalCountEO() {
        warehousingCount.get(1).click();
    }

    // 仓储服务
    // 裁剪APN
    public void clickOnCutAPN() {
        warehousingService.get(0).click();
    }
    // 裁剪EO
    public void clickOnCutEO() {
        warehousingService.get(1).click();
    }
    // 质检APN
    public void clickOnQualityCheckAPN() {
        warehousingService.get(2).click();
    }
    // 质检EO
    public void clickOnQualityCheckEO() {
        warehousingService.get(3).click();
    }



}
