//package Tests;
//import java.util.concurrent.TimeUnit;
//import org.apache.log4j.PropertyConfigurator;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.testng.annotations.AfterSuite;
//import org.testng.annotations.BeforeSuite;
//import org.testng.annotations.Test;
//import Log4j.LogginforExpedia;
//import Page.Classes.MainPage;
//
//public class POMTestCase {
//	private WebDriver driver;
//	private String baseURL;
//	
//	@BeforeSuite
//	public void setup() {
//		
//		System.out.println("I am running setup");
//		driver = new FirefoxDriver();
//		baseURL = "https://demostore.x-cart.com/";
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		PropertyConfigurator.configure("Log4jproperties.properties");
//		 
//	}
//	
//	@AfterSuite
//	public void teardown(){
//		driver.quit();
//	}
//	
//	
//	@Test(dependsOnMethods={"searchtest"})
//	public void click()
//	{
//		System.out.println("Test");
//		MainPage.searchbtn(driver);
//		MainPage.clickonSearch(driver);
//	
//	}
//	
//	
//	@Test
//	public void searchtest(){
//		System.out.println("search test");
//		LogginforExpedia.vtlog.debug("Hello");
//		LogginforExpedia.vtlog.info("Thisi s just an info that it has got into the lgoger");				
//		driver.get(baseURL);
//		MainPage.SDLtextbox(driver).sendKeys("Hello World");
//				
//	}
//	
//	
//
//}
