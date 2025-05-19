package myseleniumtests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment1 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "/Users/ragpatil/Desktop/Selenium_SW/Drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		driver.findElement(By.name("name")).sendKeys("Nikita");
		
		driver.findElement(By.name("email")).sendKeys("Nikita@gmail.com");
		
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("Nikita123");
		
		driver.findElement(By.className("form-check-input")).click();
		
		WebElement genderdd = driver.findElement(By.id("exampleFormControlSelect1"));
		
		Select gender = new Select(genderdd);
		
		gender.selectByIndex(1);
		
		driver.findElement(By.id("inlineRadio1")).click();
		
		driver.findElement(By.name("bday")).sendKeys("13/04/1994");
		
		driver.findElement(By.cssSelector(".btn.btn-success")).click();
		
		System.out.println(driver.findElement(By.xpath("//form-comp/div/div[2]")).getText());
	}

}
