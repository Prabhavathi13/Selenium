package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Parallel {
	@Test
	public static void classparallel () throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.javatpoint.com/linux-commands");
		Reporter.log("JavaTPoint",true);
		Thread.sleep(2000);
		
		driver.close();
		

	}
	
}
