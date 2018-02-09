package selenide.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class EnterLoginAndPassPage {
    private SelenideElement loginField = $(By.xpath("//*[@id=\"username\"]"));
    private String login = "shiosaky@gmail.com.oe";
    private SelenideElement passField = $(By.xpath("//*[@id=\"password\"]"));
    private String password = "123456";

    public void loginEnter(String login){
        loginField.val(login);
    }
    public void passwordEnter(String password){
        passField.val(password);
    }

}
