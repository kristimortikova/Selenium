package selenide.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$;

public class UkrNetLoginPage {
    private String loginUkrNet="user1401@ukr.net";
    private String passUkrNet = "12345qwerty";
    private SelenideElement loginfield= $(By.xpath("/html/body/div[2]/main/div[2]/div/div[1]/section[1]/div/div[1]/form/input[2]"));
    private SelenideElement passwordField = $(By.xpath("/html/body/div[2]/main/div[2]/div/div[1]/section[1]/div/div[1]/form/input[3]"));
    public void LoginUkrNet(String loginUkrNet){
        loginfield.val(loginUkrNet);
    }
    public void PassUkrNet(String passUkrNet){
        passwordField.val(passUkrNet);
    }
}
