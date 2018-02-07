package com.commens.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by YUY on 2018/1/29.
 */
public class SaleEOListPage {

    WebDriver driver;

    public SaleEOListPage(WebDriver driver) {
        this.driver = driver;
    }

    // 导入按钮
    @FindBy(how = How.XPATH, using = "//*[@id=\"LoopApplicationWorkshop\"]/div[2]/div/div[1]/div[2]/button[1]")
    WebElement importButton;

    // 添加按钮
    @FindBy(how = How.XPATH, using = "//*[@id=\"LoopApplicationWorkshop\"]/div[2]/div/div[1]/div[2]/button[2]")
    WebElement addButton;

    // 定义动作

    // 导入按钮
    public void clickOnImportBUtton() {
        importButton.click();
    }

    // 添加按钮
    public void clickOnAddButton() {
        addButton.click();
    }
}
