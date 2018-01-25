package com.google.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleMailLoginPage {
    private WebDriver driver;
    private By buttonLoginLocator = By.cssSelector("body > nav > div > a.gmail-nav__nav-link.gmail-nav__nav-link__sign-in");
    private WebElement buttonLogin;
    public GoogleMailLoginPage(WebDriver driver){
        this.driver = driver;
    }
    public void findButtonLogin(){
        buttonLogin = driver.findElement(buttonLoginLocator);
        buttonLogin.click();

    }
}
