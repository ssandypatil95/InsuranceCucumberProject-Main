package pageClasses;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.BaseClass;

public class SelectCityAndSelectIdPage extends BaseClass{
	
	 WebDriver driver;   
     WebDriverWait wait;

	   @FindBy(xpath = "//*[@id='txtcity']") WebElement citytextbox;
	   @FindBy(xpath = "//*[@id='divcitylist']") WebElement cityname;
	   
	   @FindBy(xpath = "//*[@id='fullname']") WebElement fullname;
	   @FindBy(xpath = "//*[@id='pmobile']") WebElement pmobilefield;
	   @FindBy(xpath = "//*[@type='submit']") WebElement continuebutton;

		public SelectCityAndSelectIdPage(WebDriver driver) 
		{
			this.driver=driver;
			
			PageFactory.initElements(driver,this );    // For initialize the all WebElements from the globally defined webElements 
		
			wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		}
		
		
		public void selectCity(String citypin) 
		{
//			citytextbox.sendKeys("411028");
			citytextbox.sendKeys(citypin);
			
			wait.until(ExpectedConditions.elementToBeClickable(cityname));
			
			cityname.click();
		}
		
		public void enterDetails(String fulname,String mobnumber) 
		{
//			fullname.sendKeys("Ram");
			fullname.sendKeys(fulname);
			
//			pmobilefield.sendKeys("9876543210");
			pmobilefield.sendKeys(mobnumber);
			
			continuebutton.click();
		}
		


}
