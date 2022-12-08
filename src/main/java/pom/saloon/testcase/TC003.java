package pom.saloon.testcase;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.CovidAlertPage;
import wrappers.ProjectWrapeprs;

public class TC003 extends ProjectWrapeprs

{
	
	@BeforeClass
	public void beforeClass()
	{
		testCaseName="TC003";
		testCaseDescription="To verify the registration for saloon booking";
		author="Nishmitha";
		category="Smoke";
		browserName="chrome";
		url="https://www.irctc.co.in/nget/train-search";
		
	}
	
	@Test
	 public void saloon()
	 {
		 
	new CovidAlertPage()
	
	.clickOnOk()
	
	.mouseHoverOnHolidays()
	
	.mouseHoverOnStays()
	
	.clickOnLounge()
	
	.clickOnSideBar()
	
	.clickOnCharter()
	
	.clickOnEnquiryForm()
	
	.enterApplicantName("John")
	
	.enterOrganizationName("Federal")
	
	.enterAddress("Belgavai")
	
	.enterMobileNo("8752412010")
	
	.enterEmail("johnsin@gmail.com")
	
	.enterRequest("Saloon Charter")
	
	.enterSourceAddress("Bangalore")
	
	.enterDestinationAddress("Pune")
	
	.enterCheckInDate("29-09-2022")
	
	.enterCheckOutDate("01-10-2022")
	
	.enterDuration("3")
	
	.enterCoachDetails("1AC")
	
	.enterNoOfPassengers("1")
	
	.enterNoOfPassenger("1")
	
	.enterPurposeOfVisit("business")
	
	.enterService("Lunch and Dinner")
	
	.clickOnSubmit()
	
	;
	 }	
}
