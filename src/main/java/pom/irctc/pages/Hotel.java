package pom.irctc.pages;

import wrappers.GenericWrappers;

public class Hotel extends GenericWrappers
{
	public Hotel clickOnGuestUser()
	{
		clickByXpath("(//a[contains(text(),'Guest User Login ')])[1]");
		
		return this;
	}
	public Hotel enterEmailAddress(String data)
	{
		enterByXpath("(//input[@name='email'])[1]",data);
		
		return this;
	}
	public Hotel enterMobileNo(String data)
	{
		enterByXpath("(//input[@name='mobileNo'])[1]",data);
		
		return this;
	}
	public Hotel clickOnSubmit()
	{
		clickByXpath("(//button[@type='submit'])[1]");
		
		return this;
	}
	
	
	 public Hotel enterHotelName(String data)
	 {
		 enterByXpath("(//input[@id='filterText'])[1]",data);
		 
		 return this;
	 }
	 
	 
	 public Hotel enterCheckInDate(String data)
	 {
		 enterByXpath("(//input[@name='dt12'])[1]", data);
		 
		 return this;
	 }
	 
	 public Hotel enterCheckOutDate(String data)
	 {
		 enterByXpath("(//input[@name='dt13'])[1]", data);
		 
		 return this;
	 }
	 
	 public Hotel clickOnRoom()
	 {
		  clickByXpath("(//input[@name='guest'])[1]");
		 
		 return this;
	 }
	 
	 public Hotel enterNoOfRooms(String data)
	 {
		 enterByXpath("(//select[@name='hotelRoom'])[1]", data);
		 
		 return this;
	 }
	 
	 public Hotel enterNoOfAdults(String data)
	 {
		 enterByXpath("(//input[@name='dt13'])[1]", data);
		 
		 return this;
	 }
	 
	 
	 public Hotel clickOnDone()
	 {
		 clickByXpath("(//button[@type='button'])[1]");
		 
		 return this;
	 }
	 
	 
	 public FindHotel findHotel()
	 {
		 clickByXpath("(//button[@class='btn btn-md yellow-gradient home-btn'])[1]");
		 
		 return new FindHotel();
	 }

	 
	 
	 
	 
}