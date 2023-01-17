package BUSINESSNEXT.SBCGOLD8.TESTSCENARIOS;

import java.io.IOException;

import org.testng.annotations.Test;
import BUSINESSNEXT.SBCGOLD8.COMMON.*;
import BUSINESSNEXT.SBCGOLD8.METHOD.*;
/*Customer Joint Onboarding process for NTB employed Indidvidual
SC_032_Lead_ETB_NTBJointEmployed.java
To run on G7 please change nature of work field and uncomment the CRRSC section
*/

//screen shot using listner class
//@Listeners(crm.mhc.common.ListnersClassAnotation.class)
public class SC_036_Lead_NTB_ETBJointEmployed extends HomePageMethod {

	// Object for methods class
	CustomerSerachPageMethod cspm = new CustomerSerachPageMethod();
	LeadObjectPageMethod lopm = new LeadObjectPageMethod();
	IndividualSalesJourneyPageMethod NTBSJPM = new IndividualSalesJourneyPageMethod();
	CollectDocsLeadPageMethod CLDLPM = new CollectDocsLeadPageMethod();
	TestDataFromExcel TDFX = new TestDataFromExcel();
	CRRSCLeadPageMethod CRRSC = new CRRSCLeadPageMethod();
	Screenshot screen = new Screenshot();
	FillAccountInformationPageMethod FAIPM = new FillAccountInformationPageMethod();

	@Test
	public void SC_006_TC_001() throws Exception {

		launchBrowser();
    	screen.ScreenshotMethod("SC_036_Lead_NTB_ETBJointEmployed-");
    	TestDataFromExcel.DataRead();
 		EnterUserName(TestDataFromExcel.UserName_CA);
        EnterPassword(TestDataFromExcel.Password);
    	screen.ScreenshotMethod("SC_036_Lead_NTB_ETBJointEmployed-");
        LoginButtonClick();
        CheckRole();
    	screen.ScreenshotMethod("SC_036_Lead_NTB_ETBJointEmployed-");
        ClickOnsaleswidget();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_036_Lead_NTB_ETBJointEmployed-");
        ClickOnsalesJouney();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_036_Lead_NTB_ETBJointEmployed-");
        lopm.ClickOnOnBoardingJourney();
        cspm.ClickOnOnBoardingJourneynext();
        Thread.sleep(1000);
	}


    @Test(priority=2)
	public void SC_021_TC_002() throws InterruptedException, IOException
	{
        NTBSJPM.SalutationID(TestDataFromExcel.SalutationID);
        NTBSJPM.EnterFirstName();
        NTBSJPM.EnterlastName();
        NTBSJPM.EntermiddleName();
        NTBSJPM.EnterMobile();
        screen.ScreenshotMethod("SC_036_Lead_NTB_ETBJointEmployed-");

        NTBSJPM.NTBJourneynext1();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_036_Lead_NTB_ETBJointEmployed-");
        NTBSJPM.ProductCategory(TestDataFromExcel.ProductCategory);
        Thread.sleep(500);
        NTBSJPM.Product(TestDataFromExcel.Product);
        screen.ScreenshotMethod("SC_036_Lead_NTB_ETBJointEmployed-");
        NTBSJPM.NTBJourneynext2();
        Thread.sleep(1000);
        System.out.print("Primary ");
        lopm.GetLeadId();

    	screen.ScreenshotMethod("SC_036_Lead_NTB_ETBJointEmployed-");
        scrollBy();
        Thread.sleep(1000);
    	screen.ScreenshotMethod("SC_036_Lead_NTB_ETBJointEmployed-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_036_Lead_NTB_ETBJointEmployed-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_036_Lead_NTB_ETBJointEmployed-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_036_Lead_NTB_ETBJointEmployed-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_036_Lead_NTB_ETBJointEmployed-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_036_Lead_NTB_ETBJointEmployed-");
        CLDLPM.CreatedNewLeadEdit();
        Thread.sleep(1000);

	}

