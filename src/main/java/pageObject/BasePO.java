package pageObject;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import utils.AndroidDriverSingleton;


public class BasePO {
    public Actions act;
    public BasePO(){
        PageFactory.initElements(AndroidDriverSingleton.getDriver(),this);
         act = new Actions(AndroidDriverSingleton.getDriver());
    }
}
