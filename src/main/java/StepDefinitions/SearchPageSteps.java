package StepDefinitions;

import Pages.SearchPage;
import Runner.runner;
import Util.DriverFactory;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchPageSteps {

    SearchPage searchPage = new SearchPage(runner.getDriver());

    @Then("Search Page in geldigi kontrol edilir")
    public void searchPageInGeldigiKontrolEdilir() {
        searchPage.checkSearchPage();
    }

    @When("{int}. siradaki ayakkabbiya tiklanir")
    public void siradakiAyakkabbiyaTiklanir(int arg0) {
    }
}
