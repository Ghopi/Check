package org.Hotel;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Base {
	static WebDriver dr;
	public static void lan(String s) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Music\\eclipse-java-photon-R-win32-x86_64\\WebSele\\drv\\chromedriver.exe");
		dr = new ChromeDriver();
		dr.get(s);
		// TODO Auto-generated method stub
	}
	public static void fil(WebElement e,String s) {
		// TODO Auto-generated method stub
		e.sendKeys(s);
			}
	public static void kick(WebElement e) {
		// TODO Auto-generated method stub
			e.click();
	}
	
	public static void selct(WebElement e,int i) {
		// TODO Auto-generated method stub
		Select s=new Select(e);
		s.selectByIndex(i);
	}
	
	public static void winChang() {
		// TODO Auto-generated method stub
		String p=dr.getWindowHandle();
		Set<String> all= dr.getWindowHandles();
		for (String x : all) {
			if(!p.equals(x))
				dr.switchTo().window(x);
		}
		
	}

}
