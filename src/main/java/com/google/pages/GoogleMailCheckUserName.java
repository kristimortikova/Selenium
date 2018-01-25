package com.google.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import static org.testng.Assert.assertTrue;

public class GoogleMailCheckUserName {
    private WebDriver driver;
    private By buttonAccountLocator = By.xpath("//*[@id=\"gb\"]/div[1]/div[1]/div[2]/div[5]/div[1]/a/span");
    private By userNameLocator = By.xpath("//*[@id=\"gb\"]/div[1]/div[1]/div[2]/div[5]/div[2]/div[1]/div/div[1]");
    private WebElement buttonAccount;
    private WebElement userName;
    private String userCheck = "Мортикова";
    public GoogleMailCheckUserName(WebDriver driver){
        this.driver = driver;
    }
    public void forCheckUserName(String userCheck){
        buttonAccount = driver.findElement(buttonAccountLocator);
        buttonAccount.click();
        userName = driver.findElement(userNameLocator);
        Assert.assertTrue(userName.getText().contains(userCheck));
    }
}
