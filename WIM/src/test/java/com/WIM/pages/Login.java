package com.WIM.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Login 
{
	WebDriver driver;
	@FindBy(xpath="//input[@id='email']")
	WebElement Email;
	@FindBy(how=How.XPATH,using="//input[@id='username']")
	WebElement Username;
	@FindBy(xpath="//input[@id='password']")
	WebElement Password;
	@FindBy(xpath="//button[text()='Create your account']")
	WebElement Submit;
public Login(WebDriver ldriver) 
{
	this.driver=ldriver;
}
public void Logincredential(String emailID,String Uname,String pass) 
{
	Email.sendKeys(emailID);
	Username.sendKeys(Uname);
	Password.sendKeys(pass);
	Submit.click();
}

}
