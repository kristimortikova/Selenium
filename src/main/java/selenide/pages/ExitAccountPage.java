package selenide.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class ExitAccountPage {
    private SelenideElement accountButton = $(By.xpath("//*[@id=\"nav-account\"]/img"));
    private SelenideElement exitButton = $(By.xpath("//*[@id=\"nav-logout\"]"));
    private SelenideElement exitButton2 = $(By.id("nav-logout"));

    public void exit(){
        accountButton.click();
        exitButton.click();

    }
}
