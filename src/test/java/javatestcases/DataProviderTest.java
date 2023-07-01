package javatestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProviderTest {

	public static WebDriver driver;

	@BeforeMethod
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	@Test(dataProvider = "create")
	void a(String name, String password) {
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys(name);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
		//Assert.assertTrue(false);
	}

	@AfterMethod
	public void teardown() {
		driver.close();
	}

//	@DataProvider
//	Object[][] data() {
//		return new Object[][]{
//			{"standard_user","secret_sauce"}
//		};
//	}

	@DataProvider(name = "create")
	Object[][] data1() {
//		Object[][] obj = new Object[2][2];
//		obj[0][0] = "standard_user";
//		obj[0][1] = "secret_sauce";
//
//		obj[1][0] = "locked_out_user";
//		obj[1][1] = "secret_sauce";
//
//		return obj;
		return new Object[][] { 
			{ "standard_user", "secret_sauce" }, 
			{ "locked_out_user", "secret_sauce" } 
		};
	}

}
