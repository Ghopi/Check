package org.Hotel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Log extends Base{
	public Log() {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(dr, this);
	}
	
	@FindBy(id="username")
	private WebElement usr;
	
	@FindBy(id="password")
	private WebElement pass;
	
	@FindBy(id="login")
	private WebElement btn;

	public WebElement getUsr() {
		return usr;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getBtn() {
		return btn;
	}
	
	
	

}
