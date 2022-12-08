package pom.facebook.testcase;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pom.facebook.pages.HomePage;
import wrappers.ProjectWrapeprs;

public class TC010 extends ProjectWrapeprs
{
	
	@BeforeClass
	public void beforeClass() {
		testCaseName="TC010";
		testCaseDescription="to verify Facebook registration for the new user sign up";
		author="Nishmita";
		category="Smoke";
		browserName="chrome";
		url="https://www.facebook.com";
		sheetName="TC010";
	}
	
	@Test(dataProvider="fetchData")
	public void facebook(String firstname, String lastname, String email, String confirmEmail, String password, String dob, String birthMonth,
			String Year)
	{
		
	new HomePage()
	
	.clickOnCreateAccount()
	
	.enterFirstName(firstname)
	
	.enterSurName(lastname)
	
	.enterEmailAddress(email)
	
	.enterConfirmEmailAddress(confirmEmail)
	
	.enterMobileNumber(password)
	
	.enterDateOfBirth(dob)
	
	.enterMonthOfBirth(birthMonth)
	
	.enterYearOfBirth(Year)
	
	.clickOnGender();
	
}
	
	}
