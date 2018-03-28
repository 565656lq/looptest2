package com.commens.methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
 * User: zuoxiaoqi
 * Date: 2018/3/22
 * Time: 下午7:46
 */
public class ClickSelect {

    WebDriverWait wait;
    // 定义log4j2
    public static org.slf4j.Logger LOGGER = LoggerFactory.getLogger(InputGoods.class.getName());


    // 出库 流程中 需要的 仓库
    public void select(WebDriver driver) {

        wait = new WebDriverWait(driver, 15);

        try {
            List<WebElement> elements = driver.findElements(By.tagName("li"));
            LOGGER.info("查找下拉列");
            for (int i = 0; i < elements.size(); i++) {
                if (elements.get(i).getText().equals(ReadWrite.readWmsString(1,6))) {
                    elements.get(i).click();
                    LOGGER.info("循环选中 预期仓库");
                }else {
                    LOGGER.error("循环选中 预期仓库错误");
                }
            }
        } catch (Exception e) {
            LOGGER.error("循环查找下拉仓库异常，异常信息：" + e);
        }

    }
}
