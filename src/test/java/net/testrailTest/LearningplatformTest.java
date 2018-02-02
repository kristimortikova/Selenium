package net.testrailTest;

import com.google.core.WebDriverTestBase;
import net.testrail.pages.LoginLearningplatformPage;
import net.testrail.pages.OpenLearningplatformPage;
import net.testrail.pages.PasswordLearningplatformPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class LearningplatformTest extends WebDriverTestBase{
    private By searchLoginField = By.xpath("//*[@id=\"username\"]");
    private WebElement loginField;
    private String login = "shiosaky@gmail.com.oe";
    private By continueButtonField = By.xpath("//*[@id=\"banner-continue-btn\"]");
    private WebElement continueButton;
    private By searchPassField = By.xpath("//*[@id=\"password\"]");
    private WebElement passField;
    private String password = "123456";
    private By searchLogInButton = By.xpath("//*[@id=\"login-btn\"]");
    private WebElement logInButton;

    @Test
    public void platformPageObjectTest(){
       driver.get("https://learningplatform.stg.openenglish.com/");
        OpenLearningplatformPage openPage = new OpenLearningplatformPage(driver);
        openPage.closeContinueButton();
        LoginLearningplatformPage loginPage = new LoginLearningplatformPage(driver);
        loginPage.loginEnter();
        PasswordLearningplatformPage passwordPage = new PasswordLearningplatformPage(driver);
        passwordPage.passEnter();



    }

}
