package BUSINESSNEXT.SBCGOLD8.TESTSCENARIOS;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;




///Retail_Lead_Journey_(Low)
public class Retail_Journey_Low  {


//
	@Test
	//public static void main(String[] args) throws InterruptedException
	public void demo() throws InterruptedException{
		// TODO Auto-generated method stub

 System.setProperty("webdriver.chrome.driver","D:\\Rizwan\\Automation\\lib\\chromedriver.exe");
//		 System.setProperty("webdriver.chrome.driver","D:\\Rizwan\\Automation\\lib\\Latest Chrome Driver\\chromedriver.exe");

	        ChromeDriver driver = new ChromeDriver();
	        driver.get("https://nbodev.crmnext.com/prodsanew/app/login/login"); //Access URL
	        driver.manage().window().maximize(); // Maximize window
	        driver.findElement(By.xpath("//*[@id=\"TxtName\"]")).sendKeys("028145");  //Enter user name
	        driver.findElement(By.xpath("//*[@id=\"TxtPassword\"]")).sendKeys("acid_qa"); // Enter Password
	        driver.findElement(By.xpath("//*[@id=\"registration\"]/input")).click();  //Click on login button
	      //  driver.findElement(By.xpath("(//a[@class='white side-nav-list__link wt50 mid f16 ht50'])[7]")).click(); //Click on Lead Object
	     //   Thread.sleep(1000);
	   //     driver.findElement(By.xpath("//i[@title='On board Customer']")).click(); //Click on Custom Action Button
	  //      Thread.sleep(3000);
	        driver.findElement(By.xpath("(//a[@class='white side-nav-list__link wt50 mid f16 ht50'])[7]")).click(); //Click on Lead Object
	        Thread.sleep(3000);
	        driver.findElement(By.xpath("//i[@title='On board Customer']")).click(); //Click on Custom Action Button
	        Thread.sleep(2000);
	        //Set<String> allWindowHandles = driver.getWindowHandles();
	        Set<String> wit =   driver.getWindowHandles();
	        System.out.println(wit);
	        Iterator<String> pp =  wit.iterator();
	        String pp1 = pp.next();
	        String pp2 = pp.next();
	        driver.switchTo().window(pp2);
	        //Iterator<String> iterator=    allWindowHandles.iterator();
	        //String parentWindow= iterator.next();
	        //String childWindow= iterator.next();
	        //driver.switchTo().window(childWindow);
	        driver.findElement(By.xpath("//span[normalize-space()='R']")).click(); //Click on Retail Onboarding Icon
	        Thread.sleep(2000);
	        //Fill the Detail Page
	        driver.switchTo().window(pp1);
	  //System.out.println(     driver.findElement(By.className("scrennflowStep__title")).getText());
	   Select cust_1902 = new Select(driver.findElement(By.name("cust_1902")));
	   cust_1902.selectByVisibleText("MR."); //Customer Salutation
	   driver.findElement(By.xpath("//input[@name='cust_1901']")).sendKeys("Vivek"); //Customer Name
	   driver.findElement(By.xpath("//*[@id=\"newobject\"]/div/div[2]/div/div/div/div/div[2]/div/div[1]/div/div[2]/div[3]/div[1]/div/div/div/div/input")).sendKeys("29/12/1987");//Date of Birth
	   driver.findElement(By.xpath("//*[@id=\"newobject\"]/div/div[2]/div/div/div/div/div[2]/div/div[1]/div/div[2]/div[5]/div[1]/div/div/div/input")).sendKeys("1801");//ID Card No.
	   driver.findElement(By.xpath("//*[@id=\"newobject\"]/div/div[2]/div/div/div/div/div[2]/div/div[1]/div/div[2]/div[5]/div[2]/div/div/div/div/input")).sendKeys("14/10/2222");//ID Card Expiry Date
	   //driver.findElement(By.xpath("//a[@data-autoid='cust_125310_srch']")).click();
	        //driver.findElement(By.xpath("//a[@data-autoid='cust_1902_ctrl']")).click();

	String MainWindow=driver.getWindowHandle();

	        // To handle all new opened window.
	            Set<String> s1=driver.getWindowHandles();
	        Iterator<String> i1=s1.iterator();


	            String ChildWindow=i1.next();



	                    // Switching to Child window
	                    driver.switchTo().window(ChildWindow);
	                    Thread.sleep(1000);
	                  //  driver.findElement(By.xpath("//*[@data-autoid='cust_1902_ctrl']")).click();


	        Select bucket2 = new Select (driver.findElement(By.xpath("//select[@name='cust_1902']")));
	        //System.out.println("bucket2");
	       // Select bucket2 = new Select(driver.findElement(By.xpath("//*[@data-autoid='cust_1902_ctrl']")));
	        bucket2.selectByVisibleText("MR.");
	        Select bucket3 = new Select (driver.findElement(By.xpath("//select[@name='cust_583']")));
	        bucket3.selectByVisibleText("Self Employed/Freelancer");
	        //driver.quit();
	        Select cust_583 = new Select(driver.findElement(By.name("cust_583")));//Employer Type
	        cust_583.selectByVisibleText("Free-Zone Corporations");
	        Select LE_PRODUCT = new Select(driver.findElement(By.name("LE_PRODUCT")));//Account Type
	        LE_PRODUCT.selectByVisibleText("Call Deposit");
	        Select LE_LEADSOURCE = new Select(driver.findElement(By.name("LE_LEADSOURCE")));//Account Type
	        LE_LEADSOURCE.selectByVisibleText("Google");
	        Select cust_667 = new Select(driver.findElement(By.name("cust_667")));//Literacy
	        cust_667.selectByVisibleText("Literate");
	        Select cust_24202 = new Select(driver.findElement(By.name("cust_24202")));//HNWI Status
	        cust_24202.selectByVisibleText("No");
	        Select cust_125060 = new Select(driver.findElement(By.name("cust_125060")));//Capture Associated Party Info
	        cust_125060.selectByVisibleText("No");
	        Select cust_24435 = new Select(driver.findElement(By.name("cust_24435")));//Residence Status
	        cust_24435.selectByVisibleText("Resident");
	      //  Select cust_1266 = new Select(driver.findElement(By.name("cust_1266")));//Residence Status
	      //  cust_1266.selectByVisibleText("Vinu");
	        Select cust_677 = new Select(driver.findElement(By.name("cust_677")));//Make ongoing payment to USA
	        cust_677.selectByVisibleText("No");
	        Select cust_673 = new Select(driver.findElement(By.name("cust_673")));//Green Card Holder Flag
	        cust_673.selectByVisibleText("No");
	        Select cust_1635 = new Select(driver.findElement(By.name("cust_1635")));//US Tax Resident
	        cust_1635.selectByVisibleText("No");
	        Select cust_695 = new Select(driver.findElement(By.name("cust_695")));//US National/Citizen
	        cust_695.selectByVisibleText("No");
	        Select cust_674 = new Select(driver.findElement(By.name("cust_674")));//US Passport Holder
	        cust_674.selectByVisibleText("No");
	        Select cust_1859 = new Select(driver.findElement(By.name("cust_1859")));//Residence Status
	        cust_1859.selectByVisibleText("0105-MUSCAT");
	        driver.findElement(By.xpath("//input[@name='cust_441']")).sendKeys("10738576");//ID Card No.
	        Thread.sleep(1000);
	        driver.findElement(By.name("LE_MOBILE")).sendKeys("9278778787");//Mobile number
	        driver.findElement(By.name("cust_1266")).sendKeys("vin");//Account short name
	        Thread.sleep(1000);

	        //driver.findElement(By.xpath("//input[@name='cust_625']").sendKeys("1550");//Other Income
	        driver.findElement(By.xpath("//input[@data-autoid='cust_624_ctrl']")).sendKeys("987654");
	      //  driver.findElement(By.xpath("//input[@name='cust_625']")).sendKeys("56789");//Other Income
	        driver.findElement(By.xpath("//input[@name='cust_51']")).sendKeys("goswami");//surname
	        driver.findElement(By.xpath("//input[@name='cust_1787']")).sendKeys("122");//Building No
	        driver.findElement(By.xpath("//input[@name='cust_1788']")).sendKeys("122");//Villa/ Flat No
	        driver.findElement(By.xpath("//input[@name='cust_785']")).sendKeys("122");//way no.
	        driver.findElement(By.xpath("//input[@name='cust_975']")).sendKeys("American Samoa");//Place of birth
	        driver.findElement(By.xpath("//input[@name='cust_147']")).sendKeys("12");// P.O BOX
	        driver.findElement(By.xpath("//a[@data-autoid='cust_125310_srch']")).click();// Products & Services
	        Thread.sleep(3000);
	        driver.findElement(By.xpath("//input[@name='Grid_SearchTextBox']")).sendKeys("Loans and Advances"); // Products & Services
	        Thread.sleep(3000);
	      //  driver.findElement(By.xpath("//i[@class='icon icon-arrow-right2']")).click();
	        driver.findElement(By.xpath("//div[@title='Loans and Advances']")).click(); // Cards

	        Thread.sleep(3000);



	        WebElement Location=driver.findElement(By.name("cust_1860"));
	        Location .sendKeys("CCAE-MUSCAT");
	        Thread.sleep(2000);
	        Location.sendKeys(Keys.DOWN);
	        Thread.sleep(1000);
	        Location.sendKeys(Keys.ENTER);


	        Thread.sleep(1000);




	        driver.findElement(By.xpath("//a[@data-autoid='cust_1419_srch']")).click();//Employer
	        Thread.sleep(1000);
	        driver.findElement(By.xpath("//input[@name='Grid_SearchTextBox']")).sendKeys("007"); //Employer
	       Thread.sleep(1000);
	     //  driver.findElement(By.xpath("//i[@class='icon icon-arrow-right2']")).click();
	        driver.findElement(By.xpath("//div[@title='007']")).click(); //Employer
	        Thread.sleep(1000);




	        driver.findElement(By.xpath("//a[@data-autoid='cust_635_srch']")).click();//Designation
	        Thread.sleep(1000);
	        driver.findElement(By.xpath("//input[@name='Grid_SearchTextBox']")).sendKeys("D001-General Manager"); //Designation
	       Thread.sleep(1000);
	     //  driver.findElement(By.xpath("//i[@class='icon icon-arrow-right2']")).click();
	        driver.findElement(By.xpath("//div[@title='D001-General Manager']")).click(); //Designation
	        Thread.sleep(1000);





	        Thread.sleep(1000);
	        //WebElement Location11=driver.findElement(By.name("cust_1800"));
	        //Location11 .sendKeys("Accommodation");
	        //Thread.sleep(2000);
	       // Location11.sendKeys(Keys.DOWN);
	        //Location11.sendKeys(Keys.ENTER);
	        //Thread.sleep(1000);


//	        driver.findElement(By.xpath("//a[@data-autoid='cust_1801_srch']")).click();//Sub industry
	        Thread.sleep(1000);
//	        driver.findElement(By.xpath("//input[@name='Grid_SearchTextBox']")).sendKeys("Abrasive product manufacturing"); //Sub industry
	       Thread.sleep(1000);
	       //driver.findElement(By.xpath("//i[@class='icon icon-arrow-right2']")).click();
//	        driver.findElement(By.xpath("//div[@title='Abrasive product manufacturing']")).click(); //Sub industry
	        Thread.sleep(1000);


	        JavascriptExecutor js = driver;

	        js.executeScript("window.scrollBy(0,5000)","" );


	        driver.findElement(By.xpath("//a[@data-autoid='cust_1001_srch']")).click();//Purpose of Account
	        Thread.sleep(1000);
	        driver.findElement(By.xpath("//label[@for='checkbox3']")).click();//Purpose of Account
	        Thread.sleep(1000);
	//       driver.findElement(By.xpath("//i[@class='icon icon-arrow-right2']")).click();
	        driver.findElement(By.xpath("//button[normalize-space()='Ok']")).click();//Purpose of Account

	        JavascriptExecutor js1 = driver;
	        js1.executeScript("window.scrollBy(0,5000)","" );

	        driver.findElement(By.xpath("//a[@data-autoid='cust_123350_srch']")).click(); //Screening Matches
	        Thread.sleep(1000);
	        driver.findElement(By.xpath("//input[@name='Grid_SearchTextBox']")).sendKeys("Positive Match (no Financial Crime negative news)"); //Screening Matches
	        Thread.sleep(1000);
	      //  driver.findElement(By.xpath("//i[@class='icon icon-arrow-right2']")).click();
	        driver.findElement(By.xpath("//div[@title='Positive Match (no Financial Crime negative news)']")).click(); //Screening Matches
	        Thread.sleep(1000);
	      //  driver.findElement(By.xpath("//div[@title='Activities of call centers)']")).click(); //Nature of business
	        Thread.sleep(1000);
	        driver.findElement(By.xpath("//a[@data-autoid='cust_125120_srch']")).click(); //PEP Status
	        Thread.sleep(1000);
	        driver.findElement(By.xpath("//input[@name='Grid_SearchTextBox']")).sendKeys("Not Applicable"); //PEP Status
	        Thread.sleep(1000);

	      //  driver.findElement(By.xpath("//i[@class='icon icon-arrow-right2']")).click();
	        driver.findElement(By.xpath("//div[@title='Not Applicable']")).click(); //PEP Status
	        Thread.sleep(1000);



	        JavascriptExecutor js11 = driver;
	        js11.executeScript("window.scrollBy(0,5000)","" );

	        driver.findElement(By.xpath("//a[@data-autoid='cust_979_srch']")).click();//PO CODE
	        Thread.sleep(1000);
	 //       driver.findElement(By.xpath("//label[@for='checkbox1']")).click();//PO CODE
	        Thread.sleep(1000);
	     //  driver.findElement(By.xpath("//i[@class='icon icon-arrow-right2']")).click();
	        driver.findElement(By.xpath("//input[@name='Grid_SearchTextBox']")).sendKeys("101 - City Center MUSCAT");
	        driver.findElement(By.xpath("//div[@title='101 - City Center MUSCAT']")).click();//PO CODE
	        Thread.sleep(1000);


	        driver.findElement(By.xpath("//a[@data-autoid='cust_125130_srch']")).click();//Average Expected Transaction Value Per Annum
	        Thread.sleep(1000);
	 //       driver.findElement(By.xpath("//label[@for='checkbox1']")).click();//PO CODE
	        Thread.sleep(1000);
	     //  driver.findElement(By.xpath("//i[@class='icon icon-arrow-right2']")).click();
	        driver.findElement(By.xpath("//input[@name='Grid_SearchTextBox']")).sendKeys("Upto OMR 25k");
	        driver.findElement(By.xpath("//div[@title='Upto OMR 25k']")).click();//Average Expected Transaction Value Per Annum
	        Thread.sleep(1000);


	        driver.findElement(By.xpath("//a[@data-autoid='cust_122834_srch']")).click();//Origin Country of Funds - Country 1
	        Thread.sleep(1000);
	 //       driver.findElement(By.xpath("//label[@for='checkbox1']")).click();//PO CODE
	        Thread.sleep(1000);
	     //  driver.findElement(By.xpath("//i[@class='icon icon-arrow-right2']")).click();
	        driver.findElement(By.xpath("//input[@name='Grid_SearchTextBox']")).sendKeys("American Samoa");
	        driver.findElement(By.xpath("//div[@title='American Samoa']")).click();//Origin Country of Funds - Country 1
	        Thread.sleep(1000);

	        driver.findElement(By.xpath("//a[@data-autoid='cust_125132_srch']")).click();//Relationship and Servicing Method
	        Thread.sleep(1000);
	 //       Thread.sleep(1000);
	     //  driver.findElement(By.xpath("//i[@class='icon icon-arrow-right2']")).click();
	        driver.findElement(By.xpath("//input[@name='Grid_SearchTextBox']")).sendKeys("Face-to-Face Channel (via Branch)");
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("//div[@title='Face-to-Face Channel (via Branch)']")).click();//Relationship and Servicing Method
	        Thread.sleep(1000);


