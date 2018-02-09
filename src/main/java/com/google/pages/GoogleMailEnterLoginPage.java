package com.google.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class GoogleMailEnterLoginPage {
    @FindBy(how = How.XPATH, using = "//*[@id=\"identifierId\"]")
    private WebElement loginField;

    @FindBy(how = How.XPATH, using = "//*[@id=\"identifierNext\"]/content/span")
    private WebElement buttonNext;
    private String loginData = "****************";

    public void forLoginEnter(String loginData){
        loginField.sendKeys(loginData);
        loginField.submit();
        buttonNext.click();

    }
}
