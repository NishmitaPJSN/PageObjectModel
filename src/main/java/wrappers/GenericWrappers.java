package wrappers;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
//import java.io.IOException;
//import java.io.IOException;
import java.util.Set;
//import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
//import org.apache.commons.io.FileUtils;
import org.openqa.selenium.ElementClickInterceptedException;

import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.ElementNotSelectableException;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.OutputType;
//import org.openqa.selenium.OutputType;
import org.openqa.selenium.SessionNotCreatedException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.interactions.internal.MouseAction;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

import utils.Reporting;

public class GenericWrappers extends Reporting implements Wrappers
{

	public static RemoteWebDriver driver;
	
	//int i=1;
	
	public static Properties prop;
	
	public void loadObjects()
	{
		
	try {
			prop=new Properties();
			
			prop.load(new FileInputStream("./src/test/java/object.properties"));
				
	}
	catch(FileNotFoundException e)
	{
		
	e.printStackTrace();
	}
	catch(IOException e)
	{
		e.printStackTrace();
	}
	}
	
	public void unloadObjects()
	{
		prop=null;
	}
	public void invokeApp(String browser, String url) 
	{
		
		try {
			
			if(browser.equalsIgnoreCase("chrome"))
			{
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				
				 driver=new ChromeDriver();
				
			}
			else if(browser.equalsIgnoreCase("firefox"))
			{
				System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
				
				 driver=new FirefoxDriver();
			}
			
			else if(browser.equalsIgnoreCase("ie"))
			{
				System.setProperty("webdriver.ie.driver","./drivers/iedriver.exe");
				
				 driver=new InternetExplorerDriver();
			}
			
			driver.manage().window().maximize();
			
			driver.get(url);
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			
			
			//System.out.println("The browser "+browser+" is launched with the given url "+url+" Successfully");	
			
			reportStep("The browser "+browser+" is launched with the given url "+url+" Successfull", "pass");
			
		}
		
		catch (SessionNotCreatedException e) 			
		{
			
			
			//System.err.println("The browser "+browser+" is not launched with the given url "+url+" due to session id not created error");
			
			reportStep("The browser "+browser+" is not launched with the given url "+url+" due to session id not created error", "fail");
		}
		catch(InvalidArgumentException e)   
		{
			//System.err.println("The browser "+browser+" is not launched as the given url "+url+" does not contain http or https");
			
			reportStep("The browser "+browser+" is not launched as the given url "+url+" does not contain http or https", "fail");
		}
		
		catch(WebDriverException e)			
		{
			//System.err.println("The browser "+browser+" is not launched due to unknown error");
			
			reportStep("The browser "+browser+" is not launched due to unknown error", "fail");
		}	
		
	}
	
	public void enterById(String idValue, String data) 
	{
		
		
		try {
			driver.findElementById(idValue).sendKeys(data);
			
			//System.out.println("The element with the id "+idValue+" is entered with data "+data+"");
			
			
			reportStep("The element with the id "+idValue+" is entered with data "+data+"", "pass");
		} 
		
		catch(ElementClickInterceptedException e)
		{
			//System.out.println("The element with the id "+idValue+" click is intercepted");
			
			reportStep("The element with the id "+idValue+" click is intercepted", "fail");
		}
		catch (NoSuchElementException e) 
		{
			//System.err.println("The element with the id "+idValue+" is not found in the DOM");
			
			reportStep("The element with the id "+idValue+" is not found in the DOM", "fail");
		}
		catch(ElementNotVisibleException e)
		{
			//System.err.println("The element with the id "+idValue+" is not visible in the Application");
			
			reportStep("The element with the id "+idValue+" is not visible in the Application", "fail");
		}
		
		catch(StaleElementReferenceException e)
		{
			//System.err.println("The element with the id "+idValue+" is not stable in the application");
			
			reportStep("The element with the id "+idValue+" is not stable in the application", "fail");
		}
		
		catch(ElementNotInteractableException e)
		{
			//System.err.println("The element with the id "+idValue+" is not interactable with the application");
			
			reportStep("The element with the id "+idValue+" is not interactable with the application", "fail");
			
		}
		catch(UnhandledAlertException e)
		{
			//System.err.println("Unexpected alert occured in the application");
			
			reportStep("Unexpected alert occured in the application", "fail");
			
		}
		
		
		catch(WebDriverException e)
		{
			//System.err.println("The element with the id "+idValue+" is not entered with data "+data+" due to unknown error");
			
			reportStep("The element with the id "+idValue+" is not entered with data "+data+" due to unknown error", "fail");
		}

		
	}

