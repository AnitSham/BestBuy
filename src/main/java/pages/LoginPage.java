package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Specification;

public class LoginPage extends Specification {

	@FindBy(id = "fld-e")
	WebElement loginemail;

	@FindBy(id = "fld-p1")
	WebElement loginpassword;

	@FindBy(xpath = "//div/button[text()='Sign In']")
	WebElement signin;

	public LoginPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public LoginPage loginemail(String LoginEmail) {
		sendKeys(loginemail, LoginEmail);
		return this;
	}

	public LoginPage loginpassword(String LoginPassword) {
		sendKeys(loginpassword, LoginPassword);
		return this;
	}

	public LoginPage login() {
		click(signin);
		return this;
	}

}
