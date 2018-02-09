package com.google.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class GoogleResultPage {
    @FindBy (how = How.XPATH, using = "//*[@id=\"rso\"]/div[1]/div/div[1]/div/div[1]/div[2]/div[3]/div/div/h3/a")
    private WebElement linkField;

    public WebElement findLink(){

        return linkField;
    }
}
