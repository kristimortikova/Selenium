package com.google.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class GoogleMailPasswordPage {

    @FindBy(how = How.XPATH, using = "//*[@id=\"password\"]/div[1]/div/div[1]/input")
    private WebElement passwordField;
    private By buttonNext2Locator = By.xpath("//*[@id=\"passwordNext\"]/content/span");
    @FindBy(how = How.XPATH, using = "//*[@id=\"passwordNext\"]/content/span")
    private WebElement buttonNext2;
    private String passwordData = "*************";

    public void forPassword(String passwordData){
        passwordField.sendKeys(passwordData);
        passwordField.submit();
        buttonNext2.click();
    }
}
