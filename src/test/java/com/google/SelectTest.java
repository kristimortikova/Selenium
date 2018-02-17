package com.google;

import com.google.core.WebDriverTestBase;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;
@Feature("frame")
@Story("select ")
public class SelectTest extends WebDriverTestBase {

    private WebElement selElem;
    @Test
    public void carTest(){
        driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select");
        WebElement iFrame =  driver.findElement(By.id("iframeResult"));
        driver.switchTo().frame(iFrame);
        selElem = driver.findElement(By.cssSelector("select"));
        selElem.click();
        Select selectObject = new Select(selElem);
        driver.findElement(By.cssSelector("select option[value='audi']")).click();
        Assert.assertTrue(driver.findElement(By.cssSelector("select option[value='audi']")).getText().contains("Audi"));
        selectObject.selectByIndex(3);
        selectObject.selectByValue("audi");
        List <WebElement> allSelectOptions = selectObject.getAllSelectedOptions();
        WebElement firstSelectedOption = selectObject.getFirstSelectedOption();
        List <WebElement> allAvailableOptions = selectObject.getOptions();
        Boolean doesThisAllowMultipleSelections = selectObject.isMultiple();
        //driver.findElement(By.cssSelector("select")).click();
        driver.switchTo().parentFrame();
        driver.findElement(By.id("menuButton")).click();
    }
}