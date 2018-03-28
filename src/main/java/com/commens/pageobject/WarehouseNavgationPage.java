package com.commens.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

/**
 * User: zuoxiaoqi
 * Date: 2018/3/22
 * Time: 下午4:33
 */
public class WarehouseNavgationPage {
    WebDriver driver;
    WebDriverWait wait;

    public void WarehouseNavgation(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 15);
    }

    // 获取元素

    //获取 仓库管理导航里---入库--里的全部小导航
    @FindAll({@FindBy(how = How.XPATH, using = "//*[@id=\"nav_menuId\"]/div/ul/li[2]/ul/li/div[1]/div[2]/a")})
    List<WebElement> InBound;

    //获取 仓库管理导航里---出库--里的全部小导航
    @FindAll({@FindBy(how = How.XPATH, using = "//*[@id=\"nav_menuId\"]/div/ul/li[2]/ul/li/div[2]/div[2]/a")})
    List<WebElement> OutBound;

    //获取 仓库管理导航里---库存--里的全部小导航
    @FindAll({@FindBy(how = How.XPATH, using = "//*[@id=\"nav_menuId\"]/div/ul/li[2]/ul/li/div[3]/div[2]/a")})
    List<WebElement> Inventory;

    //获取 仓库管理导航里---仓库--里的全部小导航
    @FindAll({@FindBy(how = How.XPATH, using = "//*[@id=\"nav_menuId\"]/div/ul/li[2]/ul/li/div[4]/div[2]/a")})
    List<WebElement> Warehouse;

    //获取 仓库管理导航里---裁剪服务--里的全部小导航
    @FindAll({@FindBy(how = How.XPATH, using = "//*[@id=\"nav_menuId\"]/div/ul/li[2]/ul/li/div[5]/div[2]/a")})
    List<WebElement> CutService;

    //获取 仓库管理导航里---质检服务--里的全部小导航
    @FindAll({@FindBy(how = How.XPATH, using = "//*[@id=\"nav_menuId\"]/div/ul/li[2]/ul/li/div[5]/div[2]/a")})
    List<WebElement> QualityCheckService;




    // 点击操作

    // 入库

    //点击 预收获
    public void clickAdvanceReceing() {
        InBound.get(0).click();
    }

    //点击 库位分配
    public void clickStorgeAssign() {
        InBound.get(1).click();
    }

    //点击 生成上架任务
    public void clickShelveTaskSheet() {
        InBound.get(2).click();
    }

    //点击 上架
    public void clickShelve() {
        InBound.get(3).click();
    }

    // 出库
    //点击 预拣选
    public void clickAdvancePicking() {
        OutBound.get(0).click();
    }

    //点击 生成拣货任务
    public void clickPickingTaskSheet() {
        OutBound.get(1).click();
    }

    //点击 拣货
    public void clickPicking() {
        OutBound.get(2).click();
    }

    //点击 打包
    public void packaging() {
        OutBound.get(3).click();
    }

    //点击 发货
    public void clickDelivery() {
        OutBound.get(4).click();
    }

    // 库存
    // 点击申请盘点
    public void clickInventoryOrder() {
        Inventory.get(0).click();
    }

    // 点击生成盘点任务
    public void clickInventoryTaskSheet() {
        Inventory.get(1).click();
    }

    // 点击盘点
    public void clickInventory() {
        Inventory.get(2).click();
    }

    // 点击库存调整单
    public void clickStockAdjustmentSheet() {
        Inventory.get(3).click();
    }

    // 点击 库存差异区
    public void clickStockDifference() {
        Inventory.get(4).click();
    }

    // 点击 库内移动单
    public void clickInnerShiftSheet() {
        Inventory.get(5).click();
    }

    // 点击 库位查询
    public void clickStorageQuery() {
        Inventory.get(6).click();
    }

    // 点击 库存查询
    public void clickStockQuery() {
        Inventory.get(7).click();
    }

    // 点击 库存查询（明细）
    public void clickStockSchedule() {
        Inventory.get(8).click();
    }

    // 点击 维护商品数据
    public void clickUpdateGoods() {
        Inventory.get(9).click();
    }

    // 点击 缺货报告
    public void clickShortageReport() {
        Inventory.get(10).click();
    }

    // 仓库
    // 点击 库区
    public void clickSection() {
        Warehouse.get(0).click();
    }

    // 点击 库位
    public void clickstorage() {
        Warehouse.get(1).click();
    }

    // 裁剪服务
    // 点击 生成裁剪任务
    public void clickCutTaskSheet() {
        CutService.get(0).click();
    }

    // 点击 裁剪
    public void clickCut() {
        CutService.get(1).click();
    }

    // 质检服务
    // 点击 生成质检任务
    public void clickQualityCheckTaskSheet() {
        QualityCheckService.get(0).click();
    }

    // 点击 质检
    public void clickQualityCheck() {
        QualityCheckService.get(1).click();
    }

}