    @Test(priority=3)
	public void SC_021_TC_003() throws InterruptedException, IOException
	{
        CLDLPM.selectstatuscode();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_036_Lead_NTB_ETBJointEmployed-");
        CLDLPM.Enteremail();
        Thread.sleep(300);
        screen.ScreenshotMethod("SC_036_Lead_NTB_ETBJointEmployed-");
        CLDLPM.dob(TestDataFromExcel.dobmonth, TestDataFromExcel.dobdate, TestDataFromExcel.dobyear);
        CLDLPM.Gender(TestDataFromExcel.Gender);
        CLDLPM.PlcaeOfBirth();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_036_Lead_NTB_ETBJointEmployed-");
        CLDLPM.CustomerType(TestDataFromExcel.CustomerType);
        CLDLPM.CivilStatus(TestDataFromExcel.CivilStatus);
        CLDLPM.CustomerContact(TestDataFromExcel.CustomerContact);
        CLDLPM.BusinnesSegment(TestDataFromExcel.BusinnesSegment);
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_036_Lead_NTB_ETBJointEmployed-");
        CLDLPM.ClientSegment(TestDataFromExcel.ClientSegment);
        screen.ScreenshotMethod("SC_036_Lead_NTB_ETBJointEmployed-");
        //Joint fields
        CLDLPM.SoleOwner("No");
        Thread.sleep(1000);
        CLDLPM.CustomerRelationship("And");
        Thread.sleep(500);
        screen.ScreenshotMethod("SC_036_Lead_NTB_ETBJointEmployed-");
        CLDLPM.OnlyBBNRequired("No");
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_036_Lead_NTB_ETBJointEmployed-");
	}


    @Test(priority=4)
	public void SC_021_TC_004() throws InterruptedException, IOException
	{
       /*employed steps start */
        CLDLPM.Employeetype(TestDataFromExcel.Employeetype);
        CLDLPM.Sourceoffunds(TestDataFromExcel.SourceoffundsEmp);
        CLDLPM.employername();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_036_Lead_NTB_ETBJointEmployed-");
        CLDLPM.occupation(TestDataFromExcel.occupation);
        CLDLPM.IncomeRange(TestDataFromExcel.IncomeRange);
        Thread.sleep(1000);
        CLDLPM.workingsince(TestDataFromExcel.workingsincemonth, TestDataFromExcel.workingsinceyear);
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_036_Lead_NTB_ETBJointEmployed-");
        scrollBy();
        CLDLPM.EconomicActivity(TestDataFromExcel.EconomicActivity);
        Thread.sleep(500);
        screen.ScreenshotMethod("SC_036_Lead_NTB_ETBJointEmployed-");
        CLDLPM.Industry_Classification(TestDataFromExcel.Industry_Classification);
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_036_Lead_NTB_ETBJointEmployed-");
        CLDLPM.NatureOfWorkNEW(TestDataFromExcel.NatureOfWork);  // remove New to run on g7
        Thread.sleep(1000);
        CLDLPM.forEmployment(TestDataFromExcel.forEmployment);
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_036_Lead_NTB_ETBJointEmployed-");
        /*employed steps end */

	}


    @Test(priority=5)
	public void SC_021_TC_005() throws InterruptedException, IOException
	{
        CLDLPM.IDPrrof(TestDataFromExcel.IDPrrof);
        CLDLPM.IDNumner();
        screen.ScreenshotMethod("SC_036_Lead_NTB_ETBJointEmployed-");
        CLDLPM.MaidanName();
        screen.ScreenshotMethod("SC_036_Lead_NTB_ETBJointEmployed-");
        //CLDLPM.Tin("");
        CLDLPM.AoCode(TestDataFromExcel.AoCode);
        screen.ScreenshotMethod("SC_036_Lead_NTB_ETBJointEmployed-");
        CLDLPM.ClickOnAddress();
        screen.ScreenshotMethod("SC_036_Lead_NTB_ETBJointEmployed-");
        CLDLPM.streetfied();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_036_Lead_NTB_ETBJointEmployed-");
        CLDLPM.Zipcode(TestDataFromExcel.Zipcode);
        screen.ScreenshotMethod("SC_036_Lead_NTB_ETBJointEmployed-");
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_036_Lead_NTB_ETBJointEmployed-");
        CLDLPM.mailingaddress(TestDataFromExcel.mailingaddress);
        screen.ScreenshotMethod("SC_036_Lead_NTB_ETBJointEmployed-");
        lopm.saveAndProceed();
        Thread.sleep(1000);
   	    screen.ScreenshotMethod("SC_036_Lead_NTB_ETBJointEmployed-");


        //LogoutButtonClick();
        }


