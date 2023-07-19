package mdi_automation_task.step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import mdi_automation_task.Hooks;
import mdi_automation_task.pages.P01_Home;
import mdi_automation_task.pages.P02_Login;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class D03_Authentication {
    private final P01_Home homePage = new P01_Home();
    private final P02_Login loginPage = new P02_Login();

    @When("Hover on Hello, sign in Account & Lists")
    public void hoverOnSignInAndAccountLists() {
        //Hover on the sign-in button
        new Actions(Hooks.Browser.getDriver()).moveToElement(homePage.loginAndListsButton).perform();
    }

    @And("CLick on Your orders")
    public void clickOnYourOrders() {
        homePage.yourOrdersButton.click();
    }

    @Then("login page displayed")
    public void loginPageDisplayed() {
        Assert.assertTrue(loginPage.emailEditText.isDisplayed());
    }

    @And("CLick on Your Addresses")
    public void clickOnYourAddresses() {
        homePage.yourAddressesButton.click();
    }

    @And("CLick on Your Lists")
    public void clickOnYourLists() {
        homePage.yourListsButton.click();
    }

    @Then("List intro displayed")
    public void listIntroDisplayed() {
        Assert.assertTrue(homePage.wishlistPageContainer.isDisplayed());
    }
}
