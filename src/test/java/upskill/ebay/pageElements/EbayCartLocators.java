package upskill.ebay.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EbayCartLocators {

    @FindBy (xpath = "//select[@name='Size Type']")
    public WebElement ddSizeType;

    @FindBy (xpath = "//select[@id='msku-sel-2']")
    public WebElement ddMenSize;

    @FindBy (xpath = "//select[@name='Shade']")
    public WebElement ddShade;

    @FindBy (xpath = "//input[@id='qtyTextBox']")
    public WebElement txtbxQty;

    @FindBy (xpath = "//a[@id='atcRedesignId_btn']")
    public WebElement btnAddCart;

}
