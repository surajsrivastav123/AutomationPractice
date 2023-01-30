package day02.browseropening;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ExecuteAutomateFirefox {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", ".\\drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://demosite.executeautomation.com/Login.html");
		System.out.println("Page Title name is "+driver.getTitle());
		System.out.println("page title lenght is "+driver.getTitle().length());
		System.out.println("Current page url is "+driver.getCurrentUrl());
		WebElement userNameInput=driver.findElement(By.name("UserName"));
		userNameInput.sendKeys("execution");
		WebElement passwordInput=driver.findElement(By.name("Password"));
		passwordInput.sendKeys("admin");
		WebElement loginButton=driver.findElement(By.name("Login"));
		loginButton.submit();
		System.out.println("page title is "+driver.getTitle());
		System.out.println("Current URL is "+driver.getCurrentUrl());
		//WebElement logoutButton=driver.findElement(By.);
		//driver.close();
		


	}

}

/*
launch the firefox browser
open https://demosite.executeautomation.com/Login.html
get page Title name and Title length
Print page Title & Title length on the eclipse console
get page URL & verify if it is correct page opened
Enter username as "execution"
Enter password as "admin"
Click on login button
Get the page title & current URL print on console
click on logout
close the browser

*/