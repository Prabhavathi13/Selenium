package TestNG;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Test;

public class TestListner  implements ITestListener {
	@Test
	public void onTestStart(ITestResult result) {
		 System.out.println("test case started" + result.getName());
	 }
	@Test
	 public void onTestSuccess(ITestResult result) {
		 System.out.println("test case passed" + result.getName());
     }
	@Test
	 public void onTestFailure(ITestResult result) {
		 System.out.println("test case passed" + result.getName());
     }

	   
	  

}
