package com.google;

import com.google.core.WebDriverTestBase;
import com.google.pages.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static org.testng.Assert.assertTrue;

public class SearchGMailTest extends WebDriverTestBase {

    private String searchData = "Gmail";
    private String loginData = "***********";
    private String passwordData = "*************";
    private String userCheck = "Мортикова";


    @Test
        public void searchGooglePageObjectTest(){
        driver.get("https://www.google.com/intl/ru/gmail/about/");
        GoogleMailLoginPage loginPage = PageFactory.initElements(driver, GoogleMailLoginPage.class);
        loginPage.findButtonLogin();

        GoogleMailEnterLoginPage enterLoginPage = PageFactory.initElements(driver,GoogleMailEnterLoginPage.class);
        enterLoginPage.forLoginEnter(loginData);
        GoogleMailPasswordPage passwordPage = PageFactory.initElements(driver,GoogleMailPasswordPage.class);
        passwordPage.forPassword(passwordData);
        GoogleMailCheckUserName checkUserName = PageFactory.initElements(driver,GoogleMailCheckUserName.class);
        checkUserName.forCheckUserName(userCheck);
    }
}
