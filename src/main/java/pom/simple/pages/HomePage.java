package pom.simple.pages;


import wrappers.GenericWrappers;

public class HomePage extends GenericWrappers
{

	
	public HomePage switchToFrame()
	{
		switchToFrameByXPath("//iframe[contains(@id,'iframeResult')]");
		
		return this;
	}
	
	
	public Try clickOnTry()
	{
		clickByXpath("(//button[text()='Try it'])[1]");
		
		return new Try();
	}
	
	
}
