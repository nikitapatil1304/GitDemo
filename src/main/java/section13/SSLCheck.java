package section13;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class SSLCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeOptions option = new ChromeOptions();
		option.setAcceptInsecureCerts(true);
		System.setProperty("webdriver.chrome.driver", "/Users/ragpatil/Desktop/Selenium_SW/Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("https://expired.badssl.com/");
		System.out.println(driver.getTitle());
	
		
		FirefoxOptions option1 = new FirefoxOptions();
		option1.setAcceptInsecureCerts(true);
		System.setProperty("webdriver.gecko.driver", "/Users/ragpatil/Desktop/Selenium_SW/Drivers/geckodriver.exe");
		WebDriver driver1=new FirefoxDriver(option1);
		driver1.manage().window().maximize();
		driver1.get("https://expired.badssl.com/");
		System.out.println(driver1.getTitle());
		
		
		
	}

}
