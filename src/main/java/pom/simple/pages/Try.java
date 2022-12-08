package pom.simple.pages;

import wrappers.GenericWrappers;

public class Try extends GenericWrappers
{

	/*public Try clickOnOk()
	  {
		  clickByXpath("(//p[@id='demo'])[1]");
		  
		  return this;
	  }*/
	
	
	public Try enterUserName(String data)
	{
		enterByXpath("//p[@id='demo']", data);
		
		return this;
	}
	
	
	


	 public MainWebPage clickOnHome()
		{
			clickByXpath("(//a[@id='tryhome'])[1]");
			
			return new MainWebPage();
		}
	
}
