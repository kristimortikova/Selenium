package com.google;

import com.google.core.WebDriverTestBase;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertTrue;

public class SearchGoogleClickTest extends WebDriverTestBase {
    //private WebDriver driver;
    private By searchFieldLocator = By.xpath("//*[@id=\"lst-ib\"]");
    private By linkLocator = By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/h3/a");
    private By buttonLocator = By.xpath("//*[@id=\"sbtc\"]/div[2]/div[2]/div[1]/div/ul/li[11]/div/span[1]/span/input");
    private WebElement linkField;
    private WebElement searchField;
    private WebElement buttonField;
    private String searchData = "UKR.NET";
    /*
    @BeforeClass
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }*/

    @Test
    public void searchGoogleTest(){
        driver.get("https://www.google.ua");
        searchField = driver.findElement(searchFieldLocator);
        searchField.sendKeys(searchData);
        buttonField = driver.findElement(buttonLocator);
        buttonField.click();
        linkField = driver.findElement(linkLocator);
        assertTrue(linkField.getText().contains(searchData));
    }
}