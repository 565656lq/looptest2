package com.test.cases;


import com.commens.methods.PressKeys;
import com.commens.pageobject.Navigation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import com.commens.pageobject.*;
import com.test.base.TestBase;

import java.util.ArrayList;
import java.util.List;

public class SaleEOPageTest extends TestBase {

    @Test
    public void init() throws Exception {

        String seller = "丫丫商品供应商";
        String buyer = "丫丫商品客户";
        String employee = "测试";

        List goodsName=new ArrayList();
        goodsName.add("商品名称1");
        goodsName.add("商品名称2");
        goodsName.add("商品名称3");
        int rowCount = goodsName.size();

        String goodsCount = "10";
        String goodsTaxfreeUnitprice = "20";


        /**
         * 进入销售EO列表页*/
        // 方法1：从导航选择销售EO
//        Navigation Navigation = PageFactory.initElements(driver, Navigation.class);
//        Navigation.clickOnOrderManage();
//
//        OrderNavigation OrderNavigation = PageFactory.initElements(driver, OrderNavigation.class);
//        OrderNavigation.clickOnSaleEO();

        // 方法2：直接访问url
        Thread.sleep(1000);
        driver.get("http://loopcc.cn/#/oms/goods/sales_eo");
        Thread.sleep(1000);

        // 添加销售EO
        SaleEOListPage SaleEOListPage = PageFactory.initElements(driver, SaleEOListPage.class);
        SaleEOListPage.clickOnAddButton();
        Thread.sleep(2000);

        // 选择业务节点
        ChooseNodePage ChooseNodePage = PageFactory.initElements(driver, ChooseNodePage.class);
        ChooseNodePage.clickOnNode(3);
        ChooseNodePage.clickOnConfirmButton();

        // 销售EO弹窗填写
        AddSaleEOPage AddSaleEOPage = PageFactory.initElements(driver, AddSaleEOPage.class);

        // 销售方
        AddSaleEOPage.setSellerInput(seller);

        // 采购方
        AddSaleEOPage.setBuyerInput(buyer);

        // 业务员
        AddSaleEOPage.setEmployeeInput(employee);

        // 下一步
        AddSaleEOPage.clickOnNextButton();

        // 添加多个商品
        if (rowCount > 1){
            for(int num = 0;num<rowCount;num++){
                WebElement GoodsNameInput =
                        driver.findElement(By.xpath("//*[@id=\"business.0."+num+".goods\"]/div/span/div/div[1]/div/div[1]/input"));
                WebElement goodsCountInput =
                        driver.findElement(By.xpath("//*[@id=\"business.0."+num+".goods_quantity\"]/div/span/span/div"));
                WebElement goodsTaxfreeUnitpriceInput =
                        driver.findElement(By.xpath("//*[@id=\"business.0."+num+".goods_taxfree_unitprice\"]/div/span/span/div/input"));
                GoodsNameInput.sendKeys((String)goodsName.get(num));
                Thread.sleep(1000);
                PressKeys.pressKeyUpEnter(driver);
                Thread.sleep(1000);
                goodsCountInput =
                        driver.findElement(By.xpath("//*[@id=\"business.0."+num+".goods_quantity\"]/div/span/span/div/input"));
                //goodsCountInput.click();
                goodsCountInput.sendKeys(goodsCount);
                goodsTaxfreeUnitpriceInput.sendKeys(goodsTaxfreeUnitprice);
                if(num<rowCount-1) {
                    // 添加商品行
                    AddSaleEOPage.clickOnAddRowButton();
                }
            }
            // 只添加一个商品
        } else if(rowCount == 1){
            // 商品名称
            AddSaleEOPage.setGoodsNameInput((String)goodsName.get(0));

            // 商品数量
            AddSaleEOPage.setGoodsCountInput(goodsCount);

            // 商品价格
            AddSaleEOPage.setGoodsTaxfreeUnitpriceInput(goodsTaxfreeUnitprice);
            }

        // 完成
        Thread.sleep(1000);
        AddSaleEOPage.clickOnCompleteButton();
        Thread.sleep(1000);

    }

}
