package net.testrail.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OpenLearningplatformPage {
    private WebDriver driver;
    private By continueButtonField = By.xpath("//*[@id=\"banner-continue-btn\"]");
    private WebElement continueButton;
    public OpenLearningplatformPage(WebDriver driver){
        this.driver = driver;
    }
    public void closeContinueButton(){
        continueButton = driver.findElement(continueButtonField);
        continueButton.click();
    }

}
