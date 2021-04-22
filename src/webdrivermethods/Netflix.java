package webdrivermethods;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Netflix {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Shahbaz Anwar\\Selenium Class\\Driver for Browser\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.netflix.com/in/");
		driver.findElement(By.partialLinkText("Sign")).click();
		driver.findElement(By.id("id_userLoginId")).sendKeys("Shahbaz");
		driver.findElement(By.id("id_password")).sendKeys("anwar");
		//driver.findElement(By.className("login-remember-me")).click();
		driver.findElement(By.id("bxid_rememberMe_true")).click();
		WebElement checkBox=driver.findElement(By.id("bxid_rememberMe_true"));
		boolean checkBoxTrueFalse=checkBox.isSelected();
		System.out.println(checkBoxTrueFalse);
		System.out.println("********************************");
		if(checkBoxTrueFalse==true)
		{
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("arguments[0].click();", checkBox);
		}
		//boolean b=driver.findElement(By.className("login-remember-me")).isSelected();
		//if(b==true) {
		//	driver.findElement(By.className("login-remember-me")).click();
		//}
		//if(b==false) {
		//	driver.findElement(By.className("login-remember-me")).click();
		//}
		driver.findElement(By.partialLinkText("Need")).click();
		driver.findElement(By.id("forgot_password_input")).sendKeys("shah@gmail.com");
		driver.navigate().back();
		driver.findElement(By.partialLinkText("Sign")).click();
		driver.findElement(By.id("id_email")).sendKeys("Shah@gmail.com");
		
		driver.close();
	}

}
