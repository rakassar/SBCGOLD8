package BUSINESSNEXT.SBCGOLD8.TESTSCENARIOS;
import java.io.IOException;

import org.testng.annotations.Test;

import BUSINESSNEXT.SBCGOLD8.COMMON.*;
import BUSINESSNEXT.SBCGOLD8.METHOD.*;

/* Lead creation & appointment stage for NTB individual
 *
 */


//screen shot via listner class
//@Listeners(crm.mhc.common.ListnersClassAnotation.class)

public class SC_002_Lead_NTBLeadAppointment extends HomePageMethod
{


	//************************Fill the Info for SD process*****************************-------------//

    @Test
	public void SC_002_TC_001() throws InterruptedException, IOException
	{

	    //Object for methods class
    	CustomerSerachPageMethod cspm=new CustomerSerachPageMethod();
    	LeadObjectPageMethod lopm=new LeadObjectPageMethod();
    	IndividualSalesJourneyPageMethod NTBSJPM=new IndividualSalesJourneyPageMethod();
    	CollectDocsLeadPageMethod CLDLPM=new CollectDocsLeadPageMethod();
    	TestDataFromExcel TDFX=new TestDataFromExcel();
    	CreateLeadAppointmentPageMethod CAPM=new CreateLeadAppointmentPageMethod();
    	Screenshot screen=new Screenshot();

    	launchBrowser();
    	Thread.sleep(1000);
        screen.ScreenshotMethod("SC_002_NTBLeadAppointment-");
    	TestDataFromExcel.DataRead();
    	Thread.sleep(500);
 		EnterUserName(TestDataFromExcel.UserName_CA);
 		Thread.sleep(1000);
        screen.ScreenshotMethod("SC_002_NTBLeadAppointment-");
        EnterPassword(TestDataFromExcel.Password);
        LoginButtonClick();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_002_NTBLeadAppointment-");
        CheckRole();
        screen.ScreenshotMethod("SC_002_NTBLeadAppointment-");
        ClickOnsaleswidget();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_002_NTBLeadAppointment-");
        ClickOnsalesJouney();
        lopm.ClickOnOnBoardingJourney();
        cspm.ClickOnOnBoardingJourneynext();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_002_NTBLeadAppointment-");
        NTBSJPM.SalutationID(TestDataFromExcel.SalutationID);
        screen.ScreenshotMethod("SC_002_NTBLeadAppointment-");
        NTBSJPM.EnterFirstName();
        NTBSJPM.EnterlastName();
        NTBSJPM.EntermiddleName();
        NTBSJPM.EnterMobile();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_002_NTBLeadAppointment-");
        NTBSJPM.NTBJourneynext1();
        screen.ScreenshotMethod("SC_002_NTBLeadAppointment-");
        Thread.sleep(1000);
        NTBSJPM.ProductCategory(TestDataFromExcel.ProductCategory);
        Thread.sleep(500);
        NTBSJPM.Product(TestDataFromExcel.Product);
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_002_NTBLeadAppointment-");
        NTBSJPM.NTBJourneynext2();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_002_NTBLeadAppointment-");
        CLDLPM.CreatedNewLeadEdit();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_002_NTBLeadAppointment-");
        CAPM.selectstatuscodeappointment();
        screen.ScreenshotMethod("SC_002_NTBLeadAppointment-");
        CAPM.PreferredDayTime();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_002_NTBLeadAppointment-");
        lopm.saveAndProceed();
        Thread.sleep(1000);
        lopm.GetLeadId();

        screen.ScreenshotMethod("SC_002_NTBLeadAppointment-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_002_NTBLeadAppointment-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_002_NTBLeadAppointment-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_002_NTBLeadAppointment-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_002_NTBLeadAppointment-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_002_NTBLeadAppointment-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_002_NTBLeadAppointment-");
        lopm.ClickOnActivitiestab();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_002_NTBLeadAppointment-");

        LogoutButtonClick();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_002_NTBLeadAppointment-");
        QuiteBrowser();
    	


    }

    //screen shot via listner class
    /*
	 * @Test public void TestToPass() {
	 * System.out.println("This method to Check Fail Or Pass");
	 * Assert.assertTrue(true);
	 *
	 * }
	 */


}
