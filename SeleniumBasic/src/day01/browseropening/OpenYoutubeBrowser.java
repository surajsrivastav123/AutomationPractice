package day01.browseropening;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenYoutubeBrowser {

	public static void main(String[] args) {
		String b1=System.getProperty("user.dir")+"\\drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",b1);
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.youtube.com");

	}

}
