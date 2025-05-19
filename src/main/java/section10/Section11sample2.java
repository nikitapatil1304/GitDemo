package section10;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Section11sample2 {

	public static void main(String[] args) throws InterruptedException {

		String month="6";
		String year="2027";
		String date="25";	
		
		String[] expectedList= {month,date,year};
		
		System.setProperty("webdriver.chrome.driver", "/Users/ragpatil/Desktop/Selenium_SW/Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
		driver.findElement(By.cssSelector(".react-date-picker__inputGroup")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector(".react-calendar__navigation__label__labelText")).click();
		driver.findElement(By.cssSelector(".react-calendar__navigation__label__labelText")).click();
		driver.findElement(By.xpath("//button[text()='"+year+"']")).click();
		driver.findElement(By.xpath("//button[@class='react-calendar__tile react-calendar__year-view__months__month']["+month+"]")).click();
		driver.findElement(By.xpath("//abbr[text()='"+date+"']")).click();
		
		List<WebElement> actualList =driver.findElements(By.cssSelector(".react-date-picker__inputGroup__input"));
		for(int i=0; i<actualList.size(); i++)
			{
			
				System.out.println(actualList.get(i).getDomAttribute("value"));
				Assert.assertEquals(actualList.get(i).getDomAttribute("value"), expectedList[i]);
			}
		}
		

	

}
