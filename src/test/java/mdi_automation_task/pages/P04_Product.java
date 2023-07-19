package mdi_automation_task.pages;

import mdi_automation_task.Hooks;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P04_Product {

    @FindBy(css = "#productTitle")
    public WebElement productName;

    @FindBy(css = "#corePriceDisplay_desktop_feature_div>div:nth-child(2)>span:nth-child(2)>span:nth-child(2)>span:nth-child(2)")
    public WebElement productPrice;

    @FindBy(css = "#quantity")
    public WebElement productQuantityDropBox;

    @FindBy(css = "#add-to-cart-button")
    public WebElement addToCartButton;

    public P04_Product() {
        PageFactory.initElements(Hooks.Browser.getDriver(), this);
    }
}
