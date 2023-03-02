package BUSINESSNEXT.SBCGOLD8.TESTSCENARIOS;

import java.io.IOException;

import org.testng.annotations.Test;
import BUSINESSNEXT.SBCGOLD8.COMMON.*;
import BUSINESSNEXT.SBCGOLD8.METHOD.*;
/*Customer Joint Onboarding process for NTB employed Indidvidual

To run on G7 please change nature of work field and uncomment the CRRSC section
*/
import BUSINESSNEXT.SBCGOLD8.OBJECT.LeadObjectPageObject;

//screen shot using listner class
//@Listeners(crm.mhc.common.ListnersClassAnotation.class)
public class SC_040_Lead_ETBTrustIndi extends HomePageMethod {

	// Object for methods class
	CustomerSerachPageMethod cspm = new CustomerSerachPageMethod();
	LeadObjectPageMethod lopm = new LeadObjectPageMethod();
	IndividualSalesJourneyPageMethod NTBSJPM = new IndividualSalesJourneyPageMethod();
	CollectDocsLeadPageMethod CLDLPM = new CollectDocsLeadPageMethod();
	TestDataFromExcel TDFX = new TestDataFromExcel();
	CRRSCLeadPageMethod CRRSC = new CRRSCLeadPageMethod();
	Screenshot screen = new Screenshot();
	FillAccountInformationPageMethod FAIPM = new FillAccountInformationPageMethod();

	@Test(priority = 1)
	public void SC_040_TC_001() throws InterruptedException, IOException {
		launchBrowser();
		screen.ScreenshotMethod("SC_040_Lead_ETBTrustIndi-");
		TestDataFromExcel.DataRead();
		Thread.sleep(500);
		screen.ScreenshotMethod("SC_040_Lead_ETBTrustIndi-");
		EnterUserName(TestDataFromExcel.UserName_CA);
		EnterPassword(TestDataFromExcel.Password);
		screen.ScreenshotMethod("SC_040_Lead_ETBTrustIndi-");
		LoginButtonClick();
		CheckRole();
		Thread.sleep(500);
		screen.ScreenshotMethod("SC_040_Lead_ETBTrustIndi-");
		CheckRole();
		Thread.sleep(100);
		ClickOnsaleswidget();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_040_Lead_ETBTrustIndi-");
		ClickOnsalesJouney();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_040_Lead_ETBTrustIndi-");
		lopm.ClickOnOnBoardingJourney();
		cspm.BBNFillForCustomerSearch(TestDataFromExcel.BBN);
		Thread.sleep(1000);
		cspm.ClickOnOnBoardingJourneynext();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_040_Lead_ETBTrustIndi-");
		cspm.ChooseBBNfromList();
		Thread.sleep(2000);
		screen.ScreenshotMethod("SC_040_Lead_ETBTrustIndi-");
		cspm.clickstartjourney();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_040_Lead_ETBTrustIndi-");
		cspm.ETBIndividualSalesJorney();
		// cspm.clickonredbutton();
		// cspm.ClickOnOnBoardingJourneynext2();

		screen.ScreenshotMethod("SC_040_Lead_ETBTrustIndi-");

	}

	@Test(priority = 2)
	public void SC_040_TC_002() throws Exception {

		NTBSJPM.LeadRating("Hot");
		NTBSJPM.InterestedIn("Trust");

		screen.ScreenshotMethod("SC_040_Lead_ETBTrustIndi-");
		NTBSJPM.NTBJourneynext1();
		Thread.sleep(1000);

		screen.ScreenshotMethod("SC_040_Lead_ETBTrustIndi-");

		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_040_Lead_ETBTrustIndi-");
		NTBSJPM.ProductCategory("UITF");
		Thread.sleep(500);
		NTBSJPM.Product("SB PESO BOND FUND");
		screen.ScreenshotMethod("SC_040_Lead_ETBTrustIndi-");
		NTBSJPM.NTBJourneynext2();
		Thread.sleep(1000);
		System.out.print("Trust ");
		lopm.GetLeadId();

		screen.ScreenshotMethod("SC_040_Lead_ETBTrustIndi-");
		scrollBy();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_040_Lead_ETBTrustIndi-");
		scrollBy();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_040_Lead_ETBTrustIndi-");
		scrollBy();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_040_Lead_ETBTrustIndi-");
		scrollBy();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_040_Lead_ETBTrustIndi-");
		scrollBy();
		CLDLPM.CheckEmployeetype();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_040_Lead_ETBTrustIndi-");
		scrollBy();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_040_Lead_ETBTrustIndi-");
		CLDLPM.CreatedNewLeadEdit();
		Thread.sleep(1000);

	}

	@Test(priority = 3)
	public void SC_040_TC_003() throws InterruptedException, IOException {
		CLDLPM.selectstatuscode();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_040_Lead_ETBTrustIndi-");

		CLDLPM.settlementaccntType("Choose from Existing Account");
		Thread.sleep(500);
		screen.ScreenshotMethod("SC_040_Lead_ETBTrustIndi-");
		CLDLPM.settlementaccntPickerclk();
		Thread.sleep(500);
		screen.ScreenshotMethod("SC_040_Lead_ETBTrustIndi-");
		CLDLPM.settlementaccntclk();
		Thread.sleep(500);
		screen.ScreenshotMethod("SC_040_Lead_ETBTrustIndi-");
		scrolldown();
		screen.ScreenshotMethod("SC_040_Lead_ETBTrustIndi-");
		CLDLPM.SoleOwner("Yes");
		CLDLPM.GroupID("Groupid123");
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_040_Lead_ETBTrustIndi-");

	}

