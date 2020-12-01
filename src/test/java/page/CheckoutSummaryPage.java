package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import steps.TestState;

public class CheckoutSummaryPage {

    public static float getActualTotal() {
        return Float.parseFloat(
                TestState.webDriver.findElement(By.className("summary_subtotal_label")).getText().replace("Item total: $", "")
        );
    }

    public static WebElement getFinishButton() {
        return TestState.webDriver.findElement(By.cssSelector(".btn_action.cart_button"));
    }
}
