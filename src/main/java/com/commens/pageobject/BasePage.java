package com.commens.pageobject;

import com.commens.methods.PressKeys;
import com.commens.methods.ReadWrite;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.LoggerFactory;

/**
 User: zuoxiaoqi
 Date: 2018/3/22
 Time: 下午8:41
 */
public class BasePage {

    WebDriver driver;
    /**
     *定义 公用的方法
     */
    public static org.slf4j.Logger LOGGER = LoggerFactory.getLogger(BasePage.class);
    OMSOutBoundPage omsOutBoundPage = new OMSOutBoundPage(driver);

    WebDriverWait wait;
    int Stranum;
    /**
     *获取 预计输入商品 数量
     */
    int overnum = Integer.parseInt(ReadWrite.readOmsDate(1, 5));


    /**
     *公用的 输入商品信息
     */
    public void InputGoods(WebDriver driver) throws InterruptedException {

        // 设置等待
        wait = new WebDriverWait(driver, 15);
        //初始化
        OMSOutBoundPage OMSOutBoundPage = PageFactory.initElements(driver, OMSOutBoundPage.class);

        // 循环输入 设定好的的商品数量等信息
        for (Stranum = 0; Stranum < overnum; Stranum++) {
            LOGGER.info("循环输入商品中" + Stranum);
            try {

                /**
                *输入 商品名称
                 */
                wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@id=\"business.0." +
                        Stranum + "" +
                        ".goods\"]/div/span/div/div[1]/div/div[1]/input"))));
                LOGGER.info("判断商品名称元素 15秒内是否出现");
                WebElement GoodsName =
                        driver.findElement(By.xpath("//*[@id=\"business.0." + Stranum + "" +
                                ".goods\"]/div/span/div/div[1]/div/div[1]/input"));
                LOGGER.info("定义 商品元素 开始输入名称");
                GoodsName.sendKeys(ReadWrite.readOmsString(Stranum + 1, 4));
                LOGGER.info("输入商品名称" + ReadWrite.readOmsString(Stranum + 1, 4));
                Thread.sleep(600);
                PressKeys.pressKeyDownEnter(driver);
                Thread.sleep(600);

            } catch (Exception e) {
                LOGGER.error("输入商品名称异常，异常信息：" + e);
            }

            // 选择 商品计量单位 TODO

            try {

                /**
                 * 输入商品数量
                 */
                wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@id=\"business.0." +
                        Stranum + "" +
                        ".goods_quantity\"]/div/span/span/div/input"))));
                LOGGER.info("判断商品数量元素15秒内是否出现");
                WebElement GoodsQuantity =
                        driver.findElement(By.xpath("//*[@id=\"business.0." + Stranum + "" +
                                ".goods_quantity\"]/div/span/span/div/input"));
                LOGGER.info("定义 商品数量 开始输入商品数量");
                GoodsQuantity.sendKeys(ReadWrite.readOmsDate(Stranum + 1, 7));
                LOGGER.info("输入商品数量" + ReadWrite.readOmsDate(Stranum + 1, 7));

            } catch (Exception e) {

                LOGGER.error("输入商品数量异常，异常信息：" + e);
            }

            try {

                /**
                *输入商品不含税价格
                 */
                wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@id=\"business.0." +
                        Stranum + "" +
                        ".taxfree_unitprice\"]/div/span/span/div/input"))));
                LOGGER.info("判断商品不含税价格元素15秒内是否出现");
                WebElement TaxFree =
                        driver.findElement(By.xpath("//*[@id=\"business.0." + Stranum + "" +
                                ".taxfree_unitprice\"]/div/span/span/div/input"));
                LOGGER.info("定义 商品不含税价格 开始输入不含税价格");
                TaxFree.sendKeys(ReadWrite.readOmsDate(Stranum + 1, 8));
                LOGGER.info("输入商品不含税价格" + ReadWrite.readOmsDate(Stranum + 1, 8));

            } catch (Exception e) {
                LOGGER.error("输入商品不含税价格异常，异常信息：" + e);
            }

            try {

                /**
                *输入商品 税率
                 */
                wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@id=\"business.0." +
                        Stranum + "" +
                        ".tax_rate\"]/div/span/span/div/input"))));
                LOGGER.info("判断商品 税率元素15秒内是否出现");
                WebElement TaxRate =
                        driver.findElement(By.xpath("//*[@id=\"business.0." + Stranum + "" +
                                ".tax_rate\"]/div/span/span/div/input"));
                LOGGER.info("定义 商品税率 开始输入商品税率");
                TaxRate.sendKeys(ReadWrite.readOmsDate(Stranum + 1, 9));
                LOGGER.info("输入商品税率" + ReadWrite.readOmsDate(Stranum + 1, 9));

            } catch (Exception e) {
                LOGGER.error("输入商品税率异常，异常信息：" + e);
            }

            /**
             *循环点击 + 号 overnum 次
             */
            if (Stranum < overnum - 1) {
                try {
                    OMSOutBoundPage.clickAddDone();
                    LOGGER.info("点击 + 号" + Stranum + "次");
                    Thread.sleep(500);
                } catch (Exception e) {

                    LOGGER.error("点击 + 号 异常，异常信息：" + e);
                }

            } else {
                // 循环次数 到达overnum 跳出，不再点击 + 号
                break;
            }
        }
    }


    /**
     * 获取 OMS创建的订单号，用于下游 操作使用
     */
    public  String OrderNo(String orderNo){
        orderNo = omsOutBoundPage.OrderNo.getText().replace(" ","");
        return orderNo;
    }
}
