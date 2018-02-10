package selenide.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.value;
import static com.codeborne.selenide.Selenide.$;

public class ExitAccountPage {
    private SelenideElement accountButton = $(By.xpath("//*[@id=\"nav-account\"]/img"));
    private SelenideElement exitButton = $(By.id("nav-logout"));
    private SelenideElement loginField = $(By.id("login-email"));

    public void exit(){
        accountButton.click();
        accountButton.getText().equals("Daniel Shiosaky");
        exitButton.click();
    }
    public void checkRememberName(){
        loginField.shouldHave(value("shiosaky@gmail.com.oe"));
    }
}