	@Test(priority = 4)
	public void SC_040_TC_004() throws InterruptedException, IOException {
		if (CollectDocsLeadPageMethod.Employeetype.equals("Self-Employed")) {

			CLDLPM.businessname();
			CLDLPM.Sourceoffunds("Business");
			CLDLPM.forEmployment(TestDataFromExcel.forEmployment);
			Thread.sleep(1000);
			screen.ScreenshotMethod("SC_040_Lead_ETBTrustIndi-");
			CLDLPM.NatureOfWork(TestDataFromExcel.NatureOfWork);

			Thread.sleep(2000);
			System.out.println("EmployeeType is self-employed");

		} else if (CollectDocsLeadPageMethod.Employeetype.equals("Unemployed"))

		{
			CLDLPM.Sourceoffunds("Inheritance");
			screen.ScreenshotMethod("SC_040_Lead_ETBTrustIndi-");
			Thread.sleep(1000);
			System.out.println("EmployeeType is unemployed");
		} else if (CollectDocsLeadPageMethod.Employeetype.equals("Employed")) {
			CLDLPM.employername();
			CLDLPM.Sourceoffunds("Salary");
			Thread.sleep(1000);
			screen.ScreenshotMethod("SC_040_Lead_ETBTrustIndi-");
			CLDLPM.workingsince(TestDataFromExcel.workingsincemonth, TestDataFromExcel.workingsinceyear);
			Thread.sleep(1000);
			CLDLPM.forEmployment(TestDataFromExcel.forEmployment);
			Thread.sleep(1000);

			CLDLPM.NatureOfWork(TestDataFromExcel.NatureOfWork);
			Thread.sleep(1000);
			screen.ScreenshotMethod("SC_040_Lead_ETBTrustIndi-");
			System.out.println("EmployeeType is Employed");
		}

	}

	@Test(priority = 5)
	public void SC_040_TC_005() throws InterruptedException, IOException {
		CLDLPM.IDPrrof(TestDataFromExcel.IDPrrof);
		CLDLPM.IDNumner();
		screen.ScreenshotMethod("SC_040_Lead_ETBTrustIndi-");

		// CLDLPM.Tin("");
		CLDLPM.dosriFlag("No");
		CLDLPM.fatcaFlag("Yes");
		Thread.sleep(500);
		screen.ScreenshotMethod("SC_040_Lead_ETBTrustIndi-");
		CLDLPM.UpdateDetailsTrustTreasury("No");
		screen.ScreenshotMethod("SC_040_Lead_ETBTrustIndi-");
		CLDLPM.ClickOnAddress();
		screen.ScreenshotMethod("SC_040_Lead_ETBTrustIndi-");

		Thread.sleep(1000);
		scrollBy();
		screen.ScreenshotMethod("SC_040_Lead_ETBTrustIndi-");
		CLDLPM.PermanentAddresssameasPresentAddress("Yes");
		screen.ScreenshotMethod("SC_040_Lead_ETBTrustIndi-");
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_040_Lead_ETBTrustIndi-");
		lopm.saveAndProceed();
		NTBSJPM.CaseDedupeOnDocsLead();
		screen.ScreenshotMethod("SC_040_Lead_ETBTrustIndi-");
	}

	@Test(priority = 6)
	public void SC_040_TC_006() throws InterruptedException {
		lopm.waitTillAccountOpen();
		lopm.waitTillCSQPerform();

		screen.ScreenshotMethod("SC_040_Lead_ETBTrustIndi-");
		scrollBy();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_040_Lead_ETBTrustIndi-");
		scrollBy();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_040_Lead_ETBTrustIndi-");
		scrollBy();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_040_Lead_ETBTrustIndi-");
		scrollBy();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_040_Lead_ETBTrustIndi-");
		scrollBy();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_040_Lead_ETBTrustIndi-");
		scrollBy();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_040_Lead_ETBTrustIndi-");
		QuiteBrowser();

	}

	@Test(priority = 7)
	public void SC_040_TC_007() throws InterruptedException, IOException {
		launchBrowser();
		TestDataFromExcel.DataRead();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_040_Lead_ETBTrustIndi-");
		EnterUserName(TestDataFromExcel.UserName_TrustOps);
		EnterPassword(TestDataFromExcel.Password);
		screen.ScreenshotMethod("SC_040_Lead_ETBTrustIndi-");
		LoginButtonClick();
		CheckRole();
		Thread.sleep(500);
		clk_leadobject();
		lopm.categoryview("Trust-Individual");
		lopm.selfassignlead("Assigned to Trust");
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
		screen.ScreenshotMethod("SC_040_Lead_ETBTrustIndi-");
		scrollBy();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_040_Lead_ETBTrustIndi-");
		scrollBy();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_040_Lead_ETBTrustIndi-");
		scrollBy();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_040_Lead_ETBTrustIndi-");
		scrollBy();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_040_Lead_ETBTrustIndi-");
		scrollBy();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_040_Lead_ETBTrustIndi-");
		scrollBy();
		Thread.sleep(1000);
		screen.ScreenshotMethod("SC_040_Lead_ETBTrustIndi-");
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
