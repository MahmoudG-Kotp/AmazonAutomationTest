package mdi_automation_task.pages;

import mdi_automation_task.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P05_Cart {
    //These keys are the css attribute name of the needed data
    public static final String PRICE_ATTRIBUTE_KEY = "data-price",
            QUANTITY_ATTRIBUTE_KEY = "data-quantity";

    @FindBy(css = "#sc-active-cart>div>form>div[data-name = 'Active Items']>div:nth-child(3)>div:nth-child(4)>div>div:nth-child(2)>ul>li>span>a>span>span>span:nth-child(2)")
    public WebElement firstCartProductName;

    @FindBy(css = "#sc-active-cart>div>form>div[data-name = 'Active Items']>div:nth-child(3)")
    public WebElement firstCartProductContainer;

    public P05_Cart() {
        PageFactory.initElements(Hooks.Browser.getDriver(), this);
    }

    public String getProductSubtotal() {
        // Price in amazon website written like that 000.00 EGP
        String subtotal = Hooks.Browser.getDriver().findElement(By.cssSelector("#sc-subtotal-amount-activecart>span")).getText();
        // hence, I sub the number which is after the space ' ', then I sub the digits after the dot '.', final result will be 000
        return subtotal.substring(0, subtotal.indexOf('.'));
    }

}
