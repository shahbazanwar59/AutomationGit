package multiplewebelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class YahooAutoSuggestion {

	public static void main(String[] args) throws  InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Shahbaz Anwar\\Selenium Class\\Driver for Browser\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://in.yahoo.com/");
		driver.findElement(By.xpath("//input[@id='header-search-input']")).sendKeys("covid");
		Thread.sleep(10000);
		List<WebElement> suggestion=driver.findElements(By.xpath("//span/b/.."));
		System.out.println(suggestion.size());
		for(int i=0;i<suggestion.size();i++)		
		{
			System.out.println(suggestion.get(i).getText());
			
		}
		for(int i=0;i<suggestion.size();i++)
		{
			if(suggestion.get(i).getText().equalsIgnoreCase("covid 19 tracker india"))
			{
				suggestion.get(i).click();
			break;
			}
		}

	}

}
