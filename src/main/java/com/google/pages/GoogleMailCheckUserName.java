package com.google.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import static org.testng.Assert.assertTrue;

public class GoogleMailCheckUserName {

    @FindBy(how = How.XPATH, using = "//*[@id=\"gb\"]/div[1]/div[1]/div[2]/div[5]/div[1]/a/span")
    private WebElement buttonAccount;
    @FindBy(how = How.XPATH, using = "//*[@id=\"gb\"]/div[1]/div[1]/div[2]/div[5]/div[2]/div[1]/div/div[1]")
    private WebElement userName;
    private String userCheck = "Кристина Мортикова";

    public String forCheckUserName(String userCheck){
        buttonAccount.click();
        Assert.assertTrue(userName.getText().contains(userCheck));
        return userCheck;
    }
}
