package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import utils.AndroidDriverSingleton;

public class SentLettersPage extends BasePO {


    public boolean isSentLetterDisplayed(String subject) {
        String letterSubject = String.format("//android.view.ViewGroup[contains(@text, '%s')]", subject);
        try {
            AndroidDriverSingleton.getDriver().findElement(By.xpath(letterSubject)).isDisplayed();
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }

    }

    public boolean isOneNewLetterDisplayed() {
        return AndroidDriverSingleton.getDriver().findElement(By.xpath("//*[contains(@content-desc,'Mail, 1')]")).isDisplayed();
    }

    public void clickLetter(String subject) {
        String letterSubject = String.format("//android.view.ViewGroup[contains(@text, '%s')]", subject);
        AndroidDriverSingleton.getDriver().findElement(By.xpath(letterSubject)).click();
        System.out.println("heelo");
    }

}
