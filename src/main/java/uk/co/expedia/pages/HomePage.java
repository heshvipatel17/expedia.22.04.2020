package uk.co.expedia.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;
import uk.co.expedia.utility.Utility;

public class HomePage extends Utility {

    private static final Logger log = Logger.getLogger(HomePage.class.getName());

    @FindBy(xpath = "//button[@id='header-account-menu']")
    WebElement _accountLink;

    @FindBy(xpath = "//a[@id='primary-header-flight']")
    WebElement _flightsTab;

    public void clickOnAccountLink() {
        Reporter.log("Clicking on Account link" + _accountLink.toString() + "<br>");
        clickOnElement(_accountLink);
        log.info("Clicking on Account link" + _accountLink.toString());
    }

    public void clickOnFlightsTab() {
        Reporter.log("Clicking on flights tab : " + _flightsTab.toString() + "<br>");
        clickOnElement(_flightsTab);
        log.info("Clicking on flights tab : " + _flightsTab.toString());
    }

}
