package BUSINESSNEXT.SBCGOLD8.TESTSCENARIOS;

import java.io.IOException;

import org.testng.annotations.Test;
import BUSINESSNEXT.SBCGOLD8.COMMON.*;
import BUSINESSNEXT.SBCGOLD8.METHOD.*;
/*Customer Joint Onboarding process for NTB employed Indidvidual
SC_032_Lead_ETB_NTBJointEmployed.java3
To run on G7 please change nature of work field and uncomment the CRRSC section
*/

//screen shot using listner class
//@Listeners(crm.mhc.common.ListnersClassAnotation.class)
public class SC_032_Lead_ETB_NTBJointEmployed extends HomePageMethod {

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
	public void SC_032_TC_001() throws Exception {

		launchBrowser();
		screen.ScreenshotMethod("SC_032_Lead_ETB_NTBJointEmployed-");
		TestDataFromExcel.DataRead();
		Thread.sleep(500);
		screen.ScreenshotMethod("SC_032_Lead_ETB_NTBJointEmployed-");
		EnterUserName(TestDataFromExcel.UserName_CA);
		EnterPassword(TestDataFromExcel.Password);
		screen.ScreenshotMethod("SC_032_Lead_ETB_NTBJointEmployed-");
		LoginButtonClick();
		CheckRole();
		Thread.sleep(500);
		screen.ScreenshotMethod("SC_032_Lead_ETB_NTBJointEmployed-");
		CheckRole();
		Thread.sleep(100);
		ClickOnsaleswidget();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_032_Lead_ETB_NTBJointEmployed-");
		ClickOnsalesJouney();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_032_Lead_ETB_NTBJointEmployed-");
		lopm.ClickOnOnBoardingJourney();
		cspm.BBNFillForCustomerSearch(TestDataFromExcel.BBN);
		Thread.sleep(1000);
		cspm.ClickOnOnBoardingJourneynext();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_032_Lead_ETB_NTBJointEmployed-");
		cspm.ChooseBBNfromList();
		Thread.sleep(2000);
		screen.ScreenshotMethod("SC_032_Lead_ETB_NTBJointEmployed-");
		cspm.clickstartjourney();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_032_Lead_ETB_NTBJointEmployed-");
		cspm.ETBIndividualSalesJorney();
		// cspm.clickonredbutton();
		// cspm.ClickOnOnBoardingJourneynext2();
		Thread.sleep(2000);
		screen.ScreenshotMethod("SC_032_Lead_ETB_NTBJointEmployed-");

	}

	@Test
	public void SC_032_TC_002() throws Exception {

		NTBSJPM.LeadRating("Hot");
		screen.ScreenshotMethod("SC_032_Lead_ETB_NTBJointEmployed-");
		NTBSJPM.NTBJourneynext1();
		Thread.sleep(1000);
		NTBSJPM.ProductCategory(TestDataFromExcel.ProductCategory);
		Thread.sleep(500);
		NTBSJPM.Product(TestDataFromExcel.Product);
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_032_Lead_ETB_NTBJointEmployed-");
		NTBSJPM.NTBJourneynext2();
		Thread.sleep(2000);
		lopm.GetLeadId();

		screen.ScreenshotMethod("SC_032_Lead_ETB_NTBJointEmployed-");
		scrollBy();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_032_Lead_ETB_NTBJointEmployed-");
		scrollBy();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_032_Lead_ETB_NTBJointEmployed-");
		scrollBy();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_032_Lead_ETB_NTBJointEmployed-");
		scrollBy();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_032_Lead_ETB_NTBJointEmployed-");
		scrollBy();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_032_Lead_ETB_NTBJointEmployed-");
		scrollBy();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_032_Lead_ETB_NTBJointEmployed-");
		// NTBSJPM.NTBignoreandCreate();
		CLDLPM.CheckEmployeetype();
		Thread.sleep(500);
		lopm.ClickOnAddresstab();
		Thread.sleep(500);
		screen.ScreenshotMethod("SC_032_Lead_ETB_NTBJointEmployed-");
		scrollBy();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_032_Lead_ETB_NTBJointEmployed-");
		scrollBy();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_032_Lead_ETB_NTBJointEmployed-");
		CLDLPM.CreatedNewLeadEdit();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_032_Lead_ETB_NTBJointEmployed-");
	}

