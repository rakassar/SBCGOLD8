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

   public class SC_001_Lead_NTBLeadCreation extends HomePageMethod
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
	public void SC_001_TC_001() throws Exception
	{

    	

    	launchBrowser();
    	Thread.sleep(1000);
        screen.ScreenshotMethod("SC_001_NTBLeadCreation-");
    	TestDataFromExcel.DataRead();
    	Thread.sleep(500);
 		EnterUserName(TestDataFromExcel.UserName_CA);
 		Thread.sleep(1000);
        screen.ScreenshotMethod("SC_001_NTBLeadCreation-");
        EnterPassword(TestDataFromExcel.Password);
        LoginButtonClick();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_001_NTBLeadCreation-");
        CheckRole();
        screen.ScreenshotMethod("SC_001_NTBLeadCreation-");

        ClickOnsaleswidget();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_001_NTBLeadCreation-");
        ClickOnsalesJouney();

        lopm.ClickOnOnBoardingJourney();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_001_NTBLeadCreation-");
        cspm.ClickOnOnBoardingJourneynext();
        Thread.sleep(2000);
        screen.ScreenshotMethod("SC_001_NTBLeadCreation-");
	}

    @Test(priority=2)
	public void SC_001_TC_002() throws Exception
	{
    {
        NTBSJPM.SalutationID(TestDataFromExcel.SalutationID);
        NTBSJPM.EnterFirstName();
        NTBSJPM.EnterlastName();
        NTBSJPM.EntermiddleName();
        NTBSJPM.EnterMobile();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_001_NTBLeadCreation-");
        NTBSJPM.NTBJourneynext1();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_001_NTBLeadCreation-");
        Thread.sleep(1000);
        NTBSJPM.ProductCategory(TestDataFromExcel.ProductCategory);
        Thread.sleep(500);
        NTBSJPM.Product(TestDataFromExcel.Product);
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_001_NTBLeadCreation-");
        NTBSJPM.NTBJourneynext2();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_001_NTBLeadCreation-");
        Thread.sleep(1000);
        lopm.GetLeadId();
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_001_NTBLeadCreation-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_001_NTBLeadCreation-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_001_NTBLeadCreation-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_001_NTBLeadCreation-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_001_NTBLeadCreation-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_001_NTBLeadCreation-");
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


}
