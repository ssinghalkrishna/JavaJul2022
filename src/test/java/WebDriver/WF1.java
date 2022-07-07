package WebDriver;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class WF1 {

    WebDriver driver;
    WebDriverWait wait;
    String baseUrl = "https://yahoo.com";

    @Before
    public void setUp() throws Exception {
        String chromeDriverPath = System.getProperty("user.dir") + "/src/test/resources/drivers/chromedriver";
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);

        driver = new ChromeDriver();
        driver.get(baseUrl);
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, 2);
    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
    }

    @Test
    public void testYahoo(){
        List<WebElement> links = driver.findElements(By.xpath("//a"));
        for(WebElement link: links){
            System.out.println(link.getText());
            System.out.println(link.getAttribute("href"));
        }
    }
}