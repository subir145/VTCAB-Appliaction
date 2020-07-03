package com.glamSetters.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignupPage 
{
	
	@FindBy(xpath="(//a[contains(text(),'SIGN UP')])[1]")
	private WebElement signup;
	
	@FindBy(xpath="//a[contains(text(),'LOGIN')]")
	private WebElement login;
	
	@FindBy(xpath="//span[@class='switchery']")
	private WebElement lookingfor;
	
	@FindBy(id="first_name")
	private WebElement firstname;
	
	@FindBy(id="last_name")
	private WebElement lastname;
	
	@FindBy(id="user_login")
	private WebElement username;
	
	@FindBy(id="register_user_email")
	private WebElement email;
	
	@FindBy(id="register_user_pass")
	private WebElement password;
	
	@FindBy(id="repeat_pass")
	private WebElement retypepswrd;
	
	@FindBy(xpath="(//button[contains(@class,'btn-submit btn-sumary btn-sub-create')])[1]")
	private WebElement sign;
	
	@FindBy(id="login_user_login")
	private WebElement loginuser;
	
	@FindBy(id="login_user_pass")
	private WebElement loginpswrd;
	
	@FindBy(xpath="//button[contains(text(),'Sign in')]")
	private WebElement signin;
	
	public SignupPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	
	public void signuppage(String fn,String ln,String un,String em,String pw,String rpw)
	{
		signup.click();
		lookingfor.click();
		firstname.sendKeys(fn);
		lastname.sendKeys(ln);
		username.sendKeys(un);
		email.sendKeys(em);
		password.sendKeys(pw);
		retypepswrd.sendKeys(rpw);
		sign.click();
	}
	
	public void login(String un,String pw)
	{
		login.click();
		loginuser.sendKeys(un);
		loginpswrd.sendKeys(pw);
         signin.click();
		
	}
	
	

}
