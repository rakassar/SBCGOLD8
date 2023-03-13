package BUSINESSNEXT.SBCGOLD8.TESTSCENARIOS;

import java.io.IOException;

import org.testng.annotations.Test;
import BUSINESSNEXT.SBCGOLD8.COMMON.*;
import BUSINESSNEXT.SBCGOLD8.METHOD.*;
/*Customer Joint Onboarding process for NTB employed Indidvidual

To run on G7 please change nature of work field and uncomment the CRRSC section
*/
import BUSINESSNEXT.SBCGOLD8.OBJECT.LeadObjectPageObject;
import BUSINESSNEXT.SBCGOLD8.SOAPAPI.CSQUpdateForTrustTreasury;
import BUSINESSNEXT.SBCGOLD8.SOAPAPI.TokenGeneration;

//screen shot using listner class
//@Listeners(crm.mhc.common.ListnersClassAnotation.class)
public class SC_039_Lead_NTBJointTreauryIndi extends HomePageMethod {

	// Object for methods class
	CustomerSerachPageMethod cspm = new CustomerSerachPageMethod();
	LeadObjectPageMethod lopm = new LeadObjectPageMethod();
	IndividualSalesJourneyPageMethod NTBSJPM = new IndividualSalesJourneyPageMethod();
	CollectDocsLeadPageMethod CLDLPM = new CollectDocsLeadPageMethod();
	TestDataFromExcel TDFX = new TestDataFromExcel();
	CRRSCLeadPageMethod CRRSC = new CRRSCLeadPageMethod();
	Screenshot screen = new Screenshot();
	FillAccountInformationPageMethod FAIPM = new FillAccountInformationPageMethod();
	TokenGeneration token = new TokenGeneration();
	CSQUpdateForTrustTreasury CSQ = new CSQUpdateForTrustTreasury();

	@Test(priority = 1)
	public void SC_039_TC_001() throws InterruptedException, IOException {
		launchBrowser();
		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");
		TestDataFromExcel.DataRead();
		EnterUserName(TestDataFromExcel.UserName_CA);
		EnterPassword(TestDataFromExcel.Password);
		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");
		LoginButtonClick();
		CheckRole();
		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");
		ClickOnsaleswidget();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");
		ClickOnsalesJouney();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");
		lopm.ClickOnOnBoardingJourney();
		cspm.ClickOnOnBoardingJourneynext();
		Thread.sleep(1000);
	}

	@Test(priority = 2)
	public void SC_039_TC_002() throws InterruptedException, IOException {
		NTBSJPM.SalutationID(TestDataFromExcel.SalutationID);
		NTBSJPM.EnterFirstName();
		NTBSJPM.EnterlastName();
		NTBSJPM.EntermiddleName();
		NTBSJPM.EnterMobile();
		NTBSJPM.InterestedIn("Treasury");

		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");

		NTBSJPM.NTBJourneynext1();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");
		NTBSJPM.ProductCategory("COMPLEX DERIVATIVES");
		Thread.sleep(500);
		NTBSJPM.Product("COMPLEX DERIVATIVES");
		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");
		NTBSJPM.NTBJourneynext2();
		Thread.sleep(1000);
		System.out.print("Trust ");
		lopm.GetLeadId();
		lopm.Trust_TreasuryLeadId();

		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");
		scrollBy();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");
		scrollBy();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");
		scrollBy();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");
		scrollBy();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");
		scrollBy();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");
		scrollBy();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");
		CLDLPM.CreatedNewLeadEdit();
		Thread.sleep(1000);

	}

