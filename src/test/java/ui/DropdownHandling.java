package ui;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownHandling {

	public static void main(String[] args) throws InterruptedException {

		//singleSelectDropdown();
		//multiSelectDropdown();
		autoSuggestion();
	}

	private static void autoSuggestion() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//span[text()='From']")).click();
		WebElement from=driver.findElement(By.xpath("//input[@placeholder='From']"));
		from.sendKeys("Sydney");
		Thread.sleep(2000);
		from.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		from.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
	}

	

	private static void multiSelectDropdown() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.seleniumeasy.com/jquery-dropdown-search-demo.html");
		driver.manage().window().maximize();

		WebElement dropDownLocation = driver.findElement(By.xpath("//label[text()='Select State :']//following-sibling::select"));
		Select select = new Select(dropDownLocation);
		select.selectByVisibleText("Alaska");
		select.selectByVisibleText("Georgia");
		select.selectByIndex(0);
		select.selectByValue("AZ");
	}

	
	
	
	
	
	private static void singleSelectDropdown() {
		// single select dropdown
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.seleniumeasy.com/jquery-dropdown-search-demo.html");

		WebElement dropDownLocation = driver.findElement(By.xpath("//select[@id='country']"));

		Select select = new Select(dropDownLocation);
		// By Index
		// select.selectByIndex(1);
		// By value
		// select.selectByValue("Netherlands");
		// By visible text-->Recommended
		// select.selectByVisibleText("Japan");

		List<WebElement> allOptions = select.getOptions();
		// System.out.println(allOptions);
		for (WebElement e : allOptions) {
			// System.out.println(e.getText());
			if (e.getText().equals("Japan")) {
				select.selectByVisibleText("Japan");
			}
		}
	}

}
