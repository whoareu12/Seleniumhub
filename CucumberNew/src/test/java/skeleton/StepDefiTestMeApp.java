package skeleton;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import comm.webdriverutility;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import pages.Addproduct;


public class StepDefiTestMeApp {
	
	
	WebDriver driver;
	@Before
	public void init()
	{

		driver=webdriverutility.getDriver("chrome");
		PageFactory.initElements(driver,Addproduct.class);
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS );
		

	}
	
	

@Given("the user is in login page entered admin credentials")
public void the_user_is_in_login_page_entered_admin_credentials() {
	
	 driver.get("http://10.232.237.143:443/TestMeApp/loginhere.htm");
   
}

@When("the user added product")
public void the_user_added_product() throws InterruptedException {
	Addproduct.username.sendKeys("admin");
	Addproduct.password.sendKeys("Password456");
	Addproduct.Login.click();
	
	Addproduct.Addproduct.click();
	Addproduct.category.sendKeys("ELECTRONICS");
	Addproduct.subcategory.sendKeys("LAPTOP");
	Addproduct.product.sendKeys("hp lap");
	Addproduct.price.sendKeys("100000");
	Addproduct.quantity.sendKeys("1");
	Addproduct.brand.sendKeys("hp");
	Addproduct.description.sendKeys("i want laptop");
	Addproduct.adding.click();
	
	
	
	
  
}

@Then("user buyed a product")
public void user_buyed_a_product() {
	
	String message=driver.findElement(By.xpath("/html/body/main/div/div/div/form/b/i")).getText();
	Assert.assertTrue(message.contains(" hp lap is added Succesfully !!!"));
	
    
}



}
