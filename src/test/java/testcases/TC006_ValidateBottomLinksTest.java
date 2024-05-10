package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.Specification;
import pages.CountryPage;
import pages.HomePage;

public class TC006_ValidateBottomLinksTest extends Specification{

	@BeforeTest
	public void setup() {
		
	}
	
	@Test(priority=2)
	public void validatetestlink() {
	
		new CountryPage(driver)
		.choosecountry();
		
		
		new HomePage(driver)
		
		.accessibility()
		.verifyaccessibilitytext()
		.termsnconditions()
		.verifytnctext()
		.privacy()
		.verifyprivacytext();
		
	}
}
