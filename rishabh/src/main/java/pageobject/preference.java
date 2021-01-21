package pageobject;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class preference {
    public preference(AndroidDriver driver) //importing driver
    {
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);  //initialising every element with driver.findelementby.....
    }

    @AndroidFindBy(xpath="//android.widget.TextView[@text='3. Preference dependencies']")
    public WebElement prefdep;

    @AndroidFindBy(className="android.widget.Button")
    public List<WebElement> btn;		//list is used bcz findelementS is there in place of findelement

}