	@Test(priority = 3)
	public void SC_039_TC_003() throws InterruptedException, IOException {
		CLDLPM.selectstatuscode();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");
		CLDLPM.Enteremail();
		CLDLPM.settlementaccntType("Open New Settlement Account");
		Thread.sleep(300);
		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");
		CLDLPM.dob(TestDataFromExcel.dobmonth, TestDataFromExcel.dobdate, TestDataFromExcel.dobyear);
		CLDLPM.Gender(TestDataFromExcel.Gender);
		CLDLPM.PlcaeOfBirth();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");
		CLDLPM.CustomerType(TestDataFromExcel.CustomerType);
		CLDLPM.CivilStatus(TestDataFromExcel.CivilStatus);
		CLDLPM.CustomerContact(TestDataFromExcel.CustomerContact);
		CLDLPM.BusinnesSegment(TestDataFromExcel.BusinnesSegment);
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");
		CLDLPM.ClientSegment(TestDataFromExcel.ClientSegment);
		CLDLPM.AoCode(TestDataFromExcel.AoCode);
		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");
		// Joint fields
		CLDLPM.SoleOwner("No");
		CLDLPM.CustomerRelationship("And");
		Thread.sleep(500);
		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");
		// CLDLPM.OnlyBBNRequired("No");
		Thread.sleep(1000);
		CLDLPM.GroupID("Groupid123");
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");
	}

	@Test(priority = 4)
	public void SC_039_TC_004() throws InterruptedException, IOException {
		/* employed steps start */
		CLDLPM.Employeetype(TestDataFromExcel.Employeetype);
		CLDLPM.Sourceoffunds(TestDataFromExcel.SourceoffundsEmp);
		CLDLPM.employername();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");
		CLDLPM.occupation(TestDataFromExcel.occupation);
		CLDLPM.IncomeRange(TestDataFromExcel.IncomeRange);
		Thread.sleep(1000);
		CLDLPM.workingsince(TestDataFromExcel.workingsincemonth, TestDataFromExcel.workingsinceyear);
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");
		scrollBy();
		CLDLPM.EconomicActivity(TestDataFromExcel.EconomicActivity);
		Thread.sleep(500);
		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");
		CLDLPM.Industry_Classification(TestDataFromExcel.Industry_Classification);
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");
		CLDLPM.NatureOfWorkNEW(TestDataFromExcel.NatureOfWork); // remove New to run on g7
		Thread.sleep(1000);
		CLDLPM.forEmployment(TestDataFromExcel.forEmployment);
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");
		/* employed steps end */

	}

	@Test(priority = 5)
	public void SC_039_TC_005() throws InterruptedException, IOException {
		CLDLPM.IDPrrof(TestDataFromExcel.IDPrrof);
		CLDLPM.IDNumner();
		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");
		CLDLPM.MaidanName();
		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");
		// CLDLPM.Tin("");
		CLDLPM.dosriFlag("No");
		CLDLPM.fatcaFlag("Yes");
		Thread.sleep(500);
		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");
		CLDLPM.ClickOnAddress();
		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");
		CLDLPM.streetfied();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");
		CLDLPM.Zipcode(TestDataFromExcel.Zipcode);
		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");
		lopm.saveAndProceed();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");

		// LogoutButtonClick();
	}

	@Test(priority = 6)
	public void SC_039_TC_006() throws InterruptedException {
		CLDLPM.clickClosePopup();
		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");
		scrollBy();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");
		scrollBy();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");
		scrollBy();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");
		scrollBy();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");
		scrollBy();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");
		scrollBy();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");

	}

