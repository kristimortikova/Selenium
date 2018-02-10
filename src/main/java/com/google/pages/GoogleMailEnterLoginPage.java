package com.google.pages;

import com.google.pages.UserData.DataLogin;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class GoogleMailEnterLoginPage {
    @FindBy(how = How.XPATH, using = "//*[@id=\"identifierId\"]")
    private WebElement loginField;

    @FindBy(how = How.XPATH, using = "//*[@id=\"identifierNext\"]/content/span")
    private WebElement buttonNext;
    //private String login = "kristimortikova@gmail.com";

    public void forLoginEnter(String login){
        DataLogin dataLogin = new DataLogin();
        loginField.sendKeys(dataLogin.info(login));
        loginField.submit();
        buttonNext.click();

    }
}
