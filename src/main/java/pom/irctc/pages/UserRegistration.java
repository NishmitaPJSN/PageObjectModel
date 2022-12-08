package pom.irctc.pages;

import wrappers.GenericWrappers;

public class UserRegistration extends GenericWrappers

{
	public UserRegistration enterUserId(String data)
	{
		enterByXpath("(//input[@id='userId'])[1]", data);
		
		return this;
	}
	


	public UserRegistration enterPassword(String data)
	{
		enterByXpath("(//input[@id='password'])[1]", data);
		
		return this;
	}
	

	public UserRegistration enterConfirmPwd(String data)
	{
		enterByXpath("(//input[@id='cnfPassword'])[1]", data);
		
		return this;
	}
	
	public UserRegistration enterSequrityQuestion(String data)
	{
		enterByXpath("(//select[@id='secQstn'])[1]", data);
		
		return this;
	}
	
	public UserRegistration enterSequrityAnswer(String data)
	{
		enterByXpath("(//input[@id='secAnswer'])[1]", data);
		
		return this;
	}
	public UserRegistration enterDateOfBirth(String data)
	{
		enterByXpath("(//input[@id='dateOfBirth'])[1]", data);
		
		return this;
	}
	
	public UserRegistration enterGender()
	{
		clickByXpath("(//input[@value='F'])[1]");
		
		return this;
	}
	
	
	public UserRegistration enterMaritalStatus()
	{
		clickByXpath("(//input[@value='UnMarried'])[1]");
		
		return this;
	}
	
	public UserRegistration enterEmail(String data)
	{
		enterByXpath("(//input[@id='email'])[1]", data);
		
		return this;
	}
	
	public UserRegistration enterOccupation(String data)
	{
		enterByXpath("(//select[@id='occupation'])[1]",data);
		
		return this;
	}
	public UserRegistration enterFirstName(String data)
	{
		enterByXpath("(//input[@id='fname'])[1]",data);
		
		return this;
	}
	
	public UserRegistration enterMiddleName(String data)
	{
		enterByXpath("(//input[@id='mname'])[1]", data);
		
		return this;
	}
	
	public UserRegistration enterLastName(String data)
	{
		enterByXpath("(//input[@id='lname'])[1]", data);
		
		return this;
	}
	
	public UserRegistration enterNation(String data)
	{
		enterByXpath("(//select[@id='natinality'])[1]", data);
		
		return this;
	}
	
	public UserRegistration enterFlatNo(String data)
	{
		enterByXpath("(//input[@id='flatNo'])[1]", data);
		
		return this;
	}
	
	public UserRegistration enterStreetAddress(String data)
	{
		enterByXpath("(//input[@id='street'])[1]", data);
		
		return this;
	}
	
	
	public UserRegistration enterAreaAddress(String data)
	{
		enterByXpath("(//input[@id='area'])[1]", data);
		
		return this;
	}
	public UserRegistration enterCountry(String data)
	{
		enterByXpath("(//select[@id='country'])[1]", data);
		
		return this;
	}
	
	
	public UserRegistration enterPincode(String data)
	{
		enterByXpath("(//input[@id='pincode'])[1]", data);
		
		return this;
	}
	public UserRegistration enterPostOffice(String data)
	{
		enterByXpath("(//select[@id='postOffice'])[1]", data);
		
		return this;
	}
	
	
	public UserRegistration enterMobileNo(String data)
	{
		enterByXpath("(//input[@id='mobile'])[1]", data);
		
		return this;
	}
	
	public UserRegistration clickOnNo()
	{
		clickByXpath("(//input[@value='n'])[1]");
		
		return this;
	}
	
	
	public UserRegistration enterFlatsNo(String data)
	{
		enterByXpath("(//input[@id='flatNoOffice'])[1]",data);
		
		return this;
	}
	public UserRegistration enterStreetsAddress(String data)
	{
		enterByXpath("(//input[@id='streetOffice'])[1]", data);
		
		return this;
	}
	
	
	public UserRegistration enterYourAreaAddress(String data)
	{
		enterByXpath("(//input[@id='areaOffice'])[1]", data);
		
		return this;
	}
	
	public UserRegistration enterPincodes(String data)
	{
		enterByXpath("(//input[@id='pincodeOffice'])[1]", data);
		
		return this;
	}
	public UserRegistration enterMobileNumbers(String data)
	{
		enterByXpath("(//input[@id='mobileOffice'])[1]", data);
		
		return this;
	}
	
	
	public UserRegistration enterOfficePost(String data)
	{
		enterByXpath("(//select[@id='postOfficeOffice'])[1]",data );//"M.K.Hubli S.F. S.O"
		
		return this;
	}
}
