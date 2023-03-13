	package BUSINESSNEXT.SBCGOLD8.TESTSCENARIOS;
import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//import crm.mhc.common.BrowserStart;
//import crm.mhc.common.Screenshot;
//import crm.mhc.common.TestDataFromExcel;
//import crm.mhc.pages.methods.CollectDocsLeadPageMethod;
//import crm.mhc.pages.methods.CustomerSerachPageMethod;
//import crm.mhc.pages.methods.HomePageMethod;
//import crm.mhc.pages.methods.IndividualSalesJourneyPageMethod;
//import crm.mhc.pages.methods.LeadObjectPageMethod;

import BUSINESSNEXT.SBCGOLD8.COMMON.*;
import BUSINESSNEXT.SBCGOLD8.METHOD.*;


/* Lead creation process for NTB Individual

 */

//screen shot using listner class
//@Listeners(crm.mhc.common.ListnersClassAnotation.class)
@Listeners(BUSINESSNEXT.SBCGOLD8.COMMON.ListnersClassAnotation.class)

   public class SC_042_Lead_PayrollApplication extends HomePageMethod
   {
	//Object for methods class
	CustomerSerachPageMethod cspm=new CustomerSerachPageMethod();
	LeadObjectPageMethod lopm=new LeadObjectPageMethod();
	IndividualSalesJourneyPageMethod NTBSJPM=new IndividualSalesJourneyPageMethod();
	CollectDocsLeadPageMethod CLDLPM=new CollectDocsLeadPageMethod();
    TestDataFromExcel TDFX=new TestDataFromExcel();
    Screenshot screen=new Screenshot();
   // BrowserStart br=new BrowserStart(); 
    //HomePageMethod home=new HomePageMethod();

	//************************Fill the Info for SD process*****************************-------------//
	//ListnersClassAnotation css=new ListnersClassAnotation();
    @Test(priority=1)
	public void SC_042_TC_001() throws InterruptedException, IOException {
    	launchBrowser();
    	screen.ScreenshotMethod("SC_042_Lead_PayrollApplication-");
    	TestDataFromExcel.DataRead();
    	Thread.sleep(500);
    	screen.ScreenshotMethod("SC_042_Lead_PayrollApplication-");
 		EnterUserName(TestDataFromExcel.UserName_PayrollAssistant);
        EnterPassword(TestDataFromExcel.Password);
    	screen.ScreenshotMethod("SC_042_Lead_PayrollApplication-");
        LoginButtonClick();
        CheckRole();
        Thread.sleep(500);
        screen.ScreenshotMethod("SC_042_Lead_PayrollApplication-");
        ClickOnsaleswidget();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_042_Lead_PayrollApplication-");
        ClickOnCustomerSearch();
        Thread.sleep(1000);
        cspm.chooseCstmerToSrch("Non Individual Customer Search");
        screen.ScreenshotMethod("SC_042_Lead_PayrollApplication-");
        
        cspm.BBNFillForCustomerSearchNonIndi("10200000980");
        Thread.sleep(1000);
        cspm.ClickOnOnBoardingJourneynext();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_042_Lead_PayrollApplication-");
        cspm.ChooseBBNfromListNonIndi();
        Thread.sleep(2000);
        screen.ScreenshotMethod("SC_042_Lead_PayrollApplication-");
        cspm.switchCustomerView();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_042_Lead_PayrollApplication-");
        cspm.clickBulkAccountOpeningTab();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_042_Lead_PayrollApplication-");
        cspm.clickNewPayrollRequest();
        screen.ScreenshotMethod("SC_042_Lead_PayrollApplication-");
        
    
    }

    @Test(priority=2)
	public void SC_042_TC_002() throws Exception
    {
        screen.ScreenshotMethod("SC_042_Lead_PayrollApplication-");
        
        scrollBy();
        CLDLPM.attachCSV();
    	CLDLPM.customerTypeP("INDIVIDUAL");
    	CLDLPM.clientSegmentP("Silver");
    	CLDLPM.salesIDP("0013-Vivo, Rhett A.");
    	CLDLPM.branchP("Acropolis");
    	CLDLPM.employerTypeP("Employed");
    	CLDLPM.sourceOfFundP("Salary");
    	CLDLPM.forEmploymentP("Yes");
        screen.ScreenshotMethod("SC_042_Lead_PayrollApplication-");
        scrollBy();

    	CLDLPM.accountTagP("Payroll");
    	CLDLPM.accountPlasticP("SBC AFNI MC EMV");
    	CLDLPM.checkbookTypeP("Corporate Checkbook");
    	CLDLPM.atmFee("Yes");
        screen.ScreenshotMethod("SC_042_Lead_PayrollApplication-");
        CLDLPM.clickSave();

    	
       
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_042_Lead_PayrollApplication-");
        Thread.sleep(1000);
        lopm.getApplicationId();
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_042_Lead_PayrollApplication-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_042_Lead_PayrollApplication-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_042_Lead_PayrollApplication-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_042_Lead_PayrollApplication-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_042_Lead_PayrollApplication-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_042_Lead_PayrollApplication-");
    	QuiteBrowser();

        //CLDLPM.CreatedNewLeadEdit();
        //LoginPageRedircet();
        //LogoutButtonClick();

    }
    }

  //screen shot using listner class
	/*
	 * @Test public void TestToPass() {
	 * System.out.println("This method to Check Fail Or Pass");
	 * Assert.assertTrue(true);
	 *
	 * }
	 */



