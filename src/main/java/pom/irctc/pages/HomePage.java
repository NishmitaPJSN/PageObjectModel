package pom.irctc.pages;

import wrappers.GenericWrappers;

public class HomePage extends GenericWrappers
{
	public Register clickOnRegister()
	{
		clickByXpath("(//a[@aria-label='Click here to register your account with I.R.C.T.C.'])[1]");
		
		return new Register();
	}

	public HomePage mouseHoverOnHolidays()
	
	{
		mouseHoverByXpath("//a[@aria-label='Menu Holiday']");
		
		return this;
	}

	public HomePage mouseHoverOnStays()
	{
		mouseHoverByXpath("//span[contains(text(), 'Stays')]");
		
		
		return this;
	}

	public Accomodation clickOnLounge()
	
	{
		clickByXpath("//span[contains(text(), 'Lounge')]");
		
		return new Accomodation();
	}
	
	

	
	
}
