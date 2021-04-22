package webElements;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnterReturn {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Shahbaz Anwar\\Selenium Class\\Driver for Browser\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com");
		WebElement username=driver.findElement(By.xpath("//input[@name='username']"));
		username.sendKeys("admin");
		WebElement password=driver.findElement(By.xpath("//input[@name='pwd']"));
		password.sendKeys("manager");
		//username.sendKeys(Keys.ENTER);\
		//or
		//password.sendKeys(Keys.RETURN);
		//or
		password.sendKeys(Keys.ENTER);
		
		
		
	}

}
