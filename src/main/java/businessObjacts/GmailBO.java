package businessObjacts;

import pageObject.*;

public class GmailBO {
    private final InitialPage initialPage;
    private final ComposePage composePage;
    private final IncomeLetterPage incomeLetterPage;
    private final SentLettersPage sentLettersPage;
    private final LetterPage letterPage;

    public GmailBO(){
        initialPage = new InitialPage();
        composePage = new ComposePage();
        incomeLetterPage = new IncomeLetterPage();
        sentLettersPage = new SentLettersPage();
        letterPage =new LetterPage();
    }


    public GmailBO skipInitialPage(){
        initialPage.clickGoItBIN()
                    .clickTakeMeToGmailBIN()
                    .clickGotItBIN();
        return this;
    }

    public GmailBO sentLetter(String recipient, String subject){
        incomeLetterPage.clickComposeBIN();
        composePage.clickGotItButton()
                .typeSubject(subject)
                .typeRecipient(recipient)
                .clickSend();
        return this;
    }

    public GmailBO openSentLetters(){
        incomeLetterPage.clickNavigateDrawerBIN().clickSentBIN();
        return this;
    }

    public boolean isLetterInSent(String subject){
        return sentLettersPage.isSentLetterDisplayed(subject);
    }
    public boolean isOneNewLetter(){
        return sentLettersPage.isOneNewLetterDisplayed();
    }


    public GmailBO  openLetter(String subject)
    {
        sentLettersPage.clickLetter(subject);
        return this;
    }

    public GmailBO  deleteOpenedLetter()
    {
        letterPage.clickDeleteLetter();
        return this;
    }


}
