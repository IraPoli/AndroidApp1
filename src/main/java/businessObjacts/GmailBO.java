package businessObjacts;

import pageObject.ComposePage;
import pageObject.InitialPage;

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
                    .clickTakeMeToGmailBIN();
        return this;
    }

    public GmailBO sentLetter(String recipient, String body){
        incomeLetterPage.clickComposeBIN();
        composePage.typeRecipient(recipient)
                .typeSubject(subject)
                .typeLetter(body)
                .clickSend();
    }

    public GmailBO openSentLetters(){
        incomeLetterPage.clickNavigateDrawerBIN().clickSentBIN();
        return this;
    }

    public boolean isLetterSent(String subject){
        return sentLettersPage.isSentLetterDisplayed(subject);
    }
}
