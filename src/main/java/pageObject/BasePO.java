package pageObject;

import org.openqa.selenium.support.PageFactory;
import utils.AndroidDriverSingleton;


public class BasePO {
    public BasePO(){
        PageFactory.initElements(AndroidDriverSingleton.getDriver(),this);
    }
}
