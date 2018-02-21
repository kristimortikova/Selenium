package com.google.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class InputFieldUserInfo {
    //public WebDriver driver;
    @FindBy(how = How.ID, using = "inputTitle")
    private WebElement title;
    @FindBy(how = How.XPATH, using = "//*[@id=\"inputName\"]")
    private WebElement firstName;
    @FindBy(how = How.ID, using = "inputLastName")
    private WebElement lastName;
    private String name =  "Marina";
    private String surname = "Ivanova";
    public void setTitle(){
        title.click();
        Select selectObject = new Select(title);
        selectObject.selectByIndex(4);
        //Actions action = new Actions(driver);
    }
    public void enterFirstAndLastname(){
        firstName.sendKeys(name);
        lastName.sendKeys(surname);
    }
}
