package multiplewebelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BingAutoSuggestion {

	public static void main(String[] args) throws  InterruptedException {
		//System.setProperty("webdriver.chrome.driver","C:\\Shahbaz Anwar\\Selenium Class\\Driver for Browser\\chromedriver.exe");
		System.setProperty("webdriver.edge.driver","C:\\Shahbaz Anwar\\Selenium Class\\Driver for Browser\\msedgedriver.exe");
		//WebDriver driver=new ChromeDriver();
			WebDriver driver=new EdgeDriver();	
		driver.manage().window().maximize();
		driver.get("https://www.bing.com/");
		driver.findElement(By.id("sb_form_q")).sendKeys("covid");
		Thread.sleep(10000);
		List<WebElement> suggestion=driver.findElements(By.xpath("//span/strong/.."));
		System.out.println(suggestion.size());
		//for(int i=0;i<suggestion.size();i++)		{
			//System.out.println(suggestion.get(i).getText());
			
		//}
		
		
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