	@Test(priority = 7)
	public void SC_039_TC_007() throws InterruptedException {
		CLDLPM.clickaddScndryLeadButton();
		NTBSJPM.SalutationID(TestDataFromExcel.SalutationID);
		NTBSJPM.EnterFirstName();
		NTBSJPM.EnterlastName();
		NTBSJPM.EntermiddleName();
		NTBSJPM.EnterMobile();
		NTBSJPM.SourceOfInfo("Branch");
		NTBSJPM.NTBJourneynext2();
		Thread.sleep(1000);
		System.out.print("Child ");
		lopm.GetLeadId();

		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");
		scrollBy();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");
		scrollBy();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");
		scrollBy();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");
		scrollBy();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");
		scrollBy();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");
		scrollBy();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");
		CLDLPM.CreatedNewLeadEdit();

		CLDLPM.selectstatuscode();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");
		CLDLPM.Enteremail();

		Thread.sleep(300);
		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");
		CLDLPM.dob(TestDataFromExcel.dobmonth, TestDataFromExcel.dobdate, TestDataFromExcel.dobyear);
		CLDLPM.Gender(TestDataFromExcel.Gender);
		CLDLPM.PlcaeOfBirth();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");
		CLDLPM.CustomerType(TestDataFromExcel.CustomerType);
		CLDLPM.CivilStatus(TestDataFromExcel.CivilStatus);
		CLDLPM.CustomerContact(TestDataFromExcel.CustomerContact);
		CLDLPM.BusinnesSegment(TestDataFromExcel.BusinnesSegment);
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");
		CLDLPM.ClientSegment(TestDataFromExcel.ClientSegment);
		CLDLPM.AoCode(TestDataFromExcel.AoCode);
		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");
		// Joint fields

		Thread.sleep(500);
		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");
		// CLDLPM.OnlyBBNRequired("No");
		Thread.sleep(1000);
		CLDLPM.GroupID("Groupid123");
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");

		CLDLPM.Employeetype(TestDataFromExcel.Employeetype);
		CLDLPM.Sourceoffunds(TestDataFromExcel.SourceoffundsEmp);
		CLDLPM.employername();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");
		CLDLPM.occupation(TestDataFromExcel.occupation);
		CLDLPM.IncomeRange(TestDataFromExcel.IncomeRange);
		Thread.sleep(1000);
		CLDLPM.workingsince(TestDataFromExcel.workingsincemonth, TestDataFromExcel.workingsinceyear);
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");
		scrollBy();
		CLDLPM.EconomicActivity(TestDataFromExcel.EconomicActivity);
		Thread.sleep(500);
		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");
		CLDLPM.Industry_Classification(TestDataFromExcel.Industry_Classification);
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");
		CLDLPM.NatureOfWorkNEW(TestDataFromExcel.NatureOfWork); // remove New to run on g7
		Thread.sleep(1000);
		CLDLPM.forEmployment(TestDataFromExcel.forEmployment);
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");
		/* employed steps end */

		CLDLPM.IDPrrof(TestDataFromExcel.IDPrrof);
		CLDLPM.IDNumner();
		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");
		CLDLPM.MaidanName();
		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");
		// CLDLPM.Tin("");
		CLDLPM.dosriFlag("No");
		// CLDLPM.fatcaFlag("Yes");
		Thread.sleep(500);
		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");
		CLDLPM.ClickOnAddress();
		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");
		CLDLPM.streetfied();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");
		CLDLPM.Zipcode(TestDataFromExcel.Zipcode);
		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");
		lopm.saveAndProceed();
		Thread.sleep(2000);
		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");

		CLDLPM.clickClosePopup();
		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");
		scrollBy();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");
		scrollBy();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");
		scrollBy();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");
		scrollBy();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");
		scrollBy();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");
		scrollBy();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");

	}

