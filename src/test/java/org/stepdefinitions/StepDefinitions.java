package org.stepdefinitions;

import java.util.List;

import org.helpp.LoginPojo;
import org.helpp.Sample;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitions extends Sample {
	FrgtPojo po;
	@Given("user has to enter facebook login using chrome browser")
	public void user_has_to_enter_facebook_login_using_chrome_browser() {

		chromeBrowser();
		pageUrl("https://www.facebook.com/");
		windowMax();
		applyImpWat();


		
	}
	@When("user have to enter {string} and {string}")
	public void user_have_to_enter_and(String email, String password) {

		LoginPojo l=new LoginPojo();
	       
	      WebElement txtEmail = l.getTxtEmail();

	      fillText(txtEmail, email);
	      
	      WebElement txtPass = l.getTxtPass();
	      fillText(txtPass, password);
	}



	@When("user have to enter valid email and invalid password")
	public void user_have_to_enter_valid_email_and_invalid_password() {

       LoginPojo l=new LoginPojo();
       
      WebElement txtEmail = l.getTxtEmail();

      fillText(txtEmail, "supriya.lekkla");
      
      WebElement txtPass = l.getTxtPass();
      fillText(txtPass, "pass");
	}
	@Given("User have to Enter Facebook Through Chrome Browser")
	public void user_have_to_Enter_Facebook_Through_Chrome_Browser() {

		chromeBrowser();
		pageUrl("https://www.facebook.com/");
		windowMax();
		applyImpWat();
     
	}

	@Given("User have to click forgotten password")
	public void user_have_to_click_forgotten_password() throws InterruptedException {

		 po=new FrgtPojo();
		WebElement frgtPass = po.getBtnFrgtPass();
		btnClick(frgtPass);
		Thread.sleep(2000);
	}

	@When("User have to enter email or phone Number")
	public void user_have_to_enter_email_or_phone_Number() {



		WebElement txtBox = po.getTxtBox();
		fillText(txtBox, "9494774303");
	}

	@Then("user have to click Search button")
	public void user_have_to_click_Search_button() {
		
		WebElement txtSearchBox = po.getTxtSearchBox();
		btnClick(txtSearchBox);

	}

	@When("user have to click login button")
	public void user_have_to_click_login_button() throws InterruptedException {

	LoginPojo l=new LoginPojo();

     WebElement btnLogin = l.getBtnLogin();
     btnClick(btnLogin);
     Thread.sleep(2000);
	}

	@Then("user have to show invalid credential page")
	public void user_have_to_show_invalid_credential_page() {
		String currentUrl = driver.getCurrentUrl();
		if(currentUrl.contains("privacy_mutation_token")) {
			 System.out.println("invalid credentials");
		}
		else {
			System.out.println("user does not enter into another page");
		}
	}

}
