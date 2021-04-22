package webElements;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementAssignment4 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Shahbaz Anwar\\Selenium Class\\Driver for Browser\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		WebElement firstname=driver.findElement(By.xpath("//input[@name='firstname']"));
		firstname.sendKeys("juhi");
		String val=firstname.getAttribute("value");
		
		for(int i=0;i<=val.length();i++) {
			firstname.sendKeys(Keys.ARROW_LEFT);
		}
		
		for(int j=0;j<val.length();j++)
		{
			firstname.sendKeys(Keys.ARROW_RIGHT);
			firstname.sendKeys(Keys.SPACE);
		}
			
//			firstname.sendKeys(Keys.ARROW_RIGHT);
//			firstname.sendKeys(Keys.SPACE);
//			firstname.sendKeys(Keys.ARROW_RIGHT);
//			firstname.sendKeys(Keys.SPACE);
	}

}
