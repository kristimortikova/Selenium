package com.google;

import com.google.core.WebDriverTestBase;
import com.google.pages.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class SearchGMailTest extends WebDriverTestBase {

    private By searchFieldLocator = By.xpath("//*[@id=\"lst-ib\"]");
    private By linkLocator = By.xpath("//*[@id=\"rso\"]/div/div/div[1]/div/div/h3/a");
    private By buttonSearchLocator = By.xpath("//*[@id=\"sbtc\"]/div[2]/div[2]/div[1]/div/ul/li[11]/div/span[1]/span/input");
    private By buttonLoginLocator = By.cssSelector("body > nav > div > a.gmail-nav__nav-link.gmail-nav__nav-link__sign-in");
    private By loginFieldLocator = By.xpath("//*[@id=\"identifierId\"]");
    private By buttonNextLocator = By.xpath("//*[@id=\"identifierNext\"]/content/span");
    private By passwordFieldLocator = By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input");
    private By buttonNext2Locator = By.xpath("//*[@id=\"passwordNext\"]/content/span");
    private By buttonAccountLocator = By.xpath("//*[@id=\"gb\"]/div[1]/div[1]/div[2]/div[5]/div[1]/a/span");
    private By userNameLocator = By.xpath("//*[@id=\"gb\"]/div[1]/div[1]/div[2]/div[5]/div[2]/div[1]/div/div[1]");
    private WebElement linkField;
    private WebElement searchField;
    private WebElement buttonSearch;
    private WebElement buttonLogin;
    private WebElement loginField;
    private WebElement buttonNext;
    private WebElement passwordField;
    private WebElement buttonNext2;
    private WebElement buttonAccount;
    private WebElement userName;
    private String searchData = "Gmail";
    private String loginData = "***********";
    private String passwordData = "*************";
    private String userCheck = "Мортикова";

    @Test
    public void searchGoogleTest() {
        driver.get("https://www.google.ua");
        searchField = driver.findElement(searchFieldLocator);
        searchField.sendKeys(searchData);
        buttonSearch = driver.findElement(buttonSearchLocator);
        buttonSearch.click();
        linkField = driver.findElement(linkLocator);
        Assert.assertTrue(linkField.getText().contains(searchData));
        linkField.click();

    }
    @Test
    public void searchGooglePageObjectTest(){
        driver.get("https://www.google.com/intl/ru/gmail/about/");
        GoogleMailLoginPage loginPage = new GoogleMailLoginPage(driver);
        loginPage.findButtonLogin();
        GoogleMailEnterLoginPage enterLoginPage = new GoogleMailEnterLoginPage(driver);
        enterLoginPage.forLoginEnter(loginData);
        GoogleMailPasswordPage passwordPage = new GoogleMailPasswordPage(driver);
        passwordPage.forPassword(passwordData);
        GoogleMailCheckUserName checkUserName = new GoogleMailCheckUserName(driver);
        checkUserName.forCheckUserName(userCheck);
    }
}
