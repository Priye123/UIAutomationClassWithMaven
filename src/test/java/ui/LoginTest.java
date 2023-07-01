package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {
	

	public static void main(String[] args) {
		// Browser is open
		WebDriverManager.chromedriver().setup();// replacement of System.setProperty("webdriver.edge.driver",
												// "C:\\Users\\priran\\eclipse-workspace\\UIAutomationClasses\\browserDrivers\\msedgedriver.exe");
		//ChromeDriver driver = new ChromeDriver();
		EdgeDriver driver=new EdgeDriver();
		// launch website saucedemo.com
		driver.get("https://www.saucedemo.com/");
		
		//user enters correct username and password
		WebElement username=driver.findElement(By.id("user-name"));
		username.sendKeys("standard_user");
		
		WebElement password=driver.findElement(By.name("password"));
		password.sendKeys("secret_sauce");
		
		//user click on login button
		WebElement loginbtn=driver.findElement(By.id("login-button"));
		loginbtn.click();
		
		//Browser is closed
		driver.close();
	}

}
