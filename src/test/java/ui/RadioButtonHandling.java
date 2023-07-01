package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButtonHandling {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.seleniumeasy.com/basic-radiobutton-demo.html");
		driver.manage().window().maximize();
		
		WebElement c1=driver.findElement(By.xpath("//input[@value='15 - 50']"));
		c1.click();
		//check whether 15-50 is selected or not
		System.out.println(c1.isSelected());
		
	}

}
