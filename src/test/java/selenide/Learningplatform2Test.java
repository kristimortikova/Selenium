package selenide;

import org.testng.annotations.Test;
import selenide.core.SelenideTestBase;
import selenide.pages.EnterLoginAndPassPage;
import selenide.pages.EntryToLinkPage;
import selenide.pages.ExitAccountPage;
import selenide.pages.OpenLearningLinkPage;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class Learningplatform2Test extends SelenideTestBase{
    private String login = "shiosaky@gmail.com.oe";
    private String password = "123456";
    @Test (enabled = false)
    public void platformTest(){
        open("https://learningplatform.stg.openenglish.com/login.html");
        OpenLearningLinkPage openPage = new OpenLearningLinkPage();
        //openPage.closeBunner();
        EnterLoginAndPassPage loginAndPass = new EnterLoginAndPassPage();
        loginAndPass.loginEnter(login);
        loginAndPass.passwordEnter(password);
        EntryToLinkPage entryToLinkPage = new EntryToLinkPage();
        entryToLinkPage.rememberAndEntry();
        ExitAccountPage exitAccountPage = new ExitAccountPage();
        exitAccountPage.exit();
        exitAccountPage.checkRememberName();
    }
}
