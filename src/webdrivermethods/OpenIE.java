package webdrivermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class OpenIE {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.ie.driver", "C:\\Shahbaz Anwar\\Selenium Class\\Driver for Browser\\IEDriverServer.exe");
		WebDriver driver= new InternetExplorerDriver();
		

	}

}
