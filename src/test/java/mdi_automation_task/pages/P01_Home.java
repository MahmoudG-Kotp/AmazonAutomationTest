package mdi_automation_task.pages;

import mdi_automation_task.Hooks;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P01_Home {
    public static final String HOME_URL = "https://www.amazon.eg/";

    @FindBy(css = "a[id='nav-link-accountList']")
    public WebElement loginAndListsButton;

    @FindBy(css = "#nav-hamburger-menu")
    public WebElement allTab;

    @FindBy(css = "#hmenu-content>ul>li:nth-child(18)>a")
    public WebElement todayDealsTab;

    @FindBy(css = "#nav-cart")
    public WebElement navigationCartButton;


    @FindBy(css = "#nav_prefetch_yourorders")
    public WebElement yourOrdersButton;

    @FindBy(css = "#nav_prefetch_youraddresses")
    public WebElement yourAddressesButton;

    @FindBy(css = "#nav-al-your-account>a:nth-child(5)")
    public WebElement yourListsButton;

    @FindBy(css = "#wishlist-page")
    public WebElement wishlistPageContainer;

    public P01_Home() {
        PageFactory.initElements(Hooks.Browser.getDriver(), this);
    }
}
