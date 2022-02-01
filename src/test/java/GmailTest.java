import businessObjacts.GmailBO;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;
import utils.AndroidDriverSingleton;


import static utils.DateUtil.getSystemCurrentDate;

public class GmailTest {

    private final GmailBO gmailBO = new GmailBO();

    private final String recipient = "LevPolArt@gmail.com";
    private final String subject = "Subject test " + getSystemCurrentDate();


    @Test
    public void testIsLetterSent() {
        gmailBO.skipInitialPage().sentLetter(recipient, subject).openSentLetters();
        Assert.assertTrue(gmailBO.isLetterInSent(subject));
        Assert.assertTrue(gmailBO.isOneNewLetter());
        gmailBO.openLetter(subject).deleteOpenedLetter();
        Assert.assertFalse(gmailBO.isLetterInSent(subject));

    }


    @AfterSuite
    public void quitDriver() {
        AndroidDriverSingleton.quitDriver();

    }
}
