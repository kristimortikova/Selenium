package com.google.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RegisterThomas {
    @FindBy(how = How.ID, using = "login-link")
    private WebElement buttonRegister;
    public void findButtonRegistor(){
        buttonRegister.click();

    }
}
