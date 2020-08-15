package ob;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import proba.Utils;

public class Hotels {
	
	private WebDriver driver;
	
	public Hotels(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getCheck() {
		return Utils.waitForElementPresence(driver, By.id("checkin"), 5);
	}
	
	public WebElement getCheckOut() {
		return Utils.waitForElementPresence(driver, By.id("checkout"), 5);
	}
	
	public WebElement getRightArrow(){
		return Utils.waitForElementPresence(driver, By.cssSelector(".active .datepicker--nav-action:nth-child(3) > svg"), 5);
	}
	
	public WebElement getLeftArrow(){
		return Utils.waitForElementPresence(driver, By.cssSelector(".active .datepicker--nav-action:nth-child(1) > svg"), 5);
	}
	
	public WebElement getMonth(){
		return Utils.waitForElementPresence(driver, By.cssSelector(".active .datepicker--nav-title"), 5);
	}
	// menjati aug u npr sep za drugi mesec
	public WebElement getMonthSel(){
		return Utils.waitForElementPresence(driver, By.xpath("//div[@class='datepicker--cells datepicker--cells-months']//div[contains(text(), 'Aug')]"), 5);
	}
	//menjati 20 u npr 22 za drugi datum
	public WebElement getDate(){
		return Utils.waitForElementPresence(driver, By.xpath("//div[@id='datepickers-container']//div[1]//div[1]//div[1]//div[2]//div[contains(text(), '20')]"), 5);
	}
	//menjati 22 u npr 23 za drugi datum
	public WebElement getDateCheckout(){
		return Utils.waitForElementPresence(driver, By.xpath("//div[@id='datepickers-container']//div[2]//div[1]//div[1]//div[2]//div[contains(text(), '22')]"), 5);
	}
	// menjati aug u npr sep za drugi mesec
	public WebElement getMonthSelCheckOut(){
		return Utils.waitForElementPresence(driver, By.xpath("//div[@class='datepicker--months datepicker--body active']//div[contains(text(), 'Aug')]"), 5);
	}
	
	public WebElement getYear(){
		return Utils.waitForElementPresence(driver, By.cssSelector("div.datepicker--nav-title"), 5);
	}
	// menjati 2020 u npr 2021 za drugu godinu
	public WebElement getYearSel(){
		return Utils.waitForElementPresence(driver, By.xpath("//div[@class='datepicker--years datepicker--body active']//div[contains(text(), '2020')]"), 5);
	}
	
	// menjati 2020 u npr 2021 za drugu godinu
		public WebElement getYearSelCheckOut(){
			return Utils.waitForElementPresence(driver, By.xpath("//div[@id='datepickers-container']//div[2]//div[1]//div[3]//div[1]//div[contains(text(), '2020')]"), 5);
		}
	
	public WebElement getAdultsMin(){
		return Utils.waitForElementPresence(driver, By.xpath("(//button[@type='button'])[4]"), 5);
	}
	
	public WebElement getAdultsPlus(){
		return Utils.waitForElementPresence(driver, By.xpath("(//button[@type='button'])[3]"), 5);
	}
	
	public WebElement getChildMin(){
		return Utils.waitForElementPresence(driver, By.xpath("(//button[@type='button'])[6]"), 5);
	}
	
	public WebElement getChildPlus(){
		return Utils.waitForElementPresence(driver, By.xpath("(//button[@type='button'])[5]"), 5);
	}
	
	public WebElement getBuilder() {
		return Utils.waitForElementPresence(driver, By.xpath("//a[@onclick=\'return false;\']"), 5);
	}
	
	public WebElement getSubmit() {
		return Utils.waitForElementPresence(driver, By.xpath("//button[@type='submit']"), 5);
	}
	//div[@id='select2-drop']/ul[@class='select2-results']/li[1]//div
	public List<String> getHotelNames() {
        List<String> hotelNames = new ArrayList<String>();
        List<WebElement> hotelNameWebElements = driver.findElements(By.xpath("//div[@class='select2-result-label']"));
        for(WebElement hotelNameElement: hotelNameWebElements) {
            hotelNames.add(hotelNameElement.getText());
        }
        return hotelNames;
    }
	
	public WebElement getDestination() {
		return Utils.waitForElementPresence(driver, By.xpath("//div[6]/div/input"), 5);
	}
	
	public void setDestination(String destination) {
		WebElement destinationInput = getDestination();
		destinationInput.clear();
		destinationInput.sendKeys(destination);
		destinationInput.sendKeys(Keys.ENTER);
	}
	
	public void addDestination(String destination) {
		setDestination(destination);
		
	}
}