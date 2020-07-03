package com.glamSetters.generics;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;

public class FWutils
{
	  
	  public static void verify_page(WebDriver driver,String Expectedtitle)
	  {
		 String actualtitle=driver.getTitle();
		 Assert.assertEquals(actualtitle, Expectedtitle);
		 Reporter.log("The page is verified"+Expectedtitle,true);
		 
	  }
	  
	  public static void TakeScreenshot(WebDriver driver,String path)
	  {
		  try
		  {
		  TakesScreenshot ts=(TakesScreenshot)driver;
	     File src=ts.getScreenshotAs(OutputType.FILE);
	     File des= new File(path);
	     FileUtils.copyFile(src,des);
		  }
		  catch(Exception e)
		  {
			  e.printStackTrace();
		  }
	   }
	  

	  
  public static String read_XL_Data(String path, String sheet,int row,int cell)
  {
		  String data="";
		  try
		  {
		  Workbook wb=WorkbookFactory.create(new FileInputStream(path));
		  data=wb.getSheet(sheet).getRow(row).getCell(cell).toString();
	   }
	  catch(Exception e)
	  {
			  e.printStackTrace();
		  }
		return data;
		  
	  }
	  
	  public static int XL_Rowcount(String path, String sheet,int row)
	  {
	  int rowcount=0;
	  try
	  {
		  Workbook wb=WorkbookFactory.create(new FileInputStream(path));
		  rowcount=wb.getSheet(sheet).getLastRowNum();
	  }
	  catch(Exception e)
	  {
		  e.printStackTrace();
	  }
		  
		return rowcount;
	  
  }
  
  public static void Write_XL_Data(String path,String sheet,int row,int cell)
  {
	  try
	  {
	  Workbook wb=WorkbookFactory.create(new FileInputStream(path));
	  wb.getSheet(sheet).createRow(row).createCell(cell);
	  
	  wb.write(new FileOutputStream(path));
	  }
	  catch(Exception e)
		  {
			  e.printStackTrace();
	  }
	  
  }


}
	  
	 
	  
	
	  


