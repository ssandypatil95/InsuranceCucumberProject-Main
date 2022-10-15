package pageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.BaseClass;

public class SelectProductPage extends BaseClass{
	

WebDriver driver;
// @FindBy(xpath = "//input[@name='txtUsername']") WebElement username;
// @FindBy(xpath = "//input[@type='password']") WebElement password;
// @FindBy(xpath = "//input[@value='LOGIN']") WebElement loginbutton;

   @FindBy(xpath = "//*[@class='prd-block']//i[@class='icon-bg homeIconsBg health-insurance']") WebElement healthinsuranceproduct;

// @FindBy(xpath = "//input[@name='txtUsername']") List<WebElement> elements;     //---for using multiple webelements (for ex. multiple checkboxes )
	
	public SelectProductPage(WebDriver driver) 
	{
		this.driver=driver;
		
		PageFactory.initElements(driver,this );    // For initialize the all WebElements from the globally defined webElements 
	}
	
	public void clickonproduct() 
	{
		healthinsuranceproduct.click();
	}
	
	public String fetchTitle()
	{
		String title = driver.getTitle();
		
		System.out.println(title);
		
		return title;
	}
	


}
