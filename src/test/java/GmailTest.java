import businessObjacts.GmailBO;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;
import utils.AndroidDriverSingleton;


import static utils.DateUtil.getSystemCurrentDate;

public class GmailTest {

    private final GmailBO gmaiolBO = new GmailBO();

    private final String recipient = "LevPolArt@gmail.com";
    private final String subject = "Subject test " + getSystemCurrentDate();
    private final String body = "Text body test";

    @Test
    public void testIsLetterSent(){
        gmaiolBO.skipInitialPage().sentLetter(recipient,subject,body).openSentLetters();

        Assert.assertTrue(gmaiolBO.isLetterSent(subject));
    }


    @AfterSuite
    public  void quitDriver(){
         AndroidDriverSingleton.quitDriver();

    }
}