	        driver.findElement(By.xpath("//a[@data-autoid='cust_122835_srch']")).click();//Destination Country of Funds - Country 1
	        Thread.sleep(1000);
	 //       Thread.sleep(1000);
	     //  driver.findElement(By.xpath("//i[@class='icon icon-arrow-right2']")).click();
	        driver.findElement(By.xpath("//input[@name='Grid_SearchTextBox']")).sendKeys("American Samoa");
	        driver.findElement(By.xpath("//div[@title='American Samoa']")).click();//Destination Country of Funds - Country 1
	        Thread.sleep(1000);


	        driver.findElement(By.xpath("//a[@data-autoid='cust_125309_srch']")).click();//Source of funds & wealth
	        Thread.sleep(1000);
	 //       Thread.sleep(1000);
	     //  driver.findElement(By.xpath("//i[@class='icon icon-arrow-right2']")).click();
	        driver.findElement(By.xpath("//input[@name='Grid_SearchTextBox']")).sendKeys("Government Aid");
	        driver.findElement(By.xpath("//div[@title='Government Aid']")).click();//Source of funds & wealth
	        Thread.sleep(1000);

	        driver.findElement(By.xpath("//a[@data-autoid='cust_592_srch']")).click();//Customer Profession
	        Thread.sleep(1000);
	 //       Thread.sleep(1000);
	     //  driver.findElement(By.xpath("//i[@class='icon icon-arrow-right2']")).click();
	        driver.findElement(By.xpath("//input[@name='Grid_SearchTextBox']")).sendKeys("Actor");
	        driver.findElement(By.xpath("//div[@title='Actor']")).click();//Customer profession
	        Thread.sleep(3000);

