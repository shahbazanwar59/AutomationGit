package webdrivermethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Shahbaz Anwar\\Selenium Class\\Driver for Browser\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		String url = driver.getCurrentUrl();
		System.out.println(url);
		String title = driver.getTitle();
		System.out.println(title);
		
		//driver.findElement(By.partialLinkText("Create")).click();
		//driver.findElement(By.linkText("Create Page")).click();
		//driver.findElement(By.linkText("Facebook Pay")).click();
		//driver.findElement(By.partialLinkText("Facebook")).click();
		//driver.findElement(By.linkText("Create ad")).click();
		//driver.findElement(By.partialLinkText("Create")).click();
		driver.findElement(By.partialLinkText("Create ad")).click();
		
		

	}

}
