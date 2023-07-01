//package javatestcases;
//
//import java.io.File;
//import java.io.IOException;
//import java.time.Duration;
//import java.util.Date;
//
//import org.apache.commons.io.FileUtils;
//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.edge.EdgeDriver;
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//
//public class JavaTests {
//
//	public static WebDriver driver;
//	public static String browser;
//
//	public JavaTests() throws IOException {
//		browser = ReadWritePropertiesClass.read("browser");
//	}
//
//	public static void main(String[] args) throws IOException, InterruptedException {
//		JavaTests jt = new JavaTests();
//
//		if (browser.equalsIgnoreCase("Chrome")) {
//			WebDriverManager.chromedriver().setup();
//			driver = new ChromeDriver();
//		} else if (browser.equalsIgnoreCase("Firefox")) {
//			WebDriverManager.firefoxdriver().setup();
//			driver = new EdgeDriver();
//		} else if (browser.equals("edge")) {
//			WebDriverManager.edgedriver().setup();
//			driver = new EdgeDriver();
//		}
//
//		ChromeOptions options = new ChromeOptions();
//		options.addArguments("--incognito");
//
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
////		driver.get("https://www.saucedemo.com/");
////		System.out.println(driver.findElement(By.xpath("//input[@id='login-button']")).getAttribute("data-test"));
////		System.out.println(driver.findElement(By.xpath("//input[@id='login-button']")).getText());
////		System.out.println(driver.findElement(By.xpath("//input[@id='login-button']")).getCssValue("border"));
////		System.out.println(driver.findElement(By.xpath("//input[@id='login-button']")).getLocation());
////		System.out.println(driver.findElement(By.xpath("//input[@id='login-button']")).getSize());
//		// System.out.println(driver.findElement(By.xpath("//input[@id='login-button']")).getTagName());
//		// System.out.println(driver.findElement(By.xpath("//input[@id='login-button']")));//
//		// print xpath with more detail
//		// browser+ os+ xpath
//
////		driver.navigate().to("https://swaglabs.in/our-prints/");
////		System.out.println(driver.findElement(By.xpath("//span[text()='Home']")).getText());
////		System.out.println(driver.findElement(By.xpath("//input[@id='login-button']")).isDisplayed());
////		System.out.println(driver.findElement(By.xpath("//input[@id='login-button']")).isEnabled());
////		System.out.println(driver.findElement(By.xpath("//input[@id='login-button']")).isSelected());
//
////		driver.navigate().to("https://www.tricentis.com/software-testing-tool-trial-demo/demo-request");
////		WebElement country = driver.findElement(By.xpath("//select[@id='Country']"));
////
////		Select select = new Select(country);
////		select.selectByIndex(1);
////		Thread.sleep(2000);
////		select.selectByVisibleText("Antigua and Barbuda");
////		Thread.sleep(2000);
////		select.selectByValue("Angola");
////		Thread.sleep(2000);
//
////		driver.navigate().to("https://demo.seleniumeasy.com/jquery-dropdown-search-demo.html");
////		driver.findElement(By.xpath("//button[@id=\"details-button\"]")).click();
////		driver.findElement(By.xpath("//a[text()='Proceed to demo.seleniumeasy.com (unsafe)']")).click();
////		Select select = new Select(driver.findElement(By.xpath("//select[@id=\"files\"]")));
////		select.selectByVisibleText("Ruby");
////		select.selectByValue("somefile");
//		// Thread.sleep(2000);
//
////		Select se = new Select(driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div/div[2]/select")));
////		se.selectByVisibleText("Alaska");
////		se.selectByVisibleText("Delaware");
////		se.selectByVisibleText("Iowa");
//
////		System.out.println(se.getFirstSelectedOption().getText());
////		se.deselectByVisibleText("Alaska");
//
////		for(WebElement s:se.getOptions()) {
////			System.out.println(s.getText());
////		}
//
//		// System.out.println(se.getFirstSelectedOption().getText());
//
////		for (WebElement s : se.getAllSelectedOptions()) {
////			System.out.println(s.getText());
////		}
//
//		// driver.close();
//
////		for (WebElement e : driver.findElements(By.tagName("a"))) {
////			System.out.println(e.getAttribute("href")+" "+e.getText());
////		}
//
////		driver.get("https://www.makemytrip.com/");
////		driver.findElement(By.xpath("//span[text()='From']")).click();
////		WebElement m = driver.findElement(By.xpath("//input[@placeholder=\"From\"]"));
////		//m.click();
////		m.sendKeys("singapore");
////		m.sendKeys(Keys.ARROW_DOWN);
////		m.sendKeys(Keys.ENTER);
//
//		// driver.navigate().to("https://www.tricentis.com/software-testing-tool-trial-demo/demo-request");
////		driver.findElement(By.xpath("//input[@id=\"emailOptin\"]")).click();
////		System.out.println(driver.findElement(By.xpath("//input[@id=\"emailOptin\"]")).isSelected());
////		Thread.sleep(2000);
//		// driver.findElement(By.xpath("(//a[text()='Blog'])[4]")).click();
//
////		driver.navigate().to("https://demo.seleniumeasy.com/jquery-dropdown-search-demo.html");
////		driver.findElement(By.xpath("//button[@id=\"details-button\"]")).click();
////		driver.findElement(By.xpath("//a[text()='Proceed to demo.seleniumeasy.com (unsafe)']")).click();
////		Thread.sleep(2000);
////		//driver.findElement(By.xpath("//a[text()='Maven Tutorial']")).click();
////		//scroll into view code using selenium
////		Actions action=new Actions(driver);
////		action.moveToElement(driver.findElement(By.xpath("//a[text()='Maven Tutorial']")));
////		//scroll into view using JavascriptExecutor
////		
////		//JavascriptExecutor js=(JavascriptExecutor) driver;
////		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",driver.findElement(By.xpath("//a[text()='Maven Tutorial']")));
//
////		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
////		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@name=\"iframeResult\"]")));
////		driver.findElement(By.xpath("//button[text()='Try it']")).click();
////		//System.out.println(driver.switchTo().alert().getText());
////		driver.switchTo().alert().sendKeys("");
////		driver.switchTo().alert().accept();
////		driver.switchTo().parentFrame();
////		System.out.println(driver.findElement(By.xpath("//button[@id=\"runbtn\"]")).getText());
//
////		driver.get("https://www.w3schools.com/jsref/met_win_prompt.asp");
////
////		for (int i = 1; i <= 2; i++) {
////			driver.findElement(By.xpath("(//a[text()='Try it Yourself �'])[" + i + "]")).click();
////		}
////
////		System.out.println(driver.getWindowHandles());
////
////		Set<String> allwindowHandles = driver.getWindowHandles();
////
////		Iterator<String> it = allwindowHandles.iterator();
////		it.next();
////
////		driver.switchTo().window(it.next());
//
////		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
////		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//span[text()='Next ']"))));
////		
////		driver.findElement(By.xpath("//span[text()='Next ']")).click();
//
////		System.out.println(driver.getTitle());
//
////		driver.navigate().to("https://www.ebay.com/");
////		
////		WebElement m=driver.findElement(By.xpath("(//a[text()='Fashion'])[2]"));
////		
////		Actions action=new Actions(driver);
////		//Thread.sleep(2000);
////		action.moveToElement(m).build().perform();
////		//Thread.sleep(2000);
//
////		driver.get("https://jqueryui.com/droppable/");
////
////		Actions action = new Actions(driver);
////		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"content\"]//iframe")));
////		action.dragAndDrop(driver.findElement(By.id("draggable")), driver.findElement(By.id("droppable"))).build()
////				.perform();
////
////		action.contextClick(driver.findElement(By.id("draggable"))).build().perform();
//
////		driver.get("https://text-compare.com/");
////		WebElement s1 = driver.findElement(By.xpath("//textarea[@name=\"text1\"]"));
////		s1.click();
////		s1.sendKeys("ypes of changes\r\n"
////				+ "\r\n"
////				+ "\r\n"
////				+ "Bug fix (non-breaking change which fixes an issue).\r\n"
////				+ "New feature (non-breaking change which adds functionality).\r\n"
////				+ "Breaking change (fix or feature that would cause existing functionality to change).");
////		Actions action = new Actions(driver);
////		action.keyDown(s1, Keys.CONTROL).sendKeys("a").sendKeys("c").build().perform();
////		WebElement s2 = driver.findElement(By.xpath("//textarea[@name=\"text2\"]"));
////		s2.click();
////		action.keyDown(s2, Keys.CONTROL).sendKeys("a").sendKeys("x").sendKeys("v").build().perform();
//
//		Date date = new Date();
//		System.out.println(date);
//		String modifiedDate = date.toString().replace(" ", "-").replace(":", "-");
//		driver.get("https://www.w3schools.com/tags/tag_table.asp");
//		// driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='iframeResult']")));
//
//		WebElement prev = driver.findElement(By.xpath("(//a//span[text()=' Previous'])[1]"));
//
//		System.out.println(
//				((JavascriptExecutor) driver).executeScript("arguments[0].style.border='3px solid red';", prev));
//
//		TakesScreenshot ss = (TakesScreenshot) driver;
//
//		//driver.get("http://sampleapp.tricentis.com/101/");
//		File file = ss.getScreenshotAs(OutputType.FILE);
//		FileUtils.copyFile(file, new File(".//screenshot/" + modifiedDate + ".png"));
//
////		List<WebElement> l = driver.findElements(By.xpath("(//table//tbody//tr)[2]//td"));
////
////		int colSize = driver.findElements(By.xpath("(//table//tbody//tr)[2]//td")).size();
////
////		for (int i = 2; i <= 2; i++) {
////			// WebElement
////			// l1=driver.findElement(By.xpath("(//table//tbody//tr)["+i+"]//td"));
////
////			for (int j = 1; j <= colSize; j++) {
////				System.out.print(
////						driver.findElement(By.xpath("(//table//tbody//tr)[" + i + "]//td[" + j + "]")).getText() + " ");
////			}
////			System.out.println();
////		}
//
////		List<WebElement> list = driver.findElements(By.xpath("(//table//tbody)[2]//td"));
////
////		for (int i = 0; i < list.size(); i++) {
////			System.out.print(list.get(i).getText() + " ");
////		}
//		
//	// tagname[starts-with(@attrivute,value)]
//
//	}
//
//}
