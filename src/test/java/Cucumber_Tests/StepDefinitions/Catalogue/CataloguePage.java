package Cucumber_Tests.StepDefinitions.Catalogue;

import Cucumber_Tests.PageInstance;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

/**
 * Created by bondar on 4/20/2015.
 */
public class CataloguePage extends PageInstance{
    @When("^I open Catalogue page$")
    public void I_open_Catalogue_page() throws Throwable {
        cataloguePage = startPage.openCatalogue();
    }

    @Then("^I see \"([^\"]*)\" links in the left panel$")
    public void I_see_links_in_the_left_panel(String inputString) {
        int inputNumber = Integer.parseInt(inputString);
        int linkNumber = cataloguePage.getNumberOfLinksInTheLeftPanel();
        Assert.assertTrue("Number of links in the left pannel is not correct", linkNumber == inputNumber);
    }

    @When("^I click link number \"([^\"]*)\"$")
    public void I_click_link_number(String input) {
        int linkNumber = Integer.parseInt(input);
        cataloguePage.openDamskieShlyapkiFromLeftPanelByNumber(linkNumber);
    }

    @When("^I open DamskieShlyapki page$")
    public void I_open_DamskieShlyapki_page() throws Throwable {
        damskieShlyapki = cataloguePage.openDamskieShlyapki();
    }
}
