package ui;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practice {
	static WebDriver driver;
	
	private Practice() { //singleton design pattern
		// TODO Auto-generated constructor stub
	}
	
	public static Practice getInstance(){
		Practice pr=new Practice();
		return pr;
	}
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
//		driver.get("https://demo.seleniumeasy.com/jquery-dropdown-search-demo.html");
//		WebElement element=driver.findElement(By.xpath("//select[@id='country']"));
//		selectDropdown(element,"Denmark1");
//		System.out.println("Monali");
		
//		driver.get("https://demo.seleniumeasy.com/basic-radiobutton-demo.html");
//		
//		List<WebElement> radioButtonsOfAgeGroup=driver.findElements(By.xpath("//input[@name='ageGroup']"));
//		selectRadioButtonValue(radioButtonsOfAgeGroup,"15 to 50");
		
		driver.get("https://demo.seleniumeasy.com/basic-checkbox-demo.html");
		
		List<WebElement> allCheckBoxes=driver.findElements(By.xpath("//input[@type='checkbox' and @class='cb1-element']"));
		selectCheckBoxes(allCheckBoxes,"Option 1,Option 3");
	}

	private static void selectCheckBoxes(List<WebElement> allCheckBoxes, String str) {
		String checks[]=str.split(",");
		for(String c:checks) { //Option 1,Option 3
			
			for(WebElement w:allCheckBoxes) { 
				if(w.getText().equals(c)) {
					w.click();
					break;
				}
			}
		}
	}

	private static void selectRadioButtonValue(List<WebElement> radioButtonsOfAgeGroup,String valueTobeClicked) {
		for(WebElement element:radioButtonsOfAgeGroup) {
			if(element.getText().equals(valueTobeClicked)) {
				element.click();
				break;
			}
		}
	}

	private static void selectDropdown(WebElement element,String value) {
		//sucessful termination of program
		//if we don't handle exception,program terminates abruptly
		Select select=new Select(element);
		try {
			select.selectByVisibleText(value);
		} catch (Exception e) {
			System.out.println("This value is not present in dropdown");
		}
	}
		
}

class Monu{
	Practice pr=Practice.getInstance();
	//Practice pr=new Practice();
}
