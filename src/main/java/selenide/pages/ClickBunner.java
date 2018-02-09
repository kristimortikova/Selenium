package selenide.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import selenide.core.SelenideTestBase;

import static com.codeborne.selenide.Selenide.$;

public class ClickBunner {
    private SelenideElement bunner = $(By.xpath("//*[@id=\"banner-title\"]"));
    public void clickBunner(){
        bunner.click();
        bunner.shouldBe(Condition.visible);

    }
}
