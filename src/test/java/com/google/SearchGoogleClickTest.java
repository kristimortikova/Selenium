package com.google;

import com.google.core.WebDriverTestBase;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertTrue;

public class SearchGoogleClickTest extends WebDriverTestBase {
    private String loginUkrNet="user1401@ukr.net";
    private String passUkrNet = "12345qwerty";


    @Test
    public void searchGoogleTest(){
        driver.get("https://www.ukr.net/");

        //Assert.assertTrue(driver.findElement(By.cssSelector("#user-login-form > input:nth-child(2)")).getText().contains(""));
    }
}