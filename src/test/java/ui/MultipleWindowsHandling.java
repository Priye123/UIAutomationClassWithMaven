package ui;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleWindowsHandling {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();

		driver.get("https://www.w3schools.com/html/default.asp");
		driver.findElement(By.xpath("//a[text()='Try it Yourself »']")).click();

		// String pageId=driver.getWindowHandle();
		// System.out.println(pageId);
		// driver.switchTo().window(pageId);
		Set<String> allPageIds = driver.getWindowHandles();
		List<String> list=new ArrayList<>();
		for(String s:allPageIds) {
			list.add(s);
		}
		
//		Iterator<String> it = allPageIds.iterator();
//		it.next();// parent screen

		driver.switchTo().window(list.get(1));// child screen

		driver.switchTo().frame("iframeResult");

		System.out.println(driver.findElement(By.xpath("//h1[text()='This is a Heading']")).getText());

	}

}
