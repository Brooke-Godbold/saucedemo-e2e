package utils;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import steps.TestState;

public class WaitUtils {

    public static void waitUntilElementIsInteractable(WebElement element) {
        WebDriverWait wait = new WebDriverWait(TestState.webDriver, 5000);
        wait.until(ExpectedConditions.visibilityOf(element));
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }
}