    @Test(priority=6)
 	public void SC_021_TC_006() throws InterruptedException
 	{
    	 CLDLPM.clickClosePopup();
    	 screen.ScreenshotMethod("SC_036_Lead_NTB_ETBJointEmployed-");
         scrollBy();
         Thread.sleep(1000);
         screen.ScreenshotMethod("SC_036_Lead_NTB_ETBJointEmployed-");
         scrollBy();
         Thread.sleep(1000);
         screen.ScreenshotMethod("SC_036_Lead_NTB_ETBJointEmployed-");
         scrollBy();
         Thread.sleep(1000);
         screen.ScreenshotMethod("SC_036_Lead_NTB_ETBJointEmployed-");
         scrollBy();
         Thread.sleep(1000);
         screen.ScreenshotMethod("SC_036_Lead_NTB_ETBJointEmployed-");
         scrollBy();
         Thread.sleep(1000);
         screen.ScreenshotMethod("SC_036_Lead_NTB_ETBJointEmployed-");
         scrollBy();
         Thread.sleep(1000);
         screen.ScreenshotMethod("SC_036_Lead_NTB_ETBJointEmployed-");
         CLDLPM.clickCRRSCButton();
         Thread.sleep(1000);
         screen.ScreenshotMethod("SC_036_Lead_NTB_ETBJointEmployed-");
    	//CLDLPM.leadredbutton();


      /*  //   OLD CRRSC
     	CRRSC.AmlcUnJmf(TestDataFromExcel.AmlcUnJmf);
     	CRRSC.BankInternalChecklist(TestDataFromExcel.BankInternalChecklist);
     	CRRSC.AllegedPerdsonf(TestDataFromExcel.AllegedPerdsonf);
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_036_Lead_NTB_ETBJointEmployed-");
     	CRRSC.HPIOrJoint(TestDataFromExcel.HPIOrJoint);
     	CRRSC.BenifOFW(TestDataFromExcel.BenifOFW);
     	CRRSC.ForeignNational(TestDataFromExcel.ForeignNational);
     	CRRSC.NumberAccount(TestDataFromExcel.NeumberAccount);
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_036_Lead_NTB_ETBJointEmployed-");
     	CRRSC.EmploymentTypeCRRSC(TestDataFromExcel.EmploymentTypeCRRSC);
     	CRRSC.IndustryCRRSC(TestDataFromExcel.IndustryCRRSC);
     	Thread.sleep(1000);
        screen.ScreenshotMethod("SC_036_Lead_NTB_ETBJointEmployed-");
     	//CRRSC.EconomicActivityCRRSC(TestDataFromExcel.EconmicactivityeCRRSC);
        //Thread.sleep(1000);
     	CRRSC.ManagerialCRRSC(TestDataFromExcel.managerialCRRSC);
     	CRRSC.DirectDealingCRRSC(TestDataFromExcel.DirectDealingCRRSC);
     	Thread.sleep(1000);
        screen.ScreenshotMethod("SC_036_Lead_NTB_ETBJointEmployed-");
        Thread.sleep(1000);
     	CRRSC.CityCRRSC(TestDataFromExcel.CityCRRSC);
     	//CRRSC.ProvinceCRRSC(TestDataFromExcel.ProvinceCRRSC);
     	//CRRSC.RiskCRRSC(TestDataFromExcel.RiskCRRSC);
     	Thread.sleep(1000);
        screen.ScreenshotMethod("SC_036_Lead_NTB_ETBJointEmployed-");
     	CRRSC.vicinityRRSC(TestDataFromExcel.vicinityRRSC);

        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_036_Lead_NTB_ETBJointEmployed-");
     	CRRSC.intialdepositeRRSC(TestDataFromExcel.intialdepositeRRSC);

     	CRRSC.InwprdOutwordRRSC(TestDataFromExcel.InwprdOutwordRRSC);

        Thread.sleep(1000);
     	CRRSC.customerdeclaredCRRSC(TestDataFromExcel.customerdeclaredCRRSC);



        screen.ScreenshotMethod("SC_036_Lead_NTB_ETBJointEmployed-");
     	CRRSC.ComfortableInformationRRSC(TestDataFromExcel.ComfortableInformationRRSC);
     	CRRSC.ComfortableDocumentsRRSC(TestDataFromExcel.ComfortableDocumentsRRSC);
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_036_Lead_NTB_ETBJointEmployed-");
*/


         //New CRRSC
         CRRSC.AmlcUnJmf(TestDataFromExcel.AmlcUnJmf);
         CRRSC.HPIOrJoint(TestDataFromExcel.HPIOrJoint);
         screen.ScreenshotMethod("SC_036_Lead_NTB_ETBJointEmployed-");
         CRRSC.BenifOFW(TestDataFromExcel.BenifOFW);
         CRRSC.PrpsOfAccntOpning(TestDataFromExcel.PrpsOfAccntOpning);
         CRRSC.Sbol(TestDataFromExcel.Sbol);
         screen.ScreenshotMethod("SC_036_Lead_NTB_ETBJointEmployed-");
         CRRSC.OtherRskFctr(TestDataFromExcel.OtherRskFctr);

         
         CRRSC.RemarksCRRSC("I am Indian!");
         screen.ScreenshotMethod("SC_036_Lead_NTB_ETBJointEmployed-");
         CRRSC.Finish();

         Thread.sleep(1000);
 	}

