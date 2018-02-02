package selenide;

import io.github.bonigarcia.wdm.FirefoxDriverManager;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import selenide.core.SelenideTestBase;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class UkrNetTest extends SelenideTestBase{
    private String loginUkrNet="user1401@ukr.net";
    private String passUkrNet = "12345qwerty";
    @Test
    public void ukrNetTest(){
        open("https://www.ukr.net/");
        $(By.xpath("/html/body/div[2]/main/div[2]/div/div[1]/section[1]/div/div[1]/form/input[2]")).val(loginUkrNet);
        $(By.xpath("/html/body/div[2]/main/div[2]/div/div[1]/section[1]/div/div[1]/form/input[3]")).val(passUkrNet);
        $(By.xpath("/html/body/div[2]/main/div[2]/div/div[1]/section[1]/div/div[1]/form/div[1]/input")).click();
        $(By.xpath("/html/body/div[2]/main/div[2]/div/div[1]/section[1]/div/div[1]/form/div[2]/div/button")).click();
        $(By.xpath("/html/body/div[2]/main/div[3]/div[1]/section/ul/li[2]")).click();
        $(By.xpath("//*[@id=\"grn\"]")).val("25000");
        $(By.xpath("//*[@id=\"login-block\"]/div/div/a")).click();



    }

}
