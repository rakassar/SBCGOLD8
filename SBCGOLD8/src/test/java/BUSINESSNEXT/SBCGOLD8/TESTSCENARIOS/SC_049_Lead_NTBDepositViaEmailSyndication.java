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
public class SC_049_Lead_NTBDepositViaEmailSyndication extends HomePageMethod
{

    //Object for methods class
	CustomerSerachPageMethod cspm=new CustomerSerachPageMethod();
	LeadObjectPageMethod lopm=new LeadObjectPageMethod();
	IndividualSalesJourneyPageMethod NTBSJPM=new IndividualSalesJourneyPageMethod();
	CollectDocsLeadPageMethod CLDLPM=new CollectDocsLeadPageMethod();
	TestDataFromExcel TDFX=new TestDataFromExcel();
	CRRSCLeadPageMethod CRRSC= new CRRSCLeadPageMethod();
    Screenshot screen=new Screenshot();
    FillAccountInformationPageMethod FAIPM=new FillAccountInformationPageMethod();
    OracleDbConnection db =new OracleDbConnection();
	CreateLeadAppointmentPageMethod CAPM=new CreateLeadAppointmentPageMethod();



    @Test
	public void SC_049_TC_001() throws InterruptedException, IOException
	{
    	launchBrowser();
    	screen.ScreenshotMethod("SC_049_Lead_NTBDepositViaEmailSyndication-");
    	TestDataFromExcel.DataRead();
 		EnterUserName(TestDataFromExcel.UserName_EmailTeam);
        EnterPassword(TestDataFromExcel.Password);
    	screen.ScreenshotMethod("SC_049_Lead_NTBDepositViaEmailSyndication-");
        LoginButtonClick();
        CheckRole();
    	screen.ScreenshotMethod("SC_049_Lead_NTBDepositViaEmailSyndication-");
        CheckRole();
        Thread.sleep(100);
        clk_leadobject();
        lopm.categoryview("Other Source");
        lopm.selfassignlead("Email Leads");
        lopm.leadview("Assigned to me");
        Thread.sleep(500);
        lopm.onMyBucketleadEmailSyndication();
        Thread.sleep(500);
        Thread.sleep(1000);
        lopm.SwitchProcess();
        screen.ScreenshotMethod("SC_049_Lead_NTBDepositViaEmailSyndication-");
        cspm.ETBIndividualSalesJorney();
        Thread.sleep(1000);
	}


    @Test
	public void SC_049_TC_002() throws InterruptedException, IOException
	{	
        NTBSJPM.SalutationID(TestDataFromExcel.SalutationID);
        NTBSJPM.EnterMobile();
        NTBSJPM.SDBranch("SB EQUITIES");
        screen.ScreenshotMethod("SC_049_Lead_NTBDepositViaEmailSyndication-");

        NTBSJPM.NTBJourneynext1();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_049_Lead_NTBDepositViaEmailSyndication-");
        NTBSJPM.ProductCategory(TestDataFromExcel.ProductCategory);
        Thread.sleep(500);
        NTBSJPM.Product(TestDataFromExcel.Product);
        screen.ScreenshotMethod("SC_049_Lead_NTBDepositViaEmailSyndication-");
        NTBSJPM.NTBJourneynext2();
        Thread.sleep(1000);
        lopm.GetLeadId();

    	screen.ScreenshotMethod("SC_049_Lead_NTBDepositViaEmailSyndication-");
        scrollBy();
        Thread.sleep(1000);
    	screen.ScreenshotMethod("SC_049_Lead_NTBDepositViaEmailSyndication-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_049_Lead_NTBDepositViaEmailSyndication-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_049_Lead_NTBDepositViaEmailSyndication-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_049_Lead_NTBDepositViaEmailSyndication-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_049_Lead_NTBDepositViaEmailSyndication-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_049_Lead_NTBDepositViaEmailSyndication-");
      

	}

