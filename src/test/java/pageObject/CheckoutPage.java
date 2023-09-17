package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import helper.Base;

public class CheckoutPage extends Base {

	public void clickOnCart() {

		WebElement cartlink = driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
		cartlink.click();

	}
	public void clickOnRemove() {
		WebElement remove =driver.findElement(By.xpath("//button[@id='remove-sauce-labs-backpack']"));
		remove.click();
	}

	public void clickOnCheckout() {
		WebElement checkoutbtn = driver.findElement(By.xpath("//button[@class='btn btn_action btn_medium checkout_button']"));
		checkoutbtn.click();
	}

	public void enterFirstNameAndLastNameAndPostalCode(String fname, String lname, String postalcode) {
		WebElement Firstname = driver.findElement(By.xpath("//input[@id='first-name']"));
		Firstname.sendKeys(fname);

		WebElement Lastname = driver.findElement(By.xpath("//input[@id='last-name']"));
		Lastname.sendKeys(lname);
		WebElement PostalCode = driver.findElement(By.xpath("//input[@id='postal-code']"));
		PostalCode.sendKeys(postalcode);

	}
	public boolean validate_error1_message() {
		 return driver.findElement(By.cssSelector("div.error-message-container.error")).isDisplayed();
	}

	public void clickOnContinuebutton() {
		WebElement contbtn = driver.findElement(By.xpath("//input[@id='continue']"));
		contbtn.click();

	}
	
	

	public void clickOnFinishbutton() {
		WebElement fnbtn=driver.findElement(By.xpath("//button[@id='finish']"))	;
		fnbtn.click();
	}
	
		
	}

	
		
	

		
	


