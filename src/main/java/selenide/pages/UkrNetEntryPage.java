package selenide.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class UkrNetEntryPage {
    private SelenideElement buttonLogin = $(By.xpath("/html/body/div[2]/main/div[2]/div/div[1]/section[1]/div/div[1]/form/div[2]/div/button"));
    public void entryPage(){
        buttonLogin.click();
    }
}