    @Test(priority=7)
 	public void SC_021_TC_007() throws InterruptedException
 	{
    	Thread.sleep(1000);
   	    CLDLPM.clickClosePopup();
    	screen.ScreenshotMethod("SC_036_Lead_NTB_ETBJointEmployed-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_036_Lead_NTB_ETBJointEmployed-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_036_Lead_NTB_ETBJointEmployed-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_036_Lead_NTB_ETBJointEmployed-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_036_Lead_NTB_ETBJointEmployed-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_036_Lead_NTB_ETBJointEmployed-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_036_Lead_NTB_ETBJointEmployed-");
        lopm.ClickOnCRRSCtab();
        Thread.sleep(2000);
        screen.ScreenshotMethod("SC_036_Lead_NTB_ETBJointEmployed-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_036_Lead_NTB_ETBJointEmployed-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_036_Lead_NTB_ETBJointEmployed-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_036_Lead_NTB_ETBJointEmployed-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_036_Lead_NTB_ETBJointEmployed-");
    	CLDLPM.CreatedNewLeadEdit();
        Thread.sleep(1000);
    	CLDLPM.clickEditOFAC(TestDataFromExcel.Ofac);
    	Thread.sleep(1000);
        screen.ScreenshotMethod("SC_036_Lead_NTB_ETBJointEmployed-");
    	lopm.saveAndProceed();
    	Thread.sleep(1000);
    	screen.ScreenshotMethod("SC_036_Lead_NTB_ETBJointEmployed-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_036_Lead_NTB_ETBJointEmployed-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_036_Lead_NTB_ETBJointEmployed-");
        scrollBy();
        Thread.sleep(1000);
        screen.ScreenshotMethod("SC_036_Lead_NTB_ETBJointEmployed-");

 	}

