package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ReqsPosition extends Page{

    @FindBy(xpath = "//*[@for='positionCity']/../span")
    WebElement positionCity;

    public String verifyCity() {
        return positionCity.getText();
    }

}
