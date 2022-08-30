package definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertTrue;
import static support.TestContext.getDriver;

public class SampleStepdefs {
    @Given("^I open sample page$")
    public void iOpenSamplePage() throws InterruptedException {
        getDriver().get("https://skryabin.com/webdriver/html/sample.html");
        Thread.sleep(3000);
    }

    @When("^I fill out required fields$")
    public void iFillOutRequiredFields() {
        getDriver().findElement(By.xpath("//*[@name='username']")).sendKeys("sara");
        getDriver().findElement(By.xpath("//*[@name='email']")).sendKeys("sara@mail.com");
        getDriver().findElement(By.xpath("//*[@name='password']")).sendKeys("summer123");
        getDriver().findElement(By.xpath("//*[@name='confirmPassword']")).sendKeys("summer123");
        getDriver().findElement(By.xpath("//*[@id='name']")).click();
        getDriver().findElement(By.xpath("//*[@id='firstName']")).sendKeys("Sara");
        getDriver().findElement(By.xpath("//*[@id='middleName']")).sendKeys("M");
        getDriver().findElement(By.xpath("//*[@id='lastName']")).sendKeys("Romero");
        getDriver().findElement(By.xpath("//*[@aria-describedby='nameDialog']//*[text()='Save']")).click();
        getDriver().findElement(By.xpath("//*[@name='agreedToPrivacyPolicy']")).click();
    }

    @And("^I submit the form$")
    public void iSubmitTheForm() {
        getDriver().findElement(By.xpath("//*[@id='formSubmit']")).click();
    }

    @Then("^I verify required fields$")
    public void iVerifyRequiredFields() {
        WebElement resultLegend = getDriver().findElement(By.xpath("//*[@class='applicationResult']"));
assertTrue(resultLegend.isDisplayed());

String privacyPolicy = getDriver().findElement(By.xpath("//b[@name='agreedToPrivacyPolicy']")).getText();
assertTrue(privacyPolicy.equalsIgnoreCase("true"));

        String password = getDriver().findElement(By.xpath("//b[@name='password']")).getText();
        assertTrue(password.contains ("entered"));

String resultText = getDriver().findElement(By.xpath("//*[@id='samplePageResult']//section")).getText();

assertTrue(resultText.contains("sara"));
assertTrue(resultText.contains("sara@mail.com"));
assertTrue(resultText.contains("Sara"));
assertTrue(resultText.contains("M"));
assertTrue(resultText.contains("Romero"));
assertTrue(resultText.contains("sara"));


    }
}
