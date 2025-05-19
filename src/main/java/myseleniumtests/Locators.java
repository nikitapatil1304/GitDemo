package myseleniumtests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "/Users/ragpatil/Desktop/Selenium_SW/Drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		
		//locator id: <input type="text" placeholder="Username" id="inputUsername" value="">
		driver.findElement(By.id("inputUsername")).sendKeys("abcd");
		
		// locator name: <input type="password" placeholder="Password" name="inputPassword" value="">
		driver.findElement(By.name("inputPassword")).sendKeys("abcd");
		
		//locator calssName: <button class="submit signInBtn" type="submit">Sign In</button>
		driver.findElement(By.className("signInBtn")).click();
		
		//<p class="error">* Incorrect username or password </p>
		//locaotr cssSelector: tagName.className
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		
		//locator linkText: <a href="#">Forgot your password?</a>
		driver.findElement(By.linkText("Forgot your password?")).click();
		
		//<input type="text" placeholder="Name" xpath="1">
		//locator cssSelector tagName[attribute='Value']
		driver.findElement(By.cssSelector("input[placeholder='Name']")).sendKeys("Nikita");
		
		//<input type="text" placeholder="Email" xpath="1">
		//locator xpath: //tagName[@Atrribute='value']
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("Nikita@gmail.com");
		
		//locator xpath: tagName[Atrribute='value']:nth-child(Index)
		driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).clear();
		
		//locator xpath: //tagName[@Atrribute='value'][Index]
		driver.findElement(By.xpath("//input[@type='text'][2]")).sendKeys("Test@gmail.com");
		
		//locator xpath: //Parent/child..[Index]
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("9876543211");
		
		//<button class="reset-pwd-btn" xpath="1">Reset Login</button>
		//locator cssSelector: .classnName
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		
		//cssSelector: using parent child syntax in below 
		System.out.println(driver.findElement(By.cssSelector("form p")).getText());
		
		//Locator xpath: //tagNmae[@AtttributeName='value']/childName[Index]
		driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
		
		
		Thread.sleep(1000);
		
		//cssSelector Locator:  tagName#id we can write #id also
		driver.findElement(By.cssSelector("input#inputUsername")).sendKeys("rahul");
		

		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
		//cssSelector with regular expression tagName[attributeName*='value']
		// <input type="password" placeholder="Password" name="inputPassword" value="" xpath="1">
		
		driver.findElement(By.id("chkboxOne")).click();
		
		//xpath with regular expression //tagName[contains(@attributeName,'value')]
		//<button class="submit signInBtn" type="submit" xpath="1" style="">Sign In</button>
		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
		
		
		
		
		
		
		
		
		
		
	}

}
