package stepDefinitions;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RegisterStep {

	WebDriver controller;
	Select dropDownCountry;
	/*
	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver",
				"/home/dezmen/Documentos/Projects/BDD-Cucumber/BDD/drivers/chromedriver");
		controller = new ChromeDriver();
	}
	
	@After
	public void tearDown() throws Throwable  {
		controller.close();		
	}
	
	@Given("el usuario esta en la pagina de registro")
	public void el_usuario_esta_en_la_pagina_de_registro() {
		controller.manage().window().maximize();
		controller.get("http://sdettraining.com/trguitransactions/NewAccount.aspx");	
	}

	@When("^el usuario ingresa sus datos \"(.*)\" \"(.*)\" \"(.*)\" \"(.*)\"$")
	public void el_usuario_ingresa_sus_datos(String name, String email, String phone, String password) {
		controller.findElement(By.id("MainContent_txtFirstName")).sendKeys(name);
		controller.findElement(By.id("MainContent_txtEmail")).sendKeys(email);		
		controller.findElement(By.id("MainContent_txtHomePhone")).sendKeys(phone);
		controller.findElement(By.id("MainContent_Male")).click();
		controller.findElement(By.id("MainContent_txtPassword")).sendKeys(password);
		controller.findElement(By.id("MainContent_txtVerifyPassword")).sendKeys(password);
		
		dropDownCountry = new Select(controller.findElement(By.id("MainContent_menuCountry")));
		dropDownCountry.selectByVisibleText("Italy");

		controller.findElement(By.id("MainContent_btnSubmit")).click();			

	}
	
	@Then("el usuario puede ver un mensaje de exito al registrarse")
	public void el_usuario_puede_ver_un_mensaje_de_exito_al_registrarse() {
		String result = controller.findElement(By.id("MainContent_lblTransactionResult")).getText();
		assertEquals("Customer information added successfully", result);		
		
	}
	*/
}
