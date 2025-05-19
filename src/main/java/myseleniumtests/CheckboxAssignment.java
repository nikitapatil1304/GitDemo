package myseleniumtests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class CheckboxAssignment {

	public static void main(String[] args) {


		 System.setProperty("webdriver.chrome.driver", "/Users/ragpatil/Desktop/Selenium_SW/Drivers/chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		 
		 //1. Check the first  Checkbox and verify if it is successfully checked and Uncheck it again to verify if it is successfully Unchecked
		 
		 driver.findElement(By.id("checkBoxOption1")).click();
		 System.out.println("checkbox selected is:"+ driver.findElement(By.id("checkBoxOption1")).isSelected());
		 Assert.assertTrue(driver.findElement(By.id("checkBoxOption1")).isSelected());
		 
		 driver.findElement(By.id("checkBoxOption1")).click();
		 System.out.println("checkbox selected is:"+ driver.findElement(By.id("checkBoxOption1")).isSelected());
		 Assert.assertFalse(driver.findElement(By.id("checkBoxOption1")).isSelected());
		 
		 
		 //How to get the Count of number of check boxes present in the page
		 
		 System.out.println("Number of checkboxes displayed on page: " +driver.findElements(By.xpath("//input[@type='checkbox']")).size());
		 
		 
		 

	}

}