	@Test(priority = 8)
	public void SC_039_TC_008() throws InterruptedException {
		lopm.goToParentLead();
		CLDLPM.clickIndiAccntCreateBtn();

		NTBSJPM.LeadRating("Hot");
		NTBSJPM.ProductCategory(TestDataFromExcel.ProductCategory);
		Thread.sleep(500);
		NTBSJPM.Product(TestDataFromExcel.Product);
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");
		NTBSJPM.NTBJourneynext2();
		Thread.sleep(1000);
		System.out.print("Settlement ");
		lopm.GetLeadId();

		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");
		scrollBy();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");
		scrollBy();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");
		scrollBy();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");
		scrollBy();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");
		scrollBy();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");
		scrollBy();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");
		CLDLPM.CreatedNewLeadEdit();
		Thread.sleep(1000);
		CLDLPM.selectstatuscode();
		Thread.sleep(1000);
		CLDLPM.OnlyBBNRequired("No");
		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");
		scrollBy();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");
		scrollBy();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");
		scrollBy();
		Thread.sleep(500);
		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");
		scrollBy();
		CLDLPM.forEmployment(TestDataFromExcel.forEmployment);
		Thread.sleep(500);
		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");
		// CLDLPM.NatureOfWorkNEW(TestDataFromExcel.NatureOfWork); // remove New to run
		// on g7

		Thread.sleep(500);
		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");
		scrollBy();
		Thread.sleep(500);
		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");
		scrollBy();
		// CRRSC section
		CRRSC.PrpsOfAccntOpning(TestDataFromExcel.PrpsOfAccntOpning);
		CRRSC.Sbol(TestDataFromExcel.Sbol);

		// Communication Channel Preference
		CLDLPM.ChannelPreference_PhoneCall();
		Thread.sleep(500);
		CLDLPM.ChannelPreference_SMS();
		Thread.sleep(500);
		scrolldown();
		CLDLPM.ChannelPreference_Viber();
		Thread.sleep(500);
		CLDLPM.ChannelPreference_Email();
		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");

		scrollToTop();
		scrolldown();
		CLDLPM.ClickOnAddress();
		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");
		Thread.sleep(500);
		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");
		scrollBy();
		Thread.sleep(500);
		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");
		scrollBy();
		CLDLPM.mailingaddress(TestDataFromExcel.mailingaddress);
		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");
		lopm.saveAndProceed();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");

		CLDLPM.clickClosePopup();
		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");
		scrollBy();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");
		scrollBy();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");
		scrollBy();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");
		scrollBy();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");
		scrollBy();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");
		scrollBy();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");
		CLDLPM.clickCRRSCButton();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");

		/*
		 * // OLD CRRSC CRRSC.AmlcUnJmf(TestDataFromExcel.AmlcUnJmf);
		 * CRRSC.BankInternalChecklist(TestDataFromExcel.BankInternalChecklist);
		 * CRRSC.AllegedPerdsonf(TestDataFromExcel.AllegedPerdsonf); Thread.sleep(1000);
		 * screen.ScreenshotMethod("SC_024_NTBEmployedLoanProcessor-");
		 * CRRSC.HPIOrJoint(TestDataFromExcel.HPIOrJoint);
		 * CRRSC.BenifOFW(TestDataFromExcel.BenifOFW);
		 * CRRSC.ForeignNational(TestDataFromExcel.ForeignNational);
		 * CRRSC.NumberAccount(TestDataFromExcel.NeumberAccount); Thread.sleep(1000);
		 * screen.ScreenshotMethod("SC_024_NTBEmployedLoanProcessor-");
		 * CRRSC.EmploymentTypeCRRSC(TestDataFromExcel.EmploymentTypeCRRSC);
		 * CRRSC.IndustryCRRSC(TestDataFromExcel.IndustryCRRSC); Thread.sleep(1000);
		 * screen.ScreenshotMethod("SC_024_NTBEmployedLoanProcessor-");
		 * //CRRSC.EconomicActivityCRRSC(TestDataFromExcel.EconmicactivityeCRRSC);
		 * //Thread.sleep(1000);
		 * CRRSC.ManagerialCRRSC(TestDataFromExcel.managerialCRRSC);
		 * CRRSC.DirectDealingCRRSC(TestDataFromExcel.DirectDealingCRRSC);
		 * Thread.sleep(1000);
		 * screen.ScreenshotMethod("SC_024_NTBEmployedLoanProcessor-");
		 * Thread.sleep(1000); CRRSC.CityCRRSC(TestDataFromExcel.CityCRRSC);
		 * //CRRSC.ProvinceCRRSC(TestDataFromExcel.ProvinceCRRSC);
		 * //CRRSC.RiskCRRSC(TestDataFromExcel.RiskCRRSC); Thread.sleep(1000);
		 * screen.ScreenshotMethod("SC_024_NTBEmployedLoanProcessor-");
		 * CRRSC.vicinityRRSC(TestDataFromExcel.vicinityRRSC);
		 * 
		 * Thread.sleep(1000);
		 * screen.ScreenshotMethod("SC_024_NTBEmployedLoanProcessor-");
		 * CRRSC.intialdepositeRRSC(TestDataFromExcel.intialdepositeRRSC);
		 * 
		 * CRRSC.InwprdOutwordRRSC(TestDataFromExcel.InwprdOutwordRRSC);
		 * 
		 * Thread.sleep(1000);
		 * CRRSC.customerdeclaredCRRSC(TestDataFromExcel.customerdeclaredCRRSC);
		 * 
		 * 
		 * 
		 * screen.ScreenshotMethod("SC_024_NTBEmployedLoanProcessor-");
		 * CRRSC.ComfortableInformationRRSC(TestDataFromExcel.ComfortableInformationRRSC
		 * );
		 * CRRSC.ComfortableDocumentsRRSC(TestDataFromExcel.ComfortableDocumentsRRSC);
		 * Thread.sleep(1000);
		 * screen.ScreenshotMethod("SC_024_NTBEmployedLoanProcessor-");
		 */
		/*
		 * //New CRRSC CRRSC.AmlcUnJmf(TestDataFromExcel.AmlcUnJmf);
		 * CRRSC.HPIOrJoint(TestDataFromExcel.HPIOrJoint);
		 * screen.ScreenshotMethod("SC_003_NTBDocsCollectionEmployed-");
		 * CRRSC.BenifOFW(TestDataFromExcel.BenifOFW);
		 * CRRSC.PrpsOfAccntOpning(TestDataFromExcel.PrpsOfAccntOpning);
		 * CRRSC.Sbol(TestDataFromExcel.Sbol);
		 * screen.ScreenshotMethod("SC_003_NTBDocsCollectionEmployed-");
		 * CRRSC.OtherRskFctr(TestDataFromExcel.OtherRskFctr);
		 * CRRSC.RemarksCRRSC("I am Indian!");
		 * screen.ScreenshotMethod("SC_003_NTBDocsCollectionEmployed-"); CRRSC.Finish();
		 */

		// Latest CRRSC
		CRRSC.OtherRskFctr(TestDataFromExcel.OtherRskFctr);
		screen.ScreenshotMethod("SC_003_NTBDocsCollectionEmployed-");
		CRRSC.OFAC_mashup();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_003_NTBDocsCollectionEmployed-");
		CRRSC.AmlcUnJmf(TestDataFromExcel.AmlcUnJmf);
		CRRSC.HPIOrJoint(TestDataFromExcel.HPIOrJoint);
		screen.ScreenshotMethod("SC_003_NTBDocsCollectionEmployed-");
		CRRSC.RemarksCRRSC("I am Indian!");
		screen.ScreenshotMethod("SC_003_NTBDocsCollectionEmployed-");
		CRRSC.Finish();

		Thread.sleep(1000);

		Thread.sleep(1000);
		CLDLPM.clickClosePopup();
		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");
		scrollBy();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");
		scrollBy();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");
		scrollBy();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");
		scrollBy();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");
		scrollBy();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");
		scrollBy();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");
		lopm.ClickOnCRRSCtab();
		Thread.sleep(2000);
		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");
		scrollBy();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");
		scrollBy();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");
		scrollBy();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");
		scrollBy();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");
		CLDLPM.CreatedNewLeadEdit();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");
		lopm.saveAndProceed();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");
		scrollBy();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");
		scrollBy();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");
		scrollBy();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");
	}

