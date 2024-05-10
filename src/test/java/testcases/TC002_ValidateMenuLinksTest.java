package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.Specification;
import pages.CountryPage;
import pages.HomePage;


public class TC002_ValidateMenuLinksTest extends Specification{

	@BeforeTest
	public void setup() {
		
	}
	
	@Test(priority=1)
	public void validatetest() {
	
		new CountryPage(driver)
		.choosecountry();
		
		new HomePage(driver)
		
		.topdeals()
		.verifytdtext()
		.dealoftheday()
		.verifydotdtext()
		.yesbestbuy()
		.verifyybbtext()
		.mybestbuy()
		.verifymbbtext()
		.creditcard()
		.verifycctext()
		.giftcards()
		.verifygctext()
		.giftideas()
		.verifygitext();
}
}