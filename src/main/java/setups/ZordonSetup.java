package setups;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class ZordonSetup {
    protected AndroidDriver driver;

    protected void PrepareAutomation() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
//        #Fill value with your device ID (check using adb)
        capabilities.setCapability("deviceName", "Your Device ID");
        capabilities.setCapability(CapabilityType.BROWSER_NAME, "Android");
//        #Fill value with your android version
        capabilities.setCapability(CapabilityType.VERSION, "Your Android version");
        capabilities.setCapability("platformName", "Android");
//        #Fill value with your path where .apk saved
        capabilities.setCapability("app", "/Users/YourDekstopName/Zordon-Automation-Skeleton/apps/flipkart.apk");
//        #Fill value with to your app package
        capabilities.setCapability("appPackage", "com.flipkart.android");
//        #Fill value with your launchable activity
        capabilities.setCapability("appActivity", "com.flipkart.android.SplashActivity");
//        #Don't change the spec
        driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }
}
