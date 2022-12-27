package BUSINESSNEXT.SBCGOLD8.METHOD;

import java.text.DecimalFormat;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import BUSINESSNEXT.SBCGOLD8.OBJECT.*;

public class ReportPageMethod extends HomePageMethod {

	JavascriptExecutor js;
	String caseIDCreated;
//************************Fill the Info Stage1 process*****************************-------------//

	

	 public void clk_reportObject() throws InterruptedException

		{

			   Actions quick1 = new Actions(driver);
			   quick1.moveToElement(ReportPageObject.clk_reportquicklink).perform();
			   Thread.sleep(500);
			   
			   ReportPageObject.clk_reportobject.click();
		       
		       //CaseStagePageObject.clk_caseobject4.click();
		}
	 
	 public void trendingArrowDown() throws InterruptedException {
		 Thread.sleep(1000);  
		 ReportPageObject.clk_reportName.sendKeys("branch blue book");
		   ReportPageObject.clk_opendropdown.click();
	 }

	 public void clk_reportName(String reportname) throws InterruptedException

		{
		 
		 
		   ReportPageObject.clk_reportName.clear();
		   Thread.sleep(500);
		   ReportPageObject.clk_reportName.sendKeys(reportname);
		  
		  
		   Thread.sleep(500);
		   ReportPageObject.clk_openreport.click();

		}
	
	 
	 public void jumptoreportwindow()
	 {
	 
	     Set<String> multiplewindows=driver.getWindowHandles();
	     Iterator<String> iterator = multiplewindows.iterator();
	     String mainWindow = iterator.next();
	     String ChildWindow = iterator.next();
	     driver.switchTo().window(ChildWindow);
	 }

	public void clickOnExecute() {
		ReportPageObject.clk_executeButton.click();
		
	}

	
	 
	 
}