package section10;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Windowhandling {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/ragpatil/Desktop/Selenium_SW/Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.com/");
		
		Actions a = new Actions(driver);
		
		WebElement move = driver.findElement(By.id("nav-link-accountList"));
		a.moveToElement(move).contextClick().perform();
		
		
		//writting build means its ready to execute and perform executes the line. if these 2 are not written that line will not be executed.
		WebElement move2 = driver.findElement(By.id("twotabsearchtextbox"));
		a.moveToElement(move2).keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();

	}

}
