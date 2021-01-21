
import java.net.MalformedURLException;


import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import org.testng.annotations.Test;
import pageobject.preference;


public class apiTest extends  base{

    @Test
    public void apiTest() throws MalformedURLException {
        // TODO Auto-generated method stub

        AndroidDriver driver=capabilities();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //xpath id classname androidUIautomator

        /*8d4537b10fa942c0add49c0075dd7d3d
         *   xpath syntax
         * //tagname[@attribute='value']
         */
        homepage h=new homepage(driver);
        h.home.click();		//below line work done dynamically here
        //driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
        preference p=new preference(driver);
        p.prefdep.click();  //below line work done by dynamically here
        //driver.findElementByXPath("//android.widget.TextView[@text='3. Preference dependencies']").click();

        h.check.click();
        h.rl.click();
        //driver.findElementById("android:id/checkbox").click();
        //driver.findElementByXPath("(//android.widget.RelativeLayout)[2]").click();
        driver.findElementByClassName("android.widget.EditText").sendKeys("hello");
        p.btn.get(1).click();
        //driver.findElementsByClassName("android.widget.Button").get(1).click();

    }

}
