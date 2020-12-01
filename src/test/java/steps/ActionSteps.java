package steps;

import io.cucumber.java8.En;
import page.*;
import utils.TestUtils;

import java.util.Map;

public class ActionSteps implements En {

    public ActionSteps() {

        When("I log in with username {string} and password {string}", (String username, String password) -> {
            LoginPage.getUsernameInput().sendKeys(username);
            LoginPage.getPasswordInput().sendKeys(password);
            LoginPage.getLoginButton().click();
        });

        When("I sort the Inventory from Lowest to Highest Price", () -> {
            InventoryPage.getSortFilter().selectByValue("hilo");
        });

        When("I add the Cheapest Item to my Cart", () -> {
            TestState.expectedItemTotal += InventoryPage.getItemPrice(InventoryPage.getCheapestItem());
            TestState.expectedItemNames.add(
                    InventoryPage.getItemName(InventoryPage.getCheapestItem())
            );
            InventoryPage.getAddToCartButton(InventoryPage.getCheapestItem()).click();
        });

        When("I add the {int}(st)(nd)(rd)(th) item in the inventory to my cart", (Integer itemPosition) -> {
            TestState.expectedItemTotal += InventoryPage.getItemPrice(InventoryPage.getItemByIndex(itemPosition));
            TestState.expectedItemNames.add(
                    InventoryPage.getItemName(InventoryPage.getItemByIndex(itemPosition))
            );
            InventoryPage.getAddToCartButton(InventoryPage.getItemByIndex(itemPosition)).click();
        });

        When("I go to view my Cart", () -> {
            InventoryPage.getShoppingCartButton().click();
        });

        When("I click to go to the delivery details page", () -> {
            BasketPage.getCheckoutButton().click();
        });

        When("I fill in my delivery details", () -> {
            Map<String, String> randomDelivery = TestUtils.generateDeliveryDetails();
            CheckoutDetailsPage.getFirstNameInput().sendKeys(randomDelivery.get("firstName"));
            CheckoutDetailsPage.getLastNameInput().sendKeys(randomDelivery.get("lastName"));
            CheckoutDetailsPage.getPostcodeInput().sendKeys(randomDelivery.get("postcode"));
        });

        When("I click to go to the Checkout Summary page", () -> {
            CheckoutDetailsPage.getContinueButton().click();
        });

        When("I click on the finish button", () -> {
            CheckoutSummaryPage.getFinishButton().click();
        });

    }

}