	   //     driver.findElement(By.xpath("//a[@data-autoid='cust_658_srch']")).click();//Country of birth
	        Thread.sleep(2000);
	 //       Thread.sleep(1000);
	     //  driver.findElement(By.xpath("//i[@class='icon icon-arrow-right2']")).click();
	       // driver.findElement(By.xpath("//input[@name='Grid_SearchTextBox']")).sendKeys("AMERICAN SAMOA");

	  //      driver.findElement(By.xpath("//input[@data-autoid='cust_658_ctrl']")).sendKeys("AMERICAN SAMOA");
	  //      Thread.sleep(2000);
	  //      driver.findElement(By.xpath("//div[@data-autoid='AMERICAN SAMOA']")).click();//Country of birth
	  //      Thread.sleep(2000);





	        WebElement Location111=driver.findElement(By.name("cust_658"));
	        Location111 .sendKeys("AMERICAN SAMOA");
	        Thread.sleep(2000);
	        Location111.sendKeys(Keys.DOWN);
	        Location111.sendKeys(Keys.ENTER);



	        //driver.findElement(By.xpath("//a[@data-autoid='cust_592_srch']")).click();//Click on Product
	        //driver.findElement(By.name("Grid_SearchTextBox")).click();
	        //driver.findElement(By.name("Grid_SearchTextBox")).sendKeys("Krungsri Visa Signature");//(For Specific product)
	        //driver.findElement(By.xpath("//div[@data-autoid='DisplayName_0']")).click();//selection of product
	        //driver.findElement(By.xpath("//a[@data-autoid='FlowNext']")).click();//click on save Button

