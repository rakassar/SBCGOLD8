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
public class SC_051_Lead_NTBLeadCreateBySA extends HomePageMethod
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
	public void SC_051_TC_001() throws InterruptedException, IOException
	{
    	launchBrowser();
    	Thread.sleep(1000);
        screen.ScreenshotMethod("SC_051_Lead_NTBLeadCreateBySA-");
    	TestDataFromExcel.DataRead();
    	Thread.sleep(500);
 		EnterUserName(TestDataFromExcel.UserName_SalesAssociate);
 		Thread.sleep(1000);
        screen.ScreenshotMethod("SC_051_Lead_NTBLeadCreateBySA-");
        EnterPassword(TestDataFromExcel.Password);
        LoginButtonClick();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_051_Lead_NTBLeadCreateBySA-");
        CheckRole();
        screen.ScreenshotMethod("SC_051_Lead_NTBLeadCreateBySA-");
        ClickOnsaleswidget();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_051_Lead_NTBLeadCreateBySA-");
        ClickOnsalesJouney();
        lopm.ClickOnOnBoardingJourney();
        cspm.ClickOnOnBoardingJourneynext();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_051_Lead_NTBLeadCreateBySA-");
        NTBSJPM.SalutationID(TestDataFromExcel.SalutationID);
        screen.ScreenshotMethod("SC_051_Lead_NTBLeadCreateBySA-");
        NTBSJPM.EnterFirstName();
        NTBSJPM.EnterlastName();
        NTBSJPM.EntermiddleName();
        NTBSJPM.EnterMobile();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_051_Lead_NTBLeadCreateBySA-");
        NTBSJPM.NTBJourneynext1();
        screen.ScreenshotMethod("SC_051_Lead_NTBLeadCreateBySA-");
        Thread.sleep(1000);
        NTBSJPM.leadSource("Branch Solicited");
        NTBSJPM.ProductCategory(TestDataFromExcel.ProductCategory);
        Thread.sleep(500);
        NTBSJPM.Product(TestDataFromExcel.Product);
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_051_Lead_NTBLeadCreateBySA-");
        NTBSJPM.NTBJourneynext2();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_051_Lead_NTBLeadCreateBySA-");
        CLDLPM.CreatedNewLeadEdit();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_051_Lead_NTBLeadCreateBySA-");
        CAPM.selectstatuscodeappointment();
        screen.ScreenshotMethod("SC_051_Lead_NTBLeadCreateBySA-");
        CAPM.clickAppointmentFixFlag();
        CAPM.PreferredDayTime();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_051_Lead_NTBLeadCreateBySA-");
        lopm.saveAndProceed();
        Thread.sleep(1000);
        lopm.GetLeadId();
        System.out.println("Lead status code is "+lopm.getStatusCode());
        screen.ScreenshotMethod("SC_051_Lead_NTBLeadCreateBySA-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_051_Lead_NTBLeadCreateBySA-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_051_Lead_NTBLeadCreateBySA-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_051_Lead_NTBLeadCreateBySA-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_051_Lead_NTBLeadCreateBySA-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_051_Lead_NTBLeadCreateBySA-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_051_Lead_NTBLeadCreateBySA-");
        lopm.ClickOnActivitiestab();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_051_Lead_NTBLeadCreateBySA-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_051_Lead_NTBLeadCreateBySA-");
        lopm.ClickOnCAReassignment();
        lopm.fillCAForReassignment("User_3668");
        lopm.update360();
        Thread.sleep(1000);
        scrollToTop();
        screen.ScreenshotMethod("SC_051_Lead_NTBLeadCreateBySA-");
        QuiteBrowser();
    	


    }
	

   

     }


