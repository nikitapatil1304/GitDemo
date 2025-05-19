package section10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Section11assignment {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/ragpatil/Desktop/Selenium_SW/Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.xpath("//div[@id='checkbox-example']/fieldset/label[2]/input")).click();		
		System.out.println(driver.findElement(By.xpath("//div[@id='checkbox-example']/fieldset/label[2]")).getText());
		String textvalue= driver.findElement(By.xpath("//div[@id='checkbox-example']/fieldset/label[2]")).getText();
		
		WebElement dropdown = driver.findElement(By.id("dropdown-class-example"));
		
		Select dd = new Select(dropdown);
		dd.selectByVisibleText(textvalue);
		
		driver.findElement(By.id("name")).sendKeys(textvalue);
		driver.findElement(By.id("alertbtn")).click();
		System.out.println(driver.switchTo().alert().getText());
		
		if(driver.switchTo().alert().getText().contains(textvalue))
		{
			System.out.println("Alert message is displayed with with value passed in the textbox that is: "+textvalue);
		}		
		
		driver.switchTo().alert().accept();
		

	}

}
