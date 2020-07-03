package startdemo;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class AddNumbers {
	public static AndroidDriver driver;

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
	
		
		DesiredCapabilities ds=new DesiredCapabilities();
		ds.setCapability(MobileCapabilityType.AUTOMATION_NAME,"APPIUM");
		ds.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
		ds.setCapability(MobileCapabilityType.PLATFORM_VERSION,"9.0");
		ds.setCapability(MobileCapabilityType.DEVICE_NAME,"Android Emulator");
		ds.setCapability(MobileCapabilityType.UDID,"emulator-5554");
//		ds.setCapability("appPackage","com.singind.settingneeds");
//		ds.setCapability("appActivity","com.singind.settingneeds.user.LoginActivity");
		
		ds.setCapability("appPackage","com.android.calculator2");
		ds.setCapability("appActivity","com.android.calculator2.Calculator");
		//ds.setCapability(MobileCapabilityType.APP,"E:\\MagicMind Documents\\APK file\\setting_needs.apk");
		
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		driver=new AndroidDriver<WebElement>(url,ds);
		String Session=driver.getSessionId().toString();
		//driver.close();
		
		Thread.sleep(3000);
		
		
		driver.findElementById("com.android.calculator2:id/digit_9").click();
		Thread.sleep(2000);
		driver.findElementByAccessibilityId("plus").click();
		Thread.sleep(1000);
		driver.findElementById("com.android.calculator2:id/digit_6").click();
		Thread.sleep(1000);
		driver.findElementByAccessibilityId("equals").click();
		
		
		
		
		

	}

}
