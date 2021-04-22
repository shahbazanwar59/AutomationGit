package com.facebook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FacebookLogin {
	public static void main(String[] args) throws InterruptedException, FileNotFoundException, IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Shahbaz Anwar\\Selenium Class\\Driver for Browser\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Properties p=new Properties();
		p.load(new FileInputStream("./data.properties"));
		driver.findElement(By.id("email")).sendKeys(p.getProperty("fbid"));
		driver.findElement(By.id("pass")).sendKeys(p.getProperty("fbpassword"));
		driver.findElement(By.name("login")).click();
		Thread.sleep(5000);
		
		Actions act=new Actions(driver);
		//WebElement home = driver.findElement(By.xpath("//a[@aria-label='Home']"));
		
		//act.click(home).perform();
		WebElement messege=driver.findElement(By.xpath("//div[@class='m9osqain a5q79mjw jm1wdb64 k4urcfbm']"));
		act.click(messege).perform();
		
	}
	
	
}
