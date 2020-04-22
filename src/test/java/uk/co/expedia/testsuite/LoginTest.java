package uk.co.expedia.testsuite;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import uk.co.expedia.loadproperty.LoadProperty;
import uk.co.expedia.pages.AccountPage;
import uk.co.expedia.pages.HomePage;
import uk.co.expedia.pages.SignInPage;
import uk.co.expedia.testbase.TestBase;

public class LoginTest extends TestBase {

    HomePage homePage;
    SignInPage signInPage;
    AccountPage accountPage;
    LoadProperty loadProperty;

    @BeforeMethod
    public void setUp() {
        homePage = new HomePage();
        signInPage = new SignInPage();
        accountPage = new AccountPage();
        loadProperty = new LoadProperty();
    }

    /*
        1.LoginTest - enter invalid username and password and
        click on sign in tab and verify error message.
    */
    @Test
    public void userShouldNotLogInWithInvalidCredintial() {
        homePage.clickOnAccountLink();
        accountPage.clickOnSignInLink();
        signInPage.enterEmailField("abc@jkail.com");
        signInPage.enterPasswordField("abc123");
        signInPage.clickOnSignInTab();
        signInPage.assertErrorMessage("Please enter a valid email address");
    }

}
