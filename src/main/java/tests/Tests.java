package tests;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tests {
	
	@Test
	void m() {
		System.out.println("Hi");
	}
	
	
	

	public static void main(String[] args) throws InterruptedException {
//		ChromeOptions options = new ChromeOptions();
//		options.addArguments("--incognito");
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver();
		
//		WebDriverManager.edgedriver().setup();
//		WebDriver driver=new EdgeDriver();
//
//		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));// selenium 4
//		driver.manage().deleteAllCookies();
//
//		driver.get("https://www.tricentis.com/software-testing-tool-trial-demo/demo-request");

//		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("priyerock@gmnail.com");
//		driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("Priye");
//
//		Select select = new Select(driver.findElement(By.xpath("//select[@id=\"Country\"]")));
//		select.selectByVisibleText("France");
//
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//input[@name=\"emailOptin\"]")).click();
		
//		for(WebElement e:driver.findElements(By.tagName("a"))) {
//			System.out.println(e.getText()+"-->"+e.getAttribute("href"));
//		}
		
		List<Integer> l=Arrays.asList(1,2);
		System.out.println(l);

	}
}
