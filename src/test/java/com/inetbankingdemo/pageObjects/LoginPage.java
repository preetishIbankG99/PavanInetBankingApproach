package com.inetbankingdemo.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class LoginPage{
	WebDriver ldriver;
	//creating constructor
	public LoginPage(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
		}
//page object for userid
	@FindBy(name="uid")
	@CacheLookup
	WebElement txtUserName;
	
	
//page object for password
	@FindBy(name="password")
	@CacheLookup
	WebElement txtPassword;
	
//button page object
	@FindBy(name="btnLogin")
	@CacheLookup
	WebElement btnLogin;
	
//pageobject for logout
	@FindBy(xpath="//a[text()='Log out']")
	@CacheLookup
    WebElement	btnLogout;
	
	public void setUsername(String uname) {
		txtUserName.sendKeys(uname);
	}
	
	public void setPassword(String pwd)
	{
		txtPassword.sendKeys(pwd);
	}
	
	
	public void clickSubmit()
	{
		btnLogin.click();
	}	
	
	public void clickLogout()
	{
		btnLogout.click();
	}
	
	
	
	
	
	
	
}