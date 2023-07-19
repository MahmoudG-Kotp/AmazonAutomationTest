package mdi_automation_task.pages;

import mdi_automation_task.Hooks;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P03_Categories {
    @FindBy(css = "#anonCarousel1>ol>li:nth-child(2)>a")
    public WebElement primeDealsCategory; //2nd category in this product(Cart Scenario)

    @FindBy(css = "div[data-testid='grid-deals-container']>div:nth-child(1)>div>div>a")
    public WebElement walletAndBagsCategory; //1st product in category(Cart Scenario)

    @FindBy(css = "div[data-card-metrics-id = 'octopus-search-result-card_apb-browse_0']>div>div:nth-child(2)")
    public WebElement secondItemInCategory;

    public P03_Categories() {
        PageFactory.initElements(Hooks.Browser.getDriver(), this);
    }
}
