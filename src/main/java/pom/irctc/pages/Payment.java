
package pom.irctc.pages;

import wrappers.GenericWrappers;

public class Payment  extends GenericWrappers
{
	public Payment clickOnAgree()
	{
		clickByXpath("//span[@class='checkmark']");
		
		return this;
	}
	
	public Payment clickOnPayment()
	{
		clickByXpath("//button[@class='btn btn-radius-none yellow-gradient my-0 ml-2']");
		
		return this;
	}
	
	
	public Otp clickOnOtp()
	{
		clickByXpath("//input[@name='otp']");
		
		return new Otp();
	}
}