	@Test(priority = 8)
	public void SC_021_TC_008() throws InterruptedException {
		CLDLPM.clickaddScndryLeadButton();
		//lopm.SwitchToSecondaryWindow();
		NTBSJPM.SalutationID(TestDataFromExcel.SalutationID);
		NTBSJPM.EnterFirstName();
		NTBSJPM.EnterlastName();
		NTBSJPM.EntermiddleName();
		NTBSJPM.EnterMobile("66666");
		NTBSJPM.NTBJourneynext2();
		Thread.sleep(2000);
		NTBSJPM.chooseDedupe();
		screen.ScreenshotMethod("SC_036_Lead_NTB_ETBJointEmployed-");
		lopm.bttnUpdateCreate();
		Thread.sleep(3000);
		System.out.print("Child ");
		Thread.sleep(2000);
		lopm.GetLeadId();

		screen.ScreenshotMethod("SC_036_Lead_NTB_ETBJointEmployed-");
		scrollBy();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_036_Lead_NTB_ETBJointEmployed-");
		scrollBy();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_036_Lead_NTB_ETBJointEmployed-");
		scrollBy();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_036_Lead_NTB_ETBJointEmployed-");
		scrollBy();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_036_Lead_NTB_ETBJointEmployed-");
		scrollBy();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_036_Lead_NTB_ETBJointEmployed-");
		scrollBy();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_036_Lead_NTB_ETBJointEmployed-");
		// NTBSJPM.NTBignoreandCreate();
		CLDLPM.CheckEmployeetype();
		Thread.sleep(500);
		lopm.ClickOnAddresstab();
		Thread.sleep(500);
		screen.ScreenshotMethod("SC_036_Lead_NTB_ETBJointEmployed-");
		scrollBy();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_036_Lead_NTB_ETBJointEmployed-");
		scrollBy();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_036_Lead_NTB_ETBJointEmployed-");
		CLDLPM.CreatedNewLeadEdit();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_036_Lead_NTB_ETBJointEmployed-");
		CLDLPM.selectstatuscode();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_036_Lead_NTB_ETBJointEmployed-");
		

		/*
		 * CLDLPM.businessname(); CLDLPM.forEmployment(TestDataFromExcel.forEmployment);
		 * Thread.sleep(2000);
		 */

		if (CollectDocsLeadPageMethod.Employeetype.equals("Self-Employed")) {

			CLDLPM.businessname();
			CLDLPM.Sourceoffunds("Business");
			CLDLPM.forEmployment(TestDataFromExcel.forEmployment);
			Thread.sleep(1000);
			screen.ScreenshotMethod("SC_036_Lead_NTB_ETBJointEmployed-");
			CLDLPM.NatureOfWorkNEW(TestDataFromExcel.NatureOfWork);

			Thread.sleep(2000);
			System.out.println("EmployeeType is self-employed");

		} else if (CollectDocsLeadPageMethod.Employeetype.equals("Unemployed"))

		{
			CLDLPM.Sourceoffunds("Inheritance");
			screen.ScreenshotMethod("SC_036_Lead_NTB_ETBJointEmployed-");
			Thread.sleep(1000);
			System.out.println("EmployeeType is unemployed");
		} else if (CollectDocsLeadPageMethod.Employeetype.equals("Employed")) {
			CLDLPM.employername();
			CLDLPM.Sourceoffunds("Salary");
			Thread.sleep(1000);
			screen.ScreenshotMethod("SC_036_Lead_NTB_ETBJointEmployed-");
			//CLDLPM.workingsince(TestDataFromExcel.workingsincemonth, TestDataFromExcel.workingsinceyear);
			Thread.sleep(1000);
			CLDLPM.forEmployment(TestDataFromExcel.forEmployment);
			Thread.sleep(1000);

			CLDLPM.NatureOfWorkNEW(TestDataFromExcel.NatureOfWork);
			Thread.sleep(1000);
			screen.ScreenshotMethod("SC_036_Lead_NTB_ETBJointEmployed-");
			System.out.println("EmployeeType is Employed");
			CLDLPM.IDPrrof(TestDataFromExcel.IDPrrof);
			CLDLPM.IDNumner();
			screen.ScreenshotMethod("TC_005_LeadDocsCollectedSelfEmployed");
			Thread.sleep(2000);
			Thread.sleep(2000);
			CLDLPM.ClickOnAddress();
			Thread.sleep(1000);
			screen.ScreenshotMethod("SC_036_Lead_NTB_ETBJointEmployed-");
			CLDLPM.PermanentAddresssameasPresentAddress(TestDataFromExcel.PermanentAddresssameasPresentAddress);
			Thread.sleep(1000);
			screen.ScreenshotMethod("SC_036_Lead_NTB_ETBJointEmployed-");
			lopm.saveAndProceed();
			Thread.sleep(1000);
			screen.ScreenshotMethod("SC_036_Lead_NTB_ETBJointEmployed-");
			Thread.sleep(3000);

			/*
			 * try{driver.findElement(By.xpath("//button[@type = 'button'][1]")).click();
			 * System.out.println("case dedupe fired");}
			 *
			 *
			 * catch(NoSuchElementException e) { System.out.println("no case dedupe");
			 */
			NTBSJPM.CaseDedupeOnDocsLead();
			Thread.sleep(1000);
			CLDLPM.clickClosePopup();
			screen.ScreenshotMethod("SC_036_Lead_NTB_ETBJointEmployed-");
			CLDLPM.CreatedNewLeadEdit();
			Thread.sleep(1000);
			CLDLPM.clickEditOFAC(TestDataFromExcel.Ofac);
			Thread.sleep(1000);
			screen.ScreenshotMethod("SC_036_Lead_NTB_ETBJointEmployed-");
			lopm.saveAndProceed();
			Thread.sleep(1000);
			screen.ScreenshotMethod("SC_036_Lead_NTB_ETBJointEmployed-");
			NTBSJPM.CaseDedupeOnDocsLead();
			Thread.sleep(2000);
			screen.ScreenshotMethod("SC_036_Lead_NTB_ETBJointEmployed-");
			scrollBy();
			Thread.sleep(1000);
			screen.ScreenshotMethod("SC_036_Lead_NTB_ETBJointEmployed-");
			scrollBy();
			Thread.sleep(1000);
			screen.ScreenshotMethod("SC_036_Lead_NTB_ETBJointEmployed-");
			scrollBy();
			Thread.sleep(1000);
			screen.ScreenshotMethod("SC_036_Lead_NTB_ETBJointEmployed-");
			Thread.sleep(500);
			lopm.ClickOnUpdtButton();
			Thread.sleep(500);
			screen.ScreenshotMethod("SC_036_Lead_NTB_ETBJointEmployed-");
			lopm.popupdate360("Yes");
			Thread.sleep(1000);
			screen.ScreenshotMethod("SC_036_Lead_NTB_ETBJointEmployed-");
			lopm.update360();
			Thread.sleep(1000);
			screen.ScreenshotMethod("SC_036_Lead_NTB_ETBJointEmployed-");
			scrolldown();
			screen.ScreenshotMethod("SC_036_Lead_NTB_ETBJointEmployed-");
			Thread.sleep(1000);
			screen.ScreenshotMethod("SC_036_Lead_NTB_ETBJointEmployed-");
			lopm.ProcessApplication();
			Thread.sleep(1000);
			screen.ScreenshotMethod("SC_036_Lead_NTB_ETBJointEmployed-");
			lopm.ProcessApplicationPopUpClose();
			Thread.sleep(3000);
			screen.ScreenshotMethod("SC_036_Lead_NTB_ETBJointEmployed-");
			lopm.waitTillAccountOpen();
			screen.ScreenshotMethod("SC_036_Lead_NTB_ETBJointEmployed-");
			
		}
	}

