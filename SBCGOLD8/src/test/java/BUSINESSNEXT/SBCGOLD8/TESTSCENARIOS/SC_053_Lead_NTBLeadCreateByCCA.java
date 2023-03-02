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
public class SC_053_Lead_NTBLeadCreateByCCA extends HomePageMethod
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
	public void SC_053_TC_001() throws InterruptedException, IOException
	{
    	launchBrowser();
    	Thread.sleep(1000);
        screen.ScreenshotMethod("SC_053_Lead_NTBLeadCreateByCCA-");
    	TestDataFromExcel.DataRead();
    	Thread.sleep(500);
 		EnterUserName(TestDataFromExcel.UserName_CCA);
 		Thread.sleep(1000);
        screen.ScreenshotMethod("SC_053_Lead_NTBLeadCreateByCCA-");
        EnterPassword(TestDataFromExcel.Password);
        LoginButtonClick();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_053_Lead_NTBLeadCreateByCCA-");
        CheckRole();
        screen.ScreenshotMethod("SC_053_Lead_NTBLeadCreateByCCA-");
        ClickOnsaleswidget();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_053_Lead_NTBLeadCreateByCCA-");
        ClickOnsalesJouney();
        lopm.ClickOnOnBoardingJourney();
        cspm.ClickOnOnBoardingJourneynext();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_053_Lead_NTBLeadCreateByCCA-");
        NTBSJPM.SalutationID(TestDataFromExcel.SalutationID);
        screen.ScreenshotMethod("SC_053_Lead_NTBLeadCreateByCCA-");
        NTBSJPM.EnterFirstName();
        NTBSJPM.EnterlastName();
        NTBSJPM.EntermiddleName();
        NTBSJPM.EnterMobile();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_053_Lead_NTBLeadCreateByCCA-");
        NTBSJPM.NTBJourneynext1();
        screen.ScreenshotMethod("SC_053_Lead_NTBLeadCreateByCCA-");
        Thread.sleep(1000);
        NTBSJPM.ProductCategory(TestDataFromExcel.ProductCategory);
        Thread.sleep(500);
        NTBSJPM.Product(TestDataFromExcel.Product);
        Thread.sleep(1000);
        NTBSJPM.leadSource("Branch Solicited");
        NTBSJPM.SDBranch("SB EQUITIES");

        
        screen.ScreenshotMethod("SC_053_Lead_NTBLeadCreateByCCA-");
        NTBSJPM.NTBJourneynext2();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_053_Lead_NTBLeadCreateByCCA-");
        QuiteBrowser();
	}
        
    
	

     }