	        Thread.sleep(1000);
	     //   WebElement Location1111=driver.findElement(By.name("cust_1799"));
	      //  Location1111 .sendKeys("Aerospace");
	      //  Thread.sleep(2000);
	      //  Location1111.sendKeys(Keys.DOWN);
	      //  Location1111.sendKeys(Keys.ENTER);
	      //  Thread.sleep(1000);



	        Select cust_675 = new Select(driver.findElement(By.name("cust_24202")));//Multiple Nationality
	        cust_675.selectByVisibleText("No");
	        Thread.sleep(1000);
	       // Thread.sleep(1000);

	        driver.findElement(By.className("acd-btn--brand")).click();

	        Thread.sleep(30000);

	        //CRS

	        Select cust_123396 = new Select(driver.findElement(By.name("cust_123396")));//Care of Address Applicable
	        cust_123396.selectByVisibleText("No");
	        Select cust_123394 = new Select(driver.findElement(By.name("cust_123394")));//Self-Certification Required
	        cust_123394.selectByVisibleText("No");
	        Thread.sleep(1000);
	        Select cust_123398 = new Select(driver.findElement(By.name("cust_123398")));//Standing Instruction to Transfer to Participating Countries
	        cust_123398.selectByVisibleText("No");
	        Select cust_123399 = new Select(driver.findElement(By.name("cust_123399")));//International Phone Number
	        cust_123399.selectByVisibleText("No");
	        Thread.sleep(1000);
	        Select cust_123400 = new Select(driver.findElement(By.name("cust_123400")));//Type of CRS Self-Certification
	        cust_123400.selectByVisibleText("Individual Account");
	        Select cust_123402 = new Select(driver.findElement(By.name("cust_123402")));//Change in Circumstance
	        cust_123402.selectByVisibleText("No");
	        Thread.sleep(1000);
	        Select cust_123408 = new Select(driver.findElement(By.name("cust_123408")));//POA/Signatory Authority/Controlling Person flag
	        cust_123408.selectByVisibleText("No");
	        Select cust_123404 = new Select(driver.findElement(By.name("cust_123404")));//High value Relationship Manager Inquiry
	        cust_123404.selectByVisibleText("Not Conducted");
	        Thread.sleep(1000);
	        Select cust_123405 = new Select(driver.findElement(By.name("cust_123405")));//Reportable Account flag
	        cust_123405.selectByVisibleText("No");
	        Select cust_123403 = new Select(driver.findElement(By.name("cust_123403")));//Flag for Pre-existing High Value Individuals
	        cust_123403.selectByVisibleText("No");
	        Thread.sleep(1000);
	        driver.findElement(By.xpath("//input[@data-autoid='cust_123401_ctrl']")).sendKeys("29/12/2001");
	       // driver.findElement(By.className("acd-btn--brand mh-8")).click();
	        driver.findElement(By.linkText("Next")).click();
	        Thread.sleep(60000);

