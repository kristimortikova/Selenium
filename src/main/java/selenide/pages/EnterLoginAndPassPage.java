package selenide.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class EnterLoginAndPassPage {
    private SelenideElement loginField = $(By.id("login-email"));
    private String login = "shiosaky@gmail.com.oe";
    private SelenideElement passField = $(By.id("login-password"));
    private String password = "123456";

    public void loginEnter(String login){
        loginField.val(login);
    }
    public void passwordEnter(String password){
        passField.val(password);
    }

}
