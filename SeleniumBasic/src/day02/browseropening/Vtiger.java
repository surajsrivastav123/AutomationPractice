package day02.browseropening;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Vtiger {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		WebElement userNameInputField=driver.findElement(By.id("username"));
		userNameInputField.clear();
		userNameInputField.sendKeys("admin");
		WebElement passwordInputField= driver.findElement(By.id("password"));
		passwordInputField.clear();
		passwordInputField.sendKeys("Test@123");	
		WebElement clickOnSign=driver.findElement(By.className("buttonBlue"));
		clickOnSign.click();
		driver.getTitle();
		//driver.close();

	}

}

/**
open any browser
Enter application URL https://demo.vtiger.com/vtigercrm/index.php
clear username field
type username as admin
clear password field
type password as Test@123
click on Signin button 
 */