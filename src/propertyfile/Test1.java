package propertyfile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Shahbaz Anwar\\Selenium Class\\Driver for Browser\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Properties p=new Properties();
		p.load(new FileInputStream("./data.properties"));
//		driver.get(p.getProperty("url"));
//		driver.findElement(By.id("username")).sendKeys(p.getProperty("username"));
//		driver.findElement(By.name("pwd")).sendKeys(p.getProperty("password"));
		 driver.get(p.getProperty("url1"));
		 driver.findElement(By.id("txtUsername")).sendKeys(p.getProperty("username1"));
		 driver.findElement(By.id("txtPassword")).sendKeys(p.getProperty("password1"));
		 driver.findElement(By.id("btnLogin")).click();
	}
  
}
