package BUSINESSNEXT.SBCGOLD8.TESTSCENARIOS;
import org.testng.annotations.Test;
import BUSINESSNEXT.SBCGOLD8.COMMON.*;
import BUSINESSNEXT.SBCGOLD8.METHOD.*;
/* Lead creation process for NTB Individual

 */

//screen shot using listner class
//@Listeners(crm.mhc.common.ListnersClassAnotation.class)

   public class SC_027_Lead_NTBNonIndiPitches extends HomePageMethod
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
	public void SC_027_TC_001() throws Exception
	{

    	//rizwan

    	launchBrowser();
    	Thread.sleep(1000);
        screen.ScreenshotMethod("SC_027_Lead_NTBNonIndiPitches-");
    	TestDataFromExcel.DataRead();
    	Thread.sleep(500);
 		EnterUserName(TestDataFromExcel.UserName_CA);
 		Thread.sleep(1000);
        screen.ScreenshotMethod("SC_027_Lead_NTBNonIndiPitches-");
        EnterPassword(TestDataFromExcel.Password);
        LoginButtonClick();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_027_Lead_NTBNonIndiPitches-");
        CheckRole();
        screen.ScreenshotMethod("SC_027_Lead_NTBNonIndiPitches-");

        ClickOnsaleswidget();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_027_Lead_NTBNonIndiPitches-");
        ClickOnsalesJouney();

        lopm.ClickOnOnBoardingJourneyNonIndi();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_027_Lead_NTBNonIndiPitches-");
        cspm.ClickOnOnBoardingJourneynext();
        Thread.sleep(2000);
        screen.ScreenshotMethod("SC_027_Lead_NTBNonIndiPitches-");
	}

    @Test(priority=2)
	public void SC_027_TC_002() throws Exception
	{

    	NTBSJPM.CompanyName();
    	NTBSJPM.EnterMobile();
    	NTBSJPM.pitchMultipleProduct("Yes");
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_027_Lead_NTBNonIndiPitches-");
        NTBSJPM.NTBJourneynext1();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_027_Lead_NTBNonIndiPitches-");
        Thread.sleep(1000);
        NTBSJPM.SDBranch("Acropolis");
        Thread.sleep(500);
        CLDLPM.salesID("0014-Velasco, Jacqueline L.");
        Thread.sleep(500);
        screen.ScreenshotMethod("SC_027_Lead_NTBNonIndiPitches-");
    }


    @Test(priority=3)
	public void SC_027_TC_003() throws Exception
	{
        scrollBy();
        NTBSJPM.checkboxSaving();
        NTBSJPM.checkboxChecking();
        NTBSJPM.checkboxDeal();
        NTBSJPM.checkboxPersonalLoan();
        NTBSJPM.checkboxAutoloan();
        NTBSJPM.checkboxHomeLoan();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_027_Lead_NTBNonIndiPitches-");
        NTBSJPM.checkboxCreditCard();
        NTBSJPM.checkboxOtherloan();
        NTBSJPM.checkboxTrust();
        NTBSJPM.checkboxUITF();
        NTBSJPM.checkBoxBanca();
        NTBSJPM.checkboxTreasury();
        Thread.sleep(500);
        screen.ScreenshotMethod("SC_027_Lead_NTBNonIndiPitches-");
        scrollBy();
        CLDLPM.ZipcodeNonIndi(TestDataFromExcel.Zipcode);
        Thread.sleep(500);
        screen.ScreenshotMethod("SC_027_Lead_NTBNonIndiPitches-");
        lopm.saveAndProceed();



    }
    @Test(priority=4)
	public void SC_027_TC_004() throws Exception
	{
    	Thread.sleep(7000);
        screen.ScreenshotMethod("SC_027_Lead_NTBNonIndiPitches-");
        scrollBy();
        screen.ScreenshotMethod("SC_027_Lead_NTBNonIndiPitches-");
    	Thread.sleep(1000);
        scrollBy();
        screen.ScreenshotMethod("SC_027_Lead_NTBNonIndiPitches-");
        LogoutButtonClick();
        Thread.sleep(1000);
        screen.ScreenshotMethod("TC_002_NTBLeadAppointment-");
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


