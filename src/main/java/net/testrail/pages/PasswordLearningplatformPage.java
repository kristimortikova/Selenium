package net.testrail.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PasswordLearningplatformPage {
    private WebDriver driver;
    private By searchPassField = By.id("login-password");
    private WebElement passField;
    private String password = "123456";
    private By searchLogInButton = By.id("login-submit");
    private WebElement logInButton;
    public PasswordLearningplatformPage(WebDriver driver){
        this.driver = driver;
    }
    public void passEnter(){
        passField = driver.findElement(searchPassField);
        passField.sendKeys(password);
        //passField.submit();
        logInButton = driver.findElement(searchLogInButton);
        logInButton.click();


    }
}
