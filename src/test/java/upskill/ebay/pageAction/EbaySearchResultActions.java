package upskill.ebay.pageAction;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import upskill.ebay.pageElements.EbaySearchResultLocators;
import upskill.utilities.SetupDrivers;

public class EbaySearchResultActions {

    EbaySearchResultLocators EbaySearchResultLocatorsObj;

    public EbaySearchResultActions(){
        EbaySearchResultLocatorsObj =new EbaySearchResultLocators();
        PageFactory.initElements(SetupDrivers.driver, EbaySearchResultLocatorsObj);
    }

    public void verifyShoesItems(){
        Assert.assertEquals("shoes", EbaySearchResultLocatorsObj.txtShoes.getText());
        //or
        Assert.assertTrue(EbaySearchResultLocatorsObj.txtShoes.isDisplayed());
        //or
        EbaySearchResultLocatorsObj.txtShoes.isDisplayed();

    }

}
