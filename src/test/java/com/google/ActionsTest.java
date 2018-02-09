package com.google;

import com.google.core.WebDriverTestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionsTest extends WebDriverTestBase {
    @Test
    public void dragAnd(){
        driver.get("https://gojs.net/latest/samples/htmlDragDrop.html?gclid=CLjWnLeG5tQCFUeVGwodCowEcA");
        WebElement fromElem = driver.findElement(By.xpath("//*[@id=\"sample\"]/div[1]/span[1]/div/div[2]"));
        WebElement toElem = driver.findElement(By.xpath("//*[@id=\"myDiagramDiv\"]/canvas"));
        Actions builder = new Actions(driver);
        /*Action dragAndDrop =
                builder.clickAndHold(fromElem)
                        .moveToElement(toElem).release(toElem).build();
        dragAndDrop.perform();*/
        builder.dragAndDrop(fromElem,toElem).build().perform();
        //fromElem.getAttribute("src").equals("img_logo.gif");
    }

}
