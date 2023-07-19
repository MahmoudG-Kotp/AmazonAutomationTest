package mdi_automation_task.step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import mdi_automation_task.pages.P01_Home;
import mdi_automation_task.pages.P02_Login;
import org.testng.Assert;

public class D01_Login {

    private final P01_Home homePage = new P01_Home();
    private final P02_Login loginPage = new P02_Login();

    @Given("Navigate to the login page")
    public void navigateToLoginPage() {
        homePage.loginAndListsButton.click();
    }

    @When("User enter data {string} as email")
    public void userEnterDataAsEmail(String email) {
        loginPage.emailEditText.sendKeys(email);
    }

    @And("Continue button clicked")
    public void continueButtonClicked() {
        loginPage.continueButton.click();
    }

    @Then("Login not proceeding due to the non-existence of the account")
    public void loginNotProceedingDueToTheNonExistenceOfTheAccount() {
        Assert.assertTrue(loginPage.authErrorMessageBox.isDisplayed());
    }

}
