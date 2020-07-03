package com.glamSetters.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

import com.glamSetters.generics.WebDriverUtils;



public class Submitprojectpage extends WebDriverUtils
{
	
	@FindBy(xpath="//span[contains(text(),'subir sarkar')]")
	private WebElement sarkar;
	
	@FindBy(xpath="//a[contains(@class,'logout')]")
	private WebElement logout;

 public Submitprojectpage(WebDriver driver)
 {
	 PageFactory.initElements(driver,this);
	 
 }
 
 public void logout()
 {
	 sarkar.click();
	 logout.click();
 }
 
 public void verify_submitprjct(WebDriver driver,String Expectedtitle)
 {
	 String actualTitle=driver.getTitle();
	 Assert.assertEquals(actualTitle,Expectedtitle);
	 Reporter.log("The expected title is displayed"+Expectedtitle,true);
 }
}


