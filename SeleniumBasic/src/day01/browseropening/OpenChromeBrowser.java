package day01.browseropening;

import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChromeBrowser {

	public static void main(String[] args) {
		// set property by System.setProperty(String key, String value)
		//using by absolute path
		//System.setProperty("webdriver.chrome.driver", "D:\\workbench\\SeleniumBasic\\drivers\\chromedriver.exe");
		
		//using by relative path current path
		//System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		//using current working dir
		String s1 =System.getProperty("user.dir")+"\\drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", s1);
	
		ChromeDriver driver=new ChromeDriver();

	}

}