	@Test
	public void SC_032_TC_003() throws InterruptedException, IOException {
		CLDLPM.selectstatuscode();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_032_Lead_ETB_NTBJointEmployed-");
		CLDLPM.SoleOwner("No");
		Thread.sleep(1000);
		CLDLPM.CustomerRelationship("And");
		screen.ScreenshotMethod("SC_032_Lead_ETB_NTBJointEmployed-");

		/*
		 * CLDLPM.businessname(); CLDLPM.forEmployment(TestDataFromExcel.forEmployment);
		 * Thread.sleep(2000);
		 */

		if (CollectDocsLeadPageMethod.Employeetype.equals("Self-Employed")) {

			CLDLPM.businessname();
			CLDLPM.Sourceoffunds("Business");
			CLDLPM.forEmployment(TestDataFromExcel.forEmployment);
			Thread.sleep(1000);
			screen.ScreenshotMethod("SC_032_Lead_ETB_NTBJointEmployed-");
			CLDLPM.NatureOfWorkNEW(TestDataFromExcel.NatureOfWork);

			Thread.sleep(2000);
			System.out.println("EmployeeType is self-employed");

		} else if (CollectDocsLeadPageMethod.Employeetype.equals("Unemployed"))

		{
			CLDLPM.Sourceoffunds("Inheritance");
			screen.ScreenshotMethod("SC_032_Lead_ETB_NTBJointEmployed-");
			Thread.sleep(1000);
			System.out.println("EmployeeType is unemployed");
		} else if (CollectDocsLeadPageMethod.Employeetype.equals("Employed")) {
			CLDLPM.employername();
			CLDLPM.Sourceoffunds("Salary");
			Thread.sleep(1000);
			screen.ScreenshotMethod("SC_032_Lead_ETB_NTBJointEmployed-");
			CLDLPM.workingsince(TestDataFromExcel.workingsincemonth, TestDataFromExcel.workingsinceyear);
			Thread.sleep(1000);
			CLDLPM.forEmployment(TestDataFromExcel.forEmployment);
			Thread.sleep(1000);

			CLDLPM.NatureOfWorkNEW(TestDataFromExcel.NatureOfWork);
			Thread.sleep(1000);
			screen.ScreenshotMethod("SC_032_Lead_ETB_NTBJointEmployed-");
			System.out.println("EmployeeType is Employed");
		}

	}

	@Test
	public void SC_032_TC_004() throws InterruptedException, IOException

	{
		CLDLPM.IDPrrof(TestDataFromExcel.IDPrrof);
		CLDLPM.IDNumner();
		screen.ScreenshotMethod("TC_005_LeadDocsCollectedSelfEmployed");
		Thread.sleep(2000);
	}

	@Test
	public void SC_032_TC_005() throws InterruptedException, IOException

	{
		Thread.sleep(2000);
		CLDLPM.ClickOnAddress();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_032_Lead_ETB_NTBJointEmployed-");
		CLDLPM.PermanentAddresssameasPresentAddress(TestDataFromExcel.PermanentAddresssameasPresentAddress);
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_032_Lead_ETB_NTBJointEmployed-");
		lopm.saveAndProceed();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_032_Lead_ETB_NTBJointEmployed-");
		Thread.sleep(3000);

		/*
		 * try{driver.findElement(By.xpath("//button[@type = 'button'][1]")).click();
		 * System.out.println("case dedupe fired");}
		 *
		 *
		 * catch(NoSuchElementException e) { System.out.println("no case dedupe");
		 */
		NTBSJPM.CaseDedupeOnDocsLead();
	}

	@Test
	public void SC_032_TC_006() throws InterruptedException, IOException