    @Test
	public void SC_049_TC_003() throws InterruptedException, IOException
	{
    	launchBrowser();
    	screen.ScreenshotMethod("SC_049_Lead_NTBDepositViaEmailSyndication-");
    	TestDataFromExcel.DataRead();
    	EnterUserName(db.dboracleConnection(lopm.leadid));
        EnterPassword(TestDataFromExcel.Password);
    	screen.ScreenshotMethod("SC_049_Lead_NTBDepositViaEmailSyndication-");
        LoginButtonClick();
        CheckRole();
    	screen.ScreenshotMethod("SC_049_Lead_NTBDepositViaEmailSyndication-");
        CheckRole();
        Thread.sleep(100);
        clk_leadobject();
        lopm.categoryview("Deposit-Individual");
        lopm.leadview("Assigned Leads");
        Thread.sleep(500);
        lopm.onMyBucketlead();
        Thread.sleep(500);
        screen.ScreenshotMethod("SC_049_Lead_NTBDepositViaEmailSyndication-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_049_Lead_NTBDepositViaEmailSyndication-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_049_Lead_NTBDepositViaEmailSyndication-");
        CLDLPM.CreatedNewLeadEdit();
      
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_049_Lead_NTBDepositViaEmailSyndication-");
        CAPM.selectstatuscodeappointment();
        screen.ScreenshotMethod("SC_049_Lead_NTBDepositViaEmailSyndication-");
        CAPM.PreferredDayTime();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_049_Lead_NTBDepositViaEmailSyndication-");
        lopm.saveAndProceed();
        Thread.sleep(1000);
        lopm.GetLeadId();

        screen.ScreenshotMethod("SC_049_Lead_NTBDepositViaEmailSyndication-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_049_Lead_NTBDepositViaEmailSyndication-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_049_Lead_NTBDepositViaEmailSyndication-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_049_Lead_NTBDepositViaEmailSyndication-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_049_Lead_NTBDepositViaEmailSyndication-");
	}
    
    @Test
   	public void SC_049_TC_004() throws InterruptedException, IOException
   	{
    	launchBrowser();
    	screen.ScreenshotMethod("SC_049_Lead_NTBDepositViaEmailSyndication-");
    	TestDataFromExcel.DataRead();
    		EnterUserName(db.dboracleConnection(lopm.leadid));
        EnterPassword(TestDataFromExcel.Password);
    	screen.ScreenshotMethod("SC_049_Lead_NTBDepositViaEmailSyndication-");
        LoginButtonClick();
        CheckRole();
    	screen.ScreenshotMethod("SC_049_Lead_NTBDepositViaEmailSyndication-");
        CheckRole();
        Thread.sleep(100);
        clk_leadobject();
        lopm.categoryview("Deposit-Individual");
        lopm.leadview("Assigned Leads");
        Thread.sleep(500);
        lopm.onMyBucketlead();
        Thread.sleep(500);
        screen.ScreenshotMethod("SC_049_Lead_NTBDepositViaEmailSyndication-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_049_Lead_NTBDepositViaEmailSyndication-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_049_Lead_NTBDepositViaEmailSyndication-");
        CLDLPM.CreatedNewLeadEdit();
        Thread.sleep(1000);
        
        CLDLPM.selectstatuscode();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_049_Lead_NTBDepositViaEmailSyndication-");
        Thread.sleep(300);
        screen.ScreenshotMethod("SC_049_Lead_NTBDepositViaEmailSyndication-");
        CLDLPM.dob(TestDataFromExcel.dobmonth, TestDataFromExcel.dobdate, TestDataFromExcel.dobyear);
        CLDLPM.Gender(TestDataFromExcel.Gender);
        CLDLPM.PlcaeOfBirth();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_049_Lead_NTBDepositViaEmailSyndication-");
        CLDLPM.CustomerType(TestDataFromExcel.CustomerType);
        CLDLPM.CivilStatus(TestDataFromExcel.CivilStatus);
        CLDLPM.CustomerContact(TestDataFromExcel.CustomerContact);
        CLDLPM.BusinnesSegment(TestDataFromExcel.BusinnesSegment);
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_049_Lead_NTBDepositViaEmailSyndication-");
        CLDLPM.ClientSegment(TestDataFromExcel.ClientSegment);
        screen.ScreenshotMethod("SC_049_Lead_NTBDepositViaEmailSyndication-");
        CLDLPM.SoleOwner(TestDataFromExcel.SoleOwner);
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_049_Lead_NTBDepositViaEmailSyndication-");
	}


