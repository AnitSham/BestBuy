package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.Specification;
import pages.BrandAddItemPage;
import pages.CountryPage;
import pages.HomePage;

public class TC004_AddItemByBrandTest extends Specification{

		@BeforeTest
		public void setup() {
			
		}
		
		@Test(priority=4)
		public void brandtest() throws InterruptedException {
			
			new CountryPage(driver)
			.choosecountry();
			
			new HomePage(driver)
			
			.menu()
			.waittime(2000)
			.brands()
			.waittime(1000)
			.choosebrand();
			
		new BrandAddItemPage(driver)
	
		.watchnbuds()
		.earbuds()
		.waittime(2000)
		.scrolldown()
		.addtocart()
		.waittime(1000)
		.verifyaddedtocart();
				
		}
}
