package com.test.loopcncases;

import com.commens.methods.InputGoods;
import com.commens.methods.PressKeys;
import com.commens.methods.ReadWrite;
import com.commens.pageobject.ChooseNodePage;
import com.commens.pageobject.Navigation;
import com.commens.pageobject.OrderNavigation;
import com.commens.pageobject.OMSOutBoundPage;
import com.test.base.TestBase;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;


/**
 * User: zuoxiaoqi
 * Date: 2018/3/8
 * Time: 下午3:32
 */
public class OutBoundEOTest extends TestBase {

    @Test
    public void OutBoundEO() throws Exception {

        //初始化导航元素 并调用 导航元素
        Navigation navigation = PageFactory.initElements(driver, Navigation.class);
        //初始化订单管理导航元素 并调用 导航里的元素
        OrderNavigation orderNavigation = PageFactory.initElements(driver, OrderNavigation.class);
        //初始化出库EO页面元素 并调用 页面元素
        OMSOutBoundPage OMSOutBoundPage = PageFactory.initElements(driver, OMSOutBoundPage.class);
        // 初始化选择业务节点 元素 并调用 页面元素
        ChooseNodePage Node = PageFactory.initElements(driver, ChooseNodePage.class);
        //创建对象
        InputGoods inputGoods = new InputGoods();

        try {

            //点击导航-订单管理 按钮
            navigation.clickOnOrderManage();
            LOGGER.info("点击 订单管理导航");
        } catch (NoSuchElementException e) {
            LOGGER.error("没找到 订单管理导航 元素");
        } catch (Exception e) {
            LOGGER.error("点击 订单管理导航 异常，异常信息：" + e);
        }

        try {

            //点击订单管理-出库EO 按钮
            orderNavigation.clickOnOutboundEO();
            LOGGER.info("点击 出库EO");
        } catch (NoSuchElementException e) {
            LOGGER.error("没找到出库EO按钮 元素");
        } catch (Exception e) {
            LOGGER.error("点击 出库EO 按钮异常，异常信息：" + e);
        }

        try {

            Thread.sleep(5000);
            //点击 出库EO 页面 添加按钮
            OMSOutBoundPage.clickOnaddButton();
            LOGGER.info("点击 添加 出库EO 按钮");
        } catch (NoSuchElementException e) {
            LOGGER.error("没有找到 出库EO 添加按钮元素");
        } catch (Exception e) {
            LOGGER.error("点击 添加 出库EO 按钮异常，异常信息：" + e);
        }

        // 判断 是否需要选择节点 ，如果 多个节点 执行选择节点操作，如果单 节点 就直接 填写订单信息
        Thread.sleep(1000);
        if (Node.confirmButton.isDisplayed() == true) {
            Thread.sleep(1000);
            try {
                Node.clickOnNode(1);
                LOGGER.info("选择 第一个业务节点");
            } catch (NoSuchElementException e) {
                LOGGER.error("选择业务节点元素没有找到");
            } catch (Exception e) {
                LOGGER.error("选择业务节点异常，异常信息：" + e);
            }

            try {
                Node.clickOnConfirmButton();
                LOGGER.info("点击 确定 按钮");
            } catch (NoSuchElementException e) {
                LOGGER.error("确认按钮元素没有找到");
            } catch (Exception e) {
                LOGGER.error("点击确认按钮异常，异常信息：" + e);
            }

        }else{
            LOGGER.error("节点判断异常！");
        }

        //判断 基础信息页面是否正确打开

        try {
            //输入 仓储客户
            OMSOutBoundPage.inputWarehousClient(ReadWrite.readOmsString(1, 11));
            Thread.sleep(400);
            LOGGER.info("输入 仓储客户");
            PressKeys.pressKeyDownEnter(driver);
        } catch (NoSuchElementException e) {
            LOGGER.error("没有找到仓储客户元素");
        } catch (Exception e) {
            LOGGER.error("输入仓储客户异常，异常信息：" + e);
        }

        try {
            //输入 出库仓库
            OMSOutBoundPage.inputOutBoundWarehous(ReadWrite.readOmsString(1, 12));
            Thread.sleep(400);
            LOGGER.info("输入出库仓库");
            PressKeys.pressKeyDownEnter(driver);
        } catch (NoSuchElementException e) {
            LOGGER.error("没有找到出库仓库元素");
        } catch (Exception e) {
            LOGGER.error("输入出库仓库异常，异常信息：" + e);
        }

        try {
            //输入 业务员
            OMSOutBoundPage.inputOrderUser(ReadWrite.readOmsString(1, 3));
            Thread.sleep(400);
            LOGGER.info("输入业务员");
            PressKeys.pressKeyDownEnter(driver);
        } catch (NoSuchElementException e) {
            LOGGER.error("没有找到业务员元素");
        } catch (Exception e) {
            LOGGER.error("输入业务员异常，异常信息：" + e);
        }

        try {
            //点击 下一步
            OMSOutBoundPage.clickBaseNext();
            LOGGER.info("点击下一步");
        } catch (NoSuchElementException e) {
            LOGGER.error("没有找到下一步按钮元素");
        } catch (Exception e) {
            LOGGER.error("点击下一步异常，异常信息：" + e);
        }

        //输入 商品及价格等数据
        OMSOutBoundPage.InputGoods(driver);

        try {
            //点击 完成
            OMSOutBoundPage.clickDone();
            Thread.sleep(2000);
            LOGGER.info("点击 完成");
        } catch (NoSuchElementException e) {
            LOGGER.error("没有找到完成按钮元素");
        } catch (Exception e) {
            LOGGER.error("点击完成异常，异常信息：" + e);
        }

        //点击 下发 按钮
        Thread.sleep(1000);
        OMSOutBoundPage.back();
        OMSOutBoundPage.clickBack();
        Thread.sleep(4000);
        OMSOutBoundPage.clickDown();
        // 下发确定
        OMSOutBoundPage.clickOk();
        Thread.sleep(1000);

        System.out.print(OMSOutBoundPage.OrderNo.getText().replace(" ",""));
    }

}
