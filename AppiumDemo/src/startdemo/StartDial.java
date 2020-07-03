package startdemo;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class StartDial {
	public static AppiumDriver driver;

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		
		DesiredCapabilities ds=new DesiredCapabilities();
		ds.setCapability(MobileCapabilityType.AUTOMATION_NAME,"APPIUM");
		ds.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
		ds.setCapability(MobileCapabilityType.PLATFORM_VERSION,"9.0");
		ds.setCapability(MobileCapabilityType.DEVICE_NAME,"Android Emulator");
		ds.setCapability(MobileCapabilityType.UDID,"emulator-5554");
		
	    ds.setCapability("appPackage","com.android.camera2");
		ds.setCapability("appActivity","com.android.camera.CameraLauncher");
		
		
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		driver=new AppiumDriver<MobileElement>(url,ds);
		String Session=driver.getSessionId().toString();
		
		Thread.sleep(3000);

	}

}
