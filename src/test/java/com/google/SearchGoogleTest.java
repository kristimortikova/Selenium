package com.google;

import com.google.core.WebDriverTestBase;
import com.google.pages.GoogleResultPage;
import com.google.pages.GoogleSearchPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import static org.testng.Assert.assertTrue;

public class SearchGoogleTest extends WebDriverTestBase {
    private By searchFieldLocator = By.xpath("//*[@id=\"lst-ib\"]");
    private By linkLocator = By.xpath("//*[@id=\"rso\"]/div[1]/div/div[1]/div/div[1]/div[2]/div[2]/div/div/h3/a");
    private WebElement searchField;
    private WebElement linkField;
    private String searchData = "Selenium";

    @Test
    public void searchGoogleTest(){
        driver.get("https://www.google.ua");
        searchField = driver.findElement(searchFieldLocator);
        searchField.sendKeys(searchData);
        searchField.submit();
        linkField = driver.findElement(linkLocator);
        Assert.assertTrue(linkField.getText().contains(searchData));
    }
    @Test
    public void searchGooglePageObjectTest(){
        driver.get("https://www.google.ua");
        GoogleSearchPage searchPage = new GoogleSearchPage(driver);
        searchPage.searchFor(searchData);
        GoogleResultPage resultPage = new GoogleResultPage(driver);
        Assert.assertTrue(resultPage.findLink().getText().contains(searchData));
    }
}
