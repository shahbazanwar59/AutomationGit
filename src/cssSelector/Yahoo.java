package cssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Yahoo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Shahbaz Anwar\\Selenium Class\\Driver for Browser\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://login.yahoo.com/account/create");
		driver.findElement(By.cssSelector("input[ id='usernamereg-firstName']")).sendKeys("Shahbaz");
		driver.findElement(By.cssSelector("input[ id='usernamereg-lastName']")).sendKeys("Anwar");
		driver.findElement(By.cssSelector("input[ name='yid']")).sendKeys("shah12359");
		driver.findElement(By.cssSelector("input[ type='password']")).sendKeys("shahz@123");
		driver.findElement(By.cssSelector("input[ id='usernamereg-phone']")).sendKeys("8542398785");
	
		Select month=new Select(driver.findElement(By.cssSelector("select[ name='mm']")));
		month.selectByValue("10");
		driver.findElement(By.cssSelector("input[ name='dd']")).sendKeys("26");
		
		driver.findElement(By.cssSelector("input[ name='yyyy']")).sendKeys("2000");
		driver.findElement(By.cssSelector("input[id='usernamereg-freeformGender']")).sendKeys("Male");
		
		
		
		
		
	}

}
