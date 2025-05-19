package myseleniumtests;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Addtocart {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/ragpatil/Desktop/Selenium_SW/Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		driver.manage().window().maximize();
		
		String[] itemsNeeded = {"Cucumber","Brocolli","Beetroot"};
		
		List<WebElement> products = driver.findElements(By.xpath("//h4[@class='product-name']"));
		
/*		for(int i=0; i<products.size() ;i++)
		{
			
			//String[] productName = products.getText().split("-");
			//String formattedproductname = productName[0].trim();
			
			//Convert string array into arrayList
			List listofitemsNeeded = Arrays.asList(itemsNeeded);
			
			if(listofitemsNeeded.contains(formattedproductname))
			{
				
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(0)
			}
					}
*/

	}
}