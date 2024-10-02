package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSuite {
	
	@Test
	public void TC1() {
		System.out.println("This is Test case 1");
		
	}
	
	@Test
	public void TC2() {
		System.out.println("This is Test case 2");
		
	}
	
	@Test
	public void TC3() {
		System.out.println("This is Test case 3");
		Assert.fail();
		
	}
	
	@Test
	public void TC4() {
		System.out.println("This is Test case 4");
		
	}

}
