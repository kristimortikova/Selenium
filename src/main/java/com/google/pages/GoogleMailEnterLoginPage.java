package com.google.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleMailEnterLoginPage {
    private WebDriver driver;
    private By loginFieldLocator = By.xpath("//*[@id=\"identifierId\"]");
    private WebElement loginField;
    private By buttonNextLocator = By.xpath("//*[@id=\"identifierNext\"]/content/span");
    private WebElement buttonNext;
    private String loginData = "****************";
    public GoogleMailEnterLoginPage(WebDriver driver){
        this.driver = driver;
    }
    public void forLoginEnter(String loginData){
        loginField = driver.findElement(loginFieldLocator);
        loginField.sendKeys(loginData);
        loginField.submit();
        buttonNext = driver.findElement(buttonNextLocator);
        buttonNext.click();

    }
}
