package ob;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import proba.Utils;

public class Booking {
	
	private WebDriver driver;
	
	public Booking(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getFlights(){
		return Utils.waitToBeClickable(driver, By.cssSelector(".flights"), 5);
	}
	
	public WebElement getHotels(){
		return Utils.waitToBeClickable(driver, By.cssSelector(".hotels"), 5);
	}
	
	public WebElement getTours(){
		return Utils.waitToBeClickable(driver, By.cssSelector(".tours"), 5);
	}
	
	public WebElement getCars(){
		return Utils.waitToBeClickable(driver, By.cssSelector(".cars"), 5);
	}
	
	public WebElement getVisa(){
		return Utils.waitToBeClickable(driver, By.cssSelector(".visa"), 5);
	}
	
	public WebElement getDestination() {
		return Utils.waitForElementPresence(driver, By.cssSelector(".select2-focused"), 5);
	}
	
}