	public void enterByName(String nameValue, String data) 
	{
	
				try {
					driver.findElementByName(nameValue).sendKeys(data);
					
					//System.out.println("The element with the name "+nameValue+", is entered with the data "+data+" Successfully");
					
					reportStep("The element with the name "+nameValue+", is entered with the data "+data+" Successfully", "pass");
					
				
			} 
				catch(ElementClickInterceptedException e)
				{
					//System.out.println("The element with the name "+nameValue+" click is intercepted");
					
					reportStep("The element with the name "+nameValue+" click is intercepted", "fail");
				}
				
				catch (ElementNotInteractableException e)
				{
					//System.err.println("The element with the name "+nameValue+" is not interactable in the application");
					
					reportStep("The element with the name "+nameValue+" is not interactable in the application", "fail");
					
				}
				
				catch(StaleElementReferenceException e)
				{
					//System.err.println("The element with the name "+nameValue+" is not stable in the application");
					
					reportStep("The element with the name "+nameValue+" is not stable in the application", "fail");
				}
			
				catch (NoSuchElementException e) 
				{
					//System.err.println("The element with the name "+nameValue+" is not found in the DOM");
					
					reportStep("The element with the name "+nameValue+" is not found in the DOM","fail");
				}
				
				
				catch(WebDriverException e)
				
				{
					//System.err.println("The element with the name "+nameValue+" is not entered with the data "+data+" due to unknown error");
					
					reportStep("The element with the name "+nameValue+" is not entered with the data "+data+" due to unknown error", "fail");
				}
				
			
			
			
		
	}


	public void enterByXpath(String xpathValue, String data) 
	{
	
		
		try {
			driver.findElementByXPath(xpathValue).sendKeys(data);
			
			//System.out.println("The element with the Xpath "+xpathValue+" is entered with the data "+data+" Successfully");
			
			reportStep("The element with the Xpath "+xpathValue+" is entered with the data "+data+" Successfully", "pass");
			
		} 
		catch(ElementClickInterceptedException e)
		{
			//System.out.println("The element with the xPath "+xpathValue+" click is intercepted");
			
			reportStep("The element with the xPath "+xpathValue+" click is intercepted", "fail");
		}
		
		catch (ElementNotInteractableException e)
		{
			//System.err.println("The element with the Xpath "+xpathValue+" is not interactable in the application");
			
			reportStep("The element with the Xpath "+xpathValue+" is not interactable in the application", "fail");
			
		}
		
		catch (NoSuchElementException e) 
		{
			//System.err.println("The element with the Xpath "+xpathValue+" is not found in the DOM");
			
			reportStep("The element with the Xpath "+xpathValue+" is not found in the DOM", "fail");
		}
		
		catch(StaleElementReferenceException e)
		{
			System.err.println("The element with the Xpath "+xpathValue+" is not stable in the application");
			
			reportStep("The element with the Xpath "+xpathValue+" is not stable in the application", "fail");
		}
	
		
		catch(WebDriverException e)
		
		{
			//System.err.println("The element with the Xpath "+xpathValue+" is not entered with the data "+data+" due to Unknown Error");
			
			reportStep("The element with the Xpath "+xpathValue+" is not entered with the data "+data+" due to Unknown Error", "fail");
		}
		
		
				
	}
	
	
	

	public void verifyTitle(String title) 
	{
		try {
			String actualTitle=driver.getTitle();
			
			if(actualTitle.equals(title))
			{
				//System.out.println("The title of the page "+actualTitle+" is matched with expected title" +title);
				
				reportStep("The title of the page "+actualTitle+" is matched with expected title" +title, "pass");
			}
			else
			{
				//System.out.println("The title of the page "+actualTitle+" is not matched with expected title" +title);
				
				reportStep("The title of the page "+actualTitle+" is not matched with expected title" +title, "fail");
			}
			
		} 
		catch (WebDriverException e)
		{
			//System.err.println("The title of the page "+title+" is not verified due to unknown error");
			
			reportStep("The title of the page "+title+" is not verified due to unknown error", "fail");
		}
		
		

		
	}
	
	

	public void verifyTextById(String id, String text) 
	{
		try {
			String currentText=driver.findElementById(id).getText();
			
			if(currentText.equals(text))
			{
				//System.out.println("The element id "+id+" is holding the text "+currentText+" is matched with the expected text "+text);
				
				
				reportStep("The element id "+id+" is holding the text "+currentText+" is matched with the expected text "+text, "pass");
			}
			
			else
			{
				//System.out.println("The element  id "+id+" is holding the text "+currentText+" is not matched with the expected text "+text);
				
				reportStep("The element  id "+id+" is holding the text "+currentText+" is not matched with the expected text "+text, "fail");
			}
			
		} 
		catch (WebDriverException e) 
		{
			//System.err.println("The id "+id+" which is holding the text "+text+" is not verified due to Unknown Error");
			
			reportStep("The id "+id+" which is holding the text "+text+" is not verified due to Unknown Error", "fail");
		}
		
			
	}
	
	
	

	public void verifyTextByXpath(String xpath, String text) 
	
