package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import steps.TestState;

public class LoginPage {

    public static WebElement getUsernameInput() {
        return TestState.webDriver.findElement(By.xpath("//input[@data-test='username']"));
    }

    public static WebElement getPasswordInput() {
        return TestState.webDriver.findElement(By.xpath("//input[@data-test='password']"));
    }

    public static WebElement getLoginButton() {
        return TestState.webDriver.findElement(By.id("login-button"));
    }
}
