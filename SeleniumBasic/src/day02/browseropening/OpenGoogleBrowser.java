package day02.browseropening;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenGoogleBrowser {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");//exe path

		WebDriver driver=new ChromeDriver();//create object of current class
		
		driver.get("http:\\www.google.com");//enter the req appl
		
		String s1=driver.getTitle();// store tital name in string object
		System.out.println("Page tital is "+s1);// get tital name
		System.out.println("Page tital lenght is "+s1.length());// get tital lenght
		
		System.out.println("Current page URL is "+driver.getCurrentUrl());//current page url 
		System.out.println("Current page url lenght is "+driver.getCurrentUrl().length());//get current page url lenght
		
		System.out.println("page source lenght is "+driver.getPageSource().length());//page source lenght
		driver.close();
	}

}
