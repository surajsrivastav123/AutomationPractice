package day02.browseropening;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHrm {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		WebElement userNameInput= driver.findElement(By.name("username"));
		userNameInput.sendKeys("Admin");
		WebElement passwordNameInput=driver.findElement(By.name("password"));
		passwordNameInput.sendKeys("admin123");
		WebElement clickOnLogin=driver.findElement(By.tagName("button"));
		clickOnLogin.click();
		//driver.close();
		String actualHomeTitle=driver.getTitle();
		System.out.println("home page title is "+actualHomeTitle);
		String excepctedHomePage="OrangeHRM";
		System.out.println("Home page Titlae validation is "+actualHomeTitle.equals(excepctedHomePage));
		driver.findElement(By.className("oxd-userdropdown-name")).click();
		driver.findElement(By.linkText("Logout")).click();
		
		
		
		
		


	}

}

/*
Open chrome browser
Enter App url as https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
Validate login page
Enter user name as Admin
Password as admin123
Click on login button
Validate home page
*/