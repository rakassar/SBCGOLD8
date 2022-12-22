package BUSINESSNEXT.SBCGOLD8.METHOD;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import BUSINESSNEXT.SBCGOLD8.OBJECT.*;
public class CreateLeadAppointmentPageMethod extends HomePageMethod{

	String SDmobilenumber;
	public static String leadid;

//************************Fill the Info for new lead process*****************************-------------//


	public void selectstatuscodeappointment()
	{

		CreateLeadAppointmentPageObject.clk_statuscodeappointment.click();

	}

	public void PreferredDayTime()
	{
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy");  
		LocalDateTime now = LocalDateTime.now().plusDays(1); 
		System.out.println(dtf.format(now));

		  CreateLeadAppointmentPageObject.clk_ldPreferredDay.sendKeys(dtf.format(now));
		  //CreateLeadAppointmentPageObject.clk_ldPreferredDay.sendKeys();


		//CreateLeadAppointmentPageObject.clk_ldPreferredTime.click();
	    CreateLeadAppointmentPageObject.clk_ldPreferredTime.sendKeys("11:50 PM");

		//CreateLeadAppointmentPageObject.snd_ldPreferredTime.sendKeys(time);


		 //Select sal=new Select(CreateLeadAppointmentPageObject.snd_ldPreferredTime);

		 //sal.selectByVisibleText(time);


	}

}