package com.abn.selcucumber.steps;

import com.abn.selcucumber.helper.CommonMethodsHelper;
import com.abn.selcucumber.pages.LeftNav.AdminPage;
import com.abn.selcucumber.pages.LeftNav.HomePage;
import com.abn.selcucumber.pages.login.LoginPage;
import cucumber.api.java.en.Given;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.management.ManagementFactory;

/**
 * Created by aswathyn on 07/01/17.
 */
public class LoginStepDefs {

    static final Logger LOGGER = LoggerFactory.getLogger(LoginStepDefs.class);
    private WebDriver driver;
    HomePage homePage;
    AdminPage adminPage;
    LoginPage loginPage;

    public LoginStepDefs(SharedDriver driver){
        this.driver=driver;
        long threadId = Thread.currentThread().getId();
        String processName = ManagementFactory.getRuntimeMXBean().getName();
        LOGGER.info("Started in thread: " + threadId + ", in JVM: " + processName);
        homePage= new HomePage(driver);
    }

    @Given("^that the user logged in as \"([^\"]*)\" and \"([^\"]*)\"$")
    public void that_the_user_logged_in_as_and(String arg2, String arg3) throws Throwable {
        loginPage = new LoginPage(driver);
        loginPage.enterEmail(CommonMethodsHelper.getPropValue(arg2)).enterCredentials(CommonMethodsHelper.getPropValue(arg3));
    }
}
