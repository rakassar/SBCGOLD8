package BUSINESSNEXT.SBCGOLD8.TESTSCENARIOS;
import org.testng.annotations.Test;

import BUSINESSNEXT.SBCGOLD8.COMMON.*;
import BUSINESSNEXT.SBCGOLD8.METHOD.*;
/* Lead creation process for NTB Individual

 */

//screen shot using listner class
//@Listeners(crm.mhc.common.ListnersClassAnotation.class)

   public class SC_035_Lead_ETBIndiPitches extends HomePageMethod
   {
	//Object for methods class
	CustomerSerachPageMethod cspm=new CustomerSerachPageMethod();
	LeadObjectPageMethod lopm=new LeadObjectPageMethod();
	IndividualSalesJourneyPageMethod NTBSJPM=new IndividualSalesJourneyPageMethod();
	CollectDocsLeadPageMethod CLDLPM=new CollectDocsLeadPageMethod();
    TestDataFromExcel TDFX=new TestDataFromExcel();
    Screenshot screen=new Screenshot();


	//************************Fill the Info for SD process*****************************-------------//
	//ListnersClassAnotation css=new ListnersClassAnotation();
    @Test(priority=1)
	public void SC_026_TC_001() throws Exception
	{

    	//rizwan

    	launchBrowser();
		screen.ScreenshotMethod("SC_035_Lead_ETBIndiPitches-");
		TestDataFromExcel.DataRead();
		Thread.sleep(500);
		screen.ScreenshotMethod("SC_035_Lead_ETBIndiPitches-");
		EnterUserName(TestDataFromExcel.UserName_CA);
		EnterPassword(TestDataFromExcel.Password);
		screen.ScreenshotMethod("SC_035_Lead_ETBIndiPitches-");
		LoginButtonClick();
		CheckRole();
		Thread.sleep(500);
		screen.ScreenshotMethod("SC_035_Lead_ETBIndiPitches-");
		CheckRole();
		Thread.sleep(100);
		ClickOnsaleswidget();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_035_Lead_ETBIndiPitches-");
		ClickOnsalesJouney();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_035_Lead_ETBIndiPitches-");
		lopm.ClickOnOnBoardingJourney();
		cspm.BBNFillForCustomerSearch(TestDataFromExcel.BBN);
		Thread.sleep(1000);
		cspm.ClickOnOnBoardingJourneynext();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_035_Lead_ETBIndiPitches-");
		cspm.ChooseBBNfromList();
		Thread.sleep(2000);
		screen.ScreenshotMethod("SC_035_Lead_ETBIndiPitches-");
		cspm.clickstartjourney();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_035_Lead_ETBIndiPitches-");
		cspm.ETBIndividualSalesJorney();
		// cspm.clickonredbutton();
		// cspm.ClickOnOnBoardingJourneynext2();
		Thread.sleep(2000);
		screen.ScreenshotMethod("SC_035_Lead_ETBIndiPitches-");
	}

    @Test(priority=2)
	public void SC_026_TC_002() throws Exception
	{

      
        NTBSJPM.LeadRating("Hot");
        NTBSJPM.pitchMultipleProduct("Yes");
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_035_Lead_ETBIndiPitches-");
        NTBSJPM.NTBJourneynext1();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_035_Lead_ETBIndiPitches-");
        Thread.sleep(1000);
       
        NTBSJPM.SDBranch("Acropolis");
        Thread.sleep(500);
        CLDLPM.salesID("0014-Velasco, Jacqueline L.");
        Thread.sleep(500);
        screen.ScreenshotMethod("SC_035_Lead_ETBIndiPitches-");
    }


    @Test(priority=3)
	public void SC_026_TC_003() throws Exception
	{
        scrollBy();
       // NTBSJPM.checkboxSaving(); // ETB field serial number was one ahead so using ntb one's
        NTBSJPM.checkboxChecking();    
        NTBSJPM.checkboxDeal();
        NTBSJPM.checkboxPersonalLoan();
        NTBSJPM.checkboxAutoloan();
        NTBSJPM.checkboxHomeLoan();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_035_Lead_ETBIndiPitches-");
        NTBSJPM.checkboxCreditCard();
        NTBSJPM.checkboxOtherloan();
        NTBSJPM.checkboxTrust();
        NTBSJPM.checkboxUITF();
        NTBSJPM.checkBoxBanca();
        NTBSJPM.checkboxTreasury();
        NTBSJPM.checkboxTreasuryETB();
        Thread.sleep(500);
        screen.ScreenshotMethod("SC_035_Lead_ETBIndiPitches-");
        scrollBy();
       
        screen.ScreenshotMethod("SC_035_Lead_ETBIndiPitches-");
        lopm.saveAndProceed();




    }
    @Test(priority=4)
	public void SC_026_TC_004() throws Exception
	{
    	Thread.sleep(7000);
        lopm.GetLeadId();

        screen.ScreenshotMethod("SC_035_Lead_ETBIndiPitches-");
        scrollBy();
    	Thread.sleep(1000);
        screen.ScreenshotMethod("SC_035_Lead_ETBIndiPitches-");
        scrollBy();
    	Thread.sleep(1000);
        screen.ScreenshotMethod("SC_035_Lead_ETBIndiPitches-");
        LogoutButtonClick();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_035_Lead_ETBIndiPitches-");
    	QuiteBrowser();

	}

  //screen shot using listner class
	/*
	 * @Test public void TestToPass() {
	 * System.out.println("This method to Check Fail Or Pass");
	 * Assert.assertTrue(true);
	 *
	 * }
	 */
   }