	@Test(priority = 9)
	public void SC_021_TC_009() throws InterruptedException {
		lopm.goToParentLead();
		Refresh();
		Thread.sleep(500);
		screen.ScreenshotMethod("SC_036_Lead_NTB_ETBJointEmployed-");
		scrolldown();
		screen.ScreenshotMethod("SC_036_Lead_NTB_ETBJointEmployed-");
		FAIPM.ClickFillAccountInformation();
		FAIPM.RequestType(TestDataFromExcel.RequestTypef);
		FAIPM.Purposeofaccountopening(TestDataFromExcel.Purposeofaccountopening);
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_036_Lead_NTB_ETBJointEmployed-");
		FAIPM.ADBRequired(TestDataFromExcel.ADBRequired);
		screen.ScreenshotMethod("SC_036_Lead_NTB_ETBJointEmployed-");
		FAIPM.PromsEmail(TestDataFromExcel.PromsEmail);
		FAIPM.sel_PromsSMS(TestDataFromExcel.PromsSMS);
		FAIPM.TransactionalEmail(TestDataFromExcel.TransactionalEmail);
		FAIPM.TransactionalSMS(TestDataFromExcel.TransactionalSMS);
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_036_Lead_NTB_ETBJointEmployed-");
		CRRSC.Finish();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_036_Lead_NTB_ETBJointEmployed-");
		Thread.sleep(1000);

	}

	@Test(priority = 10)
	public void SC_021_TC_010() throws InterruptedException {
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_036_Lead_NTB_ETBJointEmployed-");
		lopm.ProcessApplication();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_036_Lead_NTB_ETBJointEmployed-");
		lopm.ProcessApplicationPopUpClose();
		Thread.sleep(3000);
		screen.ScreenshotMethod("SC_036_Lead_NTB_ETBJointEmployed-");
		lopm.waitTillAccountOpen();
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
