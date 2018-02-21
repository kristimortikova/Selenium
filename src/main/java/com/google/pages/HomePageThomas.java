package com.google.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class HomePageThomas {
    @FindBy(how = How.XPATH, using = "//*[@id=\"myDetailsNotification\"]/notification-legacy/div/h3/span")
    private WebElement message;
    @FindBy(how = How.XPATH, using = "//*[@id=\"mainHeader\"]/div/div[1]/div/a")
    private WebElement home;
    public void checkInfoMessage(){
       // Assert.assertTrue(message.getText().contains("Success!"));
    }
    public void clickHome(){
        home.click();
    }
}
