package com.abn.selcucumber.pages.login;

import com.abn.selcucumber.pages.BasePage;
import com.abn.selcucumber.pages.LeftNav.HomePage;
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
public class CredentialsPage extends BasePage<CredentialsPage> {

    @FindBy(css="#IDToken2")
    private WebElement password;

    @FindBy(id="Button1")
    private WebElement signIn;

    @FindBy(css=".product-info-inner>p")
    private WebElement environment;

    @FindBy(xpath = "//div[@class='brandingLoginForm']")
    private WebElement loginForm;

    public static final String ENVIRONMENT= "QA Environment";

    static final Logger LOGGER = LoggerFactory.getLogger(CredentialsPage.class);

    public CredentialsPage(WebDriver driver) {
        super(driver);
        instantiatePage(this);
        waitForPageToLoad(getPageLoadCondition());
    }

    @Override
    protected ExpectedCondition getPageLoadCondition() {
        return ExpectedConditions.visibilityOf(loginForm);
    }

    @Override
    protected void instantiatePage(CredentialsPage page) {
        try {
            LOGGER.info("** instantiatePage(): "+ page.getClass().getSimpleName());
            PageFactory.initElements(driver, page);
        } catch(Exception e) {
            LOGGER.error("-- Page instantiation failed",e);
        }
    }

    public HomePage enterCredentials(String passwrd) throws Exception {
        enterText(password,passwrd);
        clickButton(signIn);
        implicitWaitMethod();
        return new HomePage(driver);
    }

    /*********************GET/SET METHODS***************************/

}
