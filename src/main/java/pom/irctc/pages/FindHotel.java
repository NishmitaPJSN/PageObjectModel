package pom.irctc.pages;

import wrappers.GenericWrappers;

public class FindHotel extends GenericWrappers
{
	public FindHotel clickOnHotels()
	{
		clickByXpath("//h5[contains(text(),'Ramada Plaza by Wyndham Pune Hinjewadi')]");
		
		return this;
	}
	
	
	public BookHotel clickOnBook()
	{
		clickByXpath("//b[contains(text(), 'Continue to Book')]");
		
		return new BookHotel();
	}
	
	public BookHotel enterGstNumber(String data)
	{
		enterByXpath("//input[@name='gstNumber']" ,data);
		
		return new BookHotel();
	}
	
	
	
}
