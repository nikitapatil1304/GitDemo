package section14;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Streamspractice1 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "/Users/ragpatil/Desktop/Selenium_SW/Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
		// click on column
		driver.findElement(By.xpath("//tr/th[1]")).click();

		// capture all webelements into list
		List<WebElement> names = driver.findElements(By.xpath("//tr/td[1]"));
		
		// capture text of all webelements into new(original) list
		List<String> originalList = names.stream().map(s->s.getText()).collect(Collectors.toList());
		
		// sort on the original list of step 3 -> sorted list
		List<String> sortedList = originalList.stream().sorted().collect(Collectors.toList());
		
		// compare original list vs sorted list
		Assert.assertTrue(originalList.equals(sortedList));
		
		// scan the name column with getText ->Beans->print the price of the Rice
		List<String> price;
		
		do {
			List<WebElement> rows = driver.findElements(By.xpath("//tr/td[1]"));
		 price = rows.stream().filter(s->s.getText().contains("Rice")).
		map(s->getvegprice(s)).collect(Collectors.toList());
		price.forEach(a->System.out.println(a));
		
		if(price.size()<1)
		{
			driver.findElement(By.xpath("//a[@aria-label='Next']")).click();
		}
		}while(price.size()<1);
	
	}

	private static String getvegprice(WebElement s) {
		String p = s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return p;
	}

}
