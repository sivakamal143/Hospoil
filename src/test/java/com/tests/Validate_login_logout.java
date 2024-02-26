package com.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.base.TestBase;
import com.pages.Login_Function;
import com.pages.Logout_Function;

@Listeners(com.util.Listeners.class)
public class Validate_login_logout extends TestBase
{
    public static Login_Function linf;
    public static Logout_Function loutf;
     
    @BeforeMethod
    public void instalize()
    {
    	setup();
    	linf= new Login_Function(driver);
    	loutf= new Logout_Function(driver);
    	linf.validateLogin();
    	
    }
    
    @Test
    public void logout()
    {
    	loutf.validateLogout();	
    }
    
   }
