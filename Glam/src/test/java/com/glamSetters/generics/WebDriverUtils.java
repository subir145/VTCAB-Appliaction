package com.glamSetters.generics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverUtils {
	
	public void customWait(WebDriver driver,WebElement element )
	{
		new WebDriverWait(driver,IAutoconstant.ETO).until(ExpectedConditions.elementToBeClickable(element));
	}
	
	public void customWaitpage(WebDriver driver,String eTitle)
	{
		new WebDriverWait(driver,IAutoconstant.ETO).until(ExpectedConditions.titleContains(eTitle));
	}
	
	public void selectelement(WebElement element, String vText)
	{
		new Select(element).selectByValue(vText);;
	}
	
	public void selectindex(WebElement element,int num)
	{
		new Select(element).selectByIndex(num);
	}
	
	public void handlingframebyindex(WebDriver driver,int index)
	{
		driver.switchTo().frame(index);
	}
	
	public void handlingframebywebelement(WebDriver driver, String element)
	{
		driver.switchTo().frame(element);
	}
	
	public void mouseActions(WebDriver driver,WebElement targetelm)
	{
		new Actions(driver).moveToElement(targetelm).perform();
	}

}
