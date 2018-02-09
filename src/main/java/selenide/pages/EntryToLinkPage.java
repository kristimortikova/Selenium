package selenide.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class EntryToLinkPage {
    private SelenideElement rememberMeButton =$(By.xpath("//*[@id=\"remember-login-label\"]"));
    private SelenideElement buttonLogin = $(By.xpath("//*[@id=\"login-btn\"]"));
    public void rememberAndEntry (){
        rememberMeButton.click();
        buttonLogin.click();

    }
}
