package utility;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumFunctions
{
	public WebDriver driver;
	public WebDriverWait wait;
	public WebElement element;
	public List<WebElement> elements;
	public List<WebElement> tr_collection;
	public List<WebElement> td_collection;
	public Select clickThis;
	
	/* Opens the browser, maximizes the window and opens the URL */
	public void setUp() throws Exception
	{
		DesiredCapabilities chromeCapabilities = DesiredCapabilities.chrome();
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		driver = new ChromeDriver(chromeCapabilities);
		
		driver.manage().window().maximize();
		
		driver.get("http://rms1-dev.azurewebsites.net/");
	}
	
	/* Closes the browser and ends all processes on it */
	public void closeBrowser() throws Exception
	{
		driver.quit();
	}
	
	/* Used for when waiting for an ID or xPath. Waits 10 seconds. If the element does not appear after 10 seconds, it exits */
	public void setUpWait()
	{
		wait = new WebDriverWait(driver, 10);
	}
	
	
	/* Admin login method */
	public void adminLogin()
	{
		wait = new WebDriverWait(driver, 10);
		
		sendKeysById("Email", Constants.adminEmail);
		
		sendKeysById("Password", Constants.adminPassword);
		
		clickElementByxPath(Constants.xPathloginButton);
		
		String bodyText = findElementById("main-container").getText();
		assertTrue("Unsuccessful login!", bodyText.contains("Welcome to Ace (v1.3.1) , the lightweight, feature-rich and easy to use admin template."));
	}
	
	/* Used when you want to wait for an element to appear providing its id. Used mostly when the element doesn't appear as fast as the code is executed */
	public void waitUntilId(String id)
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(id)));
	}
	
	/* Used when you want to wait for an element to appear providing its xPath. Used mostly when the element doesn't appear as fast as the code is executed */
	public void waitUntilxPath(String xPath)
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xPath)));
	}
	
	/* Used when you want to wait for a specific title on the page to appear. Used mostly when the element doesn't appear as fast as the code is executed */
	public void waitUntilTitle(String title)
	{
		wait.until(ExpectedConditions.titleIs(title));
	}
	
	/* Find an element providing its id and allows you to use the other various WebElement methods with the element */
	public WebElement findElementById(String id)
	{
		return driver.findElement(By.id(id));
	}
	
	/* Find an element providing its xPath and allows you to use the other various WebElement methods with the element */
	public WebElement findElementByxPath(String xPath)
	{
		return driver.findElement(By.xpath(xPath));
	}
	
	public WebElement findElementByClassName(String className)
	{
		return driver.findElement(By.className(className));
	}
	
	/* Click an element providing its id. Ex: A Button */
	public void clickElementById(String id)
	{
		driver.findElement(By.id(id)).click();
	}

	/* Click an element providing its xPath. Ex: A Button that doesn't have an id */
	public void clickElementByxPath(String xPath)
	{
		driver.findElement(By.xpath(xPath)).click();
	}
	
	/* Type into a text box providing its id */
	public void sendKeysById(String id, String textSent)
	{
		driver.findElement(By.id(id)).sendKeys(textSent);
	}
	
	/* Type into a text box providing its xPath */
	public void sendKeysByxPath(String xPath, String textSent)
	{
		driver.findElement(By.xpath(xPath)).sendKeys(textSent);
	}
	
	/* Clear the contents of an element providing its id. Ex: clear a textbox */
	public void clearElementById(String id)
	{
		driver.findElement(By.id(id)).clear();
	}
	
	/* Clear the contents of an element providing its xPath */
	public void clearElementByxPath(String xPath)
	{
		driver.findElement(By.xpath(xPath)).clear();
	}
	
	/* Select an item from a dropdown box providing its id*/
	public void selectVisibleTextById(String id, String textToSelect)
	{
		element = findElementById(id);
		clickThis = new Select(element);
		clickThis.selectByVisibleText(textToSelect);
	}
	
	public void selectVisibleTextByxPath(String xPath, String textToSelect)
	{
		element = findElementByxPath(xPath);
		clickThis = new Select(element);
		clickThis.selectByVisibleText(textToSelect);
	}
	
	public void clickSpanTextById(String id, String textToSelectInSpan)
	{
		element = findElementByxPath("//*[@id='ProgramId']");
		clickThis = new Select(element);
		System.out.println(clickThis.getAllSelectedOptions());
		System.out.println(clickThis.toString());
		//driver.findElement(By.xpath("//*[@id='" + id + "']/a/span[contains(text(), '" + textToSelectInSpan + "')]")).click();	//Not working
	}
	
	public void clickSpanTextByxPath(String xPath, String textToSelectInSpan)
	{
		driver.findElement(By.xpath(xPath + "[text()='" + textToSelectInSpan + "']")).click(); //Not working
	}
	
	public void clickRadioBoxWithIdByValue(String id, String value)
	{
		driver.findElement(By.xpath("//input[contains(@id, '" + id + "') and contains(@value, '" + value + "')]")).click();
	}
	
	/* Find text within a table providing the tableId. You want to first search for what you're looking for, then use this. Searching an entire table not yet implemented */
	public boolean findTextInTableById(String tableId, String textYouAreLookingFor)
	{
		boolean textFound = false;
		element = driver.findElement(By.id(tableId));
		tr_collection = element.findElements(By.xpath("id('" + tableId + "')/tbody/tr"));
		
		for(WebElement trElement : tr_collection)
		{
			td_collection = trElement.findElements(By.xpath("td"));
			
			for(WebElement tdElement : td_collection)
			{
				if(textYouAreLookingFor.contentEquals(tdElement.getText()))
				{
					textFound = true;
				}
			}
		}
		
		return textFound;
	}
	
	public void chooseDateInDatePicker(String monthWanted, String yearWanted, String dayWanted)
	{
		WebElement monthYear = driver.findElement(By.xpath("//table[@class=' table-condensed']/thead/tr[1]/th[2]"));
		
		WebElement prevArrow = driver.findElement(By.xpath("//table[@class=' table-condensed']/thead/tr[1]/th[1]"));
		WebElement nextArrow = driver.findElement(By.xpath("//table[@class=' table-condensed']/thead/tr[1]/th[3]"));
		
		String[] initialMonthYearInPicker = monthYear.getText().split("\\s+");
		
		int initialYear = Integer.parseInt(initialMonthYearInPicker[1]);
		int year = Integer.parseInt(yearWanted);
		
		boolean monthFound = true;
		
		if(initialYear > year)
		{		
			while(initialYear > year)
			{
				prevArrow.click();
				
				monthYear = driver.findElement(By.xpath("//table[@class=' table-condensed']/thead/tr[1]/th[2]"));
				initialMonthYearInPicker = monthYear.getText().split("\\s+");
				initialYear = Integer.parseInt(initialMonthYearInPicker[1]);
			}
			
			while(!monthFound)
			{
				monthYear = driver.findElement(By.xpath("//table[@class=' table-condensed']/thead/tr[1]/th[2]"));
				initialMonthYearInPicker = monthYear.getText().split("\\s+");
				
				if(monthWanted.contentEquals(initialMonthYearInPicker[0]))
				{
					monthFound = true;
				}
				else
				{
					prevArrow.click();
				}
			}
			
			
		}
		
		else if(initialYear < year)
		{		
			while(initialYear < year)
			{
				nextArrow.click();
				
				monthYear = driver.findElement(By.xpath("//table[@class=' table-condensed']/thead/tr[1]/th[2]"));
				initialMonthYearInPicker = monthYear.getText().split("\\s+");
				initialYear = Integer.parseInt(initialMonthYearInPicker[1]);
			}
			
			while(!monthFound)
			{
				monthYear = driver.findElement(By.xpath("//table[@class=' table-condensed']/thead/tr[1]/th[2]"));
				initialMonthYearInPicker = monthYear.getText().split("\\s+");
				
				if(monthWanted.contentEquals(initialMonthYearInPicker[0]))
				{
					monthFound = true;
				}
				else
				{
					nextArrow.click();
				}
			}
		}
		
		WebElement datepicker = driver.findElement(By.xpath("//table[@class=' table-condensed']"));
		List<WebElement> days = datepicker.findElements(By.tagName("td"));
		
		for(WebElement dayCell : days)
		{
			if(dayCell.getText().contentEquals(dayWanted))
			{
				dayCell.click();
				break;
			}
		}
	}
	
	public void chooseTimeInTimePicker(String hourWanted, String minuteWanted, String meridianWanted)
	{
		WebElement hour = driver.findElement(By.xpath("//*[contains(concat(' ', normalize-space(@class), ' '), ' bootstrap-timepicker-widget dropdown-menu timepicker-orient-left timepicker-orient-top open ')]/table/tbody/tr[2]/td[1]/input"));
		WebElement minute = driver.findElement(By.xpath("//*[contains(concat(' ', normalize-space(@class), ' '), ' bootstrap-timepicker-widget dropdown-menu timepicker-orient-left timepicker-orient-top open ')]/table/tbody/tr[2]/td[3]/input"));
		WebElement meridian = driver.findElement(By.xpath("//*[contains(concat(' ', normalize-space(@class), ' '), ' bootstrap-timepicker-widget dropdown-menu timepicker-orient-left timepicker-orient-top open ')]/table/tbody/tr[2]/td[5]/input"));
		
		WebElement incrementHourArrow = driver.findElement(By.xpath("//*[contains(concat(' ', normalize-space(@class), ' '), ' bootstrap-timepicker-widget dropdown-menu timepicker-orient-left timepicker-orient-top open ')]/table/tbody/tr[1]/td[1]"));
		WebElement incrementMinuteArrow = driver.findElement(By.xpath("//*[contains(concat(' ', normalize-space(@class), ' '), ' bootstrap-timepicker-widget dropdown-menu timepicker-orient-left timepicker-orient-top open ')]/table/tbody/tr[1]/td[3]"));
		
		//WebElement decrementHourArrow = driver.findElement(By.xpath("//*[contains(concat(' ', normalize-space(@class), ' '), ' bootstrap-timepicker-widget dropdown-menu timepicker-orient-left timepicker-orient-top open ')]/table/tbody/tr[3]/td[1]"));
		//WebElement decrementMinuteArrow = driver.findElement(By.xpath("//*[contains(concat(' ', normalize-space(@class), ' '), ' bootstrap-timepicker-widget dropdown-menu timepicker-orient-left timepicker-orient-top open ')]/table/tbody/tr[3]/td[3]"));
		
		WebElement incrementMeridianArrow = driver.findElement(By.xpath("//*[contains(concat(' ', normalize-space(@class), ' '), ' bootstrap-timepicker-widget dropdown-menu timepicker-orient-left timepicker-orient-top open ')]/table/tbody/tr[1]/td[5]"));
		
		while(!hour.getAttribute("value").contentEquals(hourWanted))
		{
			incrementHourArrow.click();
		}
		
		while(!minute.getAttribute("value").contentEquals(minuteWanted))
		{
			incrementMinuteArrow.click();
		}
		
		while(!meridian.getAttribute("value").contentEquals(meridianWanted))
		{
			incrementMeridianArrow.click();
		}
	}
	
	public int findNumRowsInTableById(String tableId)
	{
		return driver.findElements(By.xpath("//table[@id='" + tableId + "']/tbody/tr")).size();
	}
	
	public int findNumRowsInTableByxPath(String xPath)
	{
		return driver.findElements(By.xpath(xPath)).size();
	}
	
	public void enterPressById(String id)
	{
		driver.findElement(By.id(id)).sendKeys(Keys.RETURN);
	}
	
	public void enterPressByxPath(String xPath)
	{
		driver.findElement(By.xpath(xPath)).sendKeys(Keys.RETURN);
	}
}