package com.tests;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.base.TestBase;
import com.pages.Login_Function;
import com.pages.Logout_Function;
import com.pages.Refferal_addRefPay;
import com.util.UtiltestCls;

public class ReferalPaymnt_Add extends TestBase
{
	 public  Login_Function linf;
	 public  Logout_Function loutf;
	 public  Refferal_addRefPay arefpay;
	 public static String sheetname1="refpay";
	 
	 @BeforeMethod
	 public void intialize()
	 {
		 setup();
		 linf=new Login_Function(driver);
		 loutf=new Logout_Function(driver);
		 //arefpay=new Refferal_addRefPay(driver);
		 linf.validateLogin();
	 }
	 
	 @DataProvider
	 public String[][] exl()
	 {
	 String[][] data= UtiltestCls.getexceldata(sheetname1);
		 return data;
	 } 	
	 
	
	 @Test(dataProvider = "exl")
	 public void reffeal_module(String pa_name,String pastr, String pa_type, String billno, String payee) throws Throwable
	 {
		 
		 arefpay=new Refferal_addRefPay(driver);
		 Thread.sleep(3000);
		
		// JavascriptExecutor js = (JavascriptExecutor)driver;
		//js.executeScript("arguments[0].click();",arefpay.ref);
		// arefpay.ref.click();
		
		 arefpay.validateAdRefPay(pa_name, pastr, pa_type, billno, payee);
	 }
	 
	}
