package upskill.ebay.pageAction;

import org.openqa.selenium.support.PageFactory;
import upskill.ebay.pageElements.EbayHomePageLocators;
import upskill.utilities.SetupDrivers;

public class EbayHomePageActions {

    EbayHomePageLocators EbayHomePageLocatorsObj;

    public EbayHomePageActions(){
        EbayHomePageLocatorsObj = new EbayHomePageLocators();
        PageFactory.initElements(SetupDrivers.driver, EbayHomePageLocatorsObj);
    }

    public void searchShoes(){
        EbayHomePageLocatorsObj.txtbxSearch.sendKeys("shoes");
        EbayHomePageLocatorsObj.btnSearch.click();
    }

    public void searchItems(String items){
        EbayHomePageLocatorsObj.txtbxSearch.sendKeys(items);
        EbayHomePageLocatorsObj.btnSearch.click();
    }

}
