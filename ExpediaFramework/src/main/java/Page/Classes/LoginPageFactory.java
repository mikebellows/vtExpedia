package Page.Classes;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import CustomObjects.ReadingProperties;

public class LoginPageFactory {
	
	@FindBy(id="signin-loginid")
	WebElement email;
	
	@FindBy(id="signin-password")
	WebElement pass;
	WebDriver driver;
	
	@FindBy(id="submitButton")
	WebElement fb;
	
	
	public LoginPageFactory(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	
	// Reading the cusstom properties
	public void propertieset(){
		try {
			ReadingProperties.Readingpropertiesv();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
	
	//setting the URL from property file
	public void settingURL(){
		try {
			String vURL= ReadingProperties.Readingpropertiesv().getProperty("urlpage");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
	}
	
	
	public void fbs(){
	//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		fb.click();
	}

	
	
//	public void entertxt(String lg){
//		email.sendKeys(lg);
//	}
//	

}
