package com.crm.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	@FindBy(name = "user_name")
	private WebElement username;
	
	@FindBy(name = "user_password")
	private WebElement password;
	
	@FindBy(id = "submitButton")
	private WebElement loginbutton;
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements( driver,this );
		
	}

	public WebElement getUsername() {
		return username;
	}

	public void setUsername(WebElement username) {
		this.username = username;
	}

	public WebElement getPassword() {
		return password;
	}

	public void setPassword(WebElement password) {
		this.password = password;
	}

	public WebElement getLoginbutton() {
		return loginbutton;
	}

	public void setLoginbutton(WebElement loginbutton) {
		this.loginbutton = loginbutton;
	}
	
}
