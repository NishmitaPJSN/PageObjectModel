package pom.confirmation.testcase;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.simple.pages.HomePage;
import wrappers.ProjectWrapeprs;

public class TC008 extends ProjectWrapeprs


{
	@BeforeClass
	public void beforeClass() {
		testCaseName="TC008";
		testCaseDescription="Confirmation alert";
		author="Nishmitha";
		category="Smoke";
		browserName="chrome";
		url="https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert";
		
	}
	
	@Test
	public void confirmationAlert()
	{
		
		
	new HomePage()
	
	.switchToFrame()
	
	.clickOnTry()
	
	
	.clickOnHome()
	
	.switchToLastWindow();
	
	}
}
