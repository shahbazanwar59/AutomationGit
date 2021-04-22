package webElements;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementAssignment1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Shahbaz Anwar\\Selenium Class\\Driver for Browser\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		WebElement firstname=driver.findElement(By.xpath("//input[@name='firstname']"));
		firstname.sendKeys("juhi");
		for(int i=0;i<2;i++)
		{
			firstname.sendKeys(Keys.ARROW_LEFT);	
		}
		for(int i=0;i<2;i++)
		{
			firstname.sendKeys(Keys.BACK_SPACE);	
		}
		

	}

}
