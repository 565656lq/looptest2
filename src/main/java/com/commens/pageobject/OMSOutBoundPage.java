package com.commens.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * User: zuoxiaoqi
 * Date: 2018/3/1
 * Time: 下午7:15
 */
public class OMSOutBoundPage extends BasePage{

    WebDriver driver;
    WebDriverWait wait;

    public OMSOutBoundPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 15);
    }

    //出库EO 导入按钮
    @FindBy(how = How.XPATH, using = "//*[@id=\"LoopApplicationWorkshop\"]/div[2]/div/div[1]/div[2]/button[1]/span")
    WebElement importButton;

    //出库EO 添加按钮
    @FindBy(how = How.XPATH, using = "//*[@id=\"LoopApplicationWorkshop\"]/div[2]/div/div[1]/div[2]/button[2]/span")
    WebElement addButton;

//    //出库EO 编辑按钮
//    @FindBy(how = How.XPATH,using = "")
//    WebElement EditButton;
//
//    //出库EO 查看按钮
//    @FindBy(how = How.XPATH,using = "")
//    WebElement ViewButton;
//
//    //出库EO 下发按钮
//    @FindBy(how = How.XPATH,using = "")
//    WebElement DownButton;

    //出库EO 基础信息下一步
    @FindBy(how = How.XPATH, using = "/html/body/div[2]/div/div[3]/div/button[3]/span")
    WebElement BaseNext;

    //出库EO 业务信息下一步
    @FindBy(how = How.XPATH, using = "/html/body/div[3]/div/div[3]/div/button[5]/span")
    WebElement BusinessNext;

    //出库EO 结算信息下一步
    @FindBy(how = How.XPATH, using = "/html/body/div[3]/div/div[3]/div/button[5]/span")
    WebElement SettlementNext;

    //出库EO 发票信息上一步
    @FindBy(how = How.XPATH, using = "/html/body/div[3]/div/div[3]/div/button[3]/span")
    WebElement InvoiceNextUP;

    //出库EO 完成
    @FindBy(how = How.XPATH, using = "/html/body/div[2]/div/div[3]/div/button[7]/span")
    WebElement Done;

    //出库EO 点击+ 商品
    @FindBy(how = How.ID, using = "1&.0&.1.content&.business")
    WebElement AddDone;

    //出库EO 点击一下空白，因为页面加载光标 会进入 查询第一个输入框 优先拿走光标，会导致 点不中 添加按钮
    @FindBy(how = How.XPATH, using = "//*[@id=\"LoopApplicationWorkshop\"]/div[2]/div/div[1]/form/div[1]/label")
    WebElement Click;

    // 输入项 控件
    //出库EO 仓储客户
    @FindBy(how = How.XPATH, using = "//input[@type = 'text' and @placeholder = '合作伙伴编号/简称/全称']")
    WebElement WarehousingClient;

    // 输入项 控件
    //出库EO 出库仓库
    @FindBy(how = How.XPATH, using = "//input[@type = 'text' and @placeholder = '仓库编号/名称']")
    WebElement OutBoundWarehous;

    // 输入项 控件
    //出库EO 业务员
    @FindBy(how = How.XPATH, using = "//input[@type = 'text' and @placeholder = '员工工号/姓名']")
    WebElement OrderUser;

    //出库EO 下发 订单
    @FindBy(how = How.XPATH, using = "//*[@id=\"LoopApplicationWorkshop\"]/div[2]/div/div[2]/div[3]/table/tbody" +
            "/tr[1]/td[8]/div/div/span[1]")
    WebElement ClickDown;

    //出库EO 订单号
    @FindBy(how = How.XPATH, using = "//*[@id=\"LoopApplicationWorkshop\"]/div[2]/div/div[2]/div[3]/table/tbody" +
            "/tr[1]/td[2]/div/div")
    public WebElement OrderNo;

    //出库EO 恢复默认
    @FindBy(how = How.XPATH, using = "//*[@id=\"LoopApplicationWorkshop\"]/div[2]/div/div[1]/div[3]/div/div[1" +
            "]/ul/li[1]/span/span[1]")
    WebElement Back;

    //出库EO 点击恢复默认
    @FindBy(how = How.XPATH, using = "//*[@id=\"LoopApplicationWorkshop\"]/div[2]/div/div[1]/div[3]/div/div[1]/ul/li" +
            "[1]/div/p/span")
    WebElement ClickBack;

    //出库EO 下发 确定
    @FindBy(how = How.XPATH, using = "/html/body/div[2]/div/div[3]/button[2]/span")
    WebElement ClickOk;


    //点击 出库EO 导入按钮
    public void clickOnImportButton() {
        importButton.click();
    }

    //点击 出库EO 添加按钮
    public void clickOnaddButton() {
        addButton.click();
    }

    // 输入仓储客户
    public void inputWarehousClient(String WarehousClientName) {
        wait.until(ExpectedConditions.elementToBeClickable(WarehousingClient));
        WarehousingClient.sendKeys(WarehousClientName);
    }

    // 输入出库仓库
    public void inputOutBoundWarehous(String OutBoundWarehousName) {
        wait.until(ExpectedConditions.elementToBeClickable(OutBoundWarehous));
        OutBoundWarehous.sendKeys(OutBoundWarehousName);
    }

    // 点击基础信息下一步
    public void clickBaseNext() {
        wait.until(ExpectedConditions.elementToBeClickable(BaseNext));
        BaseNext.click();
    }

    // 点击业务信息下一步
    public void clickBusinessNext() {
        wait.until(ExpectedConditions.elementToBeClickable(BusinessNext));
        BusinessNext.click();
    }

    // 点击结算信息下一步
    public void clickSettlementNext() {
        wait.until(ExpectedConditions.elementToBeClickable(SettlementNext));
        SettlementNext.click();
    }

    // 点击发票信息上一步
    public void clickInvoiceNextUP() {
        wait.until(ExpectedConditions.elementToBeClickable(InvoiceNextUP));
        InvoiceNextUP.click();
    }

    // 点击完成
    public void clickDone() {
        wait.until(ExpectedConditions.elementToBeClickable(Done));
        Done.click();
    }

    // 输入业务员
    public void inputOrderUser(String OrderUserName) {
        wait.until(ExpectedConditions.elementToBeClickable(OrderUser));
        OrderUser.sendKeys(OrderUserName);
    }

    // 点击 + 增加商品行
    public void clickAddDone() {
        wait.until(ExpectedConditions.elementToBeClickable(AddDone));
        AddDone.click();
    }

    // 点击 + 增加商品行
    public void click() {
        wait.until(ExpectedConditions.elementToBeClickable(Click));
        Click.click();
    }

    // 点击 下发按钮
    public void clickDown() {
        wait.until(ExpectedConditions.elementToBeClickable(ClickDown));
        ClickDown.click();
    }

    // 点击 点击 下发确认
    public void clickOk() {
        wait.until(ExpectedConditions.elementToBeClickable(ClickOk));
        ClickOk.click();
    }

    // 获取 出库EO单号

    // 恢复默认1

    public void back(){
        wait.until(ExpectedConditions.elementToBeClickable(Back));
        Back.click();
    }
    // 点击 恢复默认
    public void clickBack(){
        wait.until(ExpectedConditions.elementToBeClickable(ClickBack));
        ClickBack.click();
    }

    // 点击 获取出库EO 单号
//    public String getOrderNO(){
//        wait.until(ExpectedConditions.elementToBeClickable(OrderNo));
//        OrderNo.getText();
//    }

}
