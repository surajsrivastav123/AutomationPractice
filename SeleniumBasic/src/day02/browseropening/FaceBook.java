package day02.browseropening;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBook {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		System.out.println("home page title "+driver.getTitle());
		driver.close();
		


	}

}

/*
launch the web browser
open the URL https://www.facebook.com in the current browser
Fetching home page title
Verify actual title of the home page with the expected title
print home page title on the console
close the browser
*/