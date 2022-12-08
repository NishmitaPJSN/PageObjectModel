package pom.phptravels.testcase;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.php.pages.Register;
import wrappers.ProjectWrapeprs;

public class TC011 extends ProjectWrapeprs
{
	
	@BeforeClass
	public void beforeClass()
	{
		testCaseName="TC011";
		testCaseDescription="To verify the registration page for phptravels";
		author="Nishmitha";
		category="Smoke";
		browserName="chrome";
		url="https://www.phptravels.org/register.php";
		
	}
	@Test
	public void phpTraveles()
	{
		
	new Register ()
	
	.enterFirstname("Nishmita")
	
	.enterLastname("Shetty")
	
	.enterEmailAddress("nishmi2125@gmail.com")
	
	.enterPhoneNo("8711200521")
	
	.enterCompanyName("LeShaay")
	
	.enterStreetAddress("Maruthi Galli")
	
	.enterAddress("Neharu Nagar")
	
	.enterCity("Bangalore")
	
	.enterState("karnataka")
	
	.enterPincode("591153")
	
	.enterCountry("India")
	
	.enterMobileNo("997297134")
	
	.enterPassword("nishshetty2@28")
	
	.enterConfirmPassword("nishshetty2@28")
	
	;
}
}