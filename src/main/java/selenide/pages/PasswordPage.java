package selenide.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class PasswordPage {
    private SelenideElement buttonNextEnter = $(By.xpath("//*[@id=\"identifierNext\"]/content/span"));
    private SelenideElement passwordEnter = $(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input"));
    private SelenideElement buttonNext2Enter = $(By.xpath("//*[@id=\"passwordNext\"]/content/span"));
    public PasswordPage passwordFor(String passData){
        buttonNextEnter.click();
        passwordEnter.val(passData);
        buttonNext2Enter.click();
        return this;
    }



}
