package com.pages;

import java.awt.AWTException;

import javax.xml.xpath.XPath;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.TestBase;
import com.util.UtiltestCls;

public class Refferal_addRefPay extends TestBase
{
	
	 public Refferal_addRefPay(WebDriver driver)
     {
    	 PageFactory.initElements(driver, this);
     }
    
	
     @FindBy(xpath="//span[text()='Referral']")
      public WebElement ref;
     
     @FindBy(xpath = "//a[text()=' Add Referral Payment']")
     public WebElement adrefpay;
     
     @FindBy(xpath ="//span[@id='select2-addpatient_id-container']")
     public WebElement cliselpat;
     
     @FindBy(xpath="//input[@class='select2-search__field']")
     public WebElement selpa_txt;
     
     @FindBy(xpath = "//span[@id='select2-patient_type-container']")
     public WebElement pa_type;
     
     @FindBy(xpath = "//input[@class='select2-search__field']")
     WebElement patype_txt;
     
     @FindBy(xpath = "//span[@id='select2-bill_no_case_id-container']")
     WebElement billno;
     
     @FindBy(xpath = "//input[@class='select2-search__field']")
     WebElement bilno_txt;
     
//     @FindBy(id = "bill_amount")
//     WebElement pa_bill;
     
     @FindBy(xpath = "//span[@id='select2-payee-container']")
     WebElement payee;
     
     @FindBy(xpath = "//input[@class='select2-search__field']")
     WebElement paye_txt;
     
     @FindBy(id = "addpaymentbtn")
     WebElement savebtn;
     
     
     
     public void validateAdRefPay(String panname,String pastr, String patype, String bilno, String paye) throws AWTException, Throwable
     {
    	 UtiltestCls.Javaexuclk(ref);
    	
    	 adrefpay.click();
    	 cliselpat.click();
    	 selpa_txt.sendKeys(panname);
    	 Thread.sleep(3000);
    	
    	 UtiltestCls.textRbot();
    	 pa_type.click();
    	 patype_txt.sendKeys(patype);
    	 UtiltestCls.textRbot();
    	 
    	 
    	// UtiltestCls.dropdown(billno, bilno);
    	 Thread.sleep(3000);
    	 billno.click();
    	 bilno_txt.sendKeys(bilno);
    	 Thread.sleep(3000);
    	 UtiltestCls.textRbot();
    	 
    	 Thread.sleep(5000);
    	 payee.click();
    	 paye_txt.sendKeys(paye);
    	 //UtiltestCls.dropdown(payee,paye );
    	 UtiltestCls.textRbot();
    	 
    	 Thread.sleep(4000);
    	 savebtn.click();
   
    	 
    	 
    	 
     }
     
     
}
