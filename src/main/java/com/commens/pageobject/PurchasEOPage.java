package com.commens.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * User: zuoxiaoqi
 * Date: 2018/2/28
 * Time: 下午7:56
 */
public class PurchasEOPage {


    //导入按钮
    @FindBy(how = How.XPATH, using = "//*[@id=\"LoopApplicationWorkshop\"]/div[2]/div/div[1]/div[2]/button[1]")
    WebElement importButton;

    //添加按钮

    // 点击导入按钮
    public void clickOnImportBUtton() {
        importButton.click();

    }


}
