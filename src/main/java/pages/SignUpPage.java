package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Specification;

public class SignUpPage extends Specification {

	@FindBy(id = "firstName")
	WebElement firstname;

	@FindBy(id = "lastName")
	WebElement lastname;

	@FindBy(id = "email")
	WebElement email;

	@FindBy(name = "fld-p1")
	WebElement password;

	@FindBy(id = "reenterPassword")
	WebElement conpassword;

	@FindBy(id = "phone")
	WebElement phone;

	@FindBy(xpath = "//div/button[text()='Create an Account']")
	WebElement submit;

	public SignUpPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public SignUpPage firstname(String FirstName) {
		sendKeys(firstname, FirstName);
		return this;
	}

	public SignUpPage lastname(String LastName) {
		sendKeys(lastname, LastName);
		return this;
	}

	public SignUpPage email(String Email) {
		sendKeys(email, Email);
		return this;
	}

	public SignUpPage password(String Password) {
		sendKeys(password, Password);
		return this;
	}

	public SignUpPage conpassword(String ConPassword) {
		sendKeys(conpassword, ConPassword);
		return this;
	}

	public SignUpPage phone(String Phone) {
		sendKeys(phone, Phone);
		return this;
	}

	public SignUpPage submit() {
		click(submit);
		return this;
	}
}
