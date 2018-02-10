package net.testrail.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginLearningplatformPage {
    private WebDriver driver;
    private By searchLoginField = By.id("login-email");
    private WebElement loginField;
    private String login = "shiosaky@gmail.com.oe";
    public LoginLearningplatformPage(WebDriver driver){
        this.driver = driver;
    }
    public void loginEnter(){
        loginField = driver.findElement(searchLoginField);
        loginField.clear();
        loginField.sendKeys(login);

    }
}
