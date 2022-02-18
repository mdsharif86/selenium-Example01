package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Example {

		public static void main(String[] args) {
			
			System.setProperty("webdriver.chrome.driver", "C:\\JAVA\\Driver\\chromedriver.exe");
			WebDriver driver;
			driver = new ChromeDriver();
			driver.get("https://oklahomacity.craigslist.org/");
			
		}
}
