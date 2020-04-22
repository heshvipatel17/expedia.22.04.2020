package uk.co.expedia.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;
import uk.co.expedia.utility.Utility;

public class SignInPage extends Utility {

    private static final Logger log = LogManager.getLogger(SignInPage.class.getName());

    @FindBy(xpath = "//input[@id='gss-signin-email']")
    WebElement _emailField;

    @FindBy(xpath = "//input[@id='gss-signin-password']")
    WebElement _passwordField;

    @FindBy(xpath = "//button[@id='gss-signin-submit']")
    WebElement _signInTab;

    @FindBy(xpath = "//p[@id='signInEmailErrorMessage']")
    WebElement _errorMessage;

    public void enterEmailField(String emailId) {
        Reporter.log(" Entering email " + emailId + " to email field " + _emailField.toString() + "<br>");
        sendTextToElement(_emailField, emailId);
        log.info(" Enter email " + emailId + " to email field " + _emailField.toString());
    }

    public void enterPasswordField(String passwordD) {
        Reporter.log("Entering password  " + passwordD + " to password field " + _passwordField.toString() + "<br>");
        sendTextToElement(_passwordField, passwordD);
        log.info("Enter password  " + passwordD + " to password field " + _passwordField.toString());
    }

    public void clickOnSignInTab() {
        Reporter.log(" Clicking on sign in tab" + _signInTab.toString() + "<br>");
        clickOnElement(_signInTab);
        log.info(" Clicking on sign in tab" + _signInTab.toString());
    }

    public void assertErrorMessage(String verifyMssage) {
        Reporter.log(" verify message " + verifyMssage + " from signin page" + _errorMessage.toString() + "<br>");
        verifyTextAssertMethod(_errorMessage, verifyMssage);
        log.info(" verify message " + verifyMssage + " from signin page" + _errorMessage.toString());
    }

}
