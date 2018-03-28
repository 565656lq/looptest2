package com.commens.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


/**
 User: zuoxiaoqi
 Date: 2018/3/22
 Time: 下午4:25
 */
public class WMSAdvancePickPage extends BasePage{

    WebDriverWait wait;
    //
    public WMSAdvancePickPage(WebDriver driver) {
        //this.driver = driver;
        wait = new WebDriverWait(driver, 15);
    }

    //获取 元素

    // 页面查询按钮元素
    @FindBy(how = How.XPATH,using = "//*[@id=\"LoopApplicationWorkshop\"]/div[2]/div/div[1]/form/button/span")
    WebElement Check;

    //获取 仓库选择项 元素
    @FindBy(how = How.XPATH,using = "//*[@id=\"LoopApplicationWorkshop\"]/div[2]/div/div[1]/form/div[6]/div/div/div[1" +
            "]/input")
    WebElement ClickSelect;

    //获取 单据号 元素
    @FindBy(how = How.XPATH,using = "//*[@id=\"LoopApplicationWorkshop\"]/div[2]/div/div[1]/form/div[1]/div/span/div" +
            "/input")
    WebElement InputOrderNO;



    //操作

    //点击 查询选择仓库
    public void clickSelect() {
        try{
            wait.until(ExpectedConditions.elementToBeClickable(ClickSelect));
            ClickSelect.click();
            LOGGER.info("选择预设仓库");
        }catch (Exception e){
            LOGGER.error("选择预设仓库异常，异常信息：" + e);
        }

    }

    //点击 查询按钮
    public void clickCheck() {
        Check.click();
    }

    public void inputOrderNo(String orderno){
        InputOrderNO.sendKeys(orderno);
    }

}
