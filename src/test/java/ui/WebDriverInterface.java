package ui;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverInterface {

	public static String browser="edge";//External file(.properties file)
	public static WebDriver driver;
	
	public static void main(String[] args) {
		
		if(browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			
//			driver.get("https://www.saucedemo.com/");
//			
//			WebElement username=driver.findElement(By.id("user-name"));
//			username.sendKeys("standard_user");
//			
//			WebElement password=driver.findElement(By.name("password"));
//			password.sendKeys("secret_sauce");
//			
//			WebElement loginbtn=driver.findElement(By.id("login-button"));
//			loginbtn.click();
//			
//			driver.close();
			
		}else if(browser.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
			
//			driver.get("https://www.saucedemo.com/");
//			
//			WebElement username=driver.findElement(By.id("user-name"));
//			username.sendKeys("standard_user");
//			
//			WebElement password=driver.findElement(By.name("password"));
//			password.sendKeys("secret_sauce");
//			
//			WebElement loginbtn=driver.findElement(By.id("login-button"));
//			loginbtn.click();
//			
//			driver.close();
			
		}else if(browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			
//			driver.get("https://www.saucedemo.com/");
//			
//			WebElement username=driver.findElement(By.id("user-name"));
//			username.sendKeys("standard_user");
//			
//			WebElement password=driver.findElement(By.name("password"));
//			password.sendKeys("secret_sauce");
//			
//			WebElement loginbtn=driver.findElement(By.id("login-button"));
//			loginbtn.click();
//			
//			driver.close();
		}
		
		//driver.get("https://www.saucedemo.com/");
		driver.navigate().to("https://www.saucedemo.com/");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);//20 seconds
		
//		String windowHandleOfSauceDemo=driver.getWindowHandle();
//		
//		driver.navigate().to("https://www.google.co.in/");
//		
//		System.out.println(driver.switchTo().window(windowHandleOfSauceDemo).getTitle());
		
//		String currentURL1=driver.getCurrentUrl();
//		System.out.println(currentURL1);
		
//		WebElement username=driver.findElement(By.id("user-name"));
//		System.out.println(username.getAttribute("placeholder"));
//		username.sendKeys("standard_user");
//		
//		WebElement password=driver.findElement(By.name("password"));
//		System.out.println(password.getText()+"--");
		
		//System.out.println(password.getTagName());
		//System.out.println(password.getLocation());
		//System.out.println(password.getSize());
		//System.out.println(password.getCssValue("display"));
//		password.sendKeys("secret_sauce");
//		
		WebElement loginbtn=driver.findElement(By.id("login-button"));
		loginbtn.submit();
		//System.out.println(loginbtn.isDisplayed());
		//System.out.println(loginbtn.getText());
		//loginbtn.click();
		
//		List<WebElement> allItems= driver.findElements(By.className("inventory_item"));
//		System.out.println(allItems.size());
		
//		String currentURL=driver.getCurrentUrl();
//		System.out.println(currentURL);
		
//		String htmlDOM=driver.getPageSource();
//		System.out.println(htmlDOM);
		
		//System.out.println(driver.getTitle());
		//System.out.println(driver.getWindowHandle());
		
		driver.close();
	}
	
	//open google.co.in
	//click on hindi
	//aaj meri kismat achi h:- print on console
	//verify title
	//navigate to saucedemo.com
	//print windowID

}
