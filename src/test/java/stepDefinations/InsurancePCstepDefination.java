package stepDefinations;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageClasses.SelectProductPage;
import utilities.BaseClass;

public class InsurancePCstepDefination {
	BaseClass bc;
	WebDriver driver;
	SelectProductPage spp;

@Given("^User load the browser$")
public void user_load_the_browser() {
	 
	this.bc = new BaseClass();
	driver=bc.initialization();
	this.spp = new SelectProductPage(driver);
   }

@When("^Open the portal \\\"(.*)\\\"$")
public void open_the_portal(String url) {
	
	driver.get(url);	
   }

@When("^Current page title captured$")
public void current_page_title_captured() {
	
	spp.fetchTitle();
   }

@Then("^Hit the product$")
public void hit_the_product() {
  
	spp.clickonproduct();
   }

@Then("^Next page title captured$")
public void next_page_title_captured() {

	spp.fetchTitle();
   }

}
