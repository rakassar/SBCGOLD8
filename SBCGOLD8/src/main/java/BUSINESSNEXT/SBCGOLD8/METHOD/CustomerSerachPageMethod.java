package BUSINESSNEXT.SBCGOLD8.METHOD;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.support.ui.Select;

import BUSINESSNEXT.SBCGOLD8.OBJECT.*;

public class CustomerSerachPageMethod extends HomePageMethod {


public void ClickOnOnBoardingJourneynext()

  	{
  	   //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));

  	 CustomerSearchPageObject.clk_salesonbaordingjourneynext.click();
  	}


public void ClickOnOnBoardingJourneynext2()

	{
	   //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));

	 CustomerSearchPageObject.clk_salesonbaordingjourneynext2.click();
	}

public void BBNFillForCustomerSearch(String BBN)

	{
	 CustomerSearchPageObject.ent_fillBBNnumber.click();
	 CustomerSearchPageObject.ent_fillBBNnumber.sendKeys(BBN);

	}

public void ChooseBBNfromList()

{
 CustomerSearchPageObject.clk_topBBN.click();

}


public void clickonredbutton()

{
 CustomerSearchPageObject.btn_redbutton.click();

}

public void clickstartjourney()

{
 CustomerSearchPageObject.btn_clickstartjourney.click();

}

public void switchCustomerView()

{
 CustomerSearchPageObject.btn_clickSwitchView.click();

}

public void clickBulkAccountOpeningTab()

{
 CustomerSearchPageObject.btn_BulkAccountOpening.click();

}

public void clickNewPayrollRequest()

{
 CustomerSearchPageObject.btn_clickNewPayrollRequest.click();

}


public void ETBIndividualSalesJorney()

{
	String mainWindowHandle = driver.getWindowHandle();
	System.out.println("Main Window"+mainWindowHandle);
	Set<String> multiplewindows=driver.getWindowHandles();
	Iterator<String> iterator = multiplewindows.iterator();
   while (iterator.hasNext()) {
             String ChildWindow = iterator.next();
             if (!mainWindowHandle.equalsIgnoreCase(ChildWindow)) {
             System.out.println("Child Window"+ ChildWindow);
             driver.switchTo().window(ChildWindow);
             CustomerSearchPageObject.btn_ETBIndividualSalesJorney.click();
             driver.switchTo().window(mainWindowHandle);
 }
}

}

public void CustomerServiceJourney()

{
	
    Set<String> multiplewindows=driver.getWindowHandles();
    Iterator<String> iterator = multiplewindows.iterator();
    String mainWindow = iterator.next();
    System.out.println("Main Window"+mainWindow);
    String ChildWindow = iterator.next();
    System.out.println("Child Window"+ ChildWindow);
    driver.switchTo().window(ChildWindow);
    CustomerSearchPageObject.clk_CustomerServiceJourney.click();

}

public void ClickOnNextButtonOnCustomerSearch()

	{
	   //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));

	 CustomerSearchPageObject.clk_NextOnCustomerSerach1.click();
	}

public void BBNFillForCustomerSearchNonIndi(String BBN)

{
 CustomerSearchPageObject.ent_fillBBNnumberNonIndi.click();
 CustomerSearchPageObject.ent_fillBBNnumberNonIndi.sendKeys(BBN);

}
public void ChooseBBNfromListNonIndi()

{
 CustomerSearchPageObject.clk_topBBNNonIndi.click();

}
public void chooseCstmerToSrch(String value)

{
 Select s1 = new Select(CustomerSearchPageObject.sel_chooseCstmerToSrch);
 s1.selectByVisibleText(value);

}



}
