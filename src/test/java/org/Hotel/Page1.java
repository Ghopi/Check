package org.Hotel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page1 extends Base{
	 public Page1() {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(dr, this);
	}
	
	@FindBy(id="location")
	private WebElement e1;
	
	@FindBy(id="hotels")
	private WebElement e2;

	@FindBy(id="room_type")
	private WebElement e3;
	
	@FindBy(id="room_nos")
	private WebElement e4;
	
	@FindBy(id="datepick_in")
	private WebElement e5;
	
	@FindBy(id="datepick_out")
	private WebElement e6;
	
	@FindBy(id="adult_room")
	private WebElement e7;
	
	@FindBy(id="child_room")
	private WebElement e8;
	
	@FindBy(id="Submit")
	private WebElement btn;

	public WebElement getE1() {
		return e1;
	}

	public WebElement getE2() {
		return e2;
	}

	public WebElement getE3() {
		return e3;
	}

	public WebElement getE4() {
		return e4;
	}

	public WebElement getE5() {
		return e5;
	}

	public WebElement getE6() {
		return e6;
	}

	public WebElement getE7() {
		return e7;
	}

	public WebElement getBtn() {
		return btn;
	}

	public WebElement getE8() {
		return e8;
	}
	
	

}