    @Test
	public void SC_049_TC_005() throws InterruptedException, IOException
	{
       /*employed steps start */
        CLDLPM.Employeetype(TestDataFromExcel.Employeetype);
        CLDLPM.Sourceoffunds(TestDataFromExcel.SourceoffundsEmp);
        CLDLPM.employername();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_049_Lead_NTBDepositViaEmailSyndication-");
        CLDLPM.occupation(TestDataFromExcel.occupation);
        CLDLPM.IncomeRange(TestDataFromExcel.IncomeRange);
        Thread.sleep(1000);
        CLDLPM.workingsince(TestDataFromExcel.workingsincemonth, TestDataFromExcel.workingsinceyear);
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_049_Lead_NTBDepositViaEmailSyndication-");
        scrollBy();
        CLDLPM.EconomicActivity(TestDataFromExcel.EconomicActivity);
        Thread.sleep(500);
        screen.ScreenshotMethod("SC_049_Lead_NTBDepositViaEmailSyndication-");
        CLDLPM.Industry_Classification(TestDataFromExcel.Industry_Classification);
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_049_Lead_NTBDepositViaEmailSyndication-");
        CLDLPM.NatureOfWorkNEW(TestDataFromExcel.NatureOfWork);  
        Thread.sleep(1000);
        CLDLPM.forEmployment(TestDataFromExcel.forEmployment);
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_049_Lead_NTBDepositViaEmailSyndication-");
        /*employed steps end */

	}


    @Test
	public void SC_049_TC_006() throws InterruptedException, IOException
	{
        CLDLPM.IDPrrof(TestDataFromExcel.IDPrrof);
        CLDLPM.IDNumner();
        screen.ScreenshotMethod("SC_049_Lead_NTBDepositViaEmailSyndication-");
        CLDLPM.MaidanName();
        screen.ScreenshotMethod("SC_049_Lead_NTBDepositViaEmailSyndication-");
        //CLDLPM.Tin("");
        CLDLPM.AoCode(TestDataFromExcel.AoCode);
        screen.ScreenshotMethod("SC_049_Lead_NTBDepositViaEmailSyndication-");
        CLDLPM.ClickOnAddress();
        screen.ScreenshotMethod("SC_049_Lead_NTBDepositViaEmailSyndication-");
        CLDLPM.streetfied();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_049_Lead_NTBDepositViaEmailSyndication-");
        CLDLPM.Zipcode(TestDataFromExcel.Zipcode);
        screen.ScreenshotMethod("SC_049_Lead_NTBDepositViaEmailSyndication-");
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_049_Lead_NTBDepositViaEmailSyndication-");
        CLDLPM.mailingaddress(TestDataFromExcel.mailingaddress);
        screen.ScreenshotMethod("SC_049_Lead_NTBDepositViaEmailSyndication-");
        lopm.saveAndProceed();
        Thread.sleep(1000);
   	    screen.ScreenshotMethod("SC_049_Lead_NTBDepositViaEmailSyndication-");


        //LogoutButtonClick();
        }


