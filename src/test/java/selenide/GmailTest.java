package selenide;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.FirefoxDriverManager;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import selenide.core.SelenideTestBase;
import selenide.pages.LoginPage;
import selenide.pages.PasswordPage;
import selenide.pages.SearchPage;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class GmailTest extends SelenideTestBase {
    private String loginData = "usermortikova@gmail.com";
    private String passData = "321qwe321";

    @Test(enabled = false)
    public void gMailSelenideTest() {
        ChromeDriverManager.getInstance().setup();
        open("https://www.google.com/intl/ru/gmail/about/");
        SearchPage searchPage = new SearchPage();
        searchPage.searchFor();
        LoginPage loginPage = new LoginPage();
        loginPage.loginFor(loginData);
        PasswordPage passwordPage = new PasswordPage();
        passwordPage.passwordFor(passData);
    }
}