package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.xml.sax.Locator;

public class WaitUntilElement {

    public static boolean isPresent(WebDriver webDriver, By locator){
        try{
            WebDriverWait wait = new WebDriverWait(webDriver, 5);
            wait.until(ExpectedConditions.presenceOfElementLocated(locator));
            return true;

        }catch (Exception e){
            e.printStackTrace();

            return false;
        }
    }

    public static boolean isVisible(WebDriver webDriver, By locator){
        try{
            WebDriverWait wait = new WebDriverWait(webDriver, 5);
            wait.until(ExpectedConditions.visibilityOf(webDriver.findElement(locator)));
            return true;

        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }


}
