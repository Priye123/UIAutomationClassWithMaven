package javatestcases;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestNGBasics {

	@BeforeSuite()
	void a() {
		System.out.println("Before Suite");
	}

	@BeforeTest()
	void b() {
		System.out.println("Before Test");
		SoftAssert asse = new SoftAssert();

		asse.assertEquals(2 + 3 == 5, true);
		asse.assertEquals("Raman", "Raman");
		asse.assertFalse(true);
		asse.assertEquals("Raman", "Raman");
		//asse.assertAll();
	}

	@BeforeMethod
	void c() {
		System.out.println("Before Method");
		throw new SkipException("skipped");
	}

	@Test(priority = 1, description = "This is a good help", enabled = true, groups = { "regression" })
	void d() {
		System.out.println("Test");
	}

	@AfterMethod
	void e() {
		System.out.println("After Method");
	}

	@AfterTest
	void f() {
		System.out.println("After Test");
	}

	@AfterSuite(groups = { "regression" })
	void g() {
		System.out.println("After Suite");
	}

}
