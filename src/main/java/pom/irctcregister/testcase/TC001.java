package pom.irctcregister.testcase;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.CovidAlertPage;
import wrappers.ProjectWrapeprs;

public class TC001 extends ProjectWrapeprs

{
	
	@BeforeClass
	public void beforeClass()
	{
		testCaseName="TC001";
		testCaseDescription="To verify the registration for irctc ";
		author="Nishmitha";
		category="Smoke";
		browserName="chrome";
		url="https://www.irctc.co.in/nget/train-search";
		
	}
@Test	
	public void registration()
	{
		
	
	new CovidAlertPage()
	
	.clickOnOk()
	
	.clickOnRegister()
	
	.enterUserName("Nishmita")
	
	.enterPassword("Nishmita@28")
	
	.enterConfirmPwd("Nishmita@28")
	
	.enterLanguage("English")
	
	.enterSequrityQuestion("What is your all time favorite sports team?")
	
	.enterYourAnswer("FC barcelona")
	
	.clickOnNext()
	
	.enterUserFirstname("Nishmita")
	
	.enterUserMiddlename("Padmanabha")
	
	.enterUserLastname("Shetty")
	
	.enterYourOccupation("Student")
	
	.ClickOnDateOfBirth()
	
	.enterYourDateOfBirth()
	
	.enterMaritalStatus()
	
	.enterYourGender()
	
	.EnterYourCountry("india")
	
	.enterEmail("nishshetty@gmail.com")
	
	.enterMobileNumber("8722102450")
	
	.enterNationality("India")
	
	.ClickOnNext()
	
	.enterFlatNo("12")
	
	.enterStreetLane("market road")
	
	.enterAddress("Hanuman Nagar")
	
	.enterPincode("591153")
	
	.enterState("Karnataka")
	
	.enterCity("Belgaum")
	
	.enterPostOffice("M.K.Hubli S.F. S.O")
	
	.enterMobileNo("8755415120")
	
	.clickOnAddress()
	
	.enterOfficeFlatNo("3")
	
	.enteroffStreetAddress(" market street")
	
	.enterOfficeArea("Manyatha Tech Park")
	
	.enternNation("India")
	
	.enterPincodes("591153")
	
	.enterOfficeState("Karnataka")

	.enterOfficeCity("Udupi")
	
	.enterOfficePost("Hebbal")
	
	.enterOfficePhoneNumber("9972297134")
	
	.clickOnCheckBox()
	
	;
	}
}
