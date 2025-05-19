package section15;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium4features2 {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/ragpatil/Desktop/Selenium_SW/Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		driver.switchTo().newWindow(WindowType.TAB);
		
		driver.get("https://rahulshettyacademy.com/");
		
		Set<String> s = driver.getWindowHandles();
		Iterator<String>it = s.iterator();
		
		String parent=it.next();
		String child=it.next();
		
		
		driver.switchTo().window(child);
		String valueToEnter = driver.findElement(By.linkText("Home")).getText();
		
		System.out.println(valueToEnter);
		
		driver.switchTo().window(parent);
		
		driver.findElement(By.name("name")).sendKeys(valueToEnter);
		
		//Screenshot of particular element
		
		File screenshot = driver.findElement(By.name("name")).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(screenshot, new File("logo.png"));
		
		//get length and width of an element
		System.out.println(driver.findElement(By.name("name")).getRect().getDimension().getHeight());
		System.out.println(driver.findElement(By.name("name")).getRect().getDimension().getWidth());
		
		
		
		

	}

}
