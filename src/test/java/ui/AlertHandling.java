package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertHandling {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
		driver.manage().window().maximize();
		//System.out.println("Parent Frame " + driver.getTitle());
		driver.switchTo().frame("iframeResult");
		//System.out.println("Child Frame " + driver.getTitle());
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		//System.out.println("Before Alert " + driver.getTitle());
		driver.switchTo().alert().accept();
		//System.out.println("After Alert " + driver.getTitle());
		driver.switchTo().parentFrame();
		driver.findElement(By.xpath("//span[text()='The Window Object']"));
	}
}
