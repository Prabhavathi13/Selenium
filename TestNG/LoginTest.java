package TestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {
	PomClass login;

	@BeforeClass
	public void setup() {
		Initilization();
		login = new PomClass();

	}

	@Test
	public void validateLoginPage() throws InterruptedException {
		login.username();
		login.password();
		login.loginbtn();
		Thread.sleep(3000);
		String actual = driver.getTitle();
		String expected = "Magnus";

		Assert.assertEquals(actual, expected);
		Reporter.log("Login page is validated successfully", true);

	}

	@AfterMethod
	public void tearDown() {
		driver.close();
	}
}
