package com.google;

import com.google.core.WebDriverTestBase;
import com.google.pages.*;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class ThomasCookTest extends WebDriverTestBase{
@Test (enabled = false)
    public void ThomasCookTest(){
    driver.get("https://www.thomascook.com/holidays/package/");
    RegisterThomas registerThomas = PageFactory.initElements(driver,RegisterThomas.class);
    registerThomas.findButtonRegistor();
    LoginDataThomasCook dataThomasCook = PageFactory.initElements(driver, LoginDataThomasCook.class);
    dataThomasCook.enterLogin();
    dataThomasCook.enterPassword();
    dataThomasCook.clickButtonLogin();
    driver.get("https://www.thomascook.com/myaccount/");
    UserInfo userInfo = PageFactory.initElements(driver, UserInfo.class);
    userInfo.driver = driver;
    userInfo.clickProfile();
    userInfo.accountDet();
    InputFieldUserInfo userInfo1 = PageFactory.initElements(driver, InputFieldUserInfo.class);
    userInfo1.setTitle();
    userInfo1.enterFirstAndLastname();
    DateOfBirth dateOfBirth = PageFactory.initElements(driver, DateOfBirth.class);
    dateOfBirth.setDate();
    dateOfBirth.setMonth();
    dateOfBirth.setYear();
    dateOfBirth.saveChange();
    HomePageThomas homePage = PageFactory.initElements(driver, HomePageThomas.class);
    homePage.checkInfoMessage();
    homePage.clickHome();
}

}
