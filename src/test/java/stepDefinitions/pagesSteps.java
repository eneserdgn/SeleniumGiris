package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.pages;
import pages.homePage;
import util.DriverFactory;

public class pagesSteps {
    homePage homePage = new homePage(DriverFactory.getDriver());

    pages pag = new pages(DriverFactory.getDriver());

    @Then("should see {string} Page")
    public void shouldSeePage(String pageName) {
        pag.checkHeader(pageName);
    }

    @Given("Enes is {string} page")
    public void enesIsPage(String page) {
        homePage.checkHomePage();
        homePage.clickCard(page);
        pag.checkHeader(page);
    }

    @When("click {string} menu")
    public void clickMenu(String menu) {
        pag.clickMenu(menu);
    }

    @Given("Enes is at {string} under {string} page")
    public void enesIsBelowPage(String menu,String underMenu) {
        homePage.checkHomePage();
        homePage.clickCard(menu);
        pag.checkHeader(menu);
        pag.clickMenu(underMenu);
        pag.checkHeader(underMenu);
    }

    @When("pick {string} using choose file button")
    public void pickUsingChooseFileButton(String file) {
        pag.chooseFile(file);
    }

    @Then("should see {string} file path")
    public void shouldSeeFilePath(String file) {
        pag.checkFile(file);
    }

    @When("click {string} following links")
    public void clickFollowingLinks(String link) {
        pag.clickLinks(link);
    }

    @Then("should see {string} response code")
    public void shouldSeeResponseCode(String code) {
        pag.checkResponseCode(code);
    }
}
