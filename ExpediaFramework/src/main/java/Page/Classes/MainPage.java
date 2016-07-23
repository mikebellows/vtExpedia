package Page.Classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage {
	
	public static WebElement element = null;
	
	
	public static WebElement SDLtextbox(WebDriver driver)
	{
		element = driver.findElement(By.id("substring-default"));
		
		return element;
	}
	
	public static WebElement searchbtn(WebDriver driver)	
	{
		element = driver.findElement(By.xpath(".//div[@id='page-wrapper']//div[@id='header-area']//div[@id='search']//form[contains(@id, 'form')]//button[contains(@class, 'submit')]"));
		return element;
	}
	
		
	public static void clickonSearch(WebDriver driver)
	{
		element = searchbtn(driver);
	
	}
	
	

}
