package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import steps.TestState;

public class NavBar {

    public static WebElement getBurgerButton() {
        return TestState.webDriver.findElement(By.className("bm-burger-button"));
    }

    public static WebElement getLogoutButton() {
        return TestState.webDriver.findElement(By.id("logout_sidebar_link"));
    }
}
