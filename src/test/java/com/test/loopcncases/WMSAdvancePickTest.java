package com.test.loopcncases;

import com.commens.methods.ClickSelect;
import com.commens.pageobject.*;
import com.test.base.TestBase;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

/**
 * User: zuoxiaoqi
 * Date: 2018/3/22
 * Time: 下午4:27
 */
public class WMSAdvancePickTest extends TestBase {

    @Test
    public void WMSAdvancePick() throws InterruptedException {

        // 初始化 大导航
        Navigation navigation = PageFactory.initElements(driver, Navigation.class);
        //初始化仓储管理小导航
        WarehouseNavgationPage warehouseNavgationPage = PageFactory.initElements(driver, WarehouseNavgationPage.class);
        //初始化 出库流程页 元素
        WMSAdvancePickPage wmsAdvancePickPage = PageFactory.initElements(driver, WMSAdvancePickPage.class);
        //创建对象
        ClickSelect clickSelect = new ClickSelect();
        //
        //
        //

        //点击 仓储管理导航
        navigation.clickOnWarehouseManage();
        Thread.sleep(1000);
        //点击 预拣选页
        warehouseNavgationPage.clickAdvancePicking();

        Thread.sleep(3000);
        //

        wmsAdvancePickPage.clickSelect();

        clickSelect.select(driver);
        wmsAdvancePickPage.clickCheck();



        BasePage basePage = new BasePage();

        String S = basePage.OrderNo("");
        wmsAdvancePickPage.inputOrderNo(S);


    }
}
