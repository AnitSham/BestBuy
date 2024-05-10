package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Specification;

public class BrandAddItemPage extends Specification {

	@FindBy(xpath = "(//div/a[@class='flex-link'])[3]")
	WebElement watchnbuds;

	@FindBy(linkText = "Samsung - Galaxy Buds2 Pro True Wireless Earbud Headphones - Graphite")
	WebElement earbuds;

	@FindBy(xpath = "(//div/button[text()='Add to Cart'])[3]")
	WebElement addtocart;

	@FindBy(xpath = "//div/span[text()='Added to cart']")
	WebElement verifyaddedtocart;

	public BrandAddItemPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public BrandAddItemPage watchnbuds() {
		click(watchnbuds);
		return this;
	}

	public BrandAddItemPage earbuds() {
		click(earbuds);
		return this;
	}

	public BrandAddItemPage addtocart() {
		click(addtocart);
		return this;
	}

	public BrandAddItemPage verifyaddedtocart() {
		String y = verifyaddedtocart.getText();
		System.out.println("Added to cart");
		return this;
	}

	public BrandAddItemPage scrolldown() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,350)", "");
		return this;
	}

	public BrandAddItemPage waittime(long time) throws InterruptedException {
		waitProperty(time);
		return this;
	}

}