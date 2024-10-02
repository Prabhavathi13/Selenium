package TestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Asserts {
    @Test
	public static void assertequalclass() {
		
		String ActulValue = "Prabha" ;
		String ExpectedValue = "Prabha" ;
		 Assert.assertEquals(ActulValue,ExpectedValue);
		 Reporter.log("Result is matching",true);
		
	}
    
     
    @Test
    public static void assertnotequalclass() {
		
		String ActulValue = "Prabha" ;
		String ExpectedValue = "Prabhavathi" ;
		 Assert.assertNotEquals(ActulValue,ExpectedValue);
		 Reporter.log("Result is not matching",true);
		
	}
    
   // @Test
    public static void assertequalclass2() {
		
		String ActulValue = "Prabha" ;
		String ExpectedValue = "Prabhavathi" ;
		 Assert.assertNotEquals(ActulValue,ExpectedValue);
		 Reporter.log("Result is not matching",true);
		
	}
    
 //   @Test
    public static void assertnotequalclass2() {
		
		String ActulValue = "Prabha" ;
		String ExpectedValue = "Prabha" ;
		 Assert.assertNotEquals(ActulValue,ExpectedValue);
		 Reporter.log("Result is not matching",true);
		
	}
    
    @Test(enabled = false)
    public static void assertrueclass(){
    	boolean Result=true;
    	 
    	 Assert.assertTrue(Result, "Result is false");
    	 Reporter.log("Paased asser true class", true);
    }


}