	@Test(priority = 9)
	public void SC_039_TC_009() throws InterruptedException {
		CLDLPM.clickaddScndryLeadButton();

		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");
		NTBSJPM.SourceOfInfo("Branch");
		NTBSJPM.NTBJourneynext2();
		Thread.sleep(1000);
		System.out.print("Child ");
		lopm.GetLeadId();

		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");
		scrollBy();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");
		scrollBy();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");
		scrollBy();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");
		scrollBy();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");
		scrollBy();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");
		scrollBy();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");
		CLDLPM.CreatedNewLeadEdit();
		Thread.sleep(1000);
		CLDLPM.selectstatuscode();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");
		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");
		scrollBy();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");
		scrollBy();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");
		scrollBy();
		Thread.sleep(500);
		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");
		scrollBy();
		CLDLPM.forEmployment(TestDataFromExcel.forEmployment);
		Thread.sleep(500);
		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");
		CLDLPM.NatureOfWorkNEW(TestDataFromExcel.NatureOfWork); // remove New to run on g7

		Thread.sleep(500);
		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");
		scrollBy();
		Thread.sleep(500);
		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");
		scrollBy();
		// CRRSC section
		CRRSC.PrpsOfAccntOpning(TestDataFromExcel.PrpsOfAccntOpning);
		CRRSC.Sbol(TestDataFromExcel.Sbol);
		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");
		scrolldown();
//Communication Channel Preference
		CLDLPM.ChannelPreference_PhoneCall();
		Thread.sleep(500);
		CLDLPM.ChannelPreference_SMS();
		Thread.sleep(500);
		scrolldown();
		CLDLPM.ChannelPreference_Viber();
		Thread.sleep(500);
		CLDLPM.ChannelPreference_Email();
		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");

		scrollToTop();
		scrolldown();
		CLDLPM.ClickOnAddress();
		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");
		Thread.sleep(500);
		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");
		scrollBy();
		Thread.sleep(500);
		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");
		scrollBy();

		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");

		lopm.saveAndProceed();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");

		CLDLPM.clickClosePopup();
		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");
		scrollBy();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");
		scrollBy();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");
		scrollBy();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");
		scrollBy();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");
		scrollBy();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");
		scrollBy();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");
		CLDLPM.clickCRRSCButton();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");

		/*
		 * // OLD CRRSC CRRSC.AmlcUnJmf(TestDataFromExcel.AmlcUnJmf);
		 * CRRSC.BankInternalChecklist(TestDataFromExcel.BankInternalChecklist);
		 * CRRSC.AllegedPerdsonf(TestDataFromExcel.AllegedPerdsonf); Thread.sleep(1000);
		 * screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");
		 * CRRSC.HPIOrJoint(TestDataFromExcel.HPIOrJoint);
		 * CRRSC.BenifOFW(TestDataFromExcel.BenifOFW);
		 * CRRSC.ForeignNational(TestDataFromExcel.ForeignNational);
		 * CRRSC.NumberAccount(TestDataFromExcel.NeumberAccount); Thread.sleep(1000);
		 * screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");
		 * CRRSC.EmploymentTypeCRRSC(TestDataFromExcel.EmploymentTypeCRRSC);
		 * CRRSC.IndustryCRRSC(TestDataFromExcel.IndustryCRRSC); Thread.sleep(1000);
		 * screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");
		 * //CRRSC.EconomicActivityCRRSC(TestDataFromExcel.EconmicactivityeCRRSC);
		 * //Thread.sleep(1000);
		 * CRRSC.ManagerialCRRSC(TestDataFromExcel.managerialCRRSC);
		 * CRRSC.DirectDealingCRRSC(TestDataFromExcel.DirectDealingCRRSC);
		 * Thread.sleep(1000);
		 * screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");
		 * Thread.sleep(1000); CRRSC.CityCRRSC(TestDataFromExcel.CityCRRSC);
		 * //CRRSC.ProvinceCRRSC(TestDataFromExcel.ProvinceCRRSC);
		 * //CRRSC.RiskCRRSC(TestDataFromExcel.RiskCRRSC); Thread.sleep(1000);
		 * screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");
		 * CRRSC.vicinityRRSC(TestDataFromExcel.vicinityRRSC);
		 * 
		 * Thread.sleep(1000);
		 * screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");
		 * CRRSC.intialdepositeRRSC(TestDataFromExcel.intialdepositeRRSC);
		 * 
		 * CRRSC.InwprdOutwordRRSC(TestDataFromExcel.InwprdOutwordRRSC);
		 * 
		 * Thread.sleep(1000);
		 * CRRSC.customerdeclaredCRRSC(TestDataFromExcel.customerdeclaredCRRSC);
		 * 
		 * 
		 * 
		 * screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");
		 * CRRSC.ComfortableInformationRRSC(TestDataFromExcel.ComfortableInformationRRSC
		 * );
		 * CRRSC.ComfortableDocumentsRRSC(TestDataFromExcel.ComfortableDocumentsRRSC);
		 */
		/*
		 * //New CRRSC CRRSC.AmlcUnJmf(TestDataFromExcel.AmlcUnJmf);
		 * CRRSC.HPIOrJoint(TestDataFromExcel.HPIOrJoint);
		 * screen.ScreenshotMethod("SC_003_NTBDocsCollectionEmployed-");
		 * CRRSC.BenifOFW(TestDataFromExcel.BenifOFW);
		 * CRRSC.PrpsOfAccntOpning(TestDataFromExcel.PrpsOfAccntOpning);
		 * CRRSC.Sbol(TestDataFromExcel.Sbol);
		 * screen.ScreenshotMethod("SC_003_NTBDocsCollectionEmployed-");
		 * CRRSC.OtherRskFctr(TestDataFromExcel.OtherRskFctr);
		 * CRRSC.RemarksCRRSC("I am Indian!");
		 * screen.ScreenshotMethod("SC_003_NTBDocsCollectionEmployed-"); CRRSC.Finish();
		 */

		// Latest CRRSC
		CRRSC.OtherRskFctr(TestDataFromExcel.OtherRskFctr);
		screen.ScreenshotMethod("SC_003_NTBDocsCollectionEmployed-");
		CRRSC.OFAC_mashup();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_003_NTBDocsCollectionEmployed-");
		CRRSC.AmlcUnJmf(TestDataFromExcel.AmlcUnJmf);
		CRRSC.HPIOrJoint(TestDataFromExcel.HPIOrJoint);
		screen.ScreenshotMethod("SC_003_NTBDocsCollectionEmployed-");
		CRRSC.RemarksCRRSC("I am Indian!");
		screen.ScreenshotMethod("SC_003_NTBDocsCollectionEmployed-");
		CRRSC.Finish();

		Thread.sleep(1000);
		CLDLPM.clickClosePopup();
		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");
		scrollBy();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");
		scrollBy();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");
		scrollBy();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");
		scrollBy();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");
		scrollBy();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");
		scrollBy();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");
		lopm.ClickOnCRRSCtab();
		Thread.sleep(2000);
		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");
		scrollBy();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");
		scrollBy();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");
		scrollBy();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");
		scrollBy();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");
		CLDLPM.CreatedNewLeadEdit();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");
		lopm.saveAndProceed();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");
		scrollBy();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");
		scrollBy();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");
		scrollBy();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");
		lopm.ProcessApplication();
		Thread.sleep(3000);
		lopm.ProcessApplicationPopUpClose();
		Thread.sleep(3000);
		scrollToTop();

		lopm.waitTillAccountOpen();
		Thread.sleep(3000);
		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");

	}