	{
		try {
			String actualText=driver.findElementByXPath(xpath).getText();
			
			if(actualText.equals(text))
			{
				//System.out.println("The element with Xpath "+xpath+" is holding the text "+actualText+" is matched with the expected text "+text);
				
				reportStep("The element with Xpath "+xpath+" is holding the text "+actualText+" is matched with the expected text "+text, "pass");
			}
			
			else
			{
				//System.out.println("The element with Xpath "+xpath+" is holding the text "+actualText+" is not matched with the expected text "+text);
				
				reportStep("The element with Xpath "+xpath+" is holding the text "+actualText+" is not matched with the expected text "+text, "fail");
			}
			
			
		}
		catch (WebDriverException e) 
		{
			//System.err.println("The Xpath which is holding text "+text+" is not verified due to unknown error");
			
			reportStep("The Xpath which is holding text "+text+" is not verified due to unknown error", "fail");
		}
		

		
	}
	
			public void verifyTextContainsByXpath(String xpath, String text) 
			{
			try {
				String textContains= driver.findElementByXPath(xpath).getText();
				if(textContains.contains(text))
				{
					//System.out.println("The element with Xpath "+xpath+" contains the text "+textContains+" is matched with the expected text "+text);
					
					reportStep("The element with Xpath "+xpath+" contains the text "+textContains+" is matched with the expected text "+text, "pass");
				}
				
				else
				{
					//System.out.println("The element with Xpath "+xpath+" does not contains the text "+textContains+" with the expected text "+text);
					
					reportStep("The element with Xpath "+xpath+" does not contains the text "+textContains+" with the expected text "+text, "fail");
				}
				
			} catch (WebDriverException e)
			{
				//System.err.println("The Xpath which is containing the text "+text+" does not verified due to Unknown Error");
				
				reportStep("The Xpath which is containing the text "+text+" does not verified due to Unknown Error", "fail");
			}
			
		
			
			
	}

			public void clickByLink(String name) 
			{
				try {
					driver.findElementByLinkText(name).click();
					
					//System.out.println("The element with link  "+name+" is clicked");
					
					reportStep("The element with link  "+name+" is clicked", "pass");
					
				} 
				catch (ElementClickInterceptedException e) 
				{
					//System.err.println("The element click intercepted while clicking the link in the application" );
					
					reportStep("The element click intercepted while clicking the link in the application" , "fail");
				}
				
				catch(ElementNotVisibleException e)
				{
					//System.err.println("The Link is not visible in the application" );
					
					reportStep("The Link is not visible in the application" , "fail");
				}
				
				catch(ElementNotInteractableException e)
				{
					//System.err.println("The Element Link is not interactable with the application");
					
					reportStep("The Element Link is not interactable with the application", "fail");
				}
				
				catch (NoSuchElementException e)
				{
					//System.err.println("The Element Link is not visible in the DOM");
					
					reportStep("The Element Link is not visible in the DOM", "fail");
				}
				
				
				
				catch(WebDriverException e)
				{
					//System.err.println("Unable to click the Link due to Unknown Error");
					
					reportStep("Unable to click the Link due to Unknown Error", "fail");
				}
				
			}
			
	public void clickByLinkNoSnap(String name)  
	{
		try {
			
			driver.findElementByLinkText(name).click();
			
			//System.out.println("The Link name "+name+" is clicked");
			
			reportStep("The Link name "+name+" is clicked", "pass");
			
		} catch (ElementClickInterceptedException e) 
		{
			//System.err.println("The click is intercepted in the application" );
			
			reportStep("The click is intercepted in the application" , "fail");
		}
		
		catch(ElementNotVisibleException e)
		{
			//System.err.println("The Link is not visible in the application" );
			
			reportStep("The Link is not visible in the application" , "fail");
		}
		
		catch(ElementNotInteractableException e)
		{
			//System.err.println("The element name "+name+" is not interactable with the application");
			
			reportStep("The element name "+name+" is not interactable with the application", "fail");
		}
		
		catch (NoSuchElementException e)
		{
			//System.err.println("The Link is not visible in the DOM");
			
			reportStep("The Link is not visible in the DOM", "fail");
		}
		
		
		catch(WebDriverException e)
		{
			//System.err.println("Unable to click the Link  due to Unknown Error");
			
			reportStep("Unable to click the Link  due to Unknown Error", "fail");
		}
		
		
		
	}
	public void clickByXpath(String xpathVal) 
	{
		try {
			driver.findElementByXPath(xpathVal).click();
			//System.out.println("The Element Xpath "+xpathVal+" is clicked");
			
			reportStep("The Element Xpath "+xpathVal+" is clicked", "pass");
			
		} 
		catch (ElementClickInterceptedException e) 
		{
			//System.err.println("The Element Xpath "+xpathVal+" click is intercepted in the application");
			
			reportStep("The Element Xpath "+xpathVal+" click is intercepted in the application", "fail");
		}
		catch (ElementNotVisibleException e)
		{
			//System.err.println("The Element Xpath "+xpathVal+" is not visible in the application");
			
			reportStep("The Element Xpath "+xpathVal+" is not visible in the application", "fail");
		}
		
		catch(NoSuchElementException e)
		{
			//System.err.println("The Element Xpath "+xpathVal+" is not found in the DOM");
			
			reportStep("The Element Xpath "+xpathVal+" is not found in the DOM", "fail");
		}
		
		catch(StaleElementReferenceException e)
		{
			//System.err.println("The Element Xpath "+xpathVal+" is not stable in the application");
			
			reportStep("The Element Xpath "+xpathVal+" is not stable in the application", "fail");
		}
		
		catch(ElementNotInteractableException e)
		{
			//System.err.println("The Element Xpath "+xpathVal+" click is unable to interact with the application");
			
			reportStep("The Element Xpath "+xpathVal+" click is unable to interact with the application", "fail");
		}
		
		catch(WebDriverException e)
		{
			//System.err.println("The Element Xpath "+xpathVal+" is failed to click due to unknown error");
			
			reportStep("The Element Xpath "+xpathVal+" is failed to click due to unknown error", "fail");
		}
		
		
		
	}

