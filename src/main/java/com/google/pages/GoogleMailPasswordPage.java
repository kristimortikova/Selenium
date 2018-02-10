package com.google.pages;

import com.google.pages.UserData.DataLogin;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class GoogleMailPasswordPage {

    @FindBy(how = How.XPATH, using = "//*[@id=\"password\"]/div[1]/div/div[1]/input")
    private WebElement passwordField;
    private By buttonNext2Locator = By.xpath("//*[@id=\"passwordNext\"]/content/span");
    @FindBy(how = How.XPATH, using = "//*[@id=\"passwordNext\"]/content/span")
    private WebElement buttonNext2;
    //private String passwordData = "zhar0203dem14012";

    public void forPassword(String password){
        DataLogin dataLogin = new DataLogin();

        passwordField.sendKeys(dataLogin.infoPass(password));
        passwordField.submit();
        buttonNext2.click();
    }
}
