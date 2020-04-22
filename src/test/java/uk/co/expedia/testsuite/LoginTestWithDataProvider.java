package uk.co.expedia.testsuite;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import uk.co.expedia.pages.AccountPage;
import uk.co.expedia.pages.HomePage;
import uk.co.expedia.pages.SignInPage;
import uk.co.expedia.testbase.TestBase;
import uk.co.expedia.testdata.TestData;

public class LoginTestWithDataProvider extends TestBase {

    HomePage homePage;
    AccountPage accountPage;
    SignInPage signInPage;

    @BeforeMethod(groups = {"Regression", "Smoke", "Sanity"})
    public void setUp() {
        homePage = new HomePage();
        accountPage = new AccountPage();
        signInPage = new SignInPage();

    }

    @Test(groups = {"Regression","Smoke", "Regression"},dataProvider = "credentials", dataProviderClass = TestData.class)
    public void doLogin(String username, String password) {
        homePage.clickOnAccountLink();
        accountPage.clickOnSignInLink();
        signInPage.loginToApplication(username, password);
        signInPage.clickOnSignInTab();

    }

}
