package uk.co.expedia.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;
import uk.co.expedia.utility.Utility;

public class AccountPage extends Utility {

    private static final Logger log = LogManager.getLogger(AccountPage.class.getName());

    @FindBy(xpath = "//button[@id='header-account-signin-button']")
    WebElement _signInLink;

    public void clickOnSignInLink() {
        Reporter.log(" Clicking on Signin link" + _signInLink.toString() + "<br>");
        clickOnElement(_signInLink);
        log.info(" Clicking on Signin link" + _signInLink.toString());
    }

}
