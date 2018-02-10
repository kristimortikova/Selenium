package selenide.core;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.FirefoxDriverManager;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import static com.codeborne.selenide.WebDriverRunner.CHROME;
import static com.codeborne.selenide.WebDriverRunner.FIREFOX;

public class SelenideTestBase {
    private String browser = System.getProperty("browser", CHROME);
    @BeforeClass
    public void setUp() {
        Configuration.browser = browser;
        Configuration.holdBrowserOpen=true;
        switch (browser) {
            case CHROME:
                ChromeDriverManager.getInstance().setup();
                break;
            case FIREFOX:
                FirefoxDriverManager.getInstance().setup();
                break;
        }
    }
    @AfterClass
    public void tearRunner(){
       WebDriverRunner.getWebDriver().quit();
    }
}
