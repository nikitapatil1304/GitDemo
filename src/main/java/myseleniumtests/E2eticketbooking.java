package myseleniumtests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class E2eticketbooking {

	public static void main(String[] args) throws InterruptedException {

		int i=1;
		System.setProperty("webdriver.chrome.driver", "/Users/ragpatil/Desktop/Selenium_SW/Drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
	
		//Handling dynamic dropdown
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXTaction")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
		Thread.sleep(2000);
		
		//Handling Calender
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-active")).click();
		
		driver.findElement(By.cssSelector("#divpaxinfo")).click();
		Thread.sleep(2000);
		
		while(i<5)
		{
			driver.findElement(By.id("hrefIncAdt")).click();
			i++;
		}
		driver.findElement(By.id("btnclosepaxoption")).click();
		
		//Handling Static dropdown
		driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")).click();
		WebElement currencydd = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select staticdd = new Select(currencydd);
		staticdd.selectByVisibleText("AED");
		
		//Checkbox
		driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
		
		
		
		//Handling autosuggestive dropdown"
		
		driver.findElement(By.id("autosuggest")).sendKeys("Ind");
		Thread.sleep(2000);
		
		List<WebElement> autooptions = driver.findElements(By.xpath("//ul[@id='ui-id-1']/li/a"));
		
		for(WebElement option:autooptions)
		{
			if(option.getText().equalsIgnoreCase("India"))
			{
				option.click();
				//driver.findElement(By.xpath("//ul[@id='ui-id-1']/li/a")).click();
				break;
			}
		}
		Thread.sleep(2000);
		
		//checking for disabled element
		//Below line clicks round trip and here calender ll be enabled
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		Thread.sleep(2000);
		Assert.assertTrue(driver.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled());
		System.out.println("enabled:"+driver.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled());
		
		//below clicking one trip radio
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();
		
		//In below case webelement returning true even if calender is disabled view bcz when user clicks on it calender opens, hence below line doesnt work as expected 
		//Assert.assertTrue(driver.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled());
		
		System.out.println(driver.findElement(By.id("Div1")).getDomAttribute("Style"));
		String s=driver.findElement(By.id("Div1")).getDomAttribute("Style");
		if(s.contains("0.5"))
		{
			System.out.println("Disabled");
		}
		else
		{
			System.out.println("Enabled");
		}
		
		//driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
		
	//	System.out.println("E2E scenario is pass");
		
		
		
		
		

	}

}
