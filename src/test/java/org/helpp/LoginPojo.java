package org.helpp;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class LoginPojo extends Sample{
	


		
		public LoginPojo() {
			PageFactory.initElements(driver, this);
		}
		//Webelement txtEmail=driver.findElement(By.id("email"));
		@CacheLookup
		@FindBy(id="email")
		private WebElement txtEmail;
		
		@CacheLookup
		@FindBy(id="pass")
		private WebElement txtPass;
		
		@FindBy(xpath="//button[@name='login']")
		 private WebElement btnLogin;

		public WebElement getTxtEmail() {
			return txtEmail;
		}

		public WebElement getTxtPass() {
			return txtPass;
		}

		public WebElement getBtnLogin() {
			return btnLogin;
		}

		public List<WebElement> getCreateAccount() {
			return createAccount;
		}
		@FindBy(xpath="//a[@role='button']")
		 private List<WebElement> createAccount;

	
		
		
		
	


		
	}
		
	

