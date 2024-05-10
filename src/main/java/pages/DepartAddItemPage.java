package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import base.Specification;

public class DepartAddItemPage extends Specification {

	@FindBy(xpath = "//div/a[text()='Built-in microwaves']")
	WebElement typemicrowave;

	@FindBy(xpath = "//a[text()='GE - Profile Series 1.1 Cu. Ft. Mid-Size Microwave with Sensor Cooking - Stainless Steel']")
	WebElement steelmicrowave;

	@FindBy(xpath = "//div/button[text()='Add to Cart']")
	WebElement addtocart;

	@FindBy(xpath = "//div/span[text()='Added to cart']")
	WebElement verifyaddedtocart;

	@FindBy(linkText = "Go to Cart")
	WebElement gotocart;

	@FindBy(xpath = "//div/button[text()='Checkout']")
	WebElement checkout;

	@FindBy(xpath = "//div/button[text()='Continue as Guest']")
	WebElement guest;

	@FindBy(name = "emailAddress")
	WebElement email;

	@FindBy(name = "phone")
	WebElement phone;

	@FindBy(xpath = "//button/span[text()='Continue to Payment Information']")
	WebElement contpayment;

	@FindBy(id = "number")
	WebElement debitcard;

	@FindBy(id = "first-name")
	WebElement firstname;

	@FindBy(id = "last-name")
	WebElement lastname;

	@FindBy(name = "addressLine1")
	WebElement address;

	@FindBy(xpath = "//div[text()='2 1 Dallas Ct, Angleton, TX 77515']")
	WebElement selectaddress;

	@FindBy(xpath = "//button/span[text()='Place Your Order']")
	WebElement placeorder;

	@FindBy(xpath = "//div/p[text()='Please enter a valid card number.']")
	WebElement verifyvalidcard;

	public DepartAddItemPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public DepartAddItemPage typemicrowave() {
		click(typemicrowave);
		return this;
	}

	public DepartAddItemPage steelmicrowave() {
		click(steelmicrowave);
		return this;
	}

	public DepartAddItemPage addtocart() {
		click(addtocart);
		return this;
	}

	public DepartAddItemPage verifyaddedtocart() {
		String z = verifyaddedtocart.getText();
		System.out.println("Added to cart");
		return this;
	}

	public DepartAddItemPage gotocart() {
		click(gotocart);
		return this;
	}

	public DepartAddItemPage checkout() {
		click(checkout);
		return this;
	}

	public DepartAddItemPage guest() {
		click(guest);
		return this;
	}

	public DepartAddItemPage email(String Email) {
		sendKeys(email, Email);
		return this;
	}

	public DepartAddItemPage phone(String Phone) {
		sendKeys(phone, Phone);
		return this;
	}

	public DepartAddItemPage contpayment() {
		click(contpayment);
		return this;
	}

	public DepartAddItemPage debitcard(String DebitCard) {
		sendKeys(debitcard, DebitCard);
		return this;
	}

	public DepartAddItemPage firstname(String FirstName) {
		sendKeys(firstname, FirstName);
		return this;
	}

	public DepartAddItemPage lastname(String LastName) {
		sendKeys(lastname, LastName);
		return this;
	}

	public DepartAddItemPage address(String Address) {
		sendKeys(address, Address);
		return this;
	}

	public DepartAddItemPage selectaddress() {
		click(selectaddress);
		return this;
	}

	public DepartAddItemPage placeorder() {
		click(placeorder);
		return this;
	}

	public DepartAddItemPage verifyvalidcard() {
		String a = verifyvalidcard.getText();
		Assert.assertEquals("Please enter a valid card number.", a);
		System.out.println(a);
		return this;
	}

	public DepartAddItemPage scrolldown() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,350)", "");
		return this;
	}

	public DepartAddItemPage waittime(long time) throws InterruptedException {
		waitProperty(time);
		return this;
	}
}