	public void clickByXpathNoSnap(String xpathVal) 
	{
		try {
			driver.findElementByXPath(xpathVal).click();
			
			//System.out.println("The Element Xpath is clicked");
			
			//reportStep("The Element Xpath is clicked", "pass",false);
		} 
		
		catch (ElementClickInterceptedException e) 
		{
			//System.err.println("The Element Xpath "+xpathVal+" click is intercepted in the application");
			
			reportStep("The Element Xpath "+xpathVal+" click is intercepted in the application", "fail",false);
		}
		catch (ElementNotVisibleException e)
		{
			//System.err.println("The Element Xpath "+xpathVal+" is not visible in the application");
			
			reportStep("The Element Xpath "+xpathVal+" is not visible in the application", "fail",false);
		}
		
		
		catch(ElementNotInteractableException e)
		{
			//System.err.println("The Element Xpath "+xpathVal+" click is unable to interact with the application");
			
			reportStep("The Element Xpath "+xpathVal+" click is unable to interact with the application", "fail",false);
		}
		
		catch(NoSuchElementException e)
		{
		//	System.err.println("The Element Xpath "+xpathVal+" is not found in the DOM");
			
			reportStep("The Element Xpath "+xpathVal+" is not found in the DOM", "fail",false);
		}
		
		
		catch(StaleElementReferenceException e)
		{
			//System.err.println("The Element Xpath "+xpathVal+" is not stable in the application");
			
			reportStep("The Element Xpath "+xpathVal+" is not stable in the application", "fail",false);
		}
		
		catch(WebDriverException e)
		{
			//System.err.println("The Element Xpath "+xpathVal+" is failed to click due to unknown error");
			
			reportStep("The Element Xpath "+xpathVal+" is failed to click due to unknown error", "fail",false);
		}
			
	}

	public String getTextById(String idVal)
	{
		String textValue=null;
		try {
			textValue=driver.findElementById(idVal).getText();
			
			//System.out.println("The text with idval "+idVal+" is captured");
			
			reportStep("The text with idval "+idVal+" is captured", "pass");
			
			
			
		} catch (NoSuchElementException e) 
		{
			//System.err.println("The element with the id "+idVal+" is not found in the DOM");
			
			reportStep("The element with the id "+idVal+" is not found in the DOM", "fail");
		}
		catch(ElementNotVisibleException e)
		{
			//System.err.println("The element with the id "+idVal+" is not visible in the Application");
			
			reportStep("The element with the id "+idVal+" is not visible in the Application", "fail");
		}
		
		catch(StaleElementReferenceException e)
		{
			//System.err.println("The element with the id "+idVal+" is not stable in the application");
			
			reportStep("The element with the id "+idVal+" is not stable in the application", "fail");
		}
		
		catch(ElementNotInteractableException e)
		{
			//System.err.println("The element with the id "+idVal+" is not interactable with the application");
			
			reportStep("The element with the id "+idVal+" is not interactable with the application", "fail");
			
		}
		
		catch(WebDriverException e)
		{
			//System.err.println("The element with the id "+idVal+" is unable to get the text due to unknown error");
			
			reportStep("The element with the id "+idVal+" is unable to get the text due to unknown error", "fail");
		}
		
		
		
		return textValue;
	}

	public String getTextByXpath(String xpathVal) 
	{
		String text=null;
		try {
			 text= driver.findElementByXPath(xpathVal).getText();
			
			//System.out.println("The Element XpathValue "+xpathVal+" Text is"+text);
			
			reportStep("The Element XpathValue "+xpathVal+" Text is"+text, "pass");
			
			
			
		} 
		
		catch (NoSuchElementException e) 
		{
			//System.err.println("The element XpathValue "+xpathVal+" is not found in the DOM");
			
			reportStep("The element XpathValue "+xpathVal+" is not found in the DOM", "fail");
		}
		catch(ElementNotVisibleException e)
		{
			//System.err.println("The element XpathValue "+xpathVal+" is not visible in the Application");
			
			reportStep("The element XpathValue "+xpathVal+" is not visible in the Application", "fail");
		}
		
		catch(StaleElementReferenceException e)
		{
			//System.err.println("The element with the id "+xpathVal+" is not stable in the application");
			
			reportStep("The element with the id "+xpathVal+" is not stable in the application", "fail");
		}
		
		catch(ElementNotInteractableException e)
		{
			//System.err.println("The element XpathValue "+xpathVal+"  is not interactable with the application");
			
			reportStep("The element XpathValue "+xpathVal+"  is not interactable with the application", "fail");
			
		}
		
		catch(WebDriverException e)
		{
			//System.err.println("The XpathValue "+xpathVal+" is unable to get the text due to unknown error");
			
			reportStep("The XpathValue "+xpathVal+" is unable to get the text due to unknown error", "fail");
		}
		
		
		
		return text;
		
		
	}

	public void selectVisibileTextById(String id, String value) 
	
	{
		try {
			Select dropDowns= new Select (driver.findElementById(id));
			
			dropDowns.selectByVisibleText(value);
			
			//System.out.println("The element with "+id+" is selected with visible text value "+value+" ");
			
			reportStep("The element with "+id+" is selected with visible text value "+value+" ", "pass");
			
			
		} 
		catch (ElementNotSelectableException e) 
		{
			//System.err.println("The element with id "+id+" is unable to select the visible text value "+value+" from dropdowns");
			
			reportStep("The element with id "+id+" is unable to select the visible text value "+value+" from dropdowns", "fail");
		}
		catch(ElementClickInterceptedException e)
		{
			//System.err.println("The element with id "+id+" click is intercepted while selecting the value "+value+" from dropdown");
			
			reportStep("The element with id "+id+" click is intercepted while selecting the value "+value+" from dropdown", "fail");
		}
		catch(NoSuchElementException e)
		{
			//System.err.println("The element with id "+id+" is not found in the DOM");
			
			reportStep("The element with id "+id+" is not found in the DOM", "fail");
		}
		
		catch(ElementNotVisibleException e)
		{
			//System.err.println("The element with id "+id+" is not visible in the application");
			
			reportStep("The element with id "+id+" is not visible in the application", "fail");
		}
		catch(StaleElementReferenceException e)
		{
			//System.err.println("The element with id "+id+" is not stable in the application");
			
			reportStep("The element with id "+id+" is not stable in the application", "fail");
		}
		catch(WebDriverException e)
		{
			//System.err.println("The selection of the visible text "+value+" is failed due to unknown error");
			
			reportStep("The selection of the visible text "+value+" is failed due to unknown error", "fail");
		}
		
		
	}
	

	public void selectIndexById(String id, int value) 
	{
		try {
			Select dropDowns=new Select(driver.findElementById(id));
			dropDowns.selectByIndex(value);
			//System.out.println("The value "+value+" from dropdown has been selected using the Element id "+id+"");
			
			reportStep("The value "+value+" from dropdown has been selected using the Element id "+id+"", "pass");
			
		} catch (ElementNotSelectableException e) 
		{
			//System.err.println("The element id "+id+" is unable to select index of the value "+value+" from dropdowns");
			
			reportStep("The element id "+id+" is unable to select index of the value "+value+" from dropdowns", "fail");
		}
		catch(ElementClickInterceptedException e)
		{
			//System.err.println("The element id "+id+" click is intercepted while selecting the index value "+value+" from dropdown");
			
			reportStep("The element id "+id+" click is intercepted while selecting the index value "+value+" from dropdown", "fail");
		}
		catch(NoSuchElementException e)
		{
			//System.err.println("The element id "+id+" is not found in the DOM");
			
			reportStep("The element id "+id+" is not found in the DOM", "fail");
		}
		
		catch(ElementNotVisibleException e)
		{
			//System.err.println("The element id "+id+" is not visible in the application");
			
			reportStep("The element id "+id+" is not visible in the application", "fail");
		}
		catch(StaleElementReferenceException e)
		{
			//System.err.println("The element id "+id+" is not stable in the application");
			
			reportStep("The element id "+id+" is not stable in the application", "fail");
		}
		catch(WebDriverException e)
		{
			//System.err.println("The selection of the index value "+value+" from dropdown failed due to unknown error");
			
			reportStep("The element id "+id+" is not stable in the application", "fail");
		}
		
		
	}

