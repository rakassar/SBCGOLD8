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
public class SC_056_Lead_NTBDocsCollectByCCA extends HomePageMethod
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
	public void SC_056_TC_001() throws InterruptedException, IOException
	{
    	launchBrowser();
    	Thread.sleep(1000);
        screen.ScreenshotMethod(" ");
    	TestDataFromExcel.DataRead();
    	Thread.sleep(500);
 		EnterUserName(TestDataFromExcel.UserName_CCA);
 		Thread.sleep(1000);
        screen.ScreenshotMethod("SC_056_Lead_NTBDocsCollectByCCA-");
        EnterPassword(TestDataFromExcel.Password);
        LoginButtonClick();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_056_Lead_NTBDocsCollectByCCA-");
        CheckRole();
        screen.ScreenshotMethod("SC_056_Lead_NTBDocsCollectByCCA-");
        ClickOnsaleswidget();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_056_Lead_NTBDocsCollectByCCA-");
        ClickOnsalesJouney();
        lopm.ClickOnOnBoardingJourney();
        cspm.ClickOnOnBoardingJourneynext();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_056_Lead_NTBDocsCollectByCCA-");
        NTBSJPM.SalutationID(TestDataFromExcel.SalutationID);
        screen.ScreenshotMethod("SC_056_Lead_NTBDocsCollectByCCA-");
        NTBSJPM.EnterFirstName();
        NTBSJPM.EnterlastName();
        NTBSJPM.EntermiddleName();
        NTBSJPM.EnterMobile();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_056_Lead_NTBDocsCollectByCCA-");
        NTBSJPM.NTBJourneynext1();
        screen.ScreenshotMethod("SC_056_Lead_NTBDocsCollectByCCA-");
        Thread.sleep(1000);
        NTBSJPM.ProductCategory(TestDataFromExcel.ProductCategory);
        Thread.sleep(500);
        NTBSJPM.Product(TestDataFromExcel.Product);
        Thread.sleep(1000);
        NTBSJPM.leadSource("Branch Solicited");
        NTBSJPM.SDBranch("SB EQUITIES");

        
        screen.ScreenshotMethod("SC_056_Lead_NTBDocsCollectByCCA-");
        NTBSJPM.NTBJourneynext2();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_056_Lead_NTBDocsCollectByCCA-");
        QuiteBrowser();
	}
        
        @Test
    	public void SC_056_TC_002() throws InterruptedException, IOException
    	{
        	launchBrowser();
        	screen.ScreenshotMethod("SC_056_Lead_NTBDocsCollectByCCA-");
        	TestDataFromExcel.DataRead();
            EnterUserName(db.dboracleConnection(lopm.leadid));
            EnterPassword(TestDataFromExcel.Password);
        	screen.ScreenshotMethod("SC_056_Lead_NTBDocsCollectByCCA-");
            LoginButtonClick();
            CheckRole();
        	screen.ScreenshotMethod("SC_056_Lead_NTBDocsCollectByCCA-");
            CheckRole();
            Thread.sleep(100);
            clk_leadobject();
            lopm.categoryview("Deposit-Individual");
            lopm.leadview("Assigned Leads");
            Thread.sleep(500);
            lopm.onMyBucketlead();
            Thread.sleep(500);
            screen.ScreenshotMethod("SC_056_Lead_NTBDocsCollectByCCA-");
            scrollBy();
            Thread.sleep(1000);
            screen.ScreenshotMethod("SC_056_Lead_NTBDocsCollectByCCA-");
            scrollBy();
            Thread.sleep(1000);
            screen.ScreenshotMethod("SC_056_Lead_NTBDocsCollectByCCA-");
        
        
        CLDLPM.CreatedNewLeadEdit();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_056_Lead_NTBDocsCollectByCCA-");
        CAPM.selectstatuscodeappointment();
        screen.ScreenshotMethod("SC_056_Lead_NTBDocsCollectByCCA-");
        CAPM.PreferredDayTime();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_056_Lead_NTBDocsCollectByCCA-");
        lopm.saveAndProceed();
        Thread.sleep(1000);
        lopm.GetLeadId();
        System.out.println("Lead status code is "+lopm.getStatusCode());
        screen.ScreenshotMethod("SC_056_Lead_NTBDocsCollectByCCA-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_056_Lead_NTBDocsCollectByCCA-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_056_Lead_NTBDocsCollectByCCA-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_056_Lead_NTBDocsCollectByCCA-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_056_Lead_NTBDocsCollectByCCA-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_056_Lead_NTBDocsCollectByCCA-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_056_Lead_NTBDocsCollectByCCA-");
        lopm.ClickOnActivitiestab();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_056_Lead_NTBDocsCollectByCCA-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_056_Lead_NTBDocsCollectByCCA-");
        scrollToTop();
        screen.ScreenshotMethod("SC_056_Lead_NTBDocsCollectByCCA-");
        QuiteBrowser();
    	


    }
	

    @Test
	public void SC_056_TC_003() throws InterruptedException, IOException
	{
    	launchBrowser();
    	screen.ScreenshotMethod("SC_056_Lead_NTBDocsCollectByCCA-");
    	TestDataFromExcel.DataRead();
        EnterUserName(db.dboracleConnection(lopm.leadid));
        EnterPassword(TestDataFromExcel.Password);
    	screen.ScreenshotMethod("SC_056_Lead_NTBDocsCollectByCCA-");
        LoginButtonClick();
        CheckRole();
    	screen.ScreenshotMethod("SC_056_Lead_NTBDocsCollectByCCA-");
        CheckRole();
        Thread.sleep(100);
        clk_leadobject();
        lopm.categoryview("Deposit-Individual");
        lopm.leadview("Assigned Leads");
        Thread.sleep(500);
        lopm.onMyBucketlead();
        Thread.sleep(500);
        screen.ScreenshotMethod("SC_056_Lead_NTBDocsCollectByCCA-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_056_Lead_NTBDocsCollectByCCA-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_056_Lead_NTBDocsCollectByCCA-");
        CLDLPM.CreatedNewLeadEdit();
        Thread.sleep(1000);
	
        CLDLPM.selectstatuscode();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_056_Lead_NTBDocsCollectByCCA-");
        CLDLPM.Enteremail();
        Thread.sleep(300);
        screen.ScreenshotMethod("SC_056_Lead_NTBDocsCollectByCCA-");
        CLDLPM.dob(TestDataFromExcel.dobmonth, TestDataFromExcel.dobdate, TestDataFromExcel.dobyear);
        CLDLPM.Gender(TestDataFromExcel.Gender);
        CLDLPM.PlcaeOfBirth();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_056_Lead_NTBDocsCollectByCCA-");
        CLDLPM.CustomerType(TestDataFromExcel.CustomerType);
        CLDLPM.CivilStatus(TestDataFromExcel.CivilStatus);
        CLDLPM.CustomerContact(TestDataFromExcel.CustomerContact);
        CLDLPM.BusinnesSegment(TestDataFromExcel.BusinnesSegment);
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_056_Lead_NTBDocsCollectByCCA-");
        CLDLPM.ClientSegment(TestDataFromExcel.ClientSegment);
        screen.ScreenshotMethod("SC_056_Lead_NTBDocsCollectByCCA-");
        CLDLPM.SoleOwner(TestDataFromExcel.SoleOwner);
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_056_Lead_NTBDocsCollectByCCA-");
	}


    @Test
	public void SC_056_TC_004() throws InterruptedException, IOException
	{
       /*employed steps start */
        CLDLPM.Employeetype(TestDataFromExcel.Employeetype);
        CLDLPM.Sourceoffunds(TestDataFromExcel.SourceoffundsEmp);
        CLDLPM.employername();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_056_Lead_NTBDocsCollectByCCA-");
        CLDLPM.occupation(TestDataFromExcel.occupation);
        CLDLPM.IncomeRange(TestDataFromExcel.IncomeRange);
        Thread.sleep(1000);
        CLDLPM.workingsince(TestDataFromExcel.workingsincemonth, TestDataFromExcel.workingsinceyear);
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_056_Lead_NTBDocsCollectByCCA-");
        scrollBy();
        CLDLPM.EconomicActivity(TestDataFromExcel.EconomicActivity);
        Thread.sleep(500);
        screen.ScreenshotMethod("SC_056_Lead_NTBDocsCollectByCCA-");
        CLDLPM.Industry_Classification(TestDataFromExcel.Industry_Classification);
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_056_Lead_NTBDocsCollectByCCA-");
        CLDLPM.NatureOfWorkNEW(TestDataFromExcel.NatureOfWork);  
        Thread.sleep(1000);
        CLDLPM.forEmployment(TestDataFromExcel.forEmployment);
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_056_Lead_NTBDocsCollectByCCA-");
        /*employed steps end */

	}


    @Test
	public void SC_056_TC_005() throws InterruptedException, IOException
	{
        CLDLPM.IDPrrof(TestDataFromExcel.IDPrrof);
        CLDLPM.IDNumner();
        screen.ScreenshotMethod("SC_056_Lead_NTBDocsCollectByCCA-");
        CLDLPM.MaidanName();
        screen.ScreenshotMethod("SC_056_Lead_NTBDocsCollectByCCA-");
        //CLDLPM.Tin("");
        CLDLPM.AoCode(TestDataFromExcel.AoCode);
        screen.ScreenshotMethod("SC_056_Lead_NTBDocsCollectByCCA-");
        CLDLPM.ClickOnAddress();
        screen.ScreenshotMethod("SC_056_Lead_NTBDocsCollectByCCA-");
        CLDLPM.streetfied();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_056_Lead_NTBDocsCollectByCCA-");
        CLDLPM.Zipcode(TestDataFromExcel.Zipcode);
        screen.ScreenshotMethod("SC_056_Lead_NTBDocsCollectByCCA-");
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_056_Lead_NTBDocsCollectByCCA-");
        CLDLPM.mailingaddress(TestDataFromExcel.mailingaddress);
        screen.ScreenshotMethod("SC_056_Lead_NTBDocsCollectByCCA-");
        lopm.saveAndProceed();
        Thread.sleep(1000);
   	    screen.ScreenshotMethod("SC_056_Lead_NTBDocsCollectByCCA-");


        //LogoutButtonClick();
        }


    @Test
 	public void SC_056_TC_006() throws InterruptedException
 	{
    	 CLDLPM.clickClosePopup();
    	 screen.ScreenshotMethod("SC_056_Lead_NTBDocsCollectByCCA-");
         scrollBy();
         Thread.sleep(1000);
         screen.ScreenshotMethod("SC_056_Lead_NTBDocsCollectByCCA-");
         scrollBy();
         Thread.sleep(1000);
         screen.ScreenshotMethod("SC_056_Lead_NTBDocsCollectByCCA-");
         scrollBy();
         Thread.sleep(1000);
         screen.ScreenshotMethod("SC_056_Lead_NTBDocsCollectByCCA-");
         scrollBy();
         Thread.sleep(1000);
         screen.ScreenshotMethod("SC_056_Lead_NTBDocsCollectByCCA-");
         scrollBy();
         Thread.sleep(1000);
         screen.ScreenshotMethod("SC_056_Lead_NTBDocsCollectByCCA-");
         scrollBy();
         Thread.sleep(1000);
         screen.ScreenshotMethod("SC_056_Lead_NTBDocsCollectByCCA-");
         CLDLPM.clickCRRSCButton();
         Thread.sleep(1000);
         screen.ScreenshotMethod("SC_056_Lead_NTBDocsCollectByCCA-");
    	//CLDLPM.leadredbutton();


        /*  // OLD CRRSC
     	CRRSC.AmlcUnJmf(TestDataFromExcel.AmlcUnJmf);
     	CRRSC.BankInternalChecklist(TestDataFromExcel.BankInternalChecklist);
     	CRRSC.AllegedPerdsonf(TestDataFromExcel.AllegedPerdsonf);
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_056_Lead_NTBDocsCollectByCCA-");
     	CRRSC.HPIOrJoint(TestDataFromExcel.HPIOrJoint);
     	CRRSC.BenifOFW(TestDataFromExcel.BenifOFW);
     	CRRSC.ForeignNational(TestDataFromExcel.ForeignNational);
     	CRRSC.NumberAccount(TestDataFromExcel.NeumberAccount);
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_056_Lead_NTBDocsCollectByCCA-");
     	CRRSC.EmploymentTypeCRRSC(TestDataFromExcel.EmploymentTypeCRRSC);
     	CRRSC.IndustryCRRSC(TestDataFromExcel.IndustryCRRSC);
     	Thread.sleep(1000);
        screen.ScreenshotMethod("SC_056_Lead_NTBDocsCollectByCCA-");
     	//CRRSC.EconomicActivityCRRSC(TestDataFromExcel.EconmicactivityeCRRSC);
        //Thread.sleep(1000);
     	CRRSC.ManagerialCRRSC(TestDataFromExcel.managerialCRRSC);
     	CRRSC.DirectDealingCRRSC(TestDataFromExcel.DirectDealingCRRSC);
     	Thread.sleep(1000);
        screen.ScreenshotMethod("SC_056_Lead_NTBDocsCollectByCCA-");
        Thread.sleep(1000);
     	CRRSC.CityCRRSC(TestDataFromExcel.CityCRRSC);
     	//CRRSC.ProvinceCRRSC(TestDataFromExcel.ProvinceCRRSC);
     	//CRRSC.RiskCRRSC(TestDataFromExcel.RiskCRRSC);
     	Thread.sleep(1000);
        screen.ScreenshotMethod("SC_056_Lead_NTBDocsCollectByCCA-");
     	CRRSC.vicinityRRSC(TestDataFromExcel.vicinityRRSC);

        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_056_Lead_NTBDocsCollectByCCA-");
     	CRRSC.intialdepositeRRSC(TestDataFromExcel.intialdepositeRRSC);

     	CRRSC.InwprdOutwordRRSC(TestDataFromExcel.InwprdOutwordRRSC);

        Thread.sleep(1000);
     	CRRSC.customerdeclaredCRRSC(TestDataFromExcel.customerdeclaredCRRSC);



        screen.ScreenshotMethod("SC_056_Lead_NTBDocsCollectByCCA-");
     	CRRSC.ComfortableInformationRRSC(TestDataFromExcel.ComfortableInformationRRSC);
     	CRRSC.ComfortableDocumentsRRSC(TestDataFromExcel.ComfortableDocumentsRRSC);
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_056_Lead_NTBDocsCollectByCCA-");
        */


         //New CRRSC
         CRRSC.AmlcUnJmf(TestDataFromExcel.AmlcUnJmf);
         CRRSC.HPIOrJoint(TestDataFromExcel.HPIOrJoint);
         screen.ScreenshotMethod("SC_056_Lead_NTBDocsCollectByCCA-");
         CRRSC.BenifOFW(TestDataFromExcel.BenifOFW);
         CRRSC.PrpsOfAccntOpning(TestDataFromExcel.PrpsOfAccntOpning);
         CRRSC.Sbol(TestDataFromExcel.Sbol);
         screen.ScreenshotMethod("SC_056_Lead_NTBDocsCollectByCCA-");
         CRRSC.OtherRskFctr(TestDataFromExcel.OtherRskFctr);
         CRRSC.RemarksCRRSC("I am Indian!");
         screen.ScreenshotMethod("SC_056_Lead_NTBDocsCollectByCCA-");
         CRRSC.Finish();

         Thread.sleep(1000);
 	}

    @Test
 	public void SC_056_TC_007() throws InterruptedException
 	{
    	Thread.sleep(1000);
   	    CLDLPM.clickClosePopup();
    	screen.ScreenshotMethod("SC_056_Lead_NTBDocsCollectByCCA-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_056_Lead_NTBDocsCollectByCCA-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_056_Lead_NTBDocsCollectByCCA-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_056_Lead_NTBDocsCollectByCCA-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_056_Lead_NTBDocsCollectByCCA-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_056_Lead_NTBDocsCollectByCCA-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_056_Lead_NTBDocsCollectByCCA-");
        lopm.ClickOnCRRSCtab();
        Thread.sleep(2000);
        screen.ScreenshotMethod("SC_056_Lead_NTBDocsCollectByCCA-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_056_Lead_NTBDocsCollectByCCA-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_056_Lead_NTBDocsCollectByCCA-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_056_Lead_NTBDocsCollectByCCA-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_056_Lead_NTBDocsCollectByCCA-");
    	CLDLPM.CreatedNewLeadEdit();
        Thread.sleep(1000);
    	CLDLPM.clickEditOFAC(TestDataFromExcel.Ofac);
    	Thread.sleep(1000);
        screen.ScreenshotMethod("SC_056_Lead_NTBDocsCollectByCCA-");
    	lopm.saveAndProceed();
    	Thread.sleep(1000);
    	screen.ScreenshotMethod("SC_056_Lead_NTBDocsCollectByCCA-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_056_Lead_NTBDocsCollectByCCA-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_056_Lead_NTBDocsCollectByCCA-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_056_Lead_NTBDocsCollectByCCA-");

 	}

    @Test
 	public void SC_056_TC_008() throws InterruptedException
 	{
    	Thread.sleep(500);
    	scrolldown();
        screen.ScreenshotMethod("SC_056_Lead_NTBDocsCollectByCCA-");
        FAIPM.ClickFillAccountInformation();
        FAIPM.RequestType(TestDataFromExcel.RequestTypef);
        FAIPM.Purposeofaccountopening(TestDataFromExcel.Purposeofaccountopening);
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_056_Lead_NTBDocsCollectByCCA-");
        FAIPM.ADBRequired(TestDataFromExcel.ADBRequired);
        screen.ScreenshotMethod("SC_056_Lead_NTBDocsCollectByCCA-");
        FAIPM.PromsEmail(TestDataFromExcel.PromsEmail);
        FAIPM.sel_PromsSMS(TestDataFromExcel.PromsSMS);
        FAIPM.TransactionalEmail(TestDataFromExcel.TransactionalEmail);
        FAIPM.TransactionalSMS(TestDataFromExcel.TransactionalSMS);
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_056_Lead_NTBDocsCollectByCCA-");
        CRRSC.Finish();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_056_Lead_NTBDocsCollectByCCA-");
        Thread.sleep(1000);
        

 	}


    @Test
 	public void SC_056_TC_009() throws InterruptedException
 	{
    	Thread.sleep(1000);
        screen.ScreenshotMethod("SC_056_Lead_NTBDocsCollectByCCA-");
        lopm.ProcessApplication();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_056_Lead_NTBDocsCollectByCCA-");
        lopm.ProcessApplicationPopUpClose();
        Thread.sleep(2000);
        scrollToTop();
        lopm.GetLeadId();
        lopm.waitTillAccountOpen();

        screen.ScreenshotMethod("SC_056_Lead_NTBDocsCollectByCCA-");
        CLDLPM.clickClosePopup();
    	screen.ScreenshotMethod("SC_056_Lead_NTBDocsCollectByCCA-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_056_Lead_NTBDocsCollectByCCA-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_056_Lead_NTBDocsCollectByCCA-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_056_Lead_NTBDocsCollectByCCA-");
        QuiteBrowser();
    	
 	}
    @Test
 	public void SC_056_TC_010() throws InterruptedException, IOException
 	{
    	launchBrowser();
        screen.ScreenshotMethod("SC_056_Lead_NTBDocsCollectByCCA-");
    	TestDataFromExcel.DataRead();
 		EnterUserName(TestDataFromExcel.UserName_BBGCDMaintenanceAnalyst);
        EnterPassword(TestDataFromExcel.Password);
        screen.ScreenshotMethod("SC_056_Lead_NTBDocsCollectByCCA-");
        LoginButtonClick();
        CheckRole();
        screen.ScreenshotMethod("SC_056_Lead_NTBDocsCollectByCCA-");
        clk_leadobject();
        lopm.categoryview("Deposit-Individual");
        lopm.selfassignlead("Account Opened");
        lopm.leadview("Assigned Leads");
        Thread.sleep(500);
        lopm.onMyBucketlead();
        Thread.sleep(500);
        screen.ScreenshotMethod("SC_056_Lead_NTBDocsCollectByCCA-");
        CLDLPM.clickClosePopup();
        screen.ScreenshotMethod("SC_056_Lead_NTBDocsCollectByCCA-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_056_Lead_NTBDocsCollectByCCA-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_056_Lead_NTBDocsCollectByCCA-");
        lopm.BBOGlogExceptionButton();
        lopm.SwitchToLastWindow();
        lopm.logException("No deficiency");
        lopm.LeadRemarks("No defect");
        lopm.clickFinsih();
        lopm.SwitchToParentWindow();
        
        lopm.BBOGVerify();
        lopm.LeadRemarks("No defect");
        lopm.BmApproveUpdate();
        Thread.sleep(1000);
        scrollToTop();
        screen.ScreenshotMethod("SC_056_Lead_NTBDocsCollectByCCA-");
        System.out.println("Lead status code is "+lopm.getStatusCode());
        lopm.goToCustomer360();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_056_Lead_NTBDocsCollectByCCA-");
        cspm.switchCustomerView();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_056_Lead_NTBDocsCollectByCCA-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_056_Lead_NTBDocsCollectByCCA-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_056_Lead_NTBDocsCollectByCCA-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_056_Lead_NTBDocsCollectByCCA-");
        QuiteBrowser();

    
        
        


	}


	/*
	 * //screen shot using listner class
	 *
	 * @Test public void TestToPass() {
	 * System.out.println("This method to Check Fail Or Pass");
	 * Assert.assertTrue(true);
	 *
	 * }
	 */

     }


