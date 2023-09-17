package stepDefination;

import org.junit.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.CheckoutPage;

public class CheckoutPageSteps {

	CheckoutPage check = new CheckoutPage();

	@When("user clicks on cart")
	public void user_clicks_on_cart() {
		check.clickOnCart();

	}
	

	@Then("clicks on remove button")
	public void clicks_on_remove_button() {
	   check.clickOnRemove(); 
	}
	




	@When("user clicks on checkout")
	public void user_clicks_on_checkout() {
		check.clickOnCheckout();

	}

	@And("user enter {string} and {string} and {string}")
	public void user_enter_and(String firstname, String lastname, String postalcode) {
		check.enterFirstNameAndLastNameAndPostalCode(firstname, lastname, postalcode);

	}
	

	@Then("validate error1 message")
	public void validate_error1_message() {
		Assert.assertTrue(check.validate_error1_message()); 
	}




			
		

	@Then("clicks on continue button")
	public void clicks_on_continue_button() {
		check.clickOnContinuebutton();

	}
	
	
	@Then("clicks on finish button")
	public void clicks_on_finish_button() {
		check.clickOnFinishbutton();

}
	
	   
	}