	@Test(priority = 10)
	public void SC_039_TC_010() throws InterruptedException {
		lopm.goToParentLead();
		FAIPM.ClickFillAccountInformation();
		FAIPM.RequestType(TestDataFromExcel.RequestTypef);
		Thread.sleep(400);
		scrollBy();

		FAIPM.PromoCode();
		// FAIPM.Purposeofaccountopening(TestDataFromExcel.Purposeofaccountopening);

		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");
		FAIPM.ADBRequired(TestDataFromExcel.ADBRequired);
		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");
		FAIPM.PromsEmail(TestDataFromExcel.PromsEmail);
		FAIPM.sel_PromsSMS(TestDataFromExcel.PromsSMS);
		FAIPM.TransactionalEmail(TestDataFromExcel.TransactionalEmail);
		FAIPM.TransactionalSMS(TestDataFromExcel.TransactionalSMS);
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");
		CRRSC.Finish();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");
		lopm.ProcessApplication();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");
		lopm.ProcessApplicationPopUpClose();
		Thread.sleep(2000);
		scrollToTop();
		lopm.waitTillAccountOpen();
		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");
		CLDLPM.clickClosePopup();
		scrollBy();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");
		scrollBy();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");
		scrollBy();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");
		scrollBy();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");

	}

	@Test(priority = 11)
	public void SC_039_TC_011() throws InterruptedException {
		clk_leadobject();
		lopm.leadSearch(lopm.tLeadID);
		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");
		CLDLPM.clickClosePopup();
		scrollBy();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");
		scrollBy();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");
		CLDLPM.CreatedNewLeadEdit();
		Thread.sleep(1000);
		CLDLPM.settlementaccntType("Choose from Existing Account");
		Thread.sleep(500);
		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");
		CLDLPM.settlementaccntPickerclk();
		Thread.sleep(500);
		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");
		CLDLPM.settlementaccntclk();
		Thread.sleep(500);
		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");
		scrolldown();
		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");
		Thread.sleep(500);
		scrolldown();
		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");
		Thread.sleep(500);
		scrolldown();
		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");
		Thread.sleep(500);
		scrolldown();
		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");
		Thread.sleep(500);
		scrolldown();
		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");
		Thread.sleep(500);
		scrolldown();
		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");
		CLDLPM.UpdateDetailsTrustTreasury("No");
		Thread.sleep(500);
		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");
		lopm.saveAndProceed();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");
		NTBSJPM.CaseDedupeOnDocsLead();
		Thread.sleep(1000);
		CLDLPM.CreatedNewLeadEdit();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");
		CLDLPM.settlementaccntType("Choose from Existing Account");
		Thread.sleep(500);
		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");
		CLDLPM.settlementaccntPickerclk();
		Thread.sleep(500);
		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");
		CLDLPM.settlementaccntclk();
		Thread.sleep(500);
		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");
		CLDLPM.UpdateDetailsTrustTreasury("No");
		Thread.sleep(500);
		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");
		lopm.saveAndProceed();
		Thread.sleep(500);
		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");
		NTBSJPM.CaseDedupeOnDocsLead();
		lopm.GetLeadId();
		token.Token();
		CSQ.CSQUpdate();
		lopm.waitTillCSQPerform();
		Thread.sleep(3000);
		lopm.goToTChildTrustLead();
		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");

		CLDLPM.CreatedNewLeadEdit();
		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");
		scrolldown();
		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");
		Thread.sleep(500);
		scrolldown();
		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");
		Thread.sleep(500);
		scrolldown();
		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");
		Thread.sleep(500);
		CLDLPM.UpdateDetailsTrustTreasury("No");
		Thread.sleep(500);
		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");
		lopm.saveAndProceed();
		Thread.sleep(500);
		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");
		lopm.waitTillCSQPerform();
		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");
		scrolldown();
		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");
		Thread.sleep(500);
		scrolldown();
		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");
		scrolldown();
		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");
		Thread.sleep(500);
		scrolldown();
		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");
		scrolldown();
		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");
		Thread.sleep(500);
		scrolldown();
		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");
		QuiteBrowser();

	}

