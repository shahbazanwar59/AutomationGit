package xPathLocator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathIDQSpider {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Shahbaz Anwar\\Selenium Class\\Driver for Browser\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://www.qspiders.com/contact");
	driver.findElement(By.xpath("//a[.='Contact']")).click();
	WebElement text=driver.findElement(By.xpath("(//a[.='Noida'])[2]/../../..//div[contains(text(),'+91')]"));
	WebElement text1=driver.findElement(By.xpath("(//a[.='BTM Layout'])[2]/../../..//div[contains(text(),'+91')]"));
	WebElement text2=driver.findElement(By.xpath("(//a[.='Chennai - Chromepet'])[2]/../../..//div[contains(text(),'+91')]"));
	WebElement text3=driver.findElement(By.xpath("(//a[.='Qspiders Us'])/../../..//div[contains(text(),'+1 (415)')]"));
	System.out.println("Noida "+text.getText());
	System.out.println("Bangalore "+text1.getText());
	System.out.println("Chennai "+text2.getText());
	System.out.println("US "+text3.getText());
  
}

}