	{

		Thread.sleep(1000);
		CLDLPM.clickClosePopup();
		screen.ScreenshotMethod("SC_032_Lead_ETB_NTBJointEmployed-");
		CLDLPM.CreatedNewLeadEdit();
		Thread.sleep(1000);
		CLDLPM.clickEditOFAC(TestDataFromExcel.Ofac);
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_032_Lead_ETB_NTBJointEmployed-");
		lopm.saveAndProceed();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_032_Lead_ETB_NTBJointEmployed-");
		NTBSJPM.CaseDedupeOnDocsLead();
		Thread.sleep(2000);
		screen.ScreenshotMethod("SC_032_Lead_ETB_NTBJointEmployed-");
		scrollBy();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_032_Lead_ETB_NTBJointEmployed-");
		scrollBy();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_032_Lead_ETB_NTBJointEmployed-");
		scrollBy();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_032_Lead_ETB_NTBJointEmployed-");

	}

	@Test(priority = 7)
	public void SC_032_TC_007() throws InterruptedException {
		CLDLPM.clickaddScndryLeadButton();
		NTBSJPM.SalutationID(TestDataFromExcel.SalutationID);
		NTBSJPM.EnterFirstName();
		NTBSJPM.EnterlastName();
		NTBSJPM.EntermiddleName();
		NTBSJPM.EnterMobile();
		NTBSJPM.NTBJourneynext2();
		Thread.sleep(1000);
		System.out.print("Child ");
		lopm.GetLeadId();

		screen.ScreenshotMethod("SC_032_Lead_ETB_NTBJointEmployed-");
		scrollBy();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_032_Lead_ETB_NTBJointEmployed-");
		scrollBy();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_032_Lead_ETB_NTBJointEmployed-");
		scrollBy();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_032_Lead_ETB_NTBJointEmployed-");
		scrollBy();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_032_Lead_ETB_NTBJointEmployed-");
		scrollBy();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_032_Lead_ETB_NTBJointEmployed-");
		scrollBy();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_032_Lead_ETB_NTBJointEmployed-");
		CLDLPM.CreatedNewLeadEdit();
		Thread.sleep(1000);
		CLDLPM.selectstatuscode();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_032_Lead_ETB_NTBJointEmployed-");
		CLDLPM.Enteremail();
		Thread.sleep(300);
		screen.ScreenshotMethod("SC_032_Lead_ETB_NTBJointEmployed-");
		CLDLPM.dob(TestDataFromExcel.dobmonth, TestDataFromExcel.dobdate, TestDataFromExcel.dobyear);
		CLDLPM.Gender(TestDataFromExcel.Gender);
		CLDLPM.PlcaeOfBirth();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_032_Lead_ETB_NTBJointEmployed-");
		CLDLPM.CustomerType(TestDataFromExcel.CustomerType);
		CLDLPM.CivilStatus(TestDataFromExcel.CivilStatus);
		CLDLPM.CustomerContact(TestDataFromExcel.CustomerContact);
		CLDLPM.BusinnesSegment(TestDataFromExcel.BusinnesSegment);
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_032_Lead_ETB_NTBJointEmployed-");
		CLDLPM.ClientSegment(TestDataFromExcel.ClientSegment);
		screen.ScreenshotMethod("SC_032_Lead_ETB_NTBJointEmployed-");

		/* employed steps start */
		CLDLPM.Employeetype(TestDataFromExcel.Employeetype);
		CLDLPM.Sourceoffunds(TestDataFromExcel.SourceoffundsEmp);
		CLDLPM.employername();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_032_Lead_ETB_NTBJointEmployed-");
		CLDLPM.occupation(TestDataFromExcel.occupation);
		CLDLPM.IncomeRange(TestDataFromExcel.IncomeRange);
		Thread.sleep(1000);
		CLDLPM.workingsince(TestDataFromExcel.workingsincemonth, TestDataFromExcel.workingsinceyear);
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_032_Lead_ETB_NTBJointEmployed-");
		scrollBy();
		CLDLPM.EconomicActivity(TestDataFromExcel.EconomicActivity);
		Thread.sleep(500);
		screen.ScreenshotMethod("SC_032_Lead_ETB_NTBJointEmployed-");
		CLDLPM.Industry_Classification(TestDataFromExcel.Industry_Classification);
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_032_Lead_ETB_NTBJointEmployed-");
		CLDLPM.NatureOfWorkNEW(TestDataFromExcel.NatureOfWork); // remove New to run on g7
		Thread.sleep(1000);
		CLDLPM.forEmployment(TestDataFromExcel.forEmployment);
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_032_Lead_ETB_NTBJointEmployed-");
		/* employed steps end */

		CLDLPM.IDPrrof(TestDataFromExcel.IDPrrof);
		CLDLPM.IDNumner();
		screen.ScreenshotMethod("SC_032_Lead_ETB_NTBJointEmployed-");
		CLDLPM.MaidanName();
		screen.ScreenshotMethod("SC_032_Lead_ETB_NTBJointEmployed-");
		// CLDLPM.Tin("");
		CLDLPM.AoCode(TestDataFromExcel.AoCode);
		screen.ScreenshotMethod("SC_032_Lead_ETB_NTBJointEmployed-");
		CLDLPM.ClickOnAddress();
		screen.ScreenshotMethod("SC_032_Lead_ETB_NTBJointEmployed-");
		CLDLPM.streetfied();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_032_Lead_ETB_NTBJointEmployed-");
		CLDLPM.Zipcode(TestDataFromExcel.Zipcode);
		screen.ScreenshotMethod("SC_032_Lead_ETB_NTBJointEmployed-");
		lopm.saveAndProceed();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_032_Lead_ETB_NTBJointEmployed-");

		CLDLPM.clickClosePopup();
		screen.ScreenshotMethod("SC_032_Lead_ETB_NTBJointEmployed-");
		scrollBy();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_032_Lead_ETB_NTBJointEmployed-");
		scrollBy();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_032_Lead_ETB_NTBJointEmployed-");
		scrollBy();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_032_Lead_ETB_NTBJointEmployed-");
		scrollBy();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_032_Lead_ETB_NTBJointEmployed-");
		scrollBy();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_032_Lead_ETB_NTBJointEmployed-");
		scrollBy();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_032_Lead_ETB_NTBJointEmployed-");
		CLDLPM.clickCRRSCButton();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_032_Lead_ETB_NTBJointEmployed-");

		/*
		 * // OLD CRRSC CRRSC.AmlcUnJmf(TestDataFromExcel.AmlcUnJmf);
		 * CRRSC.BankInternalChecklist(TestDataFromExcel.BankInternalChecklist);
		 * CRRSC.AllegedPerdsonf(TestDataFromExcel.AllegedPerdsonf); Thread.sleep(1000);
		 * screen.ScreenshotMethod("SC_032_Lead_ETB_NTBJointEmployed-");
		 * CRRSC.HPIOrJoint(TestDataFromExcel.HPIOrJoint);
		 * CRRSC.BenifOFW(TestDataFromExcel.BenifOFW);
		 * CRRSC.ForeignNational(TestDataFromExcel.ForeignNational);
		 * CRRSC.NumberAccount(TestDataFromExcel.NeumberAccount); Thread.sleep(1000);
		 * screen.ScreenshotMethod("SC_032_Lead_ETB_NTBJointEmployed-");
		 * CRRSC.EmploymentTypeCRRSC(TestDataFromExcel.EmploymentTypeCRRSC);
		 * CRRSC.IndustryCRRSC(TestDataFromExcel.IndustryCRRSC); Thread.sleep(1000);
		 * screen.ScreenshotMethod("SC_032_Lead_ETB_NTBJointEmployed-");
		 * //CRRSC.EconomicActivityCRRSC(TestDataFromExcel.EconmicactivityeCRRSC);
		 * //Thread.sleep(1000);
		 * CRRSC.ManagerialCRRSC(TestDataFromExcel.managerialCRRSC);
		 * CRRSC.DirectDealingCRRSC(TestDataFromExcel.DirectDealingCRRSC);
		 * Thread.sleep(1000);
		 * screen.ScreenshotMethod("SC_032_Lead_ETB_NTBJointEmployed-");
		 * Thread.sleep(1000); CRRSC.CityCRRSC(TestDataFromExcel.CityCRRSC);
		 * //CRRSC.ProvinceCRRSC(TestDataFromExcel.ProvinceCRRSC);
		 * //CRRSC.RiskCRRSC(TestDataFromExcel.RiskCRRSC); Thread.sleep(1000);
		 * screen.ScreenshotMethod("SC_032_Lead_ETB_NTBJointEmployed-");
		 * CRRSC.vicinityRRSC(TestDataFromExcel.vicinityRRSC);
		 * 
		 * Thread.sleep(1000);
		 * screen.ScreenshotMethod("SC_032_Lead_ETB_NTBJointEmployed-");
		 * CRRSC.intialdepositeRRSC(TestDataFromExcel.intialdepositeRRSC);
		 * 
		 * CRRSC.InwprdOutwordRRSC(TestDataFromExcel.InwprdOutwordRRSC);
		 * 
		 * Thread.sleep(1000);
		 * CRRSC.customerdeclaredCRRSC(TestDataFromExcel.customerdeclaredCRRSC);
		 * 
		 * 
		 * 
		 * screen.ScreenshotMethod("SC_032_Lead_ETB_NTBJointEmployed-");
		 * CRRSC.ComfortableInformationRRSC(TestDataFromExcel.ComfortableInformationRRSC
		 * );
		 * CRRSC.ComfortableDocumentsRRSC(TestDataFromExcel.ComfortableDocumentsRRSC);
		 */
		// New CRRSC
		CRRSC.AmlcUnJmf(TestDataFromExcel.AmlcUnJmf);
		CRRSC.HPIOrJoint(TestDataFromExcel.HPIOrJoint);
		screen.ScreenshotMethod("SC_032_Lead_ETB_NTBJointEmployed-");
		CRRSC.BenifOFW(TestDataFromExcel.BenifOFW);
		CRRSC.PrpsOfAccntOpning(TestDataFromExcel.PrpsOfAccntOpning);
		CRRSC.Sbol(TestDataFromExcel.Sbol);
		screen.ScreenshotMethod("SC_032_Lead_ETB_NTBJointEmployed-");
		CRRSC.OtherRskFctr(TestDataFromExcel.OtherRskFctr);
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_032_Lead_ETB_NTBJointEmployed-");

		CRRSC.RemarksCRRSC("I am Indian!");
		screen.ScreenshotMethod("SC_032_Lead_ETB_NTBJointEmployed-");
		CRRSC.Finish();

		Thread.sleep(1000);
		CLDLPM.clickClosePopup();
		screen.ScreenshotMethod("SC_032_Lead_ETB_NTBJointEmployed-");
		scrollBy();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_032_Lead_ETB_NTBJointEmployed-");
		scrollBy();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_032_Lead_ETB_NTBJointEmployed-");
		scrollBy();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_032_Lead_ETB_NTBJointEmployed-");
		scrollBy();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_032_Lead_ETB_NTBJointEmployed-");
		scrollBy();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_032_Lead_ETB_NTBJointEmployed-");
		scrollBy();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_032_Lead_ETB_NTBJointEmployed-");
		lopm.ClickOnCRRSCtab();
		Thread.sleep(2000);
		screen.ScreenshotMethod("SC_032_Lead_ETB_NTBJointEmployed-");
		scrollBy();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_032_Lead_ETB_NTBJointEmployed-");
		scrollBy();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_032_Lead_ETB_NTBJointEmployed-");
		scrollBy();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_032_Lead_ETB_NTBJointEmployed-");
		scrollBy();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_032_Lead_ETB_NTBJointEmployed-");
		CLDLPM.CreatedNewLeadEdit();
		Thread.sleep(1000);
		CLDLPM.clickEditOFAC(TestDataFromExcel.Ofac);
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_032_Lead_ETB_NTBJointEmployed-");
		lopm.saveAndProceed();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_032_Lead_ETB_NTBJointEmployed-");
		scrollBy();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_032_Lead_ETB_NTBJointEmployed-");
		scrollBy();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_032_Lead_ETB_NTBJointEmployed-");
		scrollBy();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_032_Lead_ETB_NTBJointEmployed-");
		lopm.ProcessApplication();
		Thread.sleep(3000);
		lopm.ProcessApplicationPopUpClose();
		Thread.sleep(2000);
		scrollToTop();
		lopm.waitTillAccountOpen();
		screen.ScreenshotMethod("SC_005_LeadDocsCollectedSelfEmployed-");
		CLDLPM.clickClosePopup();
		screen.ScreenshotMethod("SC_005_LeadDocsCollectedSelfEmployed-");
		scrollBy();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_005_LeadDocsCollectedSelfEmployed-");
		scrollBy();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_005_LeadDocsCollectedSelfEmployed-");
		scrollBy();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_005_LeadDocsCollectedSelfEmployed-");
	}