	@Test(priority = 12)
	public void SC_039_TC_012() throws InterruptedException, IOException {
		launchBrowser();
		TestDataFromExcel.DataRead();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");
		EnterUserName(TestDataFromExcel.UserName_TreasuryOps);
		EnterPassword(TestDataFromExcel.Password);
		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");
		LoginButtonClick();
		CheckRole();
		Thread.sleep(500);
		clk_leadobject();
		lopm.categoryview("Treasury-Individual ");
		lopm.selfassignlead("Assigned to Treasury");
		lopm.leadview("Assigned Leads");
		Thread.sleep(500);
		lopm.onMyBucketlead();
		Thread.sleep(500);
		lopm.ProcessApplication();
		Thread.sleep(1500);
		LeadObjectPageObject.clk_closeProcessApplicationPopup.click();
		Thread.sleep(1500);
		lopm.TustOpsConvertLeadCLK();
		Thread.sleep(500);
		LeadObjectPageObject.clk_closeProcessApplicationPopup.click();
		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");
		scrollBy();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");
		scrollBy();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");
		scrollBy();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");
		scrollBy();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");
		scrollBy();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");
		scrollBy();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");

		clk_leadobject(); // secondary lead
		lopm.categoryview("Treasury-Individual ");
		lopm.selfassignlead("Assigned to Treasury");
		lopm.leadview("Assigned Leads");
		Thread.sleep(500);
		lopm.onMyBucketlead();
		Thread.sleep(500);
		lopm.ProcessApplication();
		Thread.sleep(1500);
		LeadObjectPageObject.clk_closeProcessApplicationPopup.click();
		Thread.sleep(1500);
		lopm.TustOpsConvertLeadCLK();
		Thread.sleep(500);
		LeadObjectPageObject.clk_closeProcessApplicationPopup.click();
		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");
		scrollBy();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");
		scrollBy();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");
		scrollBy();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");
		scrollBy();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");
		scrollBy();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");
		scrollBy();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_039_Lead_NTBJointTreauryIndi-");
		QuiteBrowser();
	}

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