    @Test
 	public void SC_049_TC_007() throws InterruptedException
 	{
    	 CLDLPM.clickClosePopup();
    	 screen.ScreenshotMethod("SC_049_Lead_NTBDepositViaEmailSyndication-");
         scrollBy();
         Thread.sleep(1000);
         screen.ScreenshotMethod("SC_049_Lead_NTBDepositViaEmailSyndication-");
         scrollBy();
         Thread.sleep(1000);
         screen.ScreenshotMethod("SC_049_Lead_NTBDepositViaEmailSyndication-");
         scrollBy();
         Thread.sleep(1000);
         screen.ScreenshotMethod("SC_049_Lead_NTBDepositViaEmailSyndication-");
         scrollBy();
         Thread.sleep(1000);
         screen.ScreenshotMethod("SC_049_Lead_NTBDepositViaEmailSyndication-");
         scrollBy();
         Thread.sleep(1000);
         screen.ScreenshotMethod("SC_049_Lead_NTBDepositViaEmailSyndication-");
         scrollBy();
         Thread.sleep(1000);
         screen.ScreenshotMethod("SC_049_Lead_NTBDepositViaEmailSyndication-");
         CLDLPM.clickCRRSCButton();
         Thread.sleep(1000);
         screen.ScreenshotMethod("SC_049_Lead_NTBDepositViaEmailSyndication-");
    	//CLDLPM.leadredbutton();


        /*  // OLD CRRSC
     	CRRSC.AmlcUnJmf(TestDataFromExcel.AmlcUnJmf);
     	CRRSC.BankInternalChecklist(TestDataFromExcel.BankInternalChecklist);
     	CRRSC.AllegedPerdsonf(TestDataFromExcel.AllegedPerdsonf);
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_049_Lead_NTBDepositViaEmailSyndication-");
     	CRRSC.HPIOrJoint(TestDataFromExcel.HPIOrJoint);
     	CRRSC.BenifOFW(TestDataFromExcel.BenifOFW);
     	CRRSC.ForeignNational(TestDataFromExcel.ForeignNational);
     	CRRSC.NumberAccount(TestDataFromExcel.NeumberAccount);
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_049_Lead_NTBDepositViaEmailSyndication-");
     	CRRSC.EmploymentTypeCRRSC(TestDataFromExcel.EmploymentTypeCRRSC);
     	CRRSC.IndustryCRRSC(TestDataFromExcel.IndustryCRRSC);
     	Thread.sleep(1000);
        screen.ScreenshotMethod("SC_049_Lead_NTBDepositViaEmailSyndication-");
     	//CRRSC.EconomicActivityCRRSC(TestDataFromExcel.EconmicactivityeCRRSC);
        //Thread.sleep(1000);
     	CRRSC.ManagerialCRRSC(TestDataFromExcel.managerialCRRSC);
     	CRRSC.DirectDealingCRRSC(TestDataFromExcel.DirectDealingCRRSC);
     	Thread.sleep(1000);
        screen.ScreenshotMethod("SC_049_Lead_NTBDepositViaEmailSyndication-");
        Thread.sleep(1000);
     	CRRSC.CityCRRSC(TestDataFromExcel.CityCRRSC);
     	//CRRSC.ProvinceCRRSC(TestDataFromExcel.ProvinceCRRSC);
     	//CRRSC.RiskCRRSC(TestDataFromExcel.RiskCRRSC);
     	Thread.sleep(1000);
        screen.ScreenshotMethod("SC_049_Lead_NTBDepositViaEmailSyndication-");
     	CRRSC.vicinityRRSC(TestDataFromExcel.vicinityRRSC);

        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_049_Lead_NTBDepositViaEmailSyndication-");
     	CRRSC.intialdepositeRRSC(TestDataFromExcel.intialdepositeRRSC);

     	CRRSC.InwprdOutwordRRSC(TestDataFromExcel.InwprdOutwordRRSC);

        Thread.sleep(1000);
     	CRRSC.customerdeclaredCRRSC(TestDataFromExcel.customerdeclaredCRRSC);



        screen.ScreenshotMethod("SC_049_Lead_NTBDepositViaEmailSyndication-");
     	CRRSC.ComfortableInformationRRSC(TestDataFromExcel.ComfortableInformationRRSC);
     	CRRSC.ComfortableDocumentsRRSC(TestDataFromExcel.ComfortableDocumentsRRSC);
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_049_Lead_NTBDepositViaEmailSyndication-");
        */


         //New CRRSC
         CRRSC.AmlcUnJmf(TestDataFromExcel.AmlcUnJmf);
         CRRSC.HPIOrJoint(TestDataFromExcel.HPIOrJoint);
         screen.ScreenshotMethod("SC_049_Lead_NTBDepositViaEmailSyndication-");
         CRRSC.BenifOFW(TestDataFromExcel.BenifOFW);
         CRRSC.PrpsOfAccntOpning(TestDataFromExcel.PrpsOfAccntOpning);
         CRRSC.Sbol(TestDataFromExcel.Sbol);
         screen.ScreenshotMethod("SC_049_Lead_NTBDepositViaEmailSyndication-");
         CRRSC.OtherRskFctr(TestDataFromExcel.OtherRskFctr);
         CRRSC.RemarksCRRSC("I am Indian!");
         screen.ScreenshotMethod("SC_049_Lead_NTBDepositViaEmailSyndication-");
         CRRSC.Finish();

         Thread.sleep(1000);
 	}

