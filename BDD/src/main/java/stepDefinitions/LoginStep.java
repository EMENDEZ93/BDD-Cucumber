package stepDefinitions;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.LoginOrCreateAnAccount;

public class LoginStep {

	WebDriver controller;
	LoginOrCreateAnAccount loginOrCreateAnAccount; 
	
	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver",
				"/home/dezmen/Documentos/Projects/BDD-Cucumber/BDD/drivers/chromedriver");
		controller = new ChromeDriver();
		
		loginOrCreateAnAccount = new LoginOrCreateAnAccount(controller);
		
	}
	
	@After
	public void tearDown() {
		controller.close();		
	}
	
	
	@Given("el usuario esta en la pagina de login")
	public void el_usuario_esta_en_la_pagina_de_login() {
		controller.manage().window().maximize();
		controller.get("http://sdettraining.com/trguitransactions/AccountManagement.aspx");
	}
		
	@When("^el usuario ingresa credenciales invalidas \"(.*)\"$")
	public void el_usuario_ingresa_credenciales_validas(String email) {
		//controller.findElement(By.id("MainContent_txtUserName")).sendKeys(email);
		loginOrCreateAnAccount.setEmail(email);
	}
	
	@And("^y el password invalido \"(.*)\"$")
	public void y_el_password(String password) {	
		//controller.findElement(By.id("MainContent_txtPassword")).sendKeys(password);
		loginOrCreateAnAccount.setPassword(password);
	}	
	
	@Then("^el usuario puede ver un mensaje de error \"(.*)\"$")
	public void el_usuario_puede_ver_un_mensaje_de_error(String message) throws Throwable {
		//controller.findElement(By.id("MainContent_btnLogin")).click();
		loginOrCreateAnAccount.clickLogin();
		
		Thread.sleep(2000);

		String result = controller.findElement(By.id("MainContent_lblTransactionResult")).getText();

		assertEquals(result, message);
	}
	
	
	/*test 2*/
	
	@Given("el usuario esta en la pagina de login con")
	public void el_usuario_esta_en_la_pagina_de_login_con() {
		controller.manage().window().maximize();
		controller.get("http://sdettraining.com/trguitransactions/AccountManagement.aspx");
	}

	@When("^el usuario ingresa credenciales validas \"(.*)\"$")
	public void el_usuario_ingresa_credenciales_invalidas(String email) {
		//controller.findElement(By.id("MainContent_txtUserName")).sendKeys(email);
		loginOrCreateAnAccount.setEmail(email);
	}

	@When("^y el password \"(.*)\"$")
	public void y_el_password_invalido_didier(String password) {
		//controller.findElement(By.id("MainContent_txtPassword")).sendKeys(password);
		loginOrCreateAnAccount.setPassword(password);
	}
	
	@Then("^el usuario puede ver su panel de administracion \"(.*)\"$")
	public void el_usuario_puede_ver_su_panel_de_administracion(String message) throws Throwable {
		controller.findElement(By.id("MainContent_btnLogin")).click();
		Thread.sleep(2000);

		String result = controller.findElement(By.id("conf_message")).getText();

		assertEquals(result, message);
	}
		
}
