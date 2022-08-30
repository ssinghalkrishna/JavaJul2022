package definitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.ReqsHome;
import pages.ReqsPosition;

import static org.assertj.core.api.Assertions.assertThat;

public class ReqsStepdefs {
    @Given("^I open careers page$")
    public void iOpenCareersPage() {
        new ReqsHome().open();
    }

    @When("^I search for \"([^\"]*)\"$")
    public void iSearchFor(String title) throws Throwable {

        new ReqsHome()
                .fillSearch(title)
                .clickSearch()
                .clickTitle(title);
    }

    @Then("^I verify that position city is \"([^\"]*)\"$")
    public void iVerifyThatPositionCityIs(String city) throws Throwable {
        String actualCity = new ReqsPosition().verifyCity();

        assertThat(actualCity).isEqualToIgnoringCase(city);
    }
}
