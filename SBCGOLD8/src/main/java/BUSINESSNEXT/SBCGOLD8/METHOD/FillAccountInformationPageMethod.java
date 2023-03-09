package BUSINESSNEXT.SBCGOLD8.METHOD;

import org.openqa.selenium.support.ui.Select;

import BUSINESSNEXT.SBCGOLD8.OBJECT.*;

public class FillAccountInformationPageMethod  extends HomePageMethod{

	//Customer Customer Profile Section

	public void RequestType(String requestType)
    {
    	Select sel=new Select(FillAccountInformationPageObject.sel_RequestTypef);
    	//sel.selectByValue(Product);
    	sel.selectByVisibleText(requestType);
    }
	public void Purposeofaccountopening(String Purposeofaccountopening)
    {
    	Select sel=new Select(FillAccountInformationPageObject.sel_Purposeofaccountopening);
    	//sel.selectByValue(Product);
    	sel.selectByVisibleText(Purposeofaccountopening);
    }

	public void PromsEmail(String PromsEmail)
    {
    	Select sel=new Select(FillAccountInformationPageObject.sel_PromsEmail);
    	//sel.selectByValue(Product);
    	sel.selectByVisibleText(PromsEmail);
    }

	public void sel_PromsSMS(String PromsSMS)
    {
    	Select sel=new Select(FillAccountInformationPageObject.sel_PromsSMS);
    	//sel.selectByValue(Product);
    	sel.selectByVisibleText(PromsSMS);
    }

	public void TransactionalEmail(String TransactionalEmail)
    {
    	Select sel=new Select(FillAccountInformationPageObject.sel_TransactionalEmail);
    	//sel.selectByValue(Product);
    	sel.selectByVisibleText(TransactionalEmail);
    }

	public void TransactionalSMS(String TransactionalSMS)
    {
    	Select sel=new Select(FillAccountInformationPageObject.sel_TransactionalSMS);
    	//sel.selectByValue(Product);
    	sel.selectByVisibleText(TransactionalSMS);
    }


	public void ADBRequired(String ADBRequired)
    {
    //CRRSCLeadPageObject.ent_RemarksRRSC.click();
		FillAccountInformationPageObject.ent_ADBRequired.sendKeys(ADBRequired);

     }

	public void ClickFillAccountInformation()
    {
		FillAccountInformationPageObject.clk_FillAccountInformation.click();
    }
	
	public void PromoCode() throws InterruptedException
    {
		FillAccountInformationPageObject.pic_promoPicker.click();
		Thread.sleep(500);
		FillAccountInformationPageObject.pic_promoSelect.click();
    }
	


}
