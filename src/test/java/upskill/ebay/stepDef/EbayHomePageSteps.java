package upskill.ebay.stepDef;

import cucumber.api.java.en.*;
import upskill.ebay.pageAction.EbayHomePageActions;

public class EbayHomePageSteps {

    EbayHomePageActions EbayHomePageActionsObj = new EbayHomePageActions();

    @Given("^Open Ebay Homepage$")
    public void open_Ebay_Homepage() throws Throwable {

    }

    @When("^Search for shoes$")
    public void search_for_shoes() throws Throwable {
        EbayHomePageActionsObj.searchShoes();

    }
    @Given("^Search for \"([^\"]*)\"$")
    public void search_for(String items) throws Throwable {
        EbayHomePageActionsObj.searchItems(items);
    }

    @Given("^Search for Shirt$")
    public void search_for_Shirt() throws Throwable {

    }
}
