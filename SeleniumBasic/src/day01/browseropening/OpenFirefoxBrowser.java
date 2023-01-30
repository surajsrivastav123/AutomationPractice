package day01.browseropening;

import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenFirefoxBrowser {

	public static void main(String[] args) {
		// set property by System.setProperty(String key, String value)
				//using by absolute path
				//System.setProperty("webdriver.gecko.driver", "D:\\workbench\\SeleniumBasic\\drivers\\geckodriver.exe");
				
				//using by relative path current path
				//System.setProperty("webdriver.gecko.driver", ".\\drivers\\geckodriver.exe");
				//using current working dir
				String s1 =System.getProperty("user.dir")+"\\drivers\\geckodriver.exe";
				System.setProperty("webdriver.gecko.driver", s1);
			
		FirefoxDriver fdriver=new FirefoxDriver();
		

	}

}
