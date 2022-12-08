package pom.bookcoach.testcase;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

//import pom.irctc.pages.Accomodation;
import pom.irctc.pages.CovidAlertPage;
import wrappers.ProjectWrapeprs;

public class TC002 extends ProjectWrapeprs
{
	
	@BeforeClass
	public void beforeClass()
	{
		testCaseName="TC002";
		testCaseDescription="To verify the registration for booking the irctc ";
		author="Nishmitha";
		category="Smoke";
		browserName="chrome";
		url="https://www.irctc.co.in/nget/train-search";
		
	}
		@Test
		public void bookCoach()
		{
			new CovidAlertPage()
			
			
		
			.clickOnOk()
			
			.mouseHoverOnHolidays()
			
			.mouseHoverOnStays()
			
			.clickOnLounge()
			
			.clickOnSideBar()
			
			.bookYourCoach()
			
			.clickOnSignUp()
			
			.enterUserId("Nishmita@28")
			
			.enterPassword("nishmitash@28")
			
			.enterConfirmPwd("nishmitash@28")
			
			.enterSequrityQuestion("What is your all time favorite sports team?")
			
			.enterSequrityAnswer("Fc Barcelona ")
			
			.enterDateOfBirth("28-06-1996")
			
			.enterGender()
			
			.enterMaritalStatus()
			
			.enterEmail("nishmi123@gmail.com")
			
			.enterOccupation("Student")
			
			.enterFirstName("Nishmita")
			
			.enterMiddleName("Padmanabha")
			
			.enterLastName("shetty")
			
			.enterNation("India")
			
			.enterFlatNo("121")
			
			.enterStreetAddress("HanumanNagar")
			
			.enterAreaAddress("vijaynagar")
			
			.enterCountry("India")
			
			.enterPincode("591153")
			
			.enterPostOffice("Kadrolli B.O")
			
			.enterMobileNo("8722102530")
			
			.clickOnNo()
			
			.enterFlatsNo("12")
			
			.enterStreetsAddress("maruthi str")
			
			.enterYourAreaAddress("Tenkanidiyoor")
			
			.enterPincodes("591153")
			
			.enterMobileNumbers("9975246103")
			
			.enterOfficePost("M.K.Hubli S.F. S.O");
			
			
			
		}
		
		
	
	
}
