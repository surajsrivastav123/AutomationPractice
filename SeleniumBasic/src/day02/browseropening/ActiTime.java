package day02.browseropening;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActiTime {

	public static void main(String[] args) {
		
	    System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.actitime.com/");
		driver.getTitle();
		driver.getTitle().length();
		String actualResult=driver.getTitle();
		System.out.println("Page Title name is "+driver.getTitle());
		System.out.println("Page Title Lenght is "+driver.getTitle().length());
		String expectedResult="actiTIME - Login";
		System.out.println("Login Page validation "+actualResult.equals(expectedResult));
		
		String pageUrl=driver.getCurrentUrl();
		System.out.println("Page URL is "+pageUrl);
		driver.getPageSource();
		driver.getPageSource().length();
		System.out.println("page source lenght is "+driver.getPageSource().length());
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		WebDriverWait wait=new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.titleIs("actiTIME - Enter Time-Track"));
		String actualHomePageTitle=driver.getTitle();
		String expectedHomePageTitle="actiTIME - Enter Time-Track";
		System.out.println("Actaul Home page title: "+actualHomePageTitle);
		System.out.println("Home page validation status is: "+actualHomePageTitle.equals(expectedHomePageTitle));
		driver.findElement(By.className("logout")).click();
		
		//driver.close();
		

	}

}
/*
launch a new Chrome browser
open http://demo.actitime.com/
Get page Title name & Title length
print page Title & Title length on the Eclipse Consol
Get page URL and verify if it is a correct page opened
Get page source(HTML source code) & Page Source length
print page length on Eclipse Console
close the browser 

*/