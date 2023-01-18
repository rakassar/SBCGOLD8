package BUSINESSNEXT.SBCGOLD8.TESTSCENARIOS;

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

public class SC_037_ETBLead_Rejected extends HomePageMethod {
	// Object for methods class
	CustomerSerachPageMethod cspm = new CustomerSerachPageMethod();
	LeadObjectPageMethod lopm = new LeadObjectPageMethod();
	IndividualSalesJourneyPageMethod NTBSJPM = new IndividualSalesJourneyPageMethod();
	CollectDocsLeadPageMethod CLDLPM = new CollectDocsLeadPageMethod();
	TestDataFromExcel TDFX = new TestDataFromExcel();
	Screenshot screen = new Screenshot();
	// BrowserStart br=new BrowserStart();
	// HomePageMethod home=new HomePageMethod();

	// ************************Fill the Info for SD
	// process*****************************-------------//
	// ListnersClassAnotation css=new ListnersClassAnotation();
	@Test(priority = 1)
	public void SC_030_TC_001() throws Exception {

		launchBrowser();
		screen.ScreenshotMethod("SC_037_ETBLead_Rejected-");
		TestDataFromExcel.DataRead();
		Thread.sleep(500);
		screen.ScreenshotMethod("SC_037_ETBLead_Rejected-");
		EnterUserName(TestDataFromExcel.UserName_CA);
		EnterPassword(TestDataFromExcel.Password);
		screen.ScreenshotMethod("SC_037_ETBLead_Rejected-");
		LoginButtonClick();
		CheckRole();
		Thread.sleep(500);
		screen.ScreenshotMethod("SC_037_ETBLead_Rejected-");
		CheckRole();
		Thread.sleep(100);
		ClickOnsaleswidget();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_037_ETBLead_Rejected-");
		ClickOnsalesJouney();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_037_ETBLead_Rejected-");
		lopm.ClickOnOnBoardingJourney();
		cspm.BBNFillForCustomerSearch(TestDataFromExcel.BBN);
		Thread.sleep(1000);
		cspm.ClickOnOnBoardingJourneynext();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_037_ETBLead_Rejected-");
		cspm.ChooseBBNfromList();
		Thread.sleep(2000);
		screen.ScreenshotMethod("SC_037_ETBLead_Rejected-");
		cspm.clickstartjourney();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_037_ETBLead_Rejected-");
		cspm.ETBIndividualSalesJorney();
		// cspm.clickonredbutton();
		// cspm.ClickOnOnBoardingJourneynext2();
		Thread.sleep(2000);
		screen.ScreenshotMethod("SC_037_ETBLead_Rejected-");

	}
	
	@Test(priority = 2)
	public void SC_006_TC_002() throws Exception {

		NTBSJPM.LeadRating("Hot");
		screen.ScreenshotMethod("SC_037_ETBLead_Rejected-");
		NTBSJPM.NTBJourneynext1();
		Thread.sleep(1000);
		NTBSJPM.ProductCategory(TestDataFromExcel.ProductCategory);
		Thread.sleep(500);
		NTBSJPM.Product(TestDataFromExcel.Product);
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_037_ETBLead_Rejected-");
		NTBSJPM.NTBJourneynext2();
		Thread.sleep(2000);
		lopm.GetLeadId();

		screen.ScreenshotMethod("SC_037_ETBLead_Rejected-");
		scrollBy();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_037_ETBLead_Rejected-");
		scrollBy();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_037_ETBLead_Rejected-");
		scrollBy();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_037_ETBLead_Rejected-");
		scrollBy();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_037_ETBLead_Rejected-");
		scrollBy();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_037_ETBLead_Rejected-");
		scrollBy();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_037_ETBLead_Rejected-");
		lopm.btn_LeadReject();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_037_ETBLead_Rejected-");
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_037_ETBLead_Rejected-");
		QuiteBrowser();

		// CLDLPM.CreatedNewLeadEdit();
		// LoginPageRedircet();
		// LogoutButtonClick();

	}
}

// screen shot using listner class
/*
 * @Test public void TestToPass() {
 * System.out.println("This method to Check Fail Or Pass");
 * Assert.assertTrue(true);
 *
 * }
 */
