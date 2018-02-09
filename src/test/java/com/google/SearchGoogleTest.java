package com.google;

import com.google.core.WebDriverTestBase;
import com.google.pages.GoogleResultPage;
import com.google.pages.GoogleSearchPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import static org.testng.Assert.assertTrue;

public class SearchGoogleTest extends WebDriverTestBase {

    private WebElement searchField;
    private WebElement linkField;
    private String searchData = "Selenium";

    @Test
    public void searchGooglePageObjectTest(){
        driver.get("https://www.google.ua");
        GoogleSearchPage page = PageFactory.initElements(driver,GoogleSearchPage.class);
        page.searchFor(searchData);

        GoogleResultPage resultPage = PageFactory.initElements(driver,GoogleResultPage.class);
        Assert.assertTrue(resultPage.findLink().getText().contains(searchData));
    }
}
