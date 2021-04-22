package webdrivermethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Shahbaz Anwar\\Selenium Class\\Driver for Browser\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("keepLoggedInLabel")).click();
		driver.findElement(By.id("loginButton")).click();
		
		
		/*
		 * driver.findElement(By.id("first-name")).sendKeys("Shahbaz");
		 * driver.findElement(By.id("last-name")).sendKeys("Anwar");
		 * driver.findElement(By.id("email")).sendKeys("shahbaz@gmail.com");
		 * driver.findElement(By.id("company")).sendKeys("MyCompany");
		 * driver.findElement(By.linkText("Start Free Trial")).click();
		 */
		 
		
	}

}
