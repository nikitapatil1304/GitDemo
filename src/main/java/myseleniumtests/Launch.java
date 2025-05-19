package myseleniumtests;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Launch {

	public static void main(String[] args) {
		// Invoke Chrome, when below property is not set, seleniumManager automatical connects to web, downloads the compatible .exe file launch the browser.
        System.setProperty("webdriver.chrome.driver", "/Users/ragpatil/Desktop/Selenium_SW/Drivers/chromedriver.exe");
		System.out.println("Chrome Browser Invoked Successfully");
        WebDriver driver = new ChromeDriver();
		driver.get("https://www.tpointtech.com/java-tutorial");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
		System.out.println("Chrome Browser Closed Successfully");
		
		
		//Invoke Firefox
		System.setProperty("webdriver.gecko.driver", "/Users/ragpatil/Desktop/Selenium_SW/Drivers/geckodriver.exe");
		WebDriver driver2 = new FirefoxDriver();
		System.out.println("Fireofx Browser Invoked Successfully");
		driver2.get("https://www.tpointtech.com/java-tutorial");
		System.out.println(driver2.getTitle());
		System.out.println(driver2.getCurrentUrl());
		driver2.close();
		System.out.println("Firefox Browser Closed Successfully");

		
		//Invoke MicrosoftEdge
				System.setProperty("webdriver.edge.driver", "/Users/ragpatil/Desktop/Selenium_SW/Drivers/msedgedriver.exe");
				WebDriver driver3 = new EdgeDriver();
				System.out.println("MicrosoftEdge Browser Invoked Successfully");
				driver3.get("https://www.tpointtech.com/java-tutorial");
				System.out.println(driver3.getTitle());
				System.out.println(driver3.getCurrentUrl());
				driver3.close();
				System.out.println("MicrosoftEdge Browser Closed Successfully");
		
		

	}

}
