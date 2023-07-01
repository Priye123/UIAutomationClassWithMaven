package javatestcases;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listeners implements ITestListener {

	public void onTestStart(ITestResult result) {
		System.out.println(result.getMethod().getMethodName() + " onTestStart");
		Reporter.log("Raman");
		Reporter.log(result.getMethod().getMethodName() + " onTestStart");
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println(result.getMethod().getMethodName() + " onTestSuccess");
		Reporter.log(result.getMethod().getMethodName() + " onTestSuccess");
	}

	public void onTestFailure(ITestResult result) {
		System.out.println(result.getMethod().getMethodName() + " onTestFailure");
		Reporter.log(result.getMethod().getMethodName() + " onTestFailure");
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub

	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub

	}

	public void onStart(ITestContext context) {
		System.out.println(context.getName() + " onStart");
		Reporter.log(context.getName() + " onStart");
	}

	public void onFinish(ITestContext context) {
		System.out.println(context.getName() + " onFinish");
		Reporter.log(context.getName() + " onFinish");
	}

}
