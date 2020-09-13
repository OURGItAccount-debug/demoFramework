package com.WIM.Utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserInitial
{
	static  WebDriver driver;

	public static WebDriver startBrowsesr(String Browser,String URL) 
	{
		if(Browser.equalsIgnoreCase("chrome")) 
		{
	       System.setProperty("webdriver.chrome.driver", "C:\\Users\\govin\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
	      //WebDriverManager.chromedriver().setup();
			 driver=new ChromeDriver();
		}
	else if(Browser.equalsIgnoreCase("Firefox")) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\govin\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		//WebDriverManager.chromedriver().setup();
	    driver=new FirefoxDriver();		
	}
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(URL);
		return driver;
		}
	}

