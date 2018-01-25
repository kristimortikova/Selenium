package com.google.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleMailPasswordPage {
    private WebDriver driver;
    private By passwordFieldLocator = By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input");
    private WebElement passwordField;
    private By buttonNext2Locator = By.xpath("//*[@id=\"passwordNext\"]/content/span");
    private WebElement buttonNext2;
    private String passwordData = "*************";
    public GoogleMailPasswordPage(WebDriver driver){
        this.driver = driver;
    }
    public void forPassword(String passwordData){
        passwordField = driver.findElement(passwordFieldLocator);
        passwordField.sendKeys(passwordData);
        passwordField.submit();
        buttonNext2 = driver.findElement(buttonNext2Locator);
        buttonNext2.click();
    }
}
