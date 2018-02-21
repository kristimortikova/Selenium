package com.google.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginDataThomasCook {
    private String login = "user1401@ukr.net";
    private String password = "321Qwe321";
    @FindBy(how = How.ID, using = "userEmail")
    private WebElement loginField;
    @FindBy(how = How.ID, using = "userPassword")
    private WebElement passwordField;
    @FindBy(how = How.ID, using = "LoginBtn")
    private WebElement buttonLogin;
    public void enterLogin(){
        loginField.sendKeys(login);
    }
    public void enterPassword(){
        passwordField.sendKeys(password);
    }
    public void clickButtonLogin(){
        buttonLogin.click();
    }

}
