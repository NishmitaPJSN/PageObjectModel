package pom.formc.pages;

import wrappers.GenericWrappers;

public class SignUp extends GenericWrappers
{
	public SignUp enterUserId(String data)
	{
		enterByXpath("(//input[@name='u_id'])[1]",data);
		
		return this;
		
	}
	
	
	public SignUp enterPassword(String data)
	{
		enterByXpath("(//input[@name='u_pwd'])[1]", data);
		
		return this;
		
	}
	
	
	public SignUp enterConfirmPassword(String data)
	{
		enterByXpath("(//input[@name='u_repwd'])[1]", data);
		
		return this;
		
	}
	
	public SignUp enterSequeityQuestion(String data)
	{
		enterByXpath("(//select[@name='u_secques'])[1]", data);// ");
		
		return this;
		
	}
	
	public SignUp enterSequrityAnswer(String data)
	{
		enterByXpath("(//input[@name='u_secans'])[1]", data);
		
		return this;
		
	}
	public SignUp enterUserName(String data)
	{
		enterByXpath("(//input[@name='u_name'])[1]", data);
		
		return this;
		
	}
	public SignUp enterGender()
	{
		clickByXpath("//option[text()=' Female']/parent::select");
		
		return this;
		
	}
	
	public SignUp enterDateOfBirth(String data)
	{
		enterByXpath("(//input[@name='u_dob'])[1]", data);
		
		return this;
		
	}
	
	
	public SignUp enterDesignation(String data)
	{
		enterByXpath("(//input[@name='u_designation'])[1]",data);
		
		return this;
		
	}
	
	
	public SignUp enterEmailAddress(String data)
	{
		enterByXpath("(//input[@name='u_emailid'])[1]", data);
		
		return this;
		
	}
	
	
	public SignUp enterPhoneNumber(String data)
	{
		enterByXpath("(//input[@name='u_mobile'])[1]", data);
		
		return this;
		
	}
	
	
	public SignUp enterMobileNumber(String data)
	{
		enterByXpath("(//input[@name='u_phone'])[1]", data);
		
		return this;
		
	}
	
	/*public SignUp enterYourNationality(String data)
	{
		enterByXpath("(//input[@name='u_nationality'])[1]",data);
		
		return this;
		
	}*/
	
	public SignUp enterYourName(String data)
	{
		enterByXpath("(//input[@name='name'])[1]", data);
		
		return this;
		
	}
	public SignUp enterCapacity(String data)
	{
		enterByXpath("(//input[@name='capacity'])[1]", data);
		
		return this;
		
	}
	
	public SignUp enterAddress(String data)
	{
		enterByXpath("(//textarea[@name='address'])[1]", data);
		
		return this;
		
	}
	
	
	public SignUp enterState(String data)
	{
		enterByXpath("(//select[@name='state'])[1]", data);
		
		return this;
		
	}
	
	public SignUp enterDistrict(String data)
	{
		enterByXpath("(//select[@name='city_distr'])[1]", data);
		
		return this;
		
	}
	
	public SignUp enterAccType()
	{
		clickByXpath("//option[text()=' Guest House']/parent::select");
		
		return this;
		
	}
	
	
	public SignUp enterGrade(String data)
	{
		enterByXpath("(//select[@name='star_rat'])[1]", data);
		
		return this;
		
	}
	public SignUp enterUserEmail(String data)
	{
		enterByXpath("(//input[@name='email'])[1]", data);
		
		return this;
		
	}
	
	public SignUp enterUserMobileNo(String data)
	{
		enterByXpath("(//input[@name='mcontact'])[1]",data);
		
		return this;
		
	}
	
	public SignUp enterUserPhoneNo(String data)
	{
		enterByXpath("(//input[@name='contact'])[1]", data);
		
		return this;
		
	}
	public SignUp enterNewUserName(String data)
	{
		enterByXpath("(//input[@name='name_o'])[1]", data);
		
		return this;
		
	}
	
	public SignUp enterNewUserAddress(String data)
	{
		enterByXpath("//input[@name='address_o']", data);
		
		return this;
		
	}
	
	public SignUp enterStateName(String data)
	{
		enterByXpath("(//select[@name='state_o'])[1]", data);
		
		return this;
		
	}
	
	public SignUp enterCityName()
	{
		clickByXpath("(//option[text()=' UDUPI'])/parent::select");
		
		return this;
		
	}
	
	public SignUp enterEmailId(String data)
	{
		enterByXpath("(//input[@name='emailid_o'])[1]",data);
		
		return this;
		
	}
	
	
	public SignUp enterUserPhoneNumber(String data)
	{
		enterByXpath("(//input[@name='phoneno_o'])[1]", data);
		
		return this;
		
	}
	
	
	
	public SignUp enterUserMobileno(String data)
	{
		enterByXpath("(//input[@name='mobile_o'])[1]", data);
		
		return this;
		
	}
	
	
}
