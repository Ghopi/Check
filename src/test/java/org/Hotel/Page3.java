package org.Hotel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page3 extends Base{
	public Page3() {
		PageFactory.initElements(dr, this);
		// TODO Auto-generated constructor stub
	}
	@FindBy(id="first_name")
	private WebElement e1;
	
	@FindBy(id="last_name")
	private WebElement e2;
	
	@FindBy(id="address")
	private WebElement e3;
	
	@FindBy(id="cc_num")
	private WebElement e4;
	
	@FindBy(id="cc_type")
	private WebElement e5;
	
	@FindBy(id="cc_exp_month")
	private WebElement e6;
	
	@FindBy(id="cc_exp_year")
	private WebElement e7;
	
	@FindBy(id="cc_cvv")
	private WebElement e8;
	
	@FindBy(id="book_now")
	private WebElement e9;

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

	public WebElement getE8() {
		return e8;
	}

	public WebElement getE9() {
		return e9;
	}

	
}
