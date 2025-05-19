package section10;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Section12assignment1 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "/Users/ragpatil/Desktop/Selenium_SW/Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,600)");
		
		List<WebElement> row = driver.findElements(By.cssSelector(".table-display tbody tr"));
		
		List<WebElement> column = driver.findElements(By.cssSelector(".table-display tbody tr th"));
		
		System.out.println("Row count is:"+ row.size());
		
		System.out.println("Column count is:"+ column.size());
		
		System.out.println(row.get(2).getText());
	
	/*	for(int i=0;i<row.size();i++)
		{
			if(i==2)
			{
				for(int j=0; j<column.size();j++)
				{
					System.out.println(row.get(i).getText());
					break;
					
				}
			}
		}*/
		
		
		
		
	}

}
