package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Specification;

public class CountryPage extends Specification {

	@FindBy(linkText = "United States")
	WebElement choosecountry;

	public CountryPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public CountryPage choosecountry() {
		click(choosecountry);
		return this;
	}

}
