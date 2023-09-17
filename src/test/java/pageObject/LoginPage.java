package pageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import helper.Base;

public class LoginPage extends Base {

	public void enterUserNameAndPassword(String user, String pass) {

		WebElement userName = driver.findElement(By.xpath("//input[@type='text']"));
		userName.sendKeys(user);

		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
		password.sendKeys(pass);
	}

	public void clickOnLoginButton() {
		WebElement loginBtn = driver.findElement(By.xpath("//button[@type='submit']"));
		loginBtn.click();
	}

	public boolean validateSucessfulLogin() {
		return driver.findElement(By.xpath("//h5[@class='bold-font mb-4']")).isDisplayed();

	}

	  public boolean validateErrorMessage() {
		  return driver.findElement(By.xpath("//div[@id='login-error-notify']")).isDisplayed();
	  }

	public void clickOnDashboard() {
		WebElement dashboard = driver.findElement(By.xpath("//span[@id='sidebar-title']"));
		dashboard.click();
	}
}
