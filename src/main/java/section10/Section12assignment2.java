package section10;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Section12assignment2 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "/Users/ragpatil/Desktop/Selenium_SW/Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.findElement(By.id("autocomplete")).sendKeys("Ind");
		Thread.sleep(3000);
		
		List<WebElement> list=driver.findElements(By.xpath("//ul[@id='ui-id-1']/li"));
	
		for(int i=0; i<list.size();i++)
		{
			if(list.get(i).getText().contentEquals("India"))
			{
				list.get(i).click();
			}
		}
		

	}

}
