package Cucumber_Tests.StepDefinitions;

import Cucumber_Tests.PageInstance;
import cucumber.api.java.en.Given;

/**
 * Created by bondar on 4/20/2015.
 */
public class StartPage extends PageInstance{
    @Given("^I am on the Start page$")
    public void I_am_on_the_Start_page() throws Throwable {
        startPage.open();
    }
}
