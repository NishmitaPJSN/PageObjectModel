package pom.facebook.pages;

import wrappers.GenericWrappers;

public class CreateAccount  extends GenericWrappers
{
  public CreateAccount enterFirstName(String data)
  {
	  enterByXpath(prop.getProperty("CreateAccount.enterFirstName.XPath"), data);
	  
	  return this;
  }
  
  
  public CreateAccount enterSurName(String data)
  {
	  
	  enterByXpath(prop.getProperty("CreateAccount.enterSurName.XPath"), data);
	  
	  return this;
  }
  
  
  public CreateAccount enterEmailAddress(String data)
  {
	  
	  enterByXpath(prop.getProperty("CreateAccount.enterEmailAddress.XPath"), data);
	  
	  return this;
  }
  
  public CreateAccount enterConfirmEmailAddress(String data)
  {
	  
	  enterByXpath(prop.getProperty("CreateAccount.enterConfirmEmailAddress.XPath"), data);
	  
	  return this;
  }
  
  public CreateAccount enterMobileNumber(String data)
  {
	  
	  enterByXpath(prop.getProperty("CreateAccount.enterMobileNumber.XPath"), data);
	  
	  return this;
  }
  

  public CreateAccount enterDateOfBirth(String data)
  {
	  
	  enterByXpath(prop.getProperty("CreateAccount.enterDateOfBirth.Xpath"), data);
	  
	  return this;
  }
	  
  public CreateAccount enterMonthOfBirth(String data)
  {
	  enterByXpath(prop.getProperty("CreateAcoount.enterMonthOfBirth.XPath"),data);
	  
	  return this;
	  
	  
  }
  public CreateAccount enterYearOfBirth(String data)
  {
	  enterByXpath(prop.getProperty("CreateAccount.enterYearOfBirth.XPath"),data);
	  
	  return this;
	  
  }
  
  
  public CreateAccount clickOnGender()
  {
	  
	  clickByXpath(prop.getProperty("CreateAccount.clickOnGender.XPath"));
	  
	 // clickByXpath("//label[text()='Female']");
	  
	  return this;
  }
  
  
  
}
