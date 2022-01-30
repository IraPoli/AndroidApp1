package pageObject;

import org.openqa.selenium.By;
import utils.AndroidDriverSingleton;

public class SentLettersPage extends BasePO{

    public boolean isSentLetterDisplayed(String subject){
        String letterSubject = String.format("//android.view.View[contains(@content-desc, '%s')]", subject);
        return AndroidDriverSingleton.getDriver().findElement(By.xpath(letterSubject)).isDisplayed();
    }
}
