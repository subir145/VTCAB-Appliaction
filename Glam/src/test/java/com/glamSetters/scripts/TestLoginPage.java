package com.glamSetters.scripts;

import org.testng.annotations.Test;

import com.glamSetters.generics.BaseTest;
import com.glamSetters.generics.FWutils;
import com.glamSetters.pages.SignupPage;

public class TestLoginPage extends BaseTest {
	
	 @Test
	 public void signup()
	 {
		 String un=FWutils.read_XL_Data(XL_DATA_PATH,"Login",1,0);
		 String pw=FWutils.read_XL_Data(XL_DATA_PATH,"Login",1,1);
		 
		 SignupPage tc=new SignupPage(driver);
		 tc.login(un, pw);
		 
		 

}
}
