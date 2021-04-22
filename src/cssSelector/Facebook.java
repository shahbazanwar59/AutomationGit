package cssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Shahbaz Anwar\\Selenium Class\\Driver for Browser\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.cssSelector("input[ name='firstname']")).sendKeys("Shahbaz");
		driver.findElement(By.cssSelector("input[ name='lastname']")).sendKeys("Anwar");
		driver.findElement(By.cssSelector("input[ name='reg_email__']")).sendKeys("8527389659");
		//driver.findElement(By.cssSelector("input[ name='reg_email_confirmation__']")).sendKeys("8527389659");
		driver.findElement(By.cssSelector("input[name='reg_passwd__']")).sendKeys("123456");
		
	}
}
