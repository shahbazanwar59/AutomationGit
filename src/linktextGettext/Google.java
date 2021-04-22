package linktextGettext;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Shahbaz Anwar\\Selenium Class\\Driver for Browser\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		String title1=driver.getTitle();
		System.out.println("title1= "+title1);
		WebElement text=driver.findElement(By.linkText("Tips to cope with stress during COVID-19"));
        System.out.println(text.getText());
        text.click();
        String title2=driver.getTitle();
        System.out.println("title2= "+title2);
        if(title1.equalsIgnoreCase(title2)) {
        	System.out.println("title are the same");
        }
        else {
        	System.out.println("title are not same");
        }
	}


}
