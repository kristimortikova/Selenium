package selenide;

import com.codeborne.selenide.Condition;
import io.github.bonigarcia.wdm.FirefoxDriverManager;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import selenide.core.SelenideTestBase;
import selenide.pages.UkrNetEntryPage;
import selenide.pages.UkrNetLoginPage;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class UkrNetTest extends SelenideTestBase{
    private String loginUkrNet="user1401@ukr.net";
    private String passUkrNet = "12345qwerty";
    @Test(enabled = false)
    public void ukrNetTest(){
        open("https://www.ukr.net/");
        UkrNetLoginPage ukrNetLoginPage = new UkrNetLoginPage();
        ukrNetLoginPage.LoginUkrNet(loginUkrNet);
        ukrNetLoginPage.PassUkrNet(passUkrNet);
        UkrNetEntryPage ukrNetEntryPage = new UkrNetEntryPage();
        ukrNetEntryPage.entryPage();
        $(By.xpath("/html/body/div[2]/main/div[3]/div[1]/section/ul/li[2]")).click();
        $(By.xpath("//*[@id=\"grn\"]")).val("25000");
        $(By.xpath("//*[@id=\"login-block\"]/div/div/span"))
                .shouldBe(Condition.exactText(loginUkrNet));
        $(By.xpath("//*[@id=\"login-block\"]/div/div/a")).click();
    }

}
