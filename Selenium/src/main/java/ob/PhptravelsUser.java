package ob;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import proba.Utils;

public class PhptravelsUser {
	
	private WebDriver driver;
	
	public PhptravelsUser(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getHome() {
		return Utils.waitForElementPresence(driver, By.xpath("//div[@id='mobileMenuMain']/nav/ul/li/a"), 5);
		       //a[contains(text(),'Home')]
	}
	
	public WebElement getVisa() {
		return Utils.waitForElementPresence(driver, By.xpath("//a[contains(text(),'Visa')]"), 5);
	}
	
	public WebElement getProf() {
		return Utils.waitForElementPresence(driver, By.xpath("//a[contains(text(),'My Profile')]"), 5);
	}
	
	public WebElement getWish() {
		return Utils.waitForElementPresence(driver, By.xpath("//a[contains(text(),'Wishlist')]"), 5);
	}
	
	public WebElement getNews() {
		return Utils.waitForElementPresence(driver, By.xpath("//a[contains(text(),'Newsletter')]"), 5);
	}
	
	public WebElement getHovBar() {
		return Utils.waitForElementPresence(driver, By.xpath("//a[contains(text(),'company')]"), 5);
	}
	
	public WebElement getOnOff() {
		return Utils.waitForElementPresence(driver, By.cssSelector("input.newsletter"), 5);
	}
	
	public WebElement getSelContry() {
		return Utils.waitForElementPresence(driver, By.cssSelector(".chosen-single > div"), 5);
	}
	
	public WebElement getContry() {
		return Utils.waitForElementPresence(driver, By.xpath("//li[contains(.,\'Australia\')]"), 5);
		// Samo menjati naziv drzave ili napraviti String
	}
	
	public WebElement getInvoice() {
		return Utils.waitForElementPresence(driver, By.xpath("//a[contains(text(),'Invoice')]"), 5);
	}
	
	public WebElement getFirstName() {
		return Utils.waitForElementPresence(driver, By.name("firstname"), 5);
	}
	
	public void setFirstName(String firstname) {
		WebElement firstnameInput = getFirstName();
		firstnameInput.clear();
		firstnameInput.sendKeys();		
	}
	
	public WebElement getLastName() {
		return Utils.waitForElementPresence(driver, By.name("lastname"), 5);
	}
	
	public void setLastName(String lastname) {
		WebElement lastnameInput = getLastName();
		lastnameInput.clear();
		lastnameInput.sendKeys();		
	}
	
	public WebElement getEmail() {
		return Utils.waitForElementPresence(driver, By.xpath("(//input[@name=\'email\'])[2]"), 5);
	}
	
	public void setEmail(String email) {
		WebElement emailInput = getEmail();
		emailInput.clear();
		emailInput.sendKeys();		
	}
	
	public WebElement getPassword() {
		return Utils.waitForElementPresence(driver, By.name("password"), 5);
	}
	
	public void setPassword(String password) {
		WebElement passwordInput = getPassword();
		passwordInput.clear();
		passwordInput.sendKeys(password);
	}
	
	public WebElement getComPassword() {
		return Utils.waitForElementPresence(driver, By.name("confirmpassword"), 5);
	}
	
	public void setComPassword(String compassword) {
		WebElement compasswordInput = getComPassword();
		compasswordInput.clear();
		compasswordInput.sendKeys(compassword);
	}
	
	public WebElement getAddress1() {
		return Utils.waitForElementPresence(driver, By.name("address1"), 5);
	}
	
	public void setAddress1(String address1) {
		WebElement Address1Input = getAddress1();
		Address1Input.clear();
		Address1Input.sendKeys(address1);
	}
	
	public WebElement getAddress2() {
		return Utils.waitForElementPresence(driver, By.name("address2"), 5);
	}
	
	public void setAddress2(String address2) {
		WebElement Address2Input = getAddress2();
		Address2Input.clear();
		Address2Input.sendKeys(address2);
	}
	
	public WebElement getCity() {
		return Utils.waitForElementPresence(driver, By.name("city"), 5);
	}
	
	public void setCity(String city) {
		WebElement CityInput = getCity();
		CityInput.clear();
		CityInput.sendKeys(city);
	}
	
	public WebElement getZip() {
		return Utils.waitForElementPresence(driver, By.name("zip"), 5);
	}
	
	public void setZip(String zip) {
		WebElement ZipInput = getZip();
		ZipInput.clear();
		ZipInput.sendKeys(zip);
	}
	
	public WebElement getPhone() {
		return Utils.waitForElementPresence(driver, By.name("phone"), 5);
	}
	
	public void setPhone(String phone) {
		WebElement PhoneInput = getPhone();
		PhoneInput.clear();
		PhoneInput.sendKeys(phone);
	}
	
	public WebElement getState() {
		return Utils.waitForElementPresence(driver, By.name("state"), 5);
	}
	
	public void setState(String state) {
		WebElement StateInput = getState();
		StateInput.clear();
		StateInput.sendKeys(state);
	}
	
	public WebElement getSubmitBtn() {
		return Utils.waitForElementPresence(driver, By.xpath("//form[@id=\'profilefrm\']/div/div/div[7]/div/button"), 5);
	}
	
	public void MyProfile(String email, String password, String compassword, String address1, String address2,
			              String city, String zip, String phone, String state) {
		//setFirstName(firstname);
		//setLastName(lastname);
		setEmail(email);
		setPassword(password);
		setComPassword(compassword);
		setAddress1(address1);
		setAddress2(address2);
		setCity(city);
		setZip(zip);
		setPhone(phone);
		setState(state);
	}
}