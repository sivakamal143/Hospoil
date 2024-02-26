package com.tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.base.TestBase;
import com.pages.Login_Function;
import com.pages.Logout_Function;
import com.pages.Referral_Refperson;
import com.util.UtiltestCls;

@Listeners(com.util.ListListeners.class)

public class ValidateReferral_Refralperson extends TestBase
{
	 public  Login_Function linf;
	 public  Logout_Function loutf;
	 public Referral_Refperson refadper;
	 public static String sheetname2="refperson";
	 
	 @BeforeMethod
	 public void instialize()
	 {
		 setup();
		 linf= new Login_Function(driver);
		 refadper=new Referral_Refperson(driver);
		 linf.validateLogin();
	 }
	 
	 @DataProvider
	 public String[][] excl()
	 {
	 String[][] data= UtiltestCls.getexceldata(sheetname2);
		 return data;
	 } 	
	 
	 @Test(dataProvider = "excl")
	 public void validate_Addperson(String rname,String rphno,String pname,String pphono,String catgy ,String std,String adres,String op,String ip,String par,String path,String rad,String blod,String amb)
	 {
		 
		 refadper.refAddReferral(rname,rphno,pname,pphono,catgy,std,adres,op,ip,par,path,rad,blod,amb);
	 
	 }

}
