package section10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Frames {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "/Users/ragpatil/Desktop/Selenium_SW/Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://jqueryui.com/droppable/");
		
		System.out.println(driver.findElements(By.tagName("iframe")).size());
		
		driver.switchTo().frame(0);
		//driver.switchTo().frame(driver.findElement(By.cssSelector(".demo-frame")));
		
		WebElement source =driver.findElement(By.id("draggable")) ;
		WebElement targer = driver.findElement(By.id("droppable"));
		
		//driver.findElement(By.id("droppable")).click();
		Actions a = new Actions(driver);
		a.dragAndDrop(source, targer).build().perform();
		
		

	}

}
