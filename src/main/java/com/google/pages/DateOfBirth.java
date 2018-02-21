package com.google.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class DateOfBirth {
    @FindBy(how = How.ID, using = "inputdate")
    private WebElement date;
    @FindBy (how = How.ID, using = "inputMonth")
    private WebElement month;
    @FindBy(how = How.ID, using = "inputYear")
    private WebElement year;
    @FindBy(how = How.XPATH, using = "/html/body/div[1]/ma-details-page/ma-page-wrapper/div/div[2]/div/form/button")
    private WebElement buttonSave;
    public void setDate(){
        Select selectObject = new Select(date);
        selectObject.selectByVisibleText("21");
    }
    public void setMonth() {
        Select selectObject1 = new Select(month);
        selectObject1.selectByValue("string:05");
    }
    public void setYear(){
        Select selectObject2 = new Select(year);
        selectObject2.selectByValue("string:1990");
    }
    public void saveChange(){
       // buttonSave.click();

    }


}
