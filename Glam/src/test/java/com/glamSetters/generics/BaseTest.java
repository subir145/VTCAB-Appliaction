package com.glamSetters.generics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.glamSetters.pages.Submitprojectpage;



  public class BaseTest implements IAutoconstant
 {
	
	static
	{
		System.setProperty(Chrome_key,chrome_value);
		System.setProperty(Gecko_key,Gecko_value);
	}
	
	public static WebDriver driver;
	
	 public static FWutils fu = new FWutils();
	public static int passCount=0,failCount=0;
	@BeforeClass
	@Parameters("sBrowser")
	public  static void openBrowser(String sBrowser)
	{
		if(sBrowser.equals("chrome"))
		{
			driver=new ChromeDriver();
		}
		else
		{
			driver=new FirefoxDriver();
		}
		driver.manage().timeouts().implicitlyWait(ITO,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(URL);
	}
	
	@AfterMethod
	public void logoutApp(ITestResult res)
	{
		int testStatus=res.getStatus();
		  String nametest=res.getName();
		  if(testStatus==1)
		  {
			  passCount++;
		  }
		  else
		  {
			  failCount++;
			  String ppath=photo_path+nametest+"png";
			  FWutils.TakeScreenshot(driver,ppath);
			  
		  }
		  Submitprojectpage sp=new Submitprojectpage(driver);
		  sp.logout();
	}
	
	@AfterClass
	public void closeBrowser()
	{
		driver.close();
	}
	
	

}
