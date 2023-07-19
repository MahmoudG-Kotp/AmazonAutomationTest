package mdi_automation_task.pages;

import mdi_automation_task.Hooks;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P02_Login {
    @FindBy(css = "#ap_email")
    public WebElement emailEditText;

    @FindBy(css = "#continue")
    public WebElement continueButton;

    @FindBy(css = "#auth-error-message-box")
    public WebElement authErrorMessageBox;

    public P02_Login() {
        PageFactory.initElements(Hooks.Browser.getDriver(), this);
    }
}
