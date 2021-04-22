package webElements;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementAssignment7 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Shahbaz Anwar\\Selenium Class\\Driver for Browser\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		WebElement firstname=driver.findElement(By.xpath("//input[@name='firstname']"));
		firstname.sendKeys("JUHI");
		String text=firstname.getAttribute("value");
		firstname.sendKeys(Keys.CONTROL,"a");
		firstname.sendKeys(text.toLowerCase());
		
		
		
		
//		for(int i=0;i<text.length();i++)
//		{
//			firstname.sendKeys(Keys.BACK_SPACE);
//		}
//		
//		firstname.sendKeys(Keys.SHIFT,text);

	}

}
