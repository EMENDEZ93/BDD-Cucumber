package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginOrCreateAnAccount {

	WebDriver controller;
	
	public LoginOrCreateAnAccount(WebDriver controller) {
		this.controller = controller;
	}
	
	public void setEmail(String email) {
		controller.findElement(By.id("MainContent_txtUserName")).sendKeys(email);
	}

	public void setPassword(String password) {
		controller.findElement(By.id("MainContent_txtPassword")).sendKeys(password);
	}
	
	public void clickLogin() {
		controller.findElement(By.id("MainContent_btnLogin")).click();
	}

	public void clickCreateAccount() {
		controller.findElement(By.linkText("Create Account")).click();
		//controller.findElement(By.xpath("//*[@id='ctl01']/div[3]/div[2]/div/div[2]/a)")).click();
	}
}
