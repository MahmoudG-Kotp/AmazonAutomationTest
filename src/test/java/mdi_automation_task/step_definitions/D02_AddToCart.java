package mdi_automation_task.step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import mdi_automation_task.pages.P01_Home;
import mdi_automation_task.pages.P03_Categories;
import mdi_automation_task.pages.P04_Product;
import mdi_automation_task.pages.P05_Cart;
import mdi_automation_task.type_defs.Product;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

public class D02_AddToCart {
    private static Product addedProduct;
    private final P01_Home homePage = new P01_Home();
    private final P03_Categories categoriesPage = new P03_Categories();
    private final P04_Product productPage = new P04_Product();
    private final P05_Cart cartPage = new P05_Cart();

    @When("Click on All tab")
    public void clickOnAllTab() {
        homePage.allTab.click();
    }

    @And("Go to Today's Deals")
    public void goToTodayIsDeals() {
        homePage.todayDealsTab.click();
    }

    @And("Click on the second Category")
    public void clickOnThe2ndCategory() {
        categoriesPage.primeDealsCategory.click();
    }

    @And("Click on the first product on this category")
    public void clickOnThe1stProduct() {
        categoriesPage.walletAndBagsCategory.click();
    }


    @And("Click on the second item in this product")
    public void clickOnThe2ndItem() {
        categoriesPage.secondItemInCategory.click();
    }

    @And("Let quantity equals two")
    public void letQuantityEqualsTwo() {
        //Assign dropbox to selector
        Select itemsSelector = new Select(productPage.productQuantityDropBox);
        //Select quantity 2
        itemsSelector.selectByVisibleText("2");
        //Get text, "2", from the selected option
        String itemQuantity = itemsSelector.getFirstSelectedOption().getText();
        addedProduct = new Product(productPage.productName.getText(), productPage.productPrice.getText(), itemQuantity);
    }

    @And("Press add to cart button")
    public void pressAddToCartButton() {
        productPage.addToCartButton.click();
    }

    @And("Navigate to the cart page")
    public void navigateToTheCartPage() {
        homePage.navigationCartButton.click();
    }

    @Then("Correct items are added to the cart")
    public void correctItemsAreAddedToTheCart() {
        SoftAssert assertItemsAddedCorrectly = new SoftAssert();
        assertItemsAddedCorrectly.assertEquals(cartPage.firstCartProductName.getText(), addedProduct.getName());
        assertItemsAddedCorrectly.assertEquals(cartPage.firstCartProductContainer.getAttribute(P05_Cart.PRICE_ATTRIBUTE_KEY), addedProduct.getPrice());
        assertItemsAddedCorrectly.assertEquals(cartPage.firstCartProductContainer.getAttribute(P05_Cart.QUANTITY_ATTRIBUTE_KEY), addedProduct.getQuantity());
        assertItemsAddedCorrectly.assertEquals(cartPage.getProductSubtotal(), addedProduct.getSubtotal());
        assertItemsAddedCorrectly.assertAll();
    }
}
