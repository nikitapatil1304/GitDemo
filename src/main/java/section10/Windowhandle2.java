package section10;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Windowhandle2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/ragpatil/Desktop/Selenium_SW/Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
		driver.findElement(By.cssSelector("a[class='blinkingText']")).click();
		
		Set<String> windows= driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		
		String parent = it.next();
		String child = it.next();
				
		driver.switchTo().window(child);
		
		//Actions a =new Actions(driver);
		System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());
		
		driver.findElement(By.cssSelector(".im-para.red")).getText();
		
		String emailId = driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0];
		
		driver.switchTo().window(parent);
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(emailId);
		
		
		
		
		
	
		
	}

}
