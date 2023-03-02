package BUSINESSNEXT.SBCGOLD8.TESTSCENARIOS;
import java.io.IOException;

import org.testng.annotations.Test;

import BUSINESSNEXT.SBCGOLD8.COMMON.*;
import BUSINESSNEXT.SBCGOLD8.METHOD.*;

/*Customer Onboarding process for NTB employed Indidvidual

To run on G7 please change nature of work field and uncomment the CRRSC section
*/

//screen shot using listner class
//@Listeners(crm.mhc.common.ListnersClassAnotation.class)
public class SC_052_Lead_NTBLeadCreateByBM extends HomePageMethod
{

    //Object for methods class
	CustomerSerachPageMethod cspm=new CustomerSerachPageMethod();
	LeadObjectPageMethod lopm=new LeadObjectPageMethod();
	IndividualSalesJourneyPageMethod NTBSJPM=new IndividualSalesJourneyPageMethod();
	CollectDocsLeadPageMethod CLDLPM=new CollectDocsLeadPageMethod();
	TestDataFromExcel TDFX=new TestDataFromExcel();
	CRRSCLeadPageMethod CRRSC= new CRRSCLeadPageMethod();
    Screenshot screen=new Screenshot();
    OracleDbConnection db =new OracleDbConnection();
	CreateLeadAppointmentPageMethod CAPM=new CreateLeadAppointmentPageMethod();
    FillAccountInformationPageMethod FAIPM=new FillAccountInformationPageMethod();



    @Test
	public void SC_052_TC_001() throws InterruptedException, IOException
	{
    	launchBrowser();
    	Thread.sleep(1000);
        screen.ScreenshotMethod("SC_052_Lead_NTBLeadCreateByBM-");
    	TestDataFromExcel.DataRead();
    	Thread.sleep(500);
 		EnterUserName(TestDataFromExcel.UserName_BranchBCM);
 		Thread.sleep(1000);
        screen.ScreenshotMethod("SC_052_Lead_NTBLeadCreateByBM-");
        EnterPassword(TestDataFromExcel.Password);
        LoginButtonClick();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_052_Lead_NTBLeadCreateByBM-");
        CheckRole();
        screen.ScreenshotMethod("SC_052_Lead_NTBLeadCreateByBM-");
        ClickOnsaleswidget();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_052_Lead_NTBLeadCreateByBM-");
        ClickOnsalesJouney();
        lopm.ClickOnOnBoardingJourney();
        cspm.ClickOnOnBoardingJourneynext();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_052_Lead_NTBLeadCreateByBM-");
        NTBSJPM.SalutationID(TestDataFromExcel.SalutationID);
        screen.ScreenshotMethod("SC_052_Lead_NTBLeadCreateByBM-");
        NTBSJPM.EnterFirstName();
        NTBSJPM.EnterlastName();
        NTBSJPM.EntermiddleName();
        NTBSJPM.EnterMobile();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_052_Lead_NTBLeadCreateByBM-");
        NTBSJPM.NTBJourneynext1();
        screen.ScreenshotMethod("SC_052_Lead_NTBLeadCreateByBM-");
        Thread.sleep(1000);
        NTBSJPM.ProductCategory(TestDataFromExcel.ProductCategory);
        Thread.sleep(500);
        NTBSJPM.Product(TestDataFromExcel.Product);
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_052_Lead_NTBLeadCreateByBM-");
        NTBSJPM.NTBJourneynext2();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_052_Lead_NTBLeadCreateByBM-");
        CLDLPM.CreatedNewLeadEdit();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_052_Lead_NTBLeadCreateByBM-");
        CAPM.selectstatuscodeappointment();
        screen.ScreenshotMethod("SC_052_Lead_NTBLeadCreateByBM-");
        CAPM.PreferredDayTime();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_052_Lead_NTBLeadCreateByBM-");
        lopm.saveAndProceed();
        Thread.sleep(1000);
        lopm.GetLeadId();
        System.out.println("Lead status code is "+lopm.getStatusCode());
        screen.ScreenshotMethod("SC_052_Lead_NTBLeadCreateByBM-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_052_Lead_NTBLeadCreateByBM-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_052_Lead_NTBLeadCreateByBM-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_052_Lead_NTBLeadCreateByBM-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_052_Lead_NTBLeadCreateByBM-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_052_Lead_NTBLeadCreateByBM-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_052_Lead_NTBLeadCreateByBM-");
        lopm.ClickOnActivitiestab();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_052_Lead_NTBLeadCreateByBM-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_052_Lead_NTBLeadCreateByBM-");
        scrollToTop();
        screen.ScreenshotMethod("SC_052_Lead_NTBLeadCreateByBM-");
        QuiteBrowser();
    	


    }
	

   

     }


