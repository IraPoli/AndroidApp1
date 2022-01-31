package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class IncomeLetterPage extends BasePO {
    @FindBy(id = "compose_button")
    private WebElement composeBIN;
    //android.widget.ImageButton[@content-desc="Open navigation drawer"]
    @FindBy(xpath = "//android.widget.ImageButton[@content-desc='Open navigation drawer']")
    private WebElement navigateDrawerBIN;

    @FindBy(xpath = "//android.widget.LinearLayout//android.widget.TextView[@text='Sent']")
    private WebElement sentBIN;

    public IncomeLetterPage clickComposeBIN(){
        composeBIN.click();
        return this;
    }

    public IncomeLetterPage clickNavigateDrawerBIN (){
       navigateDrawerBIN.click();
        return this;
    }


    public IncomeLetterPage clickSentBIN(){
        sentBIN.click();
        return this;
    }

}
