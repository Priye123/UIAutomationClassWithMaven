package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CodingChallenge {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://phptravels.com/demo/");
		driver.findElement(By.name("first_name")).sendKeys("Test");
		driver.findElement(By.name("last_name")).sendKeys("User");
		driver.findElement(By.name("business_name")).sendKeys("Test Business");
		driver.findElement(By.name("email")).sendKeys("abc@yahoo.co.in");
		
		String num1=driver.findElement(By.xpath("//span[@id='numb1']")).getText();//"4" = 4
		String num2=driver.findElement(By.xpath("//span[@id='numb2']")).getText();
		int sum=Integer.parseInt(num1)+Integer.parseInt(num2);
		
		driver.findElement(By.xpath("//input[@id='number']")).sendKeys(sum+"");
		driver.findElement(By.id("demo")).click();
		
	}

}