    @Test
 	public void SC_049_TC_008() throws InterruptedException
 	{
    	Thread.sleep(1000);
   	    CLDLPM.clickClosePopup();
    	screen.ScreenshotMethod("SC_049_Lead_NTBDepositViaEmailSyndication-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_049_Lead_NTBDepositViaEmailSyndication-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_049_Lead_NTBDepositViaEmailSyndication-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_049_Lead_NTBDepositViaEmailSyndication-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_049_Lead_NTBDepositViaEmailSyndication-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_049_Lead_NTBDepositViaEmailSyndication-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_049_Lead_NTBDepositViaEmailSyndication-");
        lopm.ClickOnCRRSCtab();
        Thread.sleep(2000);
        screen.ScreenshotMethod("SC_049_Lead_NTBDepositViaEmailSyndication-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_049_Lead_NTBDepositViaEmailSyndication-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_049_Lead_NTBDepositViaEmailSyndication-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_049_Lead_NTBDepositViaEmailSyndication-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_049_Lead_NTBDepositViaEmailSyndication-");
    	CLDLPM.CreatedNewLeadEdit();
        Thread.sleep(1000);
    	CLDLPM.clickEditOFAC(TestDataFromExcel.Ofac);
    	Thread.sleep(1000);
        screen.ScreenshotMethod("SC_049_Lead_NTBDepositViaEmailSyndication-");
    	lopm.saveAndProceed();
    	Thread.sleep(1000);
    	screen.ScreenshotMethod("SC_049_Lead_NTBDepositViaEmailSyndication-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_049_Lead_NTBDepositViaEmailSyndication-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_049_Lead_NTBDepositViaEmailSyndication-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_049_Lead_NTBDepositViaEmailSyndication-");

 	}

    @Test
 	public void SC_049_TC_009() throws InterruptedException
 	{
    	Thread.sleep(500);
    	scrolldown();
        screen.ScreenshotMethod("SC_049_Lead_NTBDepositViaEmailSyndication-");
        FAIPM.ClickFillAccountInformation();
        FAIPM.RequestType(TestDataFromExcel.RequestTypef);
        FAIPM.Purposeofaccountopening(TestDataFromExcel.Purposeofaccountopening);
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_049_Lead_NTBDepositViaEmailSyndication-");
        FAIPM.ADBRequired(TestDataFromExcel.ADBRequired);
        screen.ScreenshotMethod("SC_049_Lead_NTBDepositViaEmailSyndication-");
        FAIPM.PromsEmail(TestDataFromExcel.PromsEmail);
        FAIPM.sel_PromsSMS(TestDataFromExcel.PromsSMS);
        FAIPM.TransactionalEmail(TestDataFromExcel.TransactionalEmail);
        FAIPM.TransactionalSMS(TestDataFromExcel.TransactionalSMS);
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_049_Lead_NTBDepositViaEmailSyndication-");
        CRRSC.Finish();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_049_Lead_NTBDepositViaEmailSyndication-");
        Thread.sleep(1000);

 	}


    @Test
 	public void SC_049_TC_010() throws InterruptedException
 	{
    	Thread.sleep(1000);
        screen.ScreenshotMethod("SC_049_Lead_NTBDepositViaEmailSyndication-");
        lopm.ProcessApplication();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_049_Lead_NTBDepositViaEmailSyndication-");
        lopm.ProcessApplicationPopUpClose();
        Thread.sleep(2000);
        scrollToTop();
        lopm.GetLeadId();
        lopm.waitTillAccountOpen();

        screen.ScreenshotMethod("SC_049_Lead_NTBDepositViaEmailSyndication-");
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


