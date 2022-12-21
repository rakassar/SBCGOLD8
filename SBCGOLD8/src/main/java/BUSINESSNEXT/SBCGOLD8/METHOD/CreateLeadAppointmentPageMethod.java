package BUSINESSNEXT.SBCGOLD8.METHOD;


import BUSINESSNEXT.SBCGOLD8.OBJECT.*;
public class CreateLeadAppointmentPageMethod extends HomePageMethod{

	String SDmobilenumber;
	public static String leadid;

//************************Fill the Info for new lead process*****************************-------------//


	public void selectstatuscodeappointment()
	{

		CreateLeadAppointmentPageObject.clk_statuscodeappointment.click();

	}

	public void PreferredDayTime(String time)
	{


		  CreateLeadAppointmentPageObject.clk_ldPreferredDay.click();
		  //CreateLeadAppointmentPageObject.clk_ldPreferredDay.sendKeys();


		//CreateLeadAppointmentPageObject.clk_ldPreferredTime.click();
	    CreateLeadAppointmentPageObject.clk_ldPreferredTime.sendKeys(time);

		//CreateLeadAppointmentPageObject.snd_ldPreferredTime.sendKeys(time);


		 //Select sal=new Select(CreateLeadAppointmentPageObject.snd_ldPreferredTime);

		 //sal.selectByVisibleText(time);


	}

}