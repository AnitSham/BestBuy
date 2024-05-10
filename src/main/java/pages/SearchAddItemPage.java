package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Specification;

public class SearchAddItemPage extends Specification {

	@FindBy(xpath = "//button[@title='submit search']")
	WebElement search;

	@FindBy(linkText = "OnePlus - 12 256GB (Unlocked) - Silky Black")
	WebElement mobile;

	@FindBy(xpath = "(//div/button[text()='Add to Cart'])[1]")
	WebElement addtocart;

	@FindBy(xpath = "//div/span[text()='Added to cart']")
	WebElement verifyaddtocart;

	public SearchAddItemPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public SearchAddItemPage search() {
		click(search);
		return this;
	}

	public SearchAddItemPage mobile() {
		click(mobile);
		return this;
	}

	public SearchAddItemPage addtocart() {
		click(addtocart);
		return this;
	}

	public SearchAddItemPage verifyaddtocart() {
		String x = verifyaddtocart.getText();
		System.out.println("Added to cart");
		return this;
	}

	public SearchAddItemPage scrolldown() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,350)", "");
		return this;
	}
}
