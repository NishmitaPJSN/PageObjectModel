package pom.facebook.pages;

import wrappers.GenericWrappers;

public class HomePage extends GenericWrappers 
{
	public CreateAccount clickOnCreateAccount()
	{
		
		clickByXpath(prop.getProperty("HomePage.CreateAccount.XPath"));
		
		return new CreateAccount();
	}
	
	
}
