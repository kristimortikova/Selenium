package com.google;

import com.google.core.WebDriverTestBase;
import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AlertTest extends WebDriverTestBase {
    @Description ("annotation")
    @Test
    public void alertBoxTest(){
        driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
        WebElement iFrame =  driver.findElement(By.id("iframeResult"));
        driver.switchTo().frame(iFrame);
        driver.findElement(By.xpath("/html/body/button")).click();
        driver.switchTo().alert().accept();
        WebElement fieldResult = driver.findElement(By.id("demo"));
        String text = fieldResult.getText();
        Assert.assertEquals(text, "You pressed OK!");
    }
    @Test
    public void alertBox2Test(){
        driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
        WebElement iFrame = driver.findElement(By.id("iframeResult"));
        driver.switchTo().frame(iFrame);
        driver.findElement(By.xpath("/html/body/button")).click();
        driver.switchTo().alert().dismiss();
        WebElement fiekdResult2 = driver.findElement(By.id("demo"));
        String text2 = fiekdResult2.getText();
        Assert.assertEquals(text2, "You pressed Cancel!");
    }
}
