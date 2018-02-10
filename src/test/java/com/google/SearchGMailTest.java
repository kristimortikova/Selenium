package com.google;

import com.google.core.WebDriverTestBase;
import com.google.pages.*;
import com.google.pages.UserData.DataLogin;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static org.testng.Assert.assertTrue;

public class SearchGMailTest extends WebDriverTestBase {
    private String searchData = "Gmail";
    private String userCheck = "Kristina Mortikova";
    private String login;
    private String password;


    @Test(enabled = false)
        public void searchGooglePageObjectTest(){
        driver.get("https://www.google.com/intl/ru/gmail/about/");
        GoogleMailLoginPage loginPage = PageFactory.initElements(driver, GoogleMailLoginPage.class);
        loginPage.findButtonLogin();

        GoogleMailEnterLoginPage enterLoginPage = PageFactory.initElements(driver,GoogleMailEnterLoginPage.class);
        DataLogin dataLogin = new DataLogin();
        enterLoginPage.forLoginEnter(dataLogin.info(login));
        GoogleMailPasswordPage passwordPage = PageFactory.initElements(driver,GoogleMailPasswordPage.class);

        passwordPage.forPassword(dataLogin.infoPass(password));
        GoogleMailCheckUserName checkUserName = PageFactory.initElements(driver,GoogleMailCheckUserName.class);
        checkUserName.forCheckUserName(userCheck);
    }
}
