package skeleton;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import comm.webdriverutility;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.Registration;

public class StepdefinationWebApp {
	WebDriver driver;
	@Before
	public void init()
	{

		driver=webdriverutility.getDriver("chrome");
		PageFactory.initElements(driver,Registration.class);
		

	}
	
@Given("the user is on the DemoWebShop home page")
public void the_user_is_on_the_DemoWebShop_home_page() {
    driver.get("http://demowebshop.tricentis.com/register");
	
    
}

@When("the user enters registration details")
public void the_user_enters_registration_details() {
	   Registration.gender.click();
	   Registration.firstName.sendKeys("kiran kumar");
	   Registration.lastName.sendKeys("konde");
	   Registration.email.sendKeys("ail123@test.com");
	   Registration.password.sendKeys("abc123");
	   Registration.Confirmpassword.sendKeys("abc123");
	   Registration.register.click();

}

@Then("user is registered successfully")
public void user_is_registered_successfully() {
   
}



}
