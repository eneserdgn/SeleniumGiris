package stepDefinitions;

import io.cucumber.java.en.Then;
import pages.pages;
import util.DriverFactory;

public class pagesSteps {

    pages pag = new pages(DriverFactory.getDriver());

    @Then("should see {string} Page")
    public void shouldSeePage(String pageName) {
        pag.checkHeader(pageName);
    }

}
