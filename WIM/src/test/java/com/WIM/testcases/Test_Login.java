package com.WIM.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.WIM.Utility.BrowserInitial;
import com.WIM.pages.Login;

public class Test_Login
{
	@Test
	public void verifyLogin() 
	{
		
		WebDriver driver=BrowserInitial.startBrowsesr("chrome", "https://wordpress.com/start/user?ref=news-topnav&aff=58022");
		Login log=PageFactory.initElements(driver, Login.class);
		log.Logincredential("GR123@gmail.com","GR1234", "GR12345678");
	}

}
