package uk.co.expedia.testsuite;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import uk.co.expedia.pages.AccountPage;
import uk.co.expedia.pages.FlightsPage;
import uk.co.expedia.pages.HomePage;
import uk.co.expedia.pages.ResultPage;
import uk.co.expedia.testbase.TestBase;

public class FlightTest extends TestBase {

    HomePage homePage;
    AccountPage accountPage;
    FlightsPage flightsPage;
    ResultPage resultPage;

@BeforeMethod(groups = {"Sanity", "Smoke", "Regression"})
public void setUp() {
    homePage = new HomePage();
    accountPage = new AccountPage();
    flightsPage = new FlightsPage();
    resultPage = new ResultPage();
}
//    //to scrool the page down
//    public JavascriptExecutor js;
//    public JavascriptExecutor jse;
/*
    2.FlightTest - click on Flights tab, enter Flying from, Going to,
    Departing, Returning Travellers and click on Search Button
    and verify the same destination flight you see in search results.
*/

    @Test(priority = 0, groups = {"Smoke", "Regression"})
    public void userShouldCheckFlightsSearch() {
        homePage.clickOnFlightsTab();
        //    alertAccept();
     //   Thread.sleep(3000);
        flightsPage.clickOnAccceptBtn();
        flightsPage.enterFlightFromCity("LHR");
        flightsPage.enterFlightToCity("Mumbai");
        flightsPage.enterDepartingDate("01/10/2020");
        flightsPage.enterReturningDate("21/10/2020");
        flightsPage.clickOnSearchButton();
        resultPage.assertResultText("Select your departure to Mumbai");

    }

}