	public void switchToParentWindow() 
	{
		
		try {
			Set<String> allWinIds= driver.getWindowHandles();
			
				for(String eachID : allWinIds)
				{
					driver.switchTo().window(eachID);
					
					break;
				}
			
			
			//System.out.println("The window is switched to parent window");
			
			reportStep("The window is switched to parent window", "pass");
			
		} 
		catch (NoSuchWindowException e) 
		{
			//System.err.println("The parent window not found in the URL");
			
			reportStep("The parent window not found in the URL", "fail");
		}
		
					
		
		
	}

	public void switchToLastWindow()
	{
		try {
			Set<String> allWinIds= driver.getWindowHandles();
			
			for(String eachID : allWinIds)
			{
				driver.switchTo().window(eachID);
				
			
				
			}
			//System.out.println("The window will Switch to last window" );
			
			reportStep("The window will Switch to last window" , "pass");
			
		} 
		catch (NoSuchWindowException e) 
		{
			//System.err.println("The last window not found in the URL");
			
			reportStep("The last window not found in the URL", "fail");
		}
	
		
	}

	public void acceptAlert()
	{
		try {
			driver.switchTo().alert().accept();
			//System.out.println("The Alert is Accepted");
			
			reportStep("The Alert is Accepted", "pass");
		}
		catch (NoAlertPresentException e)
		{
			//System.err.println("Alert is not present in the Application");
			
			reportStep("Alert is not present in the Application", "fail");
		}
		
		catch(ElementClickInterceptedException e)
		{
			//System.err.println("Alert click is intercepted while accepting in the application");
			
			reportStep("Alert click is intercepted while accepting in the application", "fail");
		}
		
		
	}

	public void dismissAlert() 
	{
		try {
			driver.switchTo().alert().dismiss();
			
			//System.out.println("Alert is dismissed in the application");
			
			reportStep("Alert is dismissed in the application", "pass");
		} 
		catch (NoAlertPresentException e)
		{
			//System.err.println("Alert is not present in the application to dismiss");
			
			reportStep("Alert is not present in the application to dismiss", "fail");
		}
		
		catch(ElementClickInterceptedException e)
		{
			//System.err.println("Alert click is intercepted for dismiss in the application");
			
			reportStep("Alert click is intercepted for dismiss in the application", "fail");
		}
	}

	public String getAlertText() 
	{
		String text=null;
		
		try {
			String alertText = driver.switchTo().alert().getText();
			
			
			//System.out.println("The alerttext "+alertText+" captured successfully");
			
			reportStep("The alerttext "+alertText+" captured successfully", "pass");
			
			
			
		} 
		catch (NoAlertPresentException e)
		
		{
			//System.err.println("Alert is not present in the application");
			
			reportStep("Alert is not present in the application", "fail");
		}
		
		
		
		return text;
	}

	
	
	public long takeSnap() 
	{
			long number=0;
			
			try {
				
				number=(long) (Math.floor(Math.random()*100000000)+100000);
				
				File source=driver.getScreenshotAs(OutputType.FILE);
				
				File destination=new File("./reports/screenshots/"+number+".jpeg");
		
				FileUtils.copyFile(source, destination);
				
				//System.out.println("The screenshot has been taken successfully");
				
				//reportStep("The screenshot has been taken successfully", "pass");
			}
			
			catch(WebDriverException e)
			{
				//System.err.println("The browser could not be found");
				
				reportStep("The browser could not be found", "fail",false);
			}
			catch(Exception e)
			{
				//System.err.println("Unexpected exception while taking screenshot");
				
				reportStep("Unexpected exception while taking screenshot", "fail",false);
			}
			
			
			return number;
			
		
	}

	public void closeBrowser() 
	{
		try {
			driver.close();
			
			//System.out.println("Browser closed Successfully");
			
			reportStep("Browser closed Successfully", "pass", false);
		} 
		catch (WebDriverException e) 
		{
			//System.err.println("Unknown error Encountered while closing Browser");
			
			reportStep("Unknown error Encountered while closing Browser", "fail");
		}
		
		
		
		
	
		
	}

	public void closeAllBrowsers()  
	{
		try {
			driver.quit();
			
			//System.out.println("All browser closed Successfully");
			
			reportStep("All browser closed Successfully", "pass", false);
		} 
		catch (WebDriverException e)
		{
			//System.err.println(" Unable to close all browsers due to Unknown error");
			
			reportStep(" Unable to close all browsers due to Unknown error", "fail", false);
		}
		
	}

