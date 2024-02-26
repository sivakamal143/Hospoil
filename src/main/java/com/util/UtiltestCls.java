package com.util;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.base.TestBase;

public class UtiltestCls extends TestBase 
{
   public static String excelsheet="./src/main/java/com/testdata/hospil_refpay.xlsx";
   public static XSSFWorkbook book;
   public static XSSFSheet sheet;
   public static FileInputStream file;
   
   
   public static String [][] getexceldata(String sheetname)
   {
	   try
	   {
		   file= new FileInputStream(excelsheet);
	   }
	   catch (FileNotFoundException e) 
	    {
		   e.printStackTrace();
     	}
	   
	   try
	   {
		   book= new XSSFWorkbook(file);
	   }
	   catch (IOException e) 
	   {
		   e.printStackTrace();
	   }
	   
	   sheet=book.getSheet(sheetname);
	   int row=sheet.getPhysicalNumberOfRows();
	   int col=sheet.getRow(1).getLastCellNum();
	   String[][] data=new String[row-1][col];
	   for(int r=0;r<row-1;r++)
	   {
		   for(int c=0;c<col;c++)
		   {
			   DataFormatter df= new DataFormatter();
			   data[r][c]=df.formatCellValue(sheet.getRow(r+1).getCell(c));
		   }
	   }
	   
	   return data;  
   }
   
   public static void dropdown(WebElement ele, String value)
   {
	   Select sel= new Select(ele);
	   sel.selectByVisibleText(value);
   }
   
   public static void Javaexuclk(WebElement ele)
   {
	   JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", ele); 
   }
   
   public static void textRbot() throws AWTException
   {
	  Robot rb= new Robot();
	  rb.keyPress(KeyEvent.VK_DOWN);
	  rb.keyRelease(KeyEvent.VK_DOWN);
	  rb.keyPress(KeyEvent.VK_ENTER);
	  rb.keyRelease(KeyEvent.VK_ENTER);
   }
}