	@Test(priority = 8)
	public void SC_032_TC_008() throws InterruptedException {
		lopm.goToParentLead();
		Refresh();
		Thread.sleep(500);
		lopm.ClickOnUpdtButton();
		Thread.sleep(500);
		screen.ScreenshotMethod("SC_032_Lead_ETB_NTBJointEmployed-");
		lopm.popupdate360("No");
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_032_Lead_ETB_NTBJointEmployed-");
		lopm.update360();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_032_Lead_ETB_NTBJointEmployed-");
		scrolldown();
		screen.ScreenshotMethod("SC_032_Lead_ETB_NTBJointEmployed-");
		FAIPM.ClickFillAccountInformation();
		FAIPM.RequestType(TestDataFromExcel.RequestTypef);
		FAIPM.Purposeofaccountopening(TestDataFromExcel.Purposeofaccountopening);
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_032_Lead_ETB_NTBJointEmployed-");
		FAIPM.ADBRequired(TestDataFromExcel.ADBRequired);
		screen.ScreenshotMethod("SC_032_Lead_ETB_NTBJointEmployed-");
		FAIPM.PromsEmail(TestDataFromExcel.PromsEmail);
		FAIPM.sel_PromsSMS(TestDataFromExcel.PromsSMS);
		FAIPM.TransactionalEmail(TestDataFromExcel.TransactionalEmail);
		FAIPM.TransactionalSMS(TestDataFromExcel.TransactionalSMS);
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_032_Lead_ETB_NTBJointEmployed-");
		CRRSC.Finish();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_032_Lead_ETB_NTBJointEmployed-");
		Thread.sleep(1000);

	}

