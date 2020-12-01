package page;

import org.openqa.selenium.By;
import steps.TestState;

public class CheckoutCompletePage {

    public static String getCheckoutCompleteText() {
        return TestState.webDriver.findElement(By.id("checkout_complete_container")).getText();
    }
}
