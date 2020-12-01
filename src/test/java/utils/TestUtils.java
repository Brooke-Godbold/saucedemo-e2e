package utils;

import com.github.javafaker.Faker;

import java.util.HashMap;
import java.util.Map;

public class TestUtils {

    public static final String BASE_URL = "https://www.saucedemo.com/";

    public static float filteredPrice(String rawPrice) {
        String priceString = rawPrice.replace("$", "");
        return Float.parseFloat(priceString);
    }

    public static HashMap<String, String> generateDeliveryDetails() {
        Faker faker = new Faker();
        return new HashMap<String, String>() {{
            put("firstName", faker.name().firstName());
            put("lastName", faker.name().lastName());
            put("postcode", faker.address().zipCode());
        }};
    }
}
