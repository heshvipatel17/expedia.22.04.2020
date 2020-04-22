package uk.co.expedia.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;
import uk.co.expedia.utility.Utility;

/**
 * Created by Jay
 */
public class ResultPage extends Utility {

    private static final Logger log = LogManager.getLogger(ResultPage.class.getName());

    @FindBy(xpath = "//*[@id=\"titleBar\"]/h1/div/span[1]" )
    WebElement _resultText;

    public void assertResultText( String result) {
        Reporter.log("Verify result"+result+ " displayed on result page"+_resultText.toString()+"<br>");
        verifyTextAssertMethod(_resultText, result);
        log.info("Verify result"+result+ " displayed on result page"+ _resultText.toString());
    }
}
