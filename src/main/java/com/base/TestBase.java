package com.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import com.util.Listeners;

import io.github.bonigarcia.wdm.WebDriverManager;


public class TestBase 
{
	 public static Properties proj;
	 public static FileInputStream file;
	 public static WebDriver driver;
	// public static Listeners el;
	// public static EventFiringWebDriver efw;
	 
	
    public TestBase()
    {
    	proj= new Properties();
    	
    	try
    	{
    		file= new FileInputStream("./src/main/java/com/config/props");
    	}
    	catch(FileNotFoundException e)
    	{
    		e.printStackTrace();
    	}
    	
    	
    	try 
    	{
    		proj.load(file);
    	}
    	catch(IOException e)
    	{
    		e.printStackTrace();
    	}
    }
    
    
    public void setup()
    {
    	String web= proj.getProperty("browser");
    	if(web.equalsIgnoreCase("chrome"))
    	{
    		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver.exe");
    		WebDriverManager.chromedriver().setup(); 
    		driver=new ChromeDriver();
    	}
    	 else if(web.equalsIgnoreCase("firefox"))
		 {
			// System.setProperty("webdriver.gecko.driver", "C:\\Users\\admin\\Downloads\\geckodriver.exe");
    		 WebDriverManager.firefoxdriver().setup();
			 driver= new FirefoxDriver();
		 }
    	
//    	   el= new Listeners();
//			efw= new EventFiringWebDriver(driver);
//			efw.register(el);
//			driver= efw;
    	
    	 driver.manage().window().maximize();
		 driver.get(proj.getProperty("url"));
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
    }
}
