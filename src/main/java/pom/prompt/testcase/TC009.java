package pom.prompt.testcase;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.simple.pages.HomePage;
import wrappers.ProjectWrapeprs;

public class TC009 extends ProjectWrapeprs

{
	
	@BeforeClass
	public void beforeClass() {
		testCaseName="TC009";
		testCaseDescription="Prompt alert";
		author="Nishmitha";
		category="Smoke";
		browserName="chrome";
		url="https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert";
		
	}
	
	@Test
	public void promptAlert()
	{
		
	
	new HomePage()
	
	.switchToFrame()
	
	.clickOnTry()

	.enterUserName("Nishmita")
	
	//.clickOnOk()
	
	.clickOnHome()
	
	.switchToLastWindow();
	}
}
