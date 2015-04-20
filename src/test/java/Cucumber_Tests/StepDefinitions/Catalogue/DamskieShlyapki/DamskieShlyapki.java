package Cucumber_Tests.StepDefinitions.Catalogue.DamskieShlyapki;

import Cucumber_Tests.PageInstance;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Created by bondar on 4/20/2015.
 */
public class DamskieShlyapki extends PageInstance{
    @When("^I open DamskieShlyapki page$")
    public void I_open_DamskieShlyapki_page() throws Throwable {
        damskieShlyapki = cataloguePage.openDamskieShlyapki();
    }

    @Then("^I see Teaser Items structure photo, name, link, star rating, price, details$")
    public void I_see_Teaser_Items_structure_photo_name_link_star_rating_price_details() throws Throwable {
        damskieShlyapki.checkTeaserItemsStructure();
    }
}
