package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class CrossBrowser {
	
WebDriver driver ;
@Parameters("browsername")
    @Test
    public void launchBrowser(String browsername) {
    	if (browsername.equals("Chrome")) {
    		driver = new ChromeDriver();
    	}
    	else if (browsername.equals("Firefox")) {
    		driver = new FirefoxDriver();
    	}
    	else if (browsername.equals("Edge")) {
    		driver = new EdgeDriver();
    	}
    	else {
    		System.out.println("please enter the correct browser name");
    	}
    	
    	driver.manage().window().maximize();
    	driver.get("https://magnus.jalatechnologies.com/Account/Login");
    }
 
} 
