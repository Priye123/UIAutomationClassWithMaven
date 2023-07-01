package javatestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RoughTest {

	@Test
	void setup() {
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.google.com/");
//		System.out.println(driver.getWindowHandle());
//		Set<String> windows=driver.getWindowHandles();
//		Iterator<String> it= windows.iterator();
//		System.out.println(it.next());
		//driver.close();
//		Alert alert=driver.switchTo().alert();
//		driver.switchTo().alert().accept();
//		driver.switchTo().alert().dismiss();
//		String s=driver.switchTo().alert().getText();
//		driver.switchTo().alert().sendKeys("Raman");
		
//		Set<Cookie> cookies=driver.manage().getCookies();
//		Iterator<Cookie> it1= cookies.iterator();
//		System.out.println(it1.next());
		
//		driver.switchTo().frame();
//		driver.switchTo().parentFrame();
		
		WebElement s=driver.findElement(By.name("q"));
		s.sendKeys("Ram");
		s.sendKeys(Keys.ENTER);
	}
}
