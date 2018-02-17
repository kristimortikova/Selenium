package com.google.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class GoogleSearchPage {
    @FindBy(how = How.XPATH, using = "//*[@id=\"lst-ib\"]")
    private WebElement searchField;
    @Step("Enter data {0}")
    public void searchFor(String searchData){
        searchField.sendKeys(searchData);
        searchField.submit();
    }
}
