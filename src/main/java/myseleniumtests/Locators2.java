package myseleniumtests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Locators2 {

	public static void main(String[] args) throws InterruptedException {

		String username = "Nikita"; 
		
		System.setProperty("webdriver.chrome.driver", "/Users/ragpatil/Desktop/Selenium_SW/Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		String password = getPassword(driver);
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys(username);
		driver.findElement(By.name("inputPassword")).sendKeys(password);
		driver.findElement(By.className("signInBtn")).click();
		Thread.sleep(1000);
		
		//locator tagName
		//<p style="color: rgb(27, 179, 102); font-size: 18px; text-align: center;" css="1">You are successfully logged in.</p>
		System.out.println(driver.findElement(By.tagName("p")).getText());
		
		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
		
		Assert.assertEquals(driver.findElement(By.xpath("//div[@class='login-container']/h2")).getText(), "Hello "+username+",");
		
		//locator xpath: //tagName[text()='value']  identify element based on text
		driver.findElement(By.xpath("//button[text()='Log Out']")).click();
		
		System.out.println("You are successfully logged out.");
		
		driver.close();
	}
	public static String getPassword(WebDriver driver) throws InterruptedException
	{
		driver.get("https://rahulshettyacademy.com/locatorspractice/");

		driver.findElement(By.linkText("Forgot your password?")).click();
		
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		
		String getPsswordText = driver.findElement(By.cssSelector("form p")).getText();
		
		//Please use temporary password 'rahulshettyacademy' to Login.
		
		String[] PasswordArray1 = getPsswordText.split("'");
		//0th Index - Please use temporary password 
		//1st Index - rahulshettyacademy' to Login.
		
		//String[] PasswordArray2 = PasswordArray1[1].split("'");
		//String password = PasswordArray2[1]
		
		String password = PasswordArray1[1].split("'")[0];
		
		return password;
		
		//0th Index - rahulshettyacademy 
		//1st Index - to Login.
		
	}

}