	public void clickById(String id) 
	{
		try {
			driver.findElementById(id).click();
		//	System.out.println("The element id "+id+" clicked Successfully ");
			
			reportStep("The element id "+id+" clicked Successfully ", "pass");
		} 
		catch (ElementClickInterceptedException e) 
		{
			//System.err.println("The element id "+id+" click is intercepted in the application");
			
			reportStep("The element id "+id+" click is intercepted in the application", "fail");
		}
		catch(NoSuchElementException e)
		{
		//	System.err.println("The element id "+id+" is not found in the DOM");
			
			reportStep("The element id "+id+" is not found in the DOM", "fail");
		}
		catch(StaleElementReferenceException e)
		{
			//System.err.println("The element id "+id+" is not stable in the application");
			
			reportStep("The element id "+id+" is not stable in the application", "fail");
			
		}
		catch(ElementNotVisibleException e)
		{
			//System.err.println("The element id "+id+" is not visible in the application");
			
			reportStep("The element id "+id+" is not visible in the application", "fail");
		}
		
		catch(WebDriverException e)
		{
			//System.err.println("Unable to click element id "+id+" due to unknown error");
			
			reportStep("Unable to click element id "+id+" due to unknown error", "fail");
		}
		
		
		
	}

	
	
	
	
	public void clickByClassName(String classVal) 
	
	{
		
		
		try {
			WebElement value = (WebElement) driver.findElementsByClassName(classVal);
			
			//System.out.println("The element with Value "+value+" is clicked");
			
			reportStep("The element with Value "+value+" is clicked", "pass");
			 
		} 
		catch (ElementClickInterceptedException e) 
		{
			//System.err.println("The element ClassName click is intercepted for the value "+classVal+" in the application ");
			
			reportStep("The element ClassName click is intercepted for the value "+classVal+" in the application ", "fail");
		}
		catch(NoSuchElementException e)
		{
			//System.err.println("The element ClassName is not found in the DOM");
			
			reportStep("The element ClassName is not found in the DOM", "fail");
		}
		catch(StaleElementReferenceException e)
		{
			//System.err.println("The element ClassName is not stable in the application");
			
			reportStep("The element ClassName is not stable in the application", "fail");
			
		}
		catch(ElementNotVisibleException e)
		{
			//System.err.println("The element ClassName is not visible for the value "+classVal+" in the application");
			
			reportStep("The element ClassName is not visible for the value "+classVal+" in the application", "fail");
		}
		
		catch(WebDriverException e)
		{
			//System.err.println("Unable to perform click operation for ClassName due to unknown error");
			
			reportStep("Unable to perform click operation for ClassName due to unknown error", "fail");
		}
		
	
		
	}
	

	public void clickByName(String name)  
	{
		try {
			driver.findElementByName(name).click();
			
			//System.out.println("The element with name "+name+" clicked successfully");
			
			reportStep("The element with name "+name+" clicked successfully", "pass");

			
		} 
		
		catch (ElementClickInterceptedException e) 
		{
			//System.err.println("The element with name "+name+" click is intercepted in the application");
			
			reportStep("The element with name "+name+" click is intercepted in the application", "fail");
		}
		catch(NoSuchElementException e)
		{
			//System.err.println("The element with name "+name+" is not found in the DOM");
			
			reportStep("The element with name "+name+" is not found in the DOM", "fail");
		}
		catch(StaleElementReferenceException e)
		{
			//System.err.println("The element with name "+name+" is not stable in the application");
			
			reportStep("The element with name "+name+" is not stable in the application", "fail");
			
		}
		catch(ElementNotVisibleException e)
		{
			//System.err.println("The element with name "+name+" is not visible in the application");
			
			reportStep("The element with name "+name+" is not visible in the application", "fail");
		}
		
		catch(WebDriverException e)
		{
			//System.err.println("Unable to click element name "+name+" due to unknown error");
			
			reportStep("Unable to click element name "+name+" due to unknown error", "fail");
		}
		
	
		
	}




	/*public void waitProperty(long time)
	{
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}*/




	public void selectByValue(String value) 
	
	
	{   
		try {
			Select dropDowns=new Select(driver.findElementById(value));
			dropDowns.selectByValue(value);
			//System.out.println("The value "+value+" from dropdown has been selected using the value "+value+"");
			
			reportStep("The value "+value+" from dropdown has been selected using the value "+value+"", "pass");
			
		} catch (ElementNotSelectableException e) 
		{
			//System.err.println("The element with the value "+value+" is unable to select the value "+value+" from dropdowns");
			
			reportStep("The element with the value "+value+" is unable to select the value "+value+" from dropdowns", "fail");
		}
		catch(ElementClickInterceptedException e)
		{
			//System.err.println("The element click is intercepted while selecting the value "+value+" from dropdown");
			
			reportStep("The element click is intercepted while selecting the value "+value+" from dropdown", "fail");
		}
		catch(NoSuchElementException e)
		{
			//System.err.println("The value "+value+" is not found in the DOM");
			
			reportStep("The value "+value+" is not found in the DOM", "fail");
		}
		
		catch(ElementNotVisibleException e)
		{
			
			
			//System.err.println("The selected value "+value+" is not visible in the application");
			
			reportStep("The selected value "+value+" is not visible in the application", "fail");
		}
		catch(StaleElementReferenceException e)
		{
			//System.err.println("The element value "+value+" is not stable in the application");
			
			reportStep("The element value "+value+" is not stable in the application", "fail");
		}
		catch(WebDriverException e)
		{
			//System.err.println("The selection of the  value "+value+" from dropdown failed due to unknown error");
			
			reportStep("The selection of the  value "+value+" from dropdown failed due to unknown error", "fail");
		}
			
		
	}


