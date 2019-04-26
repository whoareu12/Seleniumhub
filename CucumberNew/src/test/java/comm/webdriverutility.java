package comm;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class webdriverutility {
	
	   static public WebDriver getDriver(String browser)
	   {
		   if(browser.equals("chrome"))
		   {
			   System.setProperty("webdriver.chrome.driver","C:\\Users\\dharani.konde\\Downloads\\chromedriver_win32\\chromedriver.exe");
			   return new ChromeDriver();
		   }
		   else if(browser.contentEquals("firefox"))
			   
		   {
			   System.setProperty("webdriver.gecko.driver","C:\\Users\\dharani.konde\\Downloads\\Drivers\\geckodriver.exe");
			   return new FirefoxDriver();
			   
		   }
 else if(browser.contentEquals("ie"))
			   
		   {
			   System.setProperty("webdriver.ie.driver","C:\\Users\\dharani.konde\\Downloads\\Drivers\\IEDriver.exe");
			   return new FirefoxDriver();
			   
		   }
 else
 {
	 return null;
 }
	   }
	   

}
