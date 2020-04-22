package uk.co.expedia.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;
import uk.co.expedia.utility.Utility;

public class FlightsPage extends Utility {

    private static final Logger log = LogManager.getLogger(FlightsPage.class.getName());

    @FindBy(xpath = "//span[@class='button-text']")
    WebElement _acceptBtn;

    @FindBy(xpath = "//input[@id='flight-origin-flp']")
    WebElement _flightFromCity;

    @FindBy(id = "flight-destination-flp")
    WebElement _flightToCity;

    @FindBy(id = "flight-departing-flp")
    WebElement _departingDate;

    @FindBy(id = "flight-returning-flp")
    WebElement _returningDate;

    @FindBy(xpath = "//form[@id='gcw-flights-form-flp']//button[contains(@class,'btn-primary btn-action gcw-submit')]")
    WebElement _searchBtn;

    public void clickOnAccceptBtn() {
        Reporter.log(" Clicking on accept button" + _acceptBtn.toString() + "<br>");
        clickOnElement(_acceptBtn);
        log.info(" Clicking on accept button" + _acceptBtn.toString());
    }

    public void enterFlightFromCity(String startCity) {
        Reporter.log(" Enter city name " + startCity + " on flight from city " + _flightFromCity.toString() + "<br>");
        sendTextToElement(_flightFromCity, startCity);
        log.info(" Enter city name " + startCity + " on flight from city " + _flightFromCity.toString());
    }

    public void enterFlightToCity(String endCity) {
        Reporter.log(" Enter city name" + endCity + " on flight to city" + _flightToCity.toString() + "<br>");
        sendTextToElement(_flightToCity, endCity);
        log.info(" Enter city name" + endCity + " on flight to city" + _flightToCity.toString());
    }

    public void enterDepartingDate(String depDate) {
        Reporter.log(" Enter departure date" + depDate + " on departure date field" + _departingDate.toString() + "<br>");
        sendTextToElement(_departingDate, depDate);
        log.info(" Enter date" + depDate + " on departure date " + _departingDate.toString());
    }

    public void enterReturningDate(String date) {
        Reporter.log("Entering returning date : " + date + " On returning date field : " + _returningDate.toString() + "<br>");
        getElement(_returningDate).sendKeys(Keys.CONTROL, "a");
        getElement(_returningDate).sendKeys(Keys.DELETE);
        sendTextToElement(_returningDate, date);
        log.info("Entering returning date : " + date + " On returning date field : " + _returningDate.toString());
    }


    public void clickOnSearchButton() {
        Reporter.log(" Clicking on search button " + _searchBtn.toString() + "<br>");
        clickOnElement(_searchBtn);
        log.info(" Clicking on search button " + _searchBtn.toString());
    }
}
