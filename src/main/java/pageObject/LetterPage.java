package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LetterPage extends BasePO{
    @FindBy(id = "delete")
    private WebElement deleteBTN;


    public LetterPage clickDeleteLetter(){
        deleteBTN.click();
        return this;
    }


}
