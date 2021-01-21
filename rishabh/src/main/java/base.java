import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class base {

    public static AndroidDriver<AndroidElement> capabilities() throws MalformedURLException {
        // TODO Auto-generated method stub

        File fs =new File(new File("src"),"ApiDemos-debug.apk");

        DesiredCapabilities cap = new DesiredCapabilities();

        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Device");
        cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
        cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");

        AndroidDriver driver =new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
        return driver;










    }

}
