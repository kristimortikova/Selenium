package net.testrail.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class DropDownPage {
    @FindBy(how = How.XPATH, using = "//*[@id=\"nav-account\"]/img")
    WebElement user;
    @FindBy(how = How.XPATH, using = "//*[@id=\"navigation-menu\"]/ul[2]/li[3]/div/p")
    WebElement userName;
    public void searchUser(){
        user.click();}
        public void  checkUserName(){
        Assert.assertEquals(userName.getText(), "Daniel Shiosaky");
    }
}
