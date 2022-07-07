package support;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class TestContext {
    private static WebDriver driver;

    public static WebDriver getDriver() {
        return driver;
    }

    public static void initialize() {
        String chromeDriverPath = System.getProperty("user.dir") + "/src/test/resources/drivers/chromedriver";
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);

        driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    public static void teardown() {
        driver.quit();
    }
}
