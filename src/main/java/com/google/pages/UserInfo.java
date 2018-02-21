package com.google.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import org.testng.Assert;



public class UserInfo {
    public WebDriver driver;
    @FindBy(how = How.CSS, using = "#loggedInHeader > div.dropdown-toggle > div.pull-left.light.MyAccountWidget-links > div")
    private WebElement userProfile;
    @FindBy(how = How.XPATH, using = "//*[@id=\"MyAccountNavigation-Details\"]")
    private WebElement accountDetails;
    @FindBy(how = How.XPATH, using = "//*[@id=\"inputTitle\"]")
    private WebElement title;
    public void clickProfile(){
        Assert.assertTrue(userProfile.getText().contains("My Account"));

    }
    public void accountDet(){
        Actions action = new Actions(driver);
        action.moveToElement(userProfile).moveToElement(accountDetails).click().build().perform();
        accountDetails.click();
        action.moveToElement(title).build().perform();
    }
}
