package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import steps.TestState;

public class CheckoutDetailsPage {

    public static WebElement getFirstNameInput() {
        return TestState.webDriver.findElement(By.xpath("//input[@data-test='firstName']"));
    }

    public static WebElement getLastNameInput() {
        return TestState.webDriver.findElement(By.xpath("//input[@data-test='lastName']"));
    }

    public static WebElement getPostcodeInput() {
        return TestState.webDriver.findElement(By.xpath("//input[@data-test='postalCode']"));
    }

    public static WebElement getContinueButton() {
        return TestState.webDriver.findElement(By.cssSelector(".btn_primary.cart_button"));
    }
}
