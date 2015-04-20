package Cucumber_Tests.StepDefinitions.Catalogue;

import Cucumber_Tests.PageInstance;
import cucumber.api.java.en.When;

/**
 * Created by bondar on 4/20/2015.
 */
public class CataloguePage extends PageInstance{
    @When("^I open Catalogue page$")
    public void I_open_Catalogue_page() throws Throwable {
        cataloguePage = startPage.openCatalogue();
    }
}
