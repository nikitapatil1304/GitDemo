package myseleniumtests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowActivities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "/Users/ragpatil/Desktop/Selenium_SW/Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//below has inbuilt synchronization wait mechanism hence waits until page loads with all the components 
		driver.get("http://google.com");
		
		driver.manage().window().maximize();
		
		//below does not wait until page loads completely as it dont have inbuilt wait mechanism, we will have to use wait mechanism explicitly to get page laoded
		driver.navigate().to("https://rahulshettyacademy.com/locatorspractice/");
		
		driver.navigate().back();
		
		driver.navigate().forward();
		
		
	}

}
