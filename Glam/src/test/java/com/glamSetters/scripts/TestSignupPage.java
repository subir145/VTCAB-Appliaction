package com.glamSetters.scripts;

import org.testng.annotations.Test;

import com.glamSetters.generics.BaseTest;
import com.glamSetters.generics.FWutils;
import com.glamSetters.pages.SignupPage;


public class TestSignupPage extends BaseTest
{
	 @Test
	 public void signup() throws InterruptedException
	 {
		 String fn=FWutils.read_XL_Data(XL_DATA_PATH,"signup",1,0);
		 String ln=FWutils.read_XL_Data(XL_DATA_PATH,"signup",1,1);
		 String un=FWutils.read_XL_Data(XL_DATA_PATH,"signup",1,2);
		 String em=FWutils.read_XL_Data(XL_DATA_PATH,"signup",1,3);
		 String pw=FWutils.read_XL_Data(XL_DATA_PATH,"signup",1,4);
		 String rpw=FWutils.read_XL_Data(XL_DATA_PATH,"signup",1,5);
		 Thread.sleep(3000);
		 
		 SignupPage tc=new SignupPage(driver);
		 tc.signuppage(fn, ln, un, em, pw, rpw);
		 
	 }

}
