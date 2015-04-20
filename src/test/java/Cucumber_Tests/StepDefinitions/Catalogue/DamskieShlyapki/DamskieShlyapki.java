package Cucumber_Tests.StepDefinitions.Catalogue.DamskieShlyapki;

import Cucumber_Tests.PageInstance;
import cucumber.api.java.en.Then;
import org.junit.Assert;

/**
 * Created by bondar on 4/20/2015.
 */
public class DamskieShlyapki extends PageInstance{
    @Then("^I see Teaser Items structure photo, name, link, star rating, price, details$")
    public void I_see_Teaser_Items_structure_photo_name_link_star_rating_price_details(){
        damskieShlyapki.checkTeaserItemsStructure();
    }

    @Then("^DamskieShlyapki page is opened$")
    public void DamskieShlyapki_page_is_opened(){
        damskieShlyapki.checkCurrentPageIs_DamskieShlyapki();
    }

    @Then("^I see \"([^\"]*)\" teaser items on the opened page$")
    public void I_see_teaser_items_on_the_opened_page(String expected){
        int actualNumberTeaserItems = damskieShlyapki.getNumberOfTeaserItems();
        int expectedNumberOfTeaserItems = Integer.parseInt(expected);
        Assert.assertTrue("Wrong number of teaser items is shown on the opened page", actualNumberTeaserItems == expectedNumberOfTeaserItems);
    }
}
