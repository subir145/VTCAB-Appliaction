package com.Listener.list;

import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class Listener extends TestListenerAdapter
{
	public void onTestStart(ITestResult tr)
	{
		System.out.println("Test started");
	}
	
	public void onTestSucces(ITestResult tr)
	{
		System.out.println("Test passed");
	}
	
	public void onTestFailure(ITestResult tr)
	{
      System.out.println("Test Failed");
	}
	
	public void onTestSkipped(ITestResult tr)
	{
		System.out.println("Test skipped");
	}
	 

}
