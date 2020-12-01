package steps;

import io.cucumber.java8.En;
import page.*;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

public class AssertSteps implements En {

    public AssertSteps() {

        Then("the Inventory will be sorted from Lowest to Highest Price", () -> {
            for(int i = 0; i < InventoryPage.getInventory().size() - 1; i++) {
                float firstPrice = InventoryPage.getItemPrice(i);
                float secondPrice = InventoryPage.getItemPrice(i + 1);
                assertThat(firstPrice).isGreaterThanOrEqualTo(secondPrice);
            }
        });

        Then("my Cart will contain the items I added", () -> {
            ArrayList<String> actualBasketItemNames = new ArrayList<>();
            BasketPage.getBasketItems().forEach(basketItem -> {
                actualBasketItemNames.add(BasketPage.getItemName(basketItem));
            });

            TestState.expectedItemNames.forEach(expectedItem -> {
                assertThat(actualBasketItemNames).contains(expectedItem);
            });
        });

        Then("the total price of my order will be correct", () -> {
            float actualItemTotal = CheckoutSummaryPage.getActualTotal();
            assertThat(actualItemTotal).isEqualTo(TestState.expectedItemTotal);
        });

        Then("I will be shown the correct Order Completion Page", () -> {
            assertThat(CheckoutCompletePage.getCheckoutCompleteText()).contains("THANK YOU FOR YOUR ORDER");
        });

        Then("I will be shown an Error Message of {string}", (String expectedError) -> {
            assertThat(LoginPage.getLoginError().getText()).isEqualTo(expectedError);
        });

        Then("the Page URL will be {string}", (String expectedUrl) -> {
            assertThat(TestState.webDriver.getCurrentUrl()).isEqualTo(expectedUrl);
        });
    }
}
