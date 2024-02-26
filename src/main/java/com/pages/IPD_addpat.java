package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IPD_addpat 
{
	
	public IPD_addpat(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//span[text()=' IPD - In Patient']")
	WebElement ipd_buton ;
	
	@FindBy(xpath = "//a[@id='addp']")
	WebElement adpat ;
	
	@FindBy(xpath = "//a[@id='addpip']")
	WebElement adpatt1  ;
	
	@FindBy(xpath = "//input[@id='name']")
	WebElement name;
	
	@FindBy(xpath = "(//input[@name='guardian_name'])[2]")
	WebElement gardname ;
	
	@FindBy(xpath = "//select[@id='addformgender']")
	WebElement gen_buton ;
	
	@FindBy(xpath = "")
	WebElement ;
	
	@FindBy(xpath = "//input[@id='birth_date']")
	WebElement dob;
	
	@FindBy(xpath = "//input[@id='age_year']")
	WebElement yr ;
	
	@FindBy(xpath = "//input[@id='age_month']")
	WebElement mon ;
	
	@FindBy(xpath = "//input[@id='age_day']")
	WebElement day ;
	
	@FindBy(xpath = "(//select[@name='blood_group'])[2]")
	WebElement blod ;
	
	@FindBy(xpath = "(//select[@name=\"marital_status\"])[2]")
	WebElement mastatus ;
	
	
	
	
	
	
	
	

}