	        driver.findElement(By.xpath("//div[@class='acid-btn acid-btn--brand']")).click();


	        Thread.sleep(60000);
	        driver.findElement(By.xpath("//a[@data-autoid='FlowNext']")).click();

	        //Login via checker for further process

	        driver.findElement(By.xpath("//*[@id=\"TxtName\"]")).sendKeys("014517");  //Enter user name
	        driver.findElement(By.xpath("//*[@id=\"TxtPassword\"]")).sendKeys("acid_qa"); // Enter Password
	        driver.findElement(By.xpath("//*[@id=\"registration\"]/input")).click();  //Click on login button
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/ul/li[3]/div/div[1]/a[1]")).click(); //Click on Lead Object
	        Thread.sleep(2000);
	        Select QueryCategoryId1 = new Select(driver.findElement(By.name("QueryCategoryId")));//Retail Leads
	        QueryCategoryId1.selectByVisibleText("Retail Leads");//Retail leads
	        Thread.sleep(2000);
	        Select QueryViewId1 = new Select(driver.findElement(By.name("QueryViewId")));//Open A/C Verification Pending Retail
	        Thread.sleep(1000);
	        QueryViewId1.selectByVisibleText("Open A/C Verification Pending Retail");//Open A/C Verification Pending Retail
	        System.out.println("Open A/C Verification Pending Retail");
	        driver.findElement(By.xpath("//a[@class='filterGroup__button acid-btn acid-btn--outline-brand']")).click(); //View can not run automatically first time.
	        Thread.sleep(2000);

	        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));

	        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[contains(@for,'checkbox0')]")));




	        driver.findElement(By.xpath("//label[contains(@for,'checkbox0')]")).click(); //Choose first  check box
	        driver.findElement(By.xpath("//span[@class='acd-btn-circle__icon']")).click(); //Self Assigning lead
	   //       wait.until(By.xpath(ChildWindow))
	        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[normalize-space()='Ok']")));
	        driver.findElement(By.xpath("//button[normalize-space()='Ok']")).click();//Click OK button for notification
	     Thread.sleep(1000);


	     wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("QueryViewId")));

	     Select QueryViewId11 = new Select(driver.findElement(By.name("QueryViewId")));//CRAM Retail Leads Assigned To Me
	     QueryViewId11.selectByVisibleText("CRAM Retail Leads Assigned To Me");//CRAM Retail Leads Assigned To Me
	     //driver.findElement(By.xpath("(//span[@class='acd-link-text'][normalize-space()='00001204'])[1]")).click();
	     Thread.sleep(5000);
	     driver.findElement(By.xpath("//a[@data-autoid='LeadID_0']")).click();
	     driver.findElement(By.xpath("//div[@title='click here to see more actions']")).click();//Click on Custom Action button
	     wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='primary f12 ph-12 truncate ff-medium acd-link-text'][normalize-space()='AML Verification']")));
	     driver.findElement(By.xpath("//span[@class='primary f12 ph-12 truncate ff-medium acd-link-text'][normalize-space()='AML Verification']")).click(); //Click on AML Verification
	     Thread.sleep(3000);
	     wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[normalize-space()='Ok']")));
	     driver.findElement(By.xpath("//button[normalize-space()='Ok']")).click();//Click on ok button post AML Verification
	     //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[normalize-space()='Ok']")));

	    // Generate CIF

	     driver.findElement(By.xpath("//div[@title='click here to see more actions']")).click();//Click on Custom Action Button
	     driver.findElement(By.xpath("//span[@class='primary f12 ph-12 truncate ff-medium acd-link-text'][normalize-space()='Generate CIF']")).click();  //Click on Generate CIF button

	     wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[normalize-space()='Ok']")));
	     driver.findElement(By.xpath("//button[normalize-space()='Ok']")).click();//Click on OK Button



	}

}
