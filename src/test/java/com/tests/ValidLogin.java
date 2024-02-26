package com.tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.base.TestBase;
import com.pages.Login_Function;




public class ValidLogin extends TestBase
{
   public static Login_Function logf;
   
   @BeforeMethod
   public void Intialize()
   {
	   setup();
	   logf=new Login_Function(driver);   
   }
   @Test
   public void logIn()
   {
	  logf.validateLogin(); 
   }
}