	@Test(priority = 9)
	public void SC_032_TC_009() throws InterruptedException {
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_032_Lead_ETB_NTBJointEmployed-");
		lopm.ProcessApplication();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_032_Lead_ETB_NTBJointEmployed-");
		lopm.ProcessApplicationPopUpClose();
		Thread.sleep(3000);
		scrollToTop();
		screen.ScreenshotMethod("SC_032_Lead_ETB_NTBJointEmployed-");
		lopm.waitTillAccountOpen();
		screen.ScreenshotMethod("SC_005_LeadDocsCollectedSelfEmployed-");
		CLDLPM.clickClosePopup();
		screen.ScreenshotMethod("SC_005_LeadDocsCollectedSelfEmployed-");
		scrollBy();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_005_LeadDocsCollectedSelfEmployed-");
		scrollBy();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_005_LeadDocsCollectedSelfEmployed-");
		scrollBy();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_005_LeadDocsCollectedSelfEmployed-");
		QuiteBrowser();
	}
	 @Test
	   	public void SC_032_TC_010() throws InterruptedException, IOException
	   	{
	       	launchBrowser();
	        screen.ScreenshotMethod("SC_005_LeadDocsCollectedSelfEmployed-");
	       	TestDataFromExcel.DataRead();
	    		EnterUserName(TestDataFromExcel.UserName_BBGCDMaintenanceAnalyst);
	           EnterPassword(TestDataFromExcel.Password);
	           screen.ScreenshotMethod("SC_005_LeadDocsCollectedSelfEmployed-");
	           LoginButtonClick();
	           CheckRole();
	           screen.ScreenshotMethod("SC_005_LeadDocsCollectedSelfEmployed-");
	           clk_leadobject();
	           lopm.categoryview("Deposit-Individual");
	           lopm.selfassignlead("Account Opened");
	           lopm.leadview("Assigned Leads");
	           Thread.sleep(500);
	           lopm.onMyBucketlead();
	           Thread.sleep(500);
	           screen.ScreenshotMethod("SC_005_LeadDocsCollectedSelfEmployed-");
	           CLDLPM.clickClosePopup();
	           screen.ScreenshotMethod("SC_005_LeadDocsCollectedSelfEmployed-");
	           scrollBy();
	           Thread.sleep(1000);
	           screen.ScreenshotMethod("SC_005_LeadDocsCollectedSelfEmployed-");
	           scrollBy();
	           Thread.sleep(1000);
	           screen.ScreenshotMethod("SC_005_LeadDocsCollectedSelfEmployed-");
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
	           screen.ScreenshotMethod("SC_005_LeadDocsCollectedSelfEmployed-");
	           System.out.println("Lead status code is "+lopm.getStatusCode());
	           lopm.goToCustomer360();
	           Thread.sleep(1000);
	           screen.ScreenshotMethod("SC_005_LeadDocsCollectedSelfEmployed-");
	           cspm.switchCustomerView();
	           Thread.sleep(1000);
	           screen.ScreenshotMethod("SC_005_LeadDocsCollectedSelfEmployed-");
	           scrollBy();
	           Thread.sleep(1000);
	           screen.ScreenshotMethod("SC_005_LeadDocsCollectedSelfEmployed-");
	           scrollBy();
	           Thread.sleep(1000);
	           screen.ScreenshotMethod("SC_005_LeadDocsCollectedSelfEmployed-");
	           scrollBy();
	           Thread.sleep(1000);
	           screen.ScreenshotMethod("SC_005_LeadDocsCollectedSelfEmployed-");
	           QuiteBrowser();


	   	}
	 @Test
	   	public void SC_032_TC_011() throws InterruptedException, IOException
	   	{
	       	launchBrowser();
	        screen.ScreenshotMethod("SC_005_LeadDocsCollectedSelfEmployed-");
	       	TestDataFromExcel.DataRead();
	    		EnterUserName(TestDataFromExcel.UserName_BBGCDMaintenanceAnalyst);
	           EnterPassword(TestDataFromExcel.Password);
	           screen.ScreenshotMethod("SC_005_LeadDocsCollectedSelfEmployed-");
	           LoginButtonClick();
	           CheckRole();
	           screen.ScreenshotMethod("SC_005_LeadDocsCollectedSelfEmployed-");
	           clk_leadobject();
	           lopm.categoryview("Deposit-Individual");
	           lopm.selfassignlead("Account Opened");
	           lopm.leadview("Assigned Leads");
	           Thread.sleep(500);
	           lopm.onMyBucketlead();
	           Thread.sleep(500);
	           screen.ScreenshotMethod("SC_005_LeadDocsCollectedSelfEmployed-");
	           CLDLPM.clickClosePopup();
	           screen.ScreenshotMethod("SC_005_LeadDocsCollectedSelfEmployed-");
	           scrollBy();
	           Thread.sleep(1000);
	           screen.ScreenshotMethod("SC_005_LeadDocsCollectedSelfEmployed-");
	           scrollBy();
	           Thread.sleep(1000);
	           screen.ScreenshotMethod("SC_005_LeadDocsCollectedSelfEmployed-");
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
	           screen.ScreenshotMethod("SC_005_LeadDocsCollectedSelfEmployed-");
	           System.out.println("Lead status code is "+lopm.getStatusCode());
	           lopm.goToCustomer360();
	           Thread.sleep(1000);
	           screen.ScreenshotMethod("SC_005_LeadDocsCollectedSelfEmployed-");
	           cspm.switchCustomerView();
	           Thread.sleep(1000);
	           screen.ScreenshotMethod("SC_005_LeadDocsCollectedSelfEmployed-");
	           scrollBy();
	           Thread.sleep(1000);
	           screen.ScreenshotMethod("SC_005_LeadDocsCollectedSelfEmployed-");
	           scrollBy();
	           Thread.sleep(1000);
	           screen.ScreenshotMethod("SC_005_LeadDocsCollectedSelfEmployed-");
	           scrollBy();
	           Thread.sleep(1000);
	           screen.ScreenshotMethod("SC_005_LeadDocsCollectedSelfEmployed-");
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
