package org.Hotel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page2 extends Base{
	public Page2() {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(dr, this);
	}
	
	@FindBy(id="radiobutton_0")
	private WebElement e1;
	
	@FindBy(id="continue")
	private WebElement e2;

	public WebElement getE1() {
		return e1;
	}

	public WebElement getE2() {
		return e2;
	}
	
	

}
