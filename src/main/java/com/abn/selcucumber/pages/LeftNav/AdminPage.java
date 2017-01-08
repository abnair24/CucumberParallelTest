package com.abn.selcucumber.pages.LeftNav;

import com.abn.selcucumber.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by aswathyn on 07/01/17.
 */
public class AdminPage extends BasePage<AdminPage> {

    @FindBy(xpath = "//span[text()='Admin']/parent::button[@data-icon2-after='triangle-open']")
    private WebElement adminWait;

    @FindBy(xpath = ".//ul[@class='submenu']//span[text()='User']/parent::a")
    private WebElement user;

    @FindBy(xpath = ".//ul[@class='submenu']//span[text()='System']/parent::a")
    private WebElement system;

    @FindBy(xpath = ".//ul[@class='submenu']//span[text()='Mobile']/parent::a")
    private WebElement mobile;

    @FindBy(xpath = ".//ul[@class='submenu']//span[text()='Collaborate']/parent::a']")
    private WebElement collaborate;

    @FindBy(xpath = "..//ul[@class='submenu']//span[text()='Reporting']/parent::a")
    private WebElement reporting;

    @FindBy(xpath = ".//ul[@class='submenu']//span[text()='Personalize Site']/parent::a")
    private WebElement personalieSite;

    private static final Logger LOGGER = LoggerFactory.getLogger(AdminPage.class);


    public AdminPage(WebDriver driver) {
        super(driver);
        instantiatePage(this);
        waitForPageToLoad(getPageLoadCondition());
//        headerNav = new HeaderNav(driver);
    }

    @Override
    protected void instantiatePage(AdminPage page) {
        try {
            LOGGER.info("** instantiatePage(): " + page.getClass().getSimpleName());
            PageFactory.initElements(driver, page);
        } catch (Exception e) {
            LOGGER.error("--- Error in instantiating page: ", page.getClass().getSimpleName());
        }
    }

    @Override
    protected ExpectedCondition getPageLoadCondition() {
        LOGGER.info(">> waiting for Admin dropdown to appear");
        return ExpectedConditions.visibilityOf(adminWait);
    }
}



    /***********************GET/SET METHODS*********************/


