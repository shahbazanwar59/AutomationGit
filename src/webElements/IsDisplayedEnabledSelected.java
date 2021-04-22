package webElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayedEnabledSelected {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Shahbaz Anwar\\Selenium Class\\Driver for Browser\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com");
		WebElement checkbox=driver.findElement(By.id("keepLoggedInCheckBox"));
		System.out.println(checkbox.isEnabled());
		System.out.println(checkbox.isSelected());
		System.out.println(checkbox.isDisplayed());

	}

}
