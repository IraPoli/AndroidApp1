package businessObjacts;

import pageObject.ComposePage;
import pageObject.IncomeLetterPage;
import pageObject.InitialPage;
import pageObject.SentLettersPage;

public class GmailBO {
    private final InitialPage initialPage;
    private final ComposePage composePage;
    private final IncomeLetterPage incomeLetterPage;
    private final SentLettersPage sentLettersPage;


    public GmailBO(){
        initialPage = new InitialPage();
        composePage = new ComposePage();
        incomeLetterPage = new IncomeLetterPage();
        sentLettersPage = new SentLettersPage();
    }


    public GmailBO skipInitialPage(){
        initialPage.clickGoItBIN()
                    .clickTakeMeToGmailBIN()
                    .clickGotItBIN();
        return this;
    }

    public GmailBO sentLetter(String recipient, String subject, String body){
        incomeLetterPage.clickComposeBIN();
        composePage.clickGotItButton()
              //  .typeRecipient(recipient)
                .typeSubject(subject)
            //    .typeLetter(body)
                .typeRecipient(recipient)
                .clickSend();
        return this;
    }

    public GmailBO openSentLetters(){
        incomeLetterPage.clickNavigateDrawerBIN().clickSentBIN();
        return this;
    }

    public boolean isLetterSent(String subject){
        return sentLettersPage.isSentLetterDisplayed(subject);
    }
}
