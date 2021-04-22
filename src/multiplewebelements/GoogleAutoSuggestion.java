package multiplewebelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleAutoSuggestion {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Shahbaz Anwar\\Selenium Class\\Driver for Browser\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("selenium");
		Thread.sleep(3000);
		List<WebElement> suggestion=driver.findElements(By.xpath("//span[contains(text(),'selenium')]"));
		System.out.println(suggestion.size());
//		for(int i=0;i<suggestion.size();i++)
//		{
//			System.out.println(suggestion.get(i).getText());
//			
//		}
//		suggestion.get(4).click();
		
		for(int i=0;i<suggestion.size();i++)
		{
			if(suggestion.get(i).getText().equalsIgnoreCase("selenium interview questions"))
			{
				suggestion.get(i).click();
				break;
			}
		}

	}

}
