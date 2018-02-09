package selenide.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class OpenLearningLinkPage {
    private SelenideElement bunner = $(By.xpath("//*[@id=\"banner-continue-btn\"]"));
    public void closeBunner(){
        bunner.click();
        bunner.shouldNotBe(Condition.visible);
    }
}
