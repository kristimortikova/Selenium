package selenide.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class EntryToLinkPage {
    private SelenideElement rememberMeButton =$(By.id("login-remember"));
    private SelenideElement buttonLogin = $(By.id("login-submit"));
    public void rememberAndEntry (){
        rememberMeButton.click();
        buttonLogin.click();

    }
}
