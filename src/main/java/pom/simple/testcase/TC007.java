package pom.simple.testcase;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.simple.pages.HomePage;
import wrappers.ProjectWrapeprs;

public class TC007 extends ProjectWrapeprs
{
	@BeforeClass
	public void beforeClass() 
	{
		testCaseName="TC007";
		testCaseDescription="Simple alert";
		author="Nishmitha";
		category="Smoke";
		browserName="chrome";
		url="https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert";
	}
	
	
	@Test
	public void simpleAlert()
	{
		
	new HomePage()
	
	.switchToFrame()
	
	.clickOnTry()
	
	//String alertText=driver.switchTo().alert().getText(); //get alert text
	
	//System.out.print(alertText);
	
	
	//.clickOnOk()
	
	.clickOnHome();
	
	//.switchToLastWindow();
	
	}
	
}
