package pageObject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ComposePage extends BasePO{

  //*[@class="android.widget.EditText"]
    @FindBy(xpath = "//*[@class='android.widget.EditText']")
    private List<WebElement> ListToIPF;

    @FindBy(id = "subject")
    private WebElement subjectIPF;


   // @FindBy(id = "body")
  //  @FindBy(id = "Compose email")
    @FindBy(id = "wc_body_layout")
    private WebElement letterIPF;

    @FindBy(id = "send")
    private WebElement sendBIN;


    @FindBy(xpath ="//*[@text ='Got it']")
    private WebElement gotItBTN;


    @FindBy(xpath ="//*[@class = 'android.widget.EditText']")
    private WebElement editText;

    public ComposePage clickGotItButton(){
      gotItBTN.click();
        return this;
    }

    public ComposePage typeRecipient(String recipient){
        ListToIPF.get(0).sendKeys(recipient);
      //  act.doubleClick(editText).perform();
    //  editText.sendKeys(Keys.ENTER);
        return this;
    }

    public ComposePage typeSubject(String subject){
        subjectIPF.click();
        subjectIPF.sendKeys(subject);

        return this;
    }

    public ComposePage typeLetter(String letter){
        letterIPF.click();
        letterIPF.sendKeys(letter);
        return this;
    }

    public ComposePage clickSend(){
        sendBIN.click();
        return this;
    }


}
