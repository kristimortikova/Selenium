package selenide.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class SearchPage {
    private SelenideElement searchLoginButton =$(By.xpath("/html/body/nav/div/a[2]"));
    public SearchPage searchFor(){
        searchLoginButton.click();
        return this;
    }
}
