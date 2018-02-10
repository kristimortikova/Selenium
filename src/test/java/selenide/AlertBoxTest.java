package selenide;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import selenide.core.SelenideTestBase;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.switchTo;

public class AlertBoxTest extends SelenideTestBase {
    private String alertExample = "https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm";
    private String canceled = "You pressed Cancel!";
    @Test(enabled = false)
    public void alertInSelenideTest(){
        open(alertExample);
        switchTo().frame("iframeResult");
        $(By.xpath("html/body/button")).click();
        switchTo().alert().dismiss();
        $(By.id("demo")).shouldHave(text(canceled));
    }
}
