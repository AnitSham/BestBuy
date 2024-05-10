package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.Specification;
import pages.CountryPage;
import pages.HomePage;

public class TC003_AddItemBySearchTest extends Specification{

	@BeforeTest
	public void setup() {
		sheetName="TC003";
	}
	
	@Test (dataProvider ="getData",priority=3)
	
	public void searchitemtest(String SearchBar) {
		
		new CountryPage(driver)
		.choosecountry();
		
		new HomePage(driver)
		
		.searchbar(SearchBar)
		.search()
		.mobile()
		.scrolldown()
		.addtocart()
		.verifyaddtocart();
		
	}

}
