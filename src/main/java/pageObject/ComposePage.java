package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ComposePage extends BasePO{
    @FindBy(id = "to")
    private WebElement toIPF;

    @FindBy(id = "subject")
    private WebElement subjectIPF;

    @FindBy(id = "body")
    private WebElement letterIPF;

    @FindBy(id = "send")
    private WebElement sendIPF;

    public ComposePage typeRecipient(String recipient)
}
