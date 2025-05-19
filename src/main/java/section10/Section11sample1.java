package section10;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Section11sample1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/ragpatil/Desktop/Selenium_SW/Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		//Print count of links present on page
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		//Print count of links present only on footer
		WebElement minidriver=driver.findElement(By.id("gf-BIG"));
		System.out.println(minidriver.findElements(By.tagName("a")).size());
		
		//Print count of links present in 1st column section of footer
		WebElement coldriver=driver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(coldriver.findElements(By.tagName("a")).size());
		
		//click on each link and open in new tab
		
		for(int i=1; i<coldriver.findElements(By.tagName("a")).size(); i++)
		{
			String keys = Keys.chord(Keys.CONTROL,Keys.ENTER);
			coldriver.findElements(By.tagName("a")).get(i).sendKeys(keys);
			Thread.sleep(4000L);	
		}
		
		Set<String> linkstoclick = driver.getWindowHandles();
		Iterator<String> it = linkstoclick.iterator();
		while(it.hasNext())
		{
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
			
			
		}

driver.quit();
		
	
	}

}
