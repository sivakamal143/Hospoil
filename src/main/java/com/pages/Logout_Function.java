package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.TestBase;

public class Logout_Function extends TestBase 
{
     @FindBy(xpath ="//a[@class = 'dropdown-toggle']")
     WebElement pro_buton;
     
     @FindBy(xpath="//a[text()='Logout']")
     WebElement logout_buton;
     
     public Logout_Function(WebDriver driver)
     {
    	 PageFactory.initElements(driver,this);
     }
     
     public void validateLogout()
     {
    	 pro_buton.click();
    	 logout_buton.click();
    	 
     }
}
