package day01.browseropening;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenGoogleChromeBrowser {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\workbench\\SeleniumBasic\\drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("http:\\www.google.com");
		driver.close();

	}

}
