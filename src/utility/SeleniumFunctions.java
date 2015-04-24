package utility;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
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
		
		String title = driver.getTitle();
		assertTrue("Unsuccessful login!", title.contains("RMS | Dashboard"));
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
	
	public void chooseDateInDatePicker(String monthWantedInWord, String numberOfMonthWanted, String numberOfYearWanted, String numberOfDayWanted)
	{
		String dateInBox = findElementById(Constants.idDateOfIncident).getAttribute("value");
		String dateWanted = numberOfMonthWanted + "/" + numberOfDayWanted + "/" + numberOfYearWanted;
		
		WebElement monthYear = findElementByxPath("//table[@class=' table-condensed']/thead/tr[1]/th[2]");
		
		WebElement prevArrow = findElementByxPath("//table[@class=' table-condensed']/thead/tr[1]/th[1]");
		WebElement nextArrow = findElementByxPath("//table[@class=' table-condensed']/thead/tr[1]/th[3]");
		
		String[] initialMonthYearInPicker = monthYear.getText().split("\\s+");
		
		int initialYear = Integer.parseInt(initialMonthYearInPicker[1]);
		int year = Integer.parseInt(numberOfYearWanted);
		
		boolean monthFound = false;
		boolean januaryFound = false;
		
		if(!dateInBox.contentEquals(dateWanted))
		{
			if(initialYear > year)
			{		
				while(initialYear > year)
				{
					prevArrow.click();
					
					monthYear = findElementByxPath("//table[@class=' table-condensed']/thead/tr[1]/th[2]");
					initialMonthYearInPicker = monthYear.getText().split("\\s+");
					initialYear = Integer.parseInt(initialMonthYearInPicker[1]);
				}
				
				while(!monthFound)
				{
					monthYear = findElementByxPath("//table[@class=' table-condensed']/thead/tr[1]/th[2]");
					initialMonthYearInPicker = monthYear.getText().split("\\s+");
					
					if(monthWantedInWord.contentEquals(initialMonthYearInPicker[0]))
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
					
					monthYear = findElementByxPath("//table[@class=' table-condensed']/thead/tr[1]/th[2]");
					initialMonthYearInPicker = monthYear.getText().split("\\s+");
					initialYear = Integer.parseInt(initialMonthYearInPicker[1]);
				}
				
				while(!monthFound)
				{
					monthYear = findElementByxPath("//table[@class=' table-condensed']/thead/tr[1]/th[2]");
					initialMonthYearInPicker = monthYear.getText().split("\\s+");
					
					if(monthWantedInWord.contentEquals(initialMonthYearInPicker[0]))
					{
						monthFound = true;
					}
					else
					{
						nextArrow.click();
					}
				}
			}
			
			else if(initialYear == year)
			{
				while(!januaryFound)
				{
					monthYear = findElementByxPath("//table[@class=' table-condensed']/thead/tr[1]/th[2]");
					initialMonthYearInPicker = monthYear.getText().split("\\s+");
					
					if(initialMonthYearInPicker[0].contentEquals("January"))
					{
						januaryFound = true;
					}
					
					else
					{
						prevArrow.click();
					}
				}
				
				while(!monthFound)
				{
					monthYear = findElementByxPath("//table[@class=' table-condensed']/thead/tr[1]/th[2]");
					initialMonthYearInPicker = monthYear.getText().split("\\s+");
					
					if(monthWantedInWord.contentEquals(initialMonthYearInPicker[0]))
					{
						monthFound = true;
					}
					else
					{
						nextArrow.click();
					}
				}
			}
			
			WebElement datepicker = findElementByxPath("//table[@class=' table-condensed']");
			List<WebElement> days = datepicker.findElements(By.tagName("td"));
			
			for(WebElement dayCell : days)
			{
				if(dayCell.getText().contentEquals(numberOfDayWanted))
				{
					dayCell.click();
					break;
				}
			}
		}
	}
	
	public void chooseTimeInTimePicker(String hourWanted, String minuteWanted, String meridianWanted)
	{
		WebElement hour = driver.findElement(By.xpath("//*[contains(concat(' ', normalize-space(@class), ' '), ' bootstrap-timepicker-widget ')]/table/tbody/tr[2]/td[1]/input"));
		WebElement minute = driver.findElement(By.xpath("//*[contains(concat(' ', normalize-space(@class), ' '), ' bootstrap-timepicker-widget ')]/table/tbody/tr[2]/td[3]/input"));
		WebElement meridian = driver.findElement(By.xpath("//*[contains(concat(' ', normalize-space(@class), ' '), ' bootstrap-timepicker-widget ')]/table/tbody/tr[2]/td[5]/input"));
		
		WebElement incrementHourArrow = driver.findElement(By.xpath("//*[contains(concat(' ', normalize-space(@class), ' '), ' bootstrap-timepicker-widget ')]/table/tbody/tr[1]/td[1]"));
		WebElement incrementMinuteArrow = driver.findElement(By.xpath("//*[contains(concat(' ', normalize-space(@class), ' '), ' bootstrap-timepicker-widget ')]/table/tbody/tr[1]/td[3]"));
		
		//WebElement decrementHourArrow = driver.findElement(By.xpath("//*[contains(concat(' ', normalize-space(@class), ' '), ' bootstrap-timepicker-widget ')]/table/tbody/tr[3]/td[1]"));
		//WebElement decrementMinuteArrow = driver.findElement(By.xpath("//*[contains(concat(' ', normalize-space(@class), ' '), ' bootstrap-timepicker-widget ')]/table/tbody/tr[3]/td[3]"));
		
		WebElement incrementMeridianArrow = driver.findElement(By.xpath("//*[contains(concat(' ', normalize-space(@class), ' '), ' bootstrap-timepicker-widget ')]/table/tbody/tr[1]/td[5]"));
		
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
	
	//Must open the tree first, then use this. You do NOT need to click the ok button. It is already done within this function
	public void clickParentIncidentDeptWithinTreeByName(String deptName) throws InterruptedException
	{
		Thread.sleep(1000);
		// Reason I use findElements is because I noticed if a user opens the tree view, then closes it, and then reopens it, the div of the old one stays on the page, however it is hidden
		List<WebElement> containers = driver.findElements(By.xpath("//*[contains(concat(' ', normalize-space(@class), ' '), ' ui-dialog ui-widget ui-widget-content ui-corner-all ui-front ui-dialog-buttons ui-draggable ui-resizable ')]"));
		List<WebElement> treeContainers = new ArrayList<WebElement>();
		
		WebElement containerWeWant = null;
		
		for(WebElement temp : containers)
		{
			if(temp.getAttribute("aria-describedby").contentEquals("rmsTreeContainer"))
			{
				treeContainers.add(temp);
			}
		}
		
		for(WebElement treeContainer : treeContainers)
		{			
			if(treeContainer.isDisplayed())
			{
				containerWeWant = treeContainer;
				break;
			}
		}
		
		WebElement treeContent = containerWeWant.findElement(By.xpath("//*[@id='rmsTree']"));
		
		List<WebElement> treeLines = treeContent.findElements(By.className("tree-branch"));
		
		for(WebElement a : treeLines)
		{
			WebElement branchName = a.findElement(By.className("tree-branch-name"));
			
			if(branchName.getText().contentEquals(deptName))
			{
				branchName.click();
				break;
			}
		}
		
		List<WebElement> buttonsInContainer = containerWeWant.findElements(By.tagName("button"));
		
		for(WebElement button : buttonsInContainer)
		{
			if(button.getText().contentEquals("OK"))
			{
				button.click();
				break;
			}
		}
	}
	
	public void clickIncidentType(String parentDept, String childDept) throws InterruptedException
	{
		Thread.sleep(1000);
		// Reason I use findElements is because I noticed if a user opens the tree view, then closes it, and then reopens it, the div of the old one stays on the page, however it is hidden
		List<WebElement> containers = driver.findElements(By.xpath("//*[contains(concat(' ', normalize-space(@class), ' '), ' ui-dialog ui-widget ui-widget-content ui-corner-all ui-front ui-dialog-buttons ui-draggable ui-resizable ')]"));
		List<WebElement> treeContainers = new ArrayList<WebElement>();
		
		WebElement parentBranch = null;
		
		WebElement containerWeWant = null;
		
		for(WebElement temp : containers)
		{
			if(temp.getAttribute("aria-describedby").contentEquals("rmsTreeContainer"))
			{
				treeContainers.add(temp);
			}
		}
		
		for(WebElement treeContainer : treeContainers)
		{			
			if(treeContainer.isDisplayed())
			{
				containerWeWant = treeContainer;
				break;
			}
		}
		
		WebElement treeContent = containerWeWant.findElement(By.xpath("//*[@id='rmsTree']"));
		
		List<WebElement> treeLines = treeContent.findElements(By.className("tree-branch"));
		
		for(WebElement temp : treeLines)
		{
			WebElement branchName = temp.findElement(By.className("tree-branch-name"));
			
			if(branchName.getText().contentEquals(parentDept))
			{
				parentBranch = temp;
				branchName.click();
				break;
			}
		}
		
		
//		WebElement childrenContainer = parentBranch.findElement(By.tagName("ul"));
//		
//		List<WebElement> children = childrenContainer.findElements(By.tagName("li"));
//		
//		for(WebElement temp : children)
//		{
//			System.out.println(temp.getText());
//		}
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