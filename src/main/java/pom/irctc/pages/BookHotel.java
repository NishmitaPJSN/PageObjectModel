package pom.irctc.pages;


import wrappers.GenericWrappers;

public class BookHotel extends GenericWrappers
{
	public BookHotel enterTitle(String data)
	{
		enterByXpath("//select[@name='title']", data);
		
		return this;
	}
	public BookHotel enterUserName(String data)
	{
		enterByXpath("//input[@name='firstName']",data);
		
		return this;
	}
	
	public BookHotel enterLastName(String data)
	{
		enterByXpath("//input[@name='lastName']", data);
		
		return this;
	}
	public BookHotel enterCountry(String data)
	{
		enterByXpath("//select[@name='country']", data);
		
		return this;
	}
	
	public BookHotel enterState(String data)
	{
		enterByXpath("//select[@name='state']", data);
		
		return this;
	}
	
	
	
	public BookHotel enterMobileNo(String data)
	{
		enterByXpath("//input[@name='mobileNo']", data);
		
		return this;
	}
	public BookHotel enterEmailAddress(String data)
	{
		enterByXpath("//input[@name='email']",data);
		
		return this;
	}
	
	public BookHotel enterGstNo(String data)
	{
		enterByXpath("//select[@name='gst']", data);
		
		return this;
	}
	
	
	public Payment clickOnContinue()
	{
		clickByXpath("(//button[@class='btn btn-radius-none yellow-gradient my-0 ml-2'])");
		
		return new Payment();
	}
	public BookHotel enterCompanyName(String data)
	{
		enterByXpath("//input[@name='companyName']", data);
		
		return this;
	}
	
	public BookHotel enterAddress(String data)
	{
		enterByXpath("//input[@name='companyAddress']", data);
		
		return this;
	}
	
	//if gst doesnt show write continue button click code and create payment class
	

	
	
	
	
	
}
