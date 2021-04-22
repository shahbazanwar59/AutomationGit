package multiplewebelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Americanairlines {

	public static void main(String[] args) throws  InterruptedException {
		System.setProperty("webdriver.edge.driver","C:\\Shahbaz Anwar\\Selenium Class\\Driver for Browser\\msedgedriver.exe");
			WebDriver driver=new EdgeDriver();	
		driver.manage().window().maximize();
		driver.get("https://www.americanairlines.in/");
		driver.findElement(By.id("reservationFlightSearchForm.originAirport")).sendKeys("san");
		Thread.sleep(10000);
		List<WebElement> suggestion=driver.findElements(By.xpath("//li/a[contains(text(),'san')"));
		System.out.println(suggestion.size());


	}

}
