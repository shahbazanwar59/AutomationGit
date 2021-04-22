package cssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Netflix {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Shahbaz Anwar\\Selenium Class\\Driver for Browser\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.netflix.com/in/");
		driver.findElement(By.cssSelector("a[href='/login']")).click();
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("Shahbaz");
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("12345");
		driver.navigate().back();
		driver.findElement(By.cssSelector("input[id='id_email']")).sendKeys("Shah@gmail.com");
	}

}
