import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class homepage {
    public homepage(AppiumDriver driver)
    {
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }

    //driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();

    @AndroidFindBy(xpath="//android.widget.TextView[@text='Preference']")
    public WebElement home;

    @AndroidFindBy(id="android:id/checkbox")
    public WebElement check;

    @AndroidFindBy(xpath="(//android.widget.RelativeLayout)[2]")
    public WebElement rl;
}
