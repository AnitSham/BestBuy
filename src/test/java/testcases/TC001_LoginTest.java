package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.Specification;
import pages.CountryPage;
import pages.HomePage;

public class TC001_LoginTest extends Specification{

	@BeforeTest
	public void setup() {
		sheetName="TC001";
	}
	
	@Test (dataProvider ="getData",priority=-1)
	
	public void choosecountrytest(String LoginEmail,String LoginPassword ) {
		
		new CountryPage(driver)
		.choosecountry();
		
	/*	new HomePage(driver)
		.account()
		.createaccount()
		.firstname(FirstName)
		.lastname(LastName)
		.email(Email)
		.password(Password)
		.conpassword(ConPassword)
		.phone(Phone)
		.submit(); */
		
		new HomePage(driver)
		.signin()
		.loginemail(LoginEmail)
		.loginpassword(LoginPassword)
		.login();	
		
		
		
	}
}
