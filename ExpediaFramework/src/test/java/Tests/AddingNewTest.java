package Tests;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import CustomObjects.ReadingProperties;
import Page.Classes.LoginPageFactory;

/**
 * @author vinodtharavath
 *
 */
//
public class AddingNewTest {
	private static WebDriver driver;
	private static String baseURL;
	static LoginPageFactory lp;

			
	@BeforeClass	
	public static void  setups() {
		driver = new FirefoxDriver();
		System.out.println("I am running setup");		
	//	baseURL = "https://www.expedia.co.in/user/signin?ckoflag=0";
				try {
		baseURL = ReadingProperties.Readingpropertiesv().getProperty("urlpage");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(baseURL);		
		driver.manage().window().maximize();
		lp = new LoginPageFactory(driver);
		PropertyConfigurator.configure("Log4jproperties.properties");	
			 
	}	

	@Test
	public void test() {
		//fail("Not yet implemented");
		System.out.println("Hello world");
		
	}
	
	@Test
//	@Test(dependsOnMethods = {"setups"})
	public void clickingfb(){
		
		
		System.out.println("b4 click");
		lp.fbs();
		System.out.println("post click");
		//driver.findElement(By.id("submitButton")).click();;
		
	
	}
	
	
//	@AfterClass
//	public static void AfterClass(){
//		
//	}
	
//	@Test
//	public void txtss(){
//		lp.entertxt("Hello world");
//	}

}
