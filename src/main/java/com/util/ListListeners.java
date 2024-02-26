package com.util;
import java.io.File;
import java.io.IOException;
import java.util.Random;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.base.TestBase;
import com.google.common.io.Files;

public class ListListeners implements ITestListener
{
	public void onTestStart(ITestResult result) {
		Reporter.log("Test case start "+result.getName());
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		Reporter.log("Test case sucess "+result.getName());
		}

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		TakesScreenshot sh=(TakesScreenshot)TestBase.driver;
		File fis=sh.getScreenshotAs(OutputType.FILE);
		Random random = new Random();
		int r = random.nextInt(100);
		File dist=new File("C:\\Users\\admin\\eclipse-workspace\\Hospil\\src\\main\\resources\\HospilScreenshot"+result.getName()+"ss"+r+".png");
		try
		{
			Files.copy(fis, dist);
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		Reporter.log("Test case Skipped "+result.getName());
	}
	

}
