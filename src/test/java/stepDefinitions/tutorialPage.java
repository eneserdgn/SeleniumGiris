package stepDefinitions;

import io.cucumber.java.en.Then;
import util.DriverFactory;

public class tutorialPage {

    pages.tutorialPage homePage = new pages.tutorialPage(DriverFactory.getDriver());


    @Then("should see Home Page")
    public void shouldSeeHomePage() {
        homePage.checkHomePage();
    }

}
