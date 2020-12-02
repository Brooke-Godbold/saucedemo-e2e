package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.nio.file.Path;
import java.nio.file.Paths;

public class WebDriverUtils {

    public static WebDriver getDriver() {
        WebDriver driver;
        Path chrome = Paths.get("chrome-driver/chromedriver.exe");
        chrome.toFile().setExecutable(true);
        System.setProperty("webdriver.chrome.driver", chrome.toAbsolutePath().toString());
        ChromeOptions chromeOptions = new ChromeOptions();
        driver = new ChromeDriver(chromeOptions);
        return driver;
    }
}
