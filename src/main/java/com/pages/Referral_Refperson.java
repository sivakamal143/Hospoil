package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.TestBase;
import com.util.UtiltestCls;

public class Referral_Refperson extends TestBase
{
     public Referral_Refperson(WebDriver driver)
     {
    	 PageFactory.initElements(driver, this);
     }
     
     @FindBy(xpath="//span[text()='Referral']")
     public WebElement ref;
     

     @FindBy(xpath = "//a[text()='Referral Person']")
     WebElement refperbuton ;
     
     @FindBy(xpath = "//a[text()=' Add Referral Person']")
     WebElement adrefper;
     
     @FindBy(xpath = "//input[@name='name']")
     WebElement refname ;
     
     @FindBy(xpath = "//input[@name='referrer_contact']")
     WebElement refcont ;
     
     @FindBy(xpath = "//input[@name='person_name']")
     WebElement pername ;
     
     @FindBy(xpath = "//input[@name='person_phone']")
     WebElement percont ;
     
     @FindBy(xpath = "//select[@name='category']")
     WebElement categry ;
     
     @FindBy(xpath = "//input[@name='commission']")
     WebElement stdcomison;
     
     @FindBy(xpath = "//input[@name='address']")
     WebElement adres;
     
     @FindBy(xpath = "//button[@class='plusign']")
     WebElement apptoallbuton ;
     
     @FindBy(xpath = "//input[@id='type_id_1']")
     WebElement opd;
     
     @FindBy(xpath = "//input[@id='type_id_2']")
     WebElement ipd;
     
     @FindBy(xpath = "//input[@id='type_id_3']")
     WebElement parmacy;
     
     @FindBy(xpath = "//input[@id='type_id_4']")
     WebElement pathology;
     
     @FindBy(xpath = "//input[@id='type_id_5']")
     WebElement radiology;
     
     @FindBy(xpath = "//input[@id='type_id_6']")
     WebElement blodbank;
     
     @FindBy(xpath = "//input[@id='type_id_7']")
     WebElement ambulance;
     
     @FindBy(xpath = "//button[@id='addpersonbtn']")
     WebElement savebuton;
     
     public void refAddReferral(String rname,String rphno,String pname,String pphono,String catgy ,String std,String adres,String op,String ip,String par,String path,String rad,String blod,String amb)
     {
    	 UtiltestCls.Javaexuclk(ref);
    	 refperbuton.click();
    	 adrefper.click();
    	 this.refname.sendKeys(rname);
    	 refcont.sendKeys(rphno);
    	 pername.sendKeys(pname);
    	 percont.sendKeys(pphono);
    	 categry.click();
    	 UtiltestCls.dropdown(categry, catgy);
    	 stdcomison.sendKeys(std);
    	 this.adres.sendKeys(adres);
    	 opd.sendKeys(op);
    	 ipd.sendKeys(ip);
    	 parmacy.sendKeys(par);
    	 pathology.sendKeys(path);
    	 radiology.sendKeys(rad);
    	 blodbank.sendKeys(blod);
    	 ambulance.sendKeys(amb);
    	 savebuton.click();
    	 while((!std.isEmpty()) ||(!ip.isEmpty()))
    			 {
    		 if(!std.isEmpty() && !(!ip.isEmpty()))
    				 {
    			       apptoallbuton.click();
    			       break;
    				 }
    		 else
    		 {
    			 break;
    		 }
    	         }
    	 savebuton.click();
    	 
    	 
    	 
    	 
    	 
    	 
    	 
     }

	
}
