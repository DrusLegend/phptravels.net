package ob;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import proba.Utils;

public class Flights2 {
	
	private WebDriver driver;
	
	public Flights2(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getSliderBtn(){
		return Utils.waitForElementPresence(driver, By.xpath("//div[2]/span/span[6]"), 5);
	}
	
	public WebElement getSliderBtn2(){
		return Utils.waitForElementPresence(driver, By.xpath("//div[2]/span/span[7]"), 5);
	}
	
	public WebElement getDirect(){
		return Utils.waitForElementPresence(driver, By.xpath("//label[contains(.,\'Direct\')]"), 5);
	}
	
	public WebElement getViewMore() {
		return Utils.waitForElementPresence(driver, By.xpath("//span[@type=\'buttom\']"), 5);
	}
	
	public WebElement getViewLess() {
		return Utils.waitForElementPresence(driver, By.xpath("(//span[@type=\'buttom\'])[2]"), 5);
	}
	
	public WebElement getModifySearch() {
		return Utils.waitForElementPresence(driver, By.xpath("//div/div[2]/button"), 5);
	}
	
	public WebElement getSearchBtn() {
		return Utils.waitForElementPresence(driver, By.xpath("//button[@id=\'searchform\']"), 5);
	}
	
	public WebElement getBookNow() {
		return Utils.waitForElementPresence(driver, By.xpath("(//button[@type='submit'])[3]"), 5);
	}
	
	public WebElement getName() {
		return Utils.waitForElementPresence(driver, By.id("passenger_name_0"), 5);
	}
	
	public void setName(String name) {
		WebElement nameInput = getName();
		nameInput.clear();
		nameInput.sendKeys(name);
	}
	
	public WebElement getAge() {
		return Utils.waitForElementPresence(driver, By.id("passenger_age_0"), 5);
	}
	
	public void setAge(String age) {
		WebElement ageInput = getAge();
		ageInput.clear();
		ageInput.sendKeys(age);
	}
	
	public WebElement getPassport() {
		return Utils.waitForElementPresence(driver, By.id("passenger_passport_0"), 5);
	}
	
	public void setPassport(String Passport) {
		WebElement passportInput = getPassport();
		passportInput.clear();
		passportInput.sendKeys(Passport);
	}
	
	public void info (String name, String age, String passport){
		setName(name);
		setAge(age);
		setPassport(passport);
		
	}
	
	public WebElement getComfirmBook() {
		return Utils.waitForElementPresence(driver, By.xpath("//button[contains(.,\'CONFIRM THIS BOOKING\')]"), 5);
	}
	
	public WebElement getPayNow() {
		return Utils.waitForElementPresence(driver, By.xpath("//button[@type=\'button\']"), 5);
	}
	
	public Select getPaymentMethod() {
		return new Select(Utils.waitForElementPresence(driver, By.xpath("//span[contains(.,\'Select Payment Method\')]"), 5));
	}
	
	public WebElement getPayOnArrrival() {
		return Utils.waitForElementPresence(driver, By.id("44"), 5);
	}

}
