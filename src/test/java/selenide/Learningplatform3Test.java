package selenide;

import org.testng.annotations.Test;
import selenide.core.SelenideTestBase;
import selenide.pages.ClickBunner;
import selenide.pages.OpenLearningLinkPage;

import static com.codeborne.selenide.Selenide.open;

public class Learningplatform3Test extends SelenideTestBase {

    @Test (enabled = false)
    public void closeBunnerTest(){
        open("https://learningplatform.stg.openenglish.com/login.html");
        OpenLearningLinkPage openLinkAndCloseBunner = new OpenLearningLinkPage();
        openLinkAndCloseBunner.closeBunner();
        ClickBunner clickBunnerr = new ClickBunner();
        clickBunnerr.clickBunner();
    }
}
