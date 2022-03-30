package org.stepdefinitions;

import org.helpp.Sample;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FrgtPojo extends Sample {

	public FrgtPojo() {

		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[text()='Forgotten password?']")
	private WebElement btnFrgtPass;
	
	@FindBy(xpath="//input[@id='identify_email']")
	private WebElement txtBox;
	
	@FindBy(xpath="//button[text()='Search']")
	private WebElement txtSearchBox;

	public WebElement getBtnFrgtPass() {
		return btnFrgtPass;
	}

	public WebElement getTxtBox() {
		return txtBox;
	}

	public WebElement getTxtSearchBox() {
		return txtSearchBox;
	}
	
	
	

}
