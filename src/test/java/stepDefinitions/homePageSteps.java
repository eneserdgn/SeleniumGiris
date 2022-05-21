package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.homePage;
import util.DriverFactory;

public class homePageSteps {

    homePage homePage = new homePage(DriverFactory.getDriver());


    @Given("Enes is home page")
    public void enes_is_home_page() {
        homePage.checkHomePage();
    }

    @Then("should see Banner")
    public void should_see_banner() {
        homePage.checkBanner();
    }

    @Then("should see {string} card")
    public void should_see_card(String string) {
        homePage.checkCard(string);
    }

    @When("click {string} card")
    public void clickCardCard(String card) {
        homePage.clickCard(card);
    }


}
