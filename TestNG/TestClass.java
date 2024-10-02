
 package TestNG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestClass {
	      
	
	   @BeforeClass
	    public void ExampleForBeforeclass() {
	    	System.out.println("This is Before Class");
	    } 
	   
	    @BeforeMethod
	    public void ExampleForBeforeMethod() {
	    	System.out.println("This is Before Method");
	    }
	    
	 
		@Test(invocationCount = 3)
		public void ExampleTestClass() {
			System.out.println("This is Test Class");
			Reporter.log("hi Good morning",true);
		}
		
		@Test(priority=-3)
		public void ExampleTestClass2() {
			System.out.println("This is Test Class 2");
			Reporter.log("hi Good evening",true);
		}
		
		@Test(priority=-5)
		public void ExampleTestClass3() {
			System.out.println("This is Test Class 3");
			Reporter.log("priority",true);
		}
		
		@Test(priority=5)
		public void ExampleTestClass4() {
			System.out.println("This is Test Class 4");
			Reporter.log("priority",true);
		}
		@Test(enabled = true)
		public void ExampleTestClass5() {
			System.out.println("This is Test Class 5");
			Reporter.log("priority",true);
		}
		
		@Test(dependsOnMethods = "ExampleTestClass2")
		public void ExampleTestClass6() {
			System.out.println("This is Test Class 6");
			Reporter.log("priority6",true);
		}
		
		 
		@AfterMethod
	    public void ExampleForAfterMethod() {
	    	System.out.println("This is After Method");
	    }
		 
		@AfterClass
	    public void ExampleForAfterclass() {
	    	System.out.println("This is After Class");
	    }
		

}
