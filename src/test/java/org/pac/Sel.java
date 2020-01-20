package org.pac;

import java.util.List;
import java.awt.Desktop.Action;
import java.util.ArrayList;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Sel {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Music\\eclipse-java-photon-R-win32-x86_64\\WebSele\\drv\\chromedriver.exe");
	WebDriver dr = new ChromeDriver();
	dr.get("https://paytm.com/\r\n");
	dr.manage().window().maximize();
	Thread.sleep(1000);
	WebElement w = dr.findElement(By.className("_3ac-"));
	dr.switchTo().frame("login_page");
	dr.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("w1311sw");
	dr.findElement(By.xpath("//img[@alt='Login']")).click();
		
		
	
	
	
	
}
}
