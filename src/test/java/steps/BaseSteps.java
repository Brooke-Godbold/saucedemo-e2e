package steps;

import io.cucumber.java8.En;
import utils.TestUtils;
import utils.WebDriverUtils;

import java.util.ArrayList;

public class BaseSteps implements En {

    public BaseSteps() {

        Before(() -> {
            TestState.webDriver = WebDriverUtils.getDriver();
            TestState.expectedItemTotal = 0;
            TestState.expectedItemNames = new ArrayList<>();
        });

        Given("I visit the Login Page", () -> {
            TestState.webDriver.get(TestUtils.BASE_URL);
        });

        After(() -> {
            TestState.webDriver.quit();
        });

    }
}
