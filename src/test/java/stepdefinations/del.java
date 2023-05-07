package stepdefinations;

import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import factory.DriverFactory;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HP;
import pages.Maccount;
import pages.conadd;
import pages.lp;

public class del {

	WebDriver driver;
	private lp lop;
	private Maccount ma;
	private conadd ca;
	
	@Given("The Users navigate to login page of the ecommerces application")
	public void the_users_navigate_to_login_page_of_the_ecommerces_application() {
		driver = DriverFactory.getDriver();
		HP hp =new HP(driver);
	      hp.clickonSigninicon();
	}

	@When("The Users enter below details")
	public void the_users_enter_below_details(DataTable dataTable) {
		Map<String, String> data = dataTable.asMap(String.class, String.class);
	
	lop =new lp(driver);
	lop.EnterEmailAddress(data.get("Email address"));
	lop.EnterPassword(data.get("Password"));
	}

	@When("The Users click on Signin button")
	public void the_users_click_on_signin_button() {
	    lop.ClickonSubmitLogin();
	}

	@Then("The users opens his profile on the ecommerce application")
	public void the_users_opens_his_profile_on_the_ecommerce_application() {
	   ma = new Maccount(driver);
	   Assert.assertTrue(ma.myaccountprofile().contains("Sam you"));
	}

	@When("The Users click on MY ADDRESSES button")
	public void the_users_click_on_my_addresses_button() {
		ma.MYAddress();
	}

	@When("The Users click on delete button")
	public void the_users_click_on_delete_button() throws InterruptedException {
	    ca = new conadd(driver);
	    ca.deleteforbutton();
	}

	@Then("The Users will view No addresses are available")
	public void the_users_will_view_no_addresses_are_available() {
		Assert.assertTrue(ca.noadd().contains("Add a new address"));
	}
}
