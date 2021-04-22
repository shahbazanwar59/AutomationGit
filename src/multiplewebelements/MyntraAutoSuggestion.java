package multiplewebelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyntraAutoSuggestion {

	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","C:\\Shahbaz Anwar\\Selenium Class\\Driver for Browser\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		driver.findElement(By.xpath("//div/input[@class='desktop-searchBar']")).sendKeys("red");
		Thread.sleep(3000);
		List<WebElement> suggestion=driver.findElements(By.xpath("//div/ul/li[contains(text(),'Red')]"));
		System.out.println(suggestion.size());
		for(int i=0;i<suggestion.size();i++) 		
		{
			System.out.println(suggestion.get(i).getText());
			
		}
		for(int i=0;i<suggestion.size();i++)
		{
			if(suggestion.get(i).getText().equalsIgnoreCase("Redtape Leather Shoe Men"))
			{
				suggestion.get(i).click();
				break;
			}
		}

	}

}
