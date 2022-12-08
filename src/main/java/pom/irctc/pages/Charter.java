package pom.irctc.pages;


import wrappers.GenericWrappers;

public class Charter extends GenericWrappers
{
	public Charter enterApplicantName(String data)
	{
		enterByXpath("(//input[@name='name'])[1]",data);
		
		return this;
	}
	public Charter enterOrganizationName(String data)
	{
		enterByXpath("(//input[@name='organization'])[1]", data);
		
		return this;
	}
	
	public Charter enterAddress(String data)
	{
		enterByXpath("(//input[@name='address'])[1]", data);
		
		return this;
	}
	
	
	public Charter enterMobileNo(String data)
	{
		enterByXpath("(//input[@name='mobile'])[1]", data);
		
		return this;
	}
	public Charter enterEmail(String data)
	{
		enterByXpath("(//input[@name='email'])[1]", data);
		
		return this;
	}
	public Charter enterRequest(String data)
	{
		enterByXpath("(//select[@name='requestFor'])[1]", data); //CLICKbyxpathtry
		
		return this;
	}
	public Charter enterSourceAddress(String data)
	{
		enterByXpath("(//input[@name='originStation'])[1]", data); //CLICKbyxpathtry
		
		return this;
	}
	public Charter enterDestinationAddress(String data)
	{
		enterByXpath("(//input[@name='destnStation'])[1]", data); //CLICKbyxpathtry
		
		return this;
	}
	
	
	public Charter enterCheckInDate(String data)
	{
		enterByXpath("(//input[@name='checkInDate'])[1]", data); //CLICKbyxpathtry
		
		return this;
	}
	public Charter enterCheckOutDate(String data)
	{
		enterByXpath("(//input[@name='checkOutDate'])[1]", data); //CLICKbyxpathtry
		
		return this;
	}
	
	
	public Charter enterDuration(String data)
	{
		enterByXpath("(//input[@name='durationPeriod'])[1]", data); //CLICKbyxpathtry
		
		return this;
	}
	public Charter enterCoachDetails(String data)
	{
		enterByXpath("(//input[@name='coachDetails'])[1]", data); //CLICKbyxpathtry
		
		return this;
	}
	
	public Charter enterNoOfPassengers(String data)
	{
		enterByXpath("(//input[@name='numPassenger'])[1]", data); //CLICKbyxpathtry
		
		return this;
	}
	public Charter enterNoOfPassenger(String data)
	{
		enterByXpath("(//input[@name='numPassenger'])[2]", data); //CLICKbyxpathtry
		
		return this;
	}
	public Charter enterPurposeOfVisit(String data)
	{
		enterByXpath("(//textarea[@name='charterPurpose'])[1]", data); //CLICKbyxpathtry
		
		return this;
	}
	public Charter enterService(String data)
	{
		enterByXpath("(//textarea[@name='services'])[1]", data); //CLICKbyxpathtry
		
		return this;
	}
	public Charter clickOnSubmit()
	{
		clickByXpath("(//button[@type='Submit'])[1]");
		
		return this;
	}
}
