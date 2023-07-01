package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameHandling {

	public static void main(String[] args) {

		// alertHandle();
		promptHandle();

	}

	private static void promptHandle() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		// prompt handle
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
		driver.manage().window().maximize();

		driver.switchTo().frame("iframeResult");

		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		driver.switchTo().alert().sendKeys("Sameer");
		driver.switchTo().alert().accept();
	}

	private static void alertHandle() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		// alert handle
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");

		driver.manage().window().maximize();

		driver.switchTo().frame("iframeResult");

		driver.findElement(By.xpath("//button[text()='Try it']")).click();

		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
	}
}
