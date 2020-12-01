package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import steps.TestState;

import java.util.List;

public class BasketPage {

    public static List<WebElement> getBasketItems() {
        return TestState.webDriver.findElements(By.className("cart_item"));
    }

    public static String getItemName(WebElement item) {
        return item.findElement(By.className("inventory_item_name")).getText();
    }

    public static WebElement getCheckoutButton() {
        return TestState.webDriver.findElement(By.cssSelector(".btn_action.checkout_button"));
    }
}
