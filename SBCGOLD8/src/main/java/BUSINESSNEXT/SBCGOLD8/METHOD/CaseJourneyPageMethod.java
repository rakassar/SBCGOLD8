package BUSINESSNEXT.SBCGOLD8.METHOD;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import BUSINESSNEXT.SBCGOLD8.OBJECT.*;

public class CaseJourneyPageMethod extends HomePageMethod {

	String SDmobilenumber;
	public static String leadid;
	JavascriptExecutor js;

//************************Fill the Info for new lead process*****************************-------------//

	public void IndividualCaseJorney()

	{

	   CaseJourneyPageObject.clk_IndividualCaseJorney.click();

	 }

       public void FillSSC(String sscname) throws InterruptedException

		{

		  driver.manage().window().maximize();
          CaseJourneyPageObject.fillSSC.click();
          WebElement SSCSearch = CaseJourneyPageObject.fillSSC;
          SSCSearch.sendKeys(sscname);
          Thread.sleep(3000);
          SSCSearch.sendKeys(Keys.DOWN);
          SSCSearch.sendKeys(Keys.ENTER);

	      }
        
       public void loanProduct() throws InterruptedException
       {
    	   CaseJourneyPageObject.fillcardproduct.click();
    	   Thread.sleep(1500);
    	   CaseJourneyPageObject.loanProduct.click();
    	   
    	   
       }


			  public void creditcardproduct() throws InterruptedException

			  {


			  CharSequence searchString = "Master";
			  CaseJourneyPageObject.fillcardproduct.click();

			  CaseJourneyPageObject.clk_productssorting.click();
			  CaseJourneyPageObject.clk_sortingM.click();
			  //Select sel=new Select(CaseJourneyPageObject.clk_pagingdropdownlist);
			  //sel.selectByValue(Product);
			  //sel.selectByVisibleText("100");
			  Thread.sleep(2000);
			  List<WebElement> creditcardproduct = CaseJourneyPageObject.fillcreditcardproduct;
			  for (WebElement element : creditcardproduct) {

			  String  creditCardProductName=element.getText();
			  if(creditCardProductName.contains(searchString))
			  {
              element.click();
			  System.out.println("Credit Card Account Number is selected");
			  break;

			  }
			  else { System.out.println("Credit Card Product not found"); } }

			  }


	  public void NextOnCasePage()
	  {
		  CaseJourneyPageObject.clk_NextOnCasePage.click();
			/*
			 * Thread.sleep(2000); JavascriptExecutor js = (JavascriptExecutor) driver;
			 * js.executeScript("window.scrollBy(0,1500)", "");
			 */

	    }
	  public void enterCustomerDetails()
	  {
		  CaseJourneyPageObject.bttn_enterCustomerDetails.click();
			/*
			 * Thread.sleep(2000); JavascriptExecutor js = (JavascriptExecutor) driver;
			 * js.executeScript("window.scrollBy(0,1500)", "");
			 */

	    }
	  public void SwitchCase()

		{
		   

		  CaseJourneyPageObject.clk_SwitchCase.click();


		}
	  public void tagCustomer()
	  {
		  CaseJourneyPageObject.bttn_tagCustomer.click();
			/*
			 * Thread.sleep(2000); JavascriptExecutor js = (JavascriptExecutor) driver;
			 * js.executeScript("window.scrollBy(0,1500)", "");
			 */

	    }
	  
	 
	  
	  public void mobileForDedupe(String no)
	  {
		  CaseJourneyPageObject.ent_mobileForDedupe.sendKeys(no);;
			/*
			 * Thread.sleep(2000); JavascriptExecutor js = (JavascriptExecutor) driver;
			 * js.executeScript("window.scrollBy(0,1500)", "");
			 */

	    }


	  public void casesaveAndProceed()

	 	{
	 	   //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));

		  CaseJourneyPageObject.clk_casesaveandproceed.click();
	 	}

	  public void Source( String Source )

	 	{
	 	   //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
		  Select source = new Select(CaseJourneyPageObject.clk_casesource);
		  source.selectByVisibleText(Source);

	 	}


		public void PIDStatus(String PIDStatus)
	    {
			//CaseStagePageObject.fill_Remarks.click();
			CaseJourneyPageObject.sel_PIDSTTAUS.sendKeys(PIDStatus);

	    }

		 public void ComplaintCategory(String ComplaintCategory) throws InterruptedException
		    {
		    	WebElement Complaint_Category = CaseJourneyPageObject.pic_ComplaintCategory;
		    	Complaint_Category.sendKeys(ComplaintCategory);
				Thread.sleep(1000);
				Complaint_Category.sendKeys(Keys.DOWN);
				Complaint_Category.sendKeys(Keys.ENTER);
		    }
}