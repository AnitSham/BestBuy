package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import base.Specification;

public class HomePage extends Specification {

	@FindBy(xpath = "//span[text()='Account']")
	WebElement account;

	@FindBy(linkText = "Create Account")
	WebElement createaccount;

	@FindBy(linkText = "Sign In")
	WebElement signin;

	@FindBy(linkText = "Top Deals")
	WebElement topdeals;

	@FindBy(xpath = "//div/span[text()='Top Deals']")
	WebElement verifytdtext;

	@FindBy(linkText = "Deal of the Day")
	WebElement dealoftheday;

	@FindBy(xpath = "//div/h2/span[text()='Deal']")
	WebElement verifydotdtext;

	@FindBy(linkText = "Yes, Best Buy Sells That")
	WebElement yesbestbuy;

	@FindBy(xpath = "//div/h1[text()='Yes, Best Buy sells ']")
	WebElement verifyybbtext;

	@FindBy(linkText = "My Best Buy Memberships")
	WebElement mybestbuy;

	@FindBy(xpath = "//div/h1[text()='Meet the My Best Buy Memberships™.']")
	WebElement verifymbbtext;

	@FindBy(linkText = "Credit Cards")
	WebElement creditcard;

	@FindBy(xpath = "//div/h1[text()='My Best Buy® Credit Cards']")
	WebElement verifycctext;

	@FindBy(linkText = "Gift Cards")
	WebElement giftcards;

	@FindBy(xpath = "//div/h1[text()='Best Buy Gift Cards']")
	WebElement veriftgctext;

	@FindBy(linkText = "Gift Ideas")
	WebElement giftideas;

	@FindBy(xpath = "//div/h1[text()='Gift Ideas']")
	WebElement verifygitext;

	@FindBy(linkText = "Accessibility")
	WebElement accessibility;

	@FindBy(xpath = "//div/h1[text()='Accessibility']")
	WebElement verifyaccessibilitytext;

	@FindBy(linkText = "Terms & Conditions")
	WebElement termsnconditions;

	@FindBy(xpath = "//div/h1[text()='Terms and Conditions']")
	WebElement verifytnctext;

	@FindBy(linkText = "Privacy")
	WebElement privacy;

	@FindBy(xpath = "//div/h1[text()='Best Buy Privacy Hub']")
	WebElement verifyprivacytext;

	@FindBy(id = "gh-search-input")
	WebElement searchbar;

	@FindBy(xpath = "//button[@aria-label='Menu']")
	WebElement menu;

	@FindBy(xpath = "//button[text()='Brands']")
	WebElement brands;

	@FindBy(linkText = "Samsung")
	WebElement choosebrand;

	@FindBy(xpath = "//li/button[text()='Appliances']")
	WebElement appliance;

	@FindBy(xpath = "//li/button[text()='Small Kitchen Appliances']")
	WebElement smallkitappl;

	@FindBy(linkText = "Microwaves")
	WebElement microwave;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public HomePage account() {
		click(account);
		return this;
	}

	public SignUpPage createaccount() {
		Actions action = new Actions(driver);
		action.moveToElement(createaccount).click().build().perform();
		return new SignUpPage(driver);
	}

	public LoginPage signin() {
		click(signin);
		return new LoginPage(driver);
	}

	public HomePage topdeals() {
		click(topdeals);
		return this;
	}

	public HomePage verifytdtext() {
		String x = verifytdtext.getText();
		Assert.assertEquals("Top Deals", x);
		System.out.println(x);
		return this;
	}

	public HomePage dealoftheday() {
		click(dealoftheday);
		return this;
	}

	public HomePage verifydotdtext() {
		String y = verifydotdtext.getText();
		Assert.assertEquals("Deal", y);
		System.out.println(y);
		return this;
	}

	public HomePage yesbestbuy() {
		click(yesbestbuy);
		return this;
	}

	public HomePage verifyybbtext() {
		String z = verifyybbtext.getText();
		if (z.equalsIgnoreCase("Yes, Best Buy sells "))
			System.out.println(z);
		return this;
	}

	public HomePage mybestbuy() {
		click(mybestbuy);
		return this;
	}

	public HomePage verifymbbtext() {
		String a = verifymbbtext.getText();
		Assert.assertEquals("Meet the My Best Buy Memberships™.", a);
		System.out.println(a);
		return this;
	}

	public HomePage creditcard() {
		click(creditcard);
		return this;
	}

	public HomePage verifycctext() {
		String b = verifycctext.getText();
		Assert.assertEquals("My Best Buy® Credit Cards", b);
		System.out.println(b);
		return this;
	}

	public HomePage giftcards() {
		click(giftcards);
		return this;
	}

	public HomePage verifygctext() {
		String c = veriftgctext.getText();
		Assert.assertEquals("Best Buy Gift Cards", c);
		System.out.println(c);
		return this;
	}

	public HomePage giftideas() {
		click(giftideas);
		return this;
	}

	public HomePage verifygitext() {
		String d = verifygitext.getText();
		Assert.assertEquals("Gift Ideas", d);
		System.out.println(d);
		return this;
	}

	public HomePage accessibility() {
		click(accessibility);
		return this;
	}

	public HomePage verifyaccessibilitytext() {
		String a = verifyaccessibilitytext.getText();
		Assert.assertEquals("Accessibility", a);
		System.out.println(a);
		return this;
	}

	public HomePage termsnconditions() {
		click(termsnconditions);
		return this;
	}

	public HomePage verifytnctext() {
		String b = verifytnctext.getText();
		Assert.assertEquals("Terms and Conditions", b);
		System.out.println(b);
		return this;
	}

	public HomePage privacy() {
		click(privacy);
		return this;
	}

	public HomePage verifyprivacytext() {
		String c = verifyprivacytext.getText();
		Assert.assertEquals("Best Buy Privacy Hub", c);
		System.out.println(c);
		return this;
	}

	public SearchAddItemPage searchbar(String SearchBar) {
		sendKeys(searchbar, SearchBar);
		return new SearchAddItemPage(driver);
	}

	public HomePage menu() {
		click(menu);
		return this;
	}

	public HomePage brands() {
		Actions action = new Actions(driver);
		action.moveToElement(brands).click().build().perform();
		return this;
	}

	public HomePage choosebrand() {
		click(choosebrand);
		return this;
	}

	public HomePage waittime(long time) throws InterruptedException {
		waitProperty(time);
		return this;
	}

	public HomePage appliance() {
		click(appliance);
		return this;
	}

	public HomePage smallkitappl() {
		Actions action = new Actions(driver);
		action.moveToElement(smallkitappl).click().build().perform();
		return this;
	}

	public HomePage microwave() {
		click(microwave);
		return this;

	}
}
