package pom.gstvalidation.testcase;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.CovidAlertPage;
import wrappers.ProjectWrapeprs;

public class TC005 extends ProjectWrapeprs

{
	
	@BeforeClass
	public void beforeClass()
	{
		testCaseName="TC005";
		testCaseDescription="Verify the GST validation ";
		author="Nishmitha";
		category="Smoke";
		browserName="chrome";
		url="https://www.irctc.co.in/nget/train-search";
		
	}
	
	@Test
	public void hotelGst()
	{
		new CovidAlertPage()
		
		.clickOnOk()
		
		.mouseHoverOnHolidays()
		
		.mouseHoverOnStays()
		
		.clickOnLounge()
		
		.clickOnSideBar()
		
		.clickOnHotel()
		
		.clickOnLogin()
		
		.clickOnGuestUser()
		
		.enterEmailAddress("messileo@gmail.com")
		
		.enterMobileNo("8755412010")
		
		.clickOnSubmit()
		
		.enterHotelName("Pune - Maharashtra")
		
		.enterCheckInDate("30-09-2022")
		
		.enterCheckOutDate("01-10-2022")
		
		.clickOnRoom()
		
		.enterNoOfRooms("1")
		
		.enterNoOfAdults("3")
		
		.clickOnDone()
		
		.findHotel()
		
		.clickOnHotels()
		
		.clickOnBook()
		
		.enterTitle("Mr")
		
		.enterUserName("Messi")
		
		.enterLastName("leo")
		
		.enterCountry("India")
		
		.enterState("karnataka")
		
		.enterMobileNo("8722104155")
		
		.enterEmailAddress("messileo@gmail.com")
		
		.enterGstNo("yes")
		
		.enterCompanyName("Le shaay")
		
		.enterAddress("manipal")
		;
	
	}
}
