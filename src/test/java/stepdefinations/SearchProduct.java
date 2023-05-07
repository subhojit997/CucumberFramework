package stepdefinations;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import factory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.SPland;
import pages.searchpage;

public class SearchProduct {
     
WebDriver driver;
private SPland spl;
	@Given("The Users navigate to landpage of the ecommerces application")
	public void the_users_navigate_to_landpage_of_the_ecommerces_application() {
		driver = DriverFactory.getDriver();
		spl = new SPland(driver);
		spl.clicklogoicon();
		
	}

	@When("In the search field User enter Printed Summer Dress Text")
	public void in_the_search_field_user_enter_printed_summer_dress_text() {
	    
		spl.entertextsearchfield();
	
	
	}

	@When("User click on search button")
	public void user_click_on_search_button() {
	  driver.findElement(By.xpath("//button[@name=\"submit_search\"]")).click(); 
	
	spl.searchbtn();
	}

	@Then("User view Printed Summer Dress result")
	public void user_view_printed_summer_dress_result() {
		searchpage sep = new searchpage(driver);
		Assert.assertTrue(sep.forpageresult().contains("3 results have been found."));
		
	}


}
