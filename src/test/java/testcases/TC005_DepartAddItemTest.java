package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.Specification;
import pages.CountryPage;
import pages.DepartAddItemPage;
import pages.HomePage;

public class TC005_DepartAddItemTest extends Specification{

	@BeforeTest
	public void setup() {
		sheetName="TC005";
	}
	
	@Test (dataProvider ="getData",priority=5)
	
	public void departtest(String Email,String Phone,String DebitCard,String FirstName,String LastName,String Address) throws InterruptedException {
		
		new CountryPage(driver)
		.choosecountry();
		
		new HomePage(driver)
		
		.menu()
		.waittime(1000)
		.appliance()
		.smallkitappl()
		.microwave();
		
		new DepartAddItemPage(driver)
		
		.typemicrowave()
		.steelmicrowave()
		.addtocart()
		.verifyaddedtocart()
		.gotocart()
		.checkout()
		.guest()
		.email(Email)
		.phone(Phone)
		.contpayment()
		.debitcard(DebitCard)
		.firstname(FirstName)
		.lastname(LastName)
		.address(Address)
		.selectaddress()
		.placeorder()
		.verifyvalidcard();

	}
}
