package myseleniumtests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Dropdown2 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chromer.driver", "/Users/ragpatil/Desktop/Selenium_SW/Drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("divpaxinfo")).click();
		
		Thread.sleep(1000);
		
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		
		int i=1;
		while(i<5)
		{
			driver.findElement(By.id("hrefIncAdt")).click();
			i++;
		}
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		
		//Handling Checkbox
	
		Assert.assertFalse(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());
		
		System.out.println("Selected:" + driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());
		
		driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();

		System.out.println("Selected:" + driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());
	
		Assert.assertTrue(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());
		
		System.out.println("CheckboxSize is:" + driver.findElements(By.xpath("//*[@type='checkbox']")).size());
	}

}
