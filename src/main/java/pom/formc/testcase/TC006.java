
package pom.formc.testcase;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.formc.pages.HomePage;
import wrappers.ProjectWrapeprs;

public class TC006 extends ProjectWrapeprs
{
	
	
	@BeforeClass
	public void beforeClass()
	{
		testCaseName="TC006";
		testCaseDescription="To verify the user sign up page for FormC";
		author="Nishmitha";
		category="Smoke";
		browserName="chrome";
		url="https://indianfrro.gov.in/frro/FormC/menuuserreg.jsp";
		
	}
	
	@Test
	public void formPage()
	{
		
		
	new HomePage()
		
	.clickOnSignUp()
	
	.enterUserId("Nishmita@28")
	
	.enterPassword("nishmitash@28")
	
	.enterConfirmPassword("nishmitash@28")
	
	.enterSequeityQuestion("What is the name of the hospital where you were born?")
	
	.enterSequrityAnswer("KMC")
	
	.enterUserName("Nishmita")
	
	.enterGender()
	
	.enterDateOfBirth("28/06/1996")
	
	.enterDesignation("Student")
	
	.enterEmailAddress("nishmitash@gmail.com")
	
	.enterPhoneNumber("9972297124")
	
	.enterMobileNumber("8722154020")
	
	//.enterYourNationality("INDIA")
	
	.enterYourName("Nishmita")
	
	.enterCapacity("2")
	
	.enterAddress("karnataka belgaum")
	
	.enterState("Karnataka")
	
	.enterDistrict("Belgaum")
	
	.enterAccType()
	
	.enterGrade("3s")
	
	.enterUserEmail("nishmi2125@gmail.com")
	
	.enterUserMobileNo("9972297134")
	
	.enterUserPhoneNo("0820567102")
	
	.enterNewUserName("Nisha")
	
	.enterNewUserAddress("Bangalore")
	
	.enterStateName("Karnataka")
	
	.enterCityName()
	
	.enterEmailId("nisha641@gmail.com")
	
	.enterUserPhoneNumber("99722974154")
	
	.enterUserMobileno("8722104521")
	;
	}
}
