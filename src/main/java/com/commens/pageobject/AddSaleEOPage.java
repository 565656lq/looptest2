package com.commens.pageobject;

import com.commens.methods.PressKeys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by YUY on 2018/1/30.
 */
public class AddSaleEOPage {

    WebDriver driver;

    public AddSaleEOPage(WebDriver driver) {
        this.driver = driver;
    }

    // 销售方
    @FindBy(how = How.XPATH, using = "//*[@id=\"order.seller\"]/div/span/div[1]/div/div[1]/input")
    WebElement sellerInput;

    // 采购方
    @FindBy(how = How.XPATH, using = "//*[@id=\"order.buyer\"]/div/span/div/div/div[1]/input")
    WebElement buyerInput;

    // TODO:订单日期

    // 业务员
    @FindBy(how = How.XPATH, using = "//*[@id=\"order.order_user\"]/div/span/div/div/div[1]/input")
    WebElement employeeInput;

    // TODO:备注

    // 基本信息--下一步按钮
    @FindBy(how = How.XPATH, using = "/html/body/div[2]/div/div[3]/div/button[3]/span")
    WebElement nextButton;

    // 商品名称
    @FindBy(how = How.XPATH, using = "//*[@id=\"business.0.0.goods\"]/div/span/div/div[1]/div/div[1]/input")
    WebElement goodsNameInput;

    // TODO:商品单位

    // 商品数量
    @FindBy(how = How.XPATH,
            using = "//*[@id=\"business.0.0.goods_quantity\"]/div/span/span/div/input")
    WebElement goodsCountInput;

    // 不含税单价
    @FindBy(how = How.XPATH, using = "//*[@id=\"business.0.0.goods_taxfree_unitprice\"]/div/span/span/div/input")
    WebElement goodsTaxfreeUnitpriceInput;

    // 添加商品行
    @FindBy(how = How.XPATH, using = "//*[@id=\"1&.0&.1.content&.business\"]")
    WebElement addRowButton;

    // TODO:删除商品行

    // TODO：业务信息--下一步按钮

    // TODO:业务信息--上一步按钮

    // 业务信息--完成
    @FindBy(how = How.XPATH, using = "/html/body/div[2]/div/div[3]/div/button[7]")
    WebElement completeButton;

    // TODO:业务信息--完场并创建出库订单




    // 定义动作

    // 输入销售方
    public void setSellerInput(String seller) throws InterruptedException {
        sellerInput.sendKeys(seller);
        Thread.sleep(1000);
        PressKeys.pressKeyDownEnter(driver);
    }

    // 输入采购方
    public void setBuyerInput(String buyer) throws InterruptedException {
        buyerInput.sendKeys(buyer);
        Thread.sleep(1000);
        PressKeys.pressKeyDownEnter(driver);
    }

    // 输入业务员
    public void setEmployeeInput(String employee) throws InterruptedException {
        employeeInput.sendKeys(employee);
        Thread.sleep(1000);
        PressKeys.pressKeyDownEnter(driver);
    }

    // 点击下一步
    public void clickOnNextButton(){
        nextButton.click();
    }

    // 输入商品名称
    public void setGoodsNameInput(String goodsName) throws InterruptedException {
            goodsNameInput.sendKeys(goodsName);
            Thread.sleep(1000);
            PressKeys.pressKeyUpEnter(driver);
    }

    // 输入商品数量
    public void  setGoodsCountInput(String goodsCount) { goodsCountInput.sendKeys(goodsCount);}

    // 输入商品单价
    public void setGoodsTaxfreeUnitpriceInput(String goodsTaxfreeUnitprice){ goodsTaxfreeUnitpriceInput.sendKeys(goodsTaxfreeUnitprice);}

    // TODO:输入税率

    // 添加商品行
    public void clickOnAddRowButton(){addRowButton.click();}

    // TODO：删除商品行

    // 点击完成
    public void clickOnCompleteButton(){ completeButton.click();}

}
