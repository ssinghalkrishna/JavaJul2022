package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static support.TestContext.getDriver;

public class ReqsHome extends Page {
    public ReqsHome() {
        url = "https://skryabin-careers.herokuapp.com/";
    }

    @FindBy(id = "positionsQuickSearchInput")
    WebElement searchInput;

    public ReqsHome fillSearch(String text) {
        searchInput.sendKeys(text);
        return this;
    }

    @FindBy(id = "positionsQuickSearchButton")
    WebElement searchButton;

    public ReqsHome clickSearch() {
        searchButton.click();
        return this;
    }

    @FindBy(xpath = "//a[contains(@href, '/positions')]")
    WebElement positionTitle;

    public void clickTitle(String title) {
        new WebDriverWait(getDriver(), 5).until(ExpectedConditions.textToBePresentInElement(positionTitle, title));
        positionTitle.click();
    }

}
