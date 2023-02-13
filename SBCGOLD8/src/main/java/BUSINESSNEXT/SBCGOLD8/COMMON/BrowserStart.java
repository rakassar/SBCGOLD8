package BUSINESSNEXT.SBCGOLD8.COMMON;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import BUSINESSNEXT.SBCGOLD8.OBJECT.CRRSCLeadPageObject;
import BUSINESSNEXT.SBCGOLD8.OBJECT.CaseJourneyPageObject;
import BUSINESSNEXT.SBCGOLD8.OBJECT.CaseStagePageObject;
import BUSINESSNEXT.SBCGOLD8.OBJECT.CollectDocsLeadPageObject;
import BUSINESSNEXT.SBCGOLD8.OBJECT.CreateLeadAppointmentPageObject;
import BUSINESSNEXT.SBCGOLD8.OBJECT.CustomerCareExecutiveObjects;
import BUSINESSNEXT.SBCGOLD8.OBJECT.CustomerSearchPageObject;
import BUSINESSNEXT.SBCGOLD8.OBJECT.ExecutiveAssistantSalesObjects_ea_sales;
import BUSINESSNEXT.SBCGOLD8.OBJECT.FillAccountInformationPageObject;
import BUSINESSNEXT.SBCGOLD8.OBJECT.HomePageObject;
import BUSINESSNEXT.SBCGOLD8.OBJECT.IndividualSalesJourneyPageObject;
import BUSINESSNEXT.SBCGOLD8.OBJECT.LeadObjectPageObject;
import BUSINESSNEXT.SBCGOLD8.OBJECT.LoginPageObject;
import BUSINESSNEXT.SBCGOLD8.REPOSITORY.*;

import BUSINESSNEXT.SBCGOLD8.OBJECT.*;
import BUSINESSNEXT.SBCGOLD8.COMMON.*;
import BUSINESSNEXT.SBCGOLD8.METHOD.*;

public class BrowserStart implements Properties{
	public static WebDriver driver=null;

	//@BeforeClass
	public void launchBrowser()
	{

    System.setProperty("webdriver.chrome.driver", ChromeDriverPath);
	driver =new ChromeDriver();
	//driver.close();
	ChromeOptions option= new ChromeOptions();
	option.addArguments("--start-maximized");
	driver.get(URL);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	new LoginPageObject(driver);
	new HomePageObject(driver);
	new LeadObjectPageObject(driver);
	new CustomerSearchPageObject(driver);
	new IndividualSalesJourneyPageObject(driver);
	new CreateLeadAppointmentPageObject(driver);
	new CollectDocsLeadPageObject(driver);
	new CustomerCareExecutiveObjects(driver);
	new ExecutiveAssistantSalesObjects_ea_sales(driver);
	new CRRSCLeadPageObject(driver);
	new FillAccountInformationPageObject(driver);
	new CaseJourneyPageObject(driver);
	new CaseStagePageObject(driver);
	new ReportPageObject(driver);

	}




	public void LoginPageRedircet()

	{
		driver.navigate().to(URL);
	}


	// @AfterClass
	public void QuiteBrowser()

	{

		 driver.quit(); }

	public void Refresh() {
		driver.navigate().refresh();
	}
	
}