	public String getTextByName(String name) 
	
	
	{
		String textName=null;
		try {
			 textName= driver.findElementByName(name).getText();
			
			//System.out.println("The Element name "+name+" Text is"+textName);
			
			reportStep("The Element name "+name+" Text is"+textName, "pass");
		
		} 
		
		catch (NoSuchElementException e) 
		{
			//System.err.println("The element name "+name+"  is not found in the DOM");
			
			reportStep("The element name "+name+"  is not found in the DOM", "fail");
		}
		catch(ElementNotVisibleException e)
		{
			//System.err.println("The element name "+name+"  is not visible in the Application");
			
			reportStep("The element name "+name+"  is not visible in the Application", "fail");
		}
		
		catch(StaleElementReferenceException e)
		{
			//System.err.println("The element with the name  is not stable in the application");
			
			reportStep("The element with the name  is not stable in the application", "fail");
			
			
		}
		
		catch(ElementNotInteractableException e)
		{
			//System.err.println("The element name "+name+"   is not interactable with the application");
			
			reportStep("The element name "+name+"   is not interactable with the application", "fail");
			
		}
		
		catch(WebDriverException e)
		{
			//System.err.println(" unable to get the text due to unknown error");
			
			reportStep(" unable to get the text due to unknown error", "fail");
		}
		
		return textName;
	}

	public void switchToFrameByXPath(String xpath) 
	
	{
				
		try {
			
			WebElement frameOne=driver.findElementByXPath("//*[@id=\"iframeResult\"]");
			driver.switchTo().frame(frameOne);
			
			//System.out.println("Switched to frame");
			
			reportStep("Switched to frame", "pass");
		} 
		catch (WebDriverException e)
		{
			
			
			//System.err.println("Unable to switch frame due to unknown error");
			
			reportStep("Unable to switch frame due to unknown error", "fail");
		}
		
	}

	public void switchToDefaultContent() 
	
	{
		try {
			driver.switchTo().defaultContent();
			
			//System.out.println("Frame is switched to main webpage");
			
			reportStep("Frame is switched to main webpage", "pass");
			
		} 
		
		catch(NoSuchFrameException e)
		{
			//System.err.println("Frame is not present in the application");
			
			reportStep("Frame is not present in the application", "fail");
		}
		catch (WebDriverException e)
		{
			//System.err.println("Unable to switch webpage due to unknown error");
			
			reportStep("Unable to switch webpage due to unknown error", "fail");
		}
		
	}




	public void refresh() 
	{
		try {
			driver.navigate().refresh();
			
			//System.out.println("The page has been refreshed ");
			
			reportStep("The page has been refreshed ", "pass");
		} 
		catch (WebDriverException e)
		{
			//System.err.println("Page Refresh failed due to unknown error");
			
			reportStep("Page Refresh failed due to unknown error", "fail");
		}
		
	}


	public void alertSendKeys(String name) 
	
	{
		try {
			driver.switchTo().alert().sendKeys(name);
			
			//System.out.println("The element Name "+name+" has been sent successfully in the alert");
			
			reportStep("The element Name "+name+" has been sent successfully in the alert", "pass");
			
		} 
		catch(NoAlertPresentException e)
		{
			//System.err.println("Alert not present in the application");
			
			reportStep("Alert not present in the application", "fail");
		}
		
		
		catch (WebDriverException e) 
		{
		//	System.err.println("The element Name "+name+"  not entered in the alert due to unknown error");
			
			reportStep("The element Name "+name+"  not entered in the alert due to unknown error", "fail");
		} 
		
	}




	public void mouseHoverByXpath(String xpath)
	
	{
		
		
		try
		{
			WebElement holidays = driver.findElementByXPath(xpath);
			
			Actions builder=new Actions(driver);
			
			builder.moveToElement(holidays).perform();
			
			//System.out.println("Mouse Hover Action Performed");
			
			reportStep("Mouse Hover Action Performed", "pass");
		} 
		
		catch (ElementNotVisibleException e)
		
		{
			//System.err.println("Element not found in the Application");
			
			reportStep("Element not found in the Application", "fail");
		}
				
		catch (NoSuchElementException e)
		{

			//System.err.println("Element not available in the Application");
			
			reportStep("Element not available in the Application", "fail");
		}
	
		
	}
	
		
	}








	




	
	




