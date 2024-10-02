package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomClass extends TestBase {

	@FindBy(id = "UserName")
	WebElement username;

	@FindBy(id = "Password")
	WebElement password;

	@FindBy(id = "btnLogin")
	WebElement loginBtn;

	public PomClass() {
		PageFactory.initElements(driver, this);
	}

	public void username() {
		username.sendKeys("training@jalaacademy.com");
	}

	public void password() {
		password.sendKeys("jobprogram");
	}

	public void loginbtn() {
		loginBtn.click();
	}

}
