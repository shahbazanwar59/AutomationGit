package multiplewebelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleCheckBox {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Shahbaz Anwar\\Selenium Class\\Driver for Browser\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("C:\\Shahbaz Anwar\\Selenium Class\\class_13July\\MultipleElements.html");
		List<WebElement> checkbox=driver.findElements(By.xpath("//input[@type='checkbox']"));
		System.out.println(checkbox.size());
		//click on check all box
//		for(int i=0;i<checkbox.size();i++)
//		{
//			checkbox.get(i).click();
//		}
		//click alternate checkbox
//		for(int i=0;i<checkbox.size();i=i+2)
//		{
//			checkbox.get(i).click();
//		}
		
		
		//click alternate checkbox in reverse order
		 for(int i=checkbox.size()-1;i>=0;i-=2)
		 {
			 checkbox.get(i).click();
		 }

	}

}
