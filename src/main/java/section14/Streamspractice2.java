package section14;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Streamspractice2 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "/Users/ragpatil/Desktop/Selenium_SW/Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
		driver.findElement(By.id("search-field")).sendKeys("Rice");
		List<WebElement>veggies= driver.findElements(By.xpath("//tr/td[1]"));
		List<WebElement> elementsList = veggies.stream().filter(veggie->veggie.getText().contains("Rice")).collect(Collectors.toList());
		Assert.assertEquals(veggies.size(), elementsList.size());
		
		System.out.println("Validated successfully");
		
		
		

	}

}
