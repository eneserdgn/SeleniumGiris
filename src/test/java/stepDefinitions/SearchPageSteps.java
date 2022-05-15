package stepDefinitions;

import pages.SearchPage;
import util.DriverFactory;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchPageSteps {

    SearchPage searchPage = new SearchPage(DriverFactory.getDriver());

    @Then("Search Page in geldigi kontrol edilir")
    public void searchPageInGeldigiKontrolEdilir() {
        searchPage.checkSearchPage();
    }

    @When("{int}. siradaki ayakkabbiya tiklanir")
    public void siradakiAyakkabbiyaTiklanir(int arg0) {
    }
}
