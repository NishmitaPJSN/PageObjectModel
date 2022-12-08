package pom.php.pages;

import wrappers.GenericWrappers;

public class Register extends GenericWrappers
{
	public Register enterFirstname(String data)
	{
		enterByXpath("(//input[@id='inputFirstName'])[1]", data);
		
		return this;
	}
	
	public Register enterLastname(String data)
	{
		enterByXpath("(//input[@id='inputLastName'])[1]",data);
		
		return this;
	}
	
	public Register enterEmailAddress(String data)
	{
		enterByXpath("(//input[@id='inputEmail'])[1]", data);
		
		return this;
	}
	
	
	
	public Register enterPhoneNo (String data)
	{
		enterByXpath("(//input[@id='inputPhone'])[1]", data);
		
		return this;
	}
	
	public Register enterCompanyName (String data)
	{
		enterByXpath("(//input[@id='inputCompanyName'])[1]", data);
		
		return this;
	}
	public Register enterStreetAddress (String data)
	{
		enterByXpath("(//input[@id='inputAddress1'])[1]", data);
		
		return this;
	}
	
	
	public Register enterAddress (String data)
	{
		enterByXpath("(//input[@id='inputAddress2'])[1]", data);
		
		return this;
	}
	public Register enterCity (String data)
	{
		enterByXpath("(//input[@id='inputCity'])[1]", data);
		
		return this;
	}
	
	
	public Register enterState (String data)
	{
		enterByXpath("(//input[@id='stateinput'])[1]", data);
		return this;
	}
	
	public Register enterPincode (String data)
	{
		enterByXpath("(//input[@id='inputPostcode'])[1]", data);
		return this;
	}
	
	
	public Register enterCountry (String data)
	{
		enterByXpath("(//select[@id='inputCountry'])[1]", data);
		return this;
	}
	
	public Register enterMobileNo (String data)
	{
		enterByXpath("(//input[@id='customfield2'])[1]", data);
		return this;
	}
	
	public Register enterPassword (String data)
	{
		enterByXpath("(//input[@id='inputNewPassword1'])[1]",data);
		return this;
	}
	
	
	public Register enterConfirmPassword (String data)
	{
		enterByXpath("(//input[@id='inputNewPassword2'])[1]",data);
		return this;
	}
}
