package selenide.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage {
    private SelenideElement enterLogin = $(By.xpath("//*[@id=\"identifierId\"]"));
    public LoginPage loginFor(String logindata){
        //enterLogin.click();
        enterLogin.val(logindata);
        return this;
    }
}
