package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;


public class InitialPage extends BasePO {

    @FindBy(id = "welcome_tour_got_it")
    private WebElement goItGmailBIN;


    @FindBy(id = "action_done")
    private WebElement takeMeToGmailBIN;

    public InitialPage clickGoItBIN(){
        goItGmailBIN.click();
        return this;
    }

    public InitialPage clickTakeMeToGmailBIN(){
        takeMeToGmailBIN.click();
        return this;
    }


}
