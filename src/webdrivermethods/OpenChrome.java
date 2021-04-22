package webdrivermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChrome {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Shahbaz Anwar\\Selenium Class\\Driver for Browser\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
		driver.navigate().to("https://javaconceptoftheday.com");
		driver.navigate().to("https://javaconceptoftheday.com/return-value-from-try-catch-finally-blocks/");
		driver.navigate().back();
		driver.navigate().forward();
		//driver.close();

	}

}
