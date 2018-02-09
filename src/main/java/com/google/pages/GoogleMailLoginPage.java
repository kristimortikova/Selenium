package com.google.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class GoogleMailLoginPage {
    @FindBy(how = How.XPATH, using = "/html/body/nav/div/a[2]")
    private WebElement buttonLogin;

    public void findButtonLogin(){

        buttonLogin.click();

    }
}
