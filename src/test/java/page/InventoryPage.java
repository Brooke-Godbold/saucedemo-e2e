package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import steps.TestState;
import utils.TestUtils;

import java.util.List;

public class InventoryPage {

    public static Select getSortFilter() {
        return new Select(TestState.webDriver.findElement(By.className("product_sort_container")));
    }

    public static List<WebElement> getInventory() {
        return TestState.webDriver.findElements(By.className("inventory_item"));
    }

    public static float getItemPrice(int itemIndex) {
        return TestUtils.filteredPrice(
                getInventory().get(itemIndex).findElement(By.className("inventory_item_price")).getText()
        );
    }

    public static float getItemPrice(WebElement item) {
        return TestUtils.filteredPrice(
                item.findElement(By.className("inventory_item_price")).getText()
        );
    }

    public static String getItemName(WebElement item) {
        return item.findElement(By.className("inventory_item_name")).getText();
    }

    public static WebElement getCheapestItem() {
        WebElement cheapestItem = getInventory().get(0);
        for(WebElement nextItem : getInventory()) {
            if(TestUtils.filteredPrice(nextItem.findElement(By.className("inventory_item_price")).getText())
                    < TestUtils.filteredPrice(cheapestItem.findElement(By.className("inventory_item_price")).getText())) {
                cheapestItem = nextItem;
            }
        }
        return cheapestItem;
    }

    public static WebElement getItemByIndex(int index) {
        return getInventory().get(index);
    }

    public static WebElement getAddToCartButton(WebElement item) {
        return item.findElement(By.cssSelector(".btn_primary.btn_inventory"));
    }

    public static WebElement getShoppingCartButton() {
        return TestState.webDriver.findElement(By.id("shopping_cart_container"));
    }
}
