package ob;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import proba.Utils;

public class Cars2 {
	
	private WebDriver driver;
	
	public Cars2(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getEditSearch() {
		return Utils.waitForElementPresence(driver, By.xpath("//a[contains(text(),\'Edit search\')]"), 5);
	}
	
	public Select getDropDownState() {
		return new Select(Utils.waitForElementPresence(driver, By.xpath("//select[@id=\'ct_s2_residency\']"), 5));
	}
	
	public WebElement getUpdateBtn() {
		return Utils.waitForElementPresence(driver, By.xpath("//span[contains(.,\'Update\')]"), 5);
	}
	
	public WebElement getXBtn() {
		return Utils.waitForElementPresence(driver, By.xpath("//div[4]/i"), 5);
	}
	
	public Select getDropDownMoney() {
		return new Select(Utils.waitForElementPresence(driver, By.xpath("//select[@id=\'ct_currency\']"), 5));
	}
	
	public WebElement getCheckBox() {
		return Utils.waitForElementPresence(driver, By.xpath("//label[@id=\'ct-checkbox-label-desktop-carSize-large\']/span/i"), 5);
	}
	
	public WebElement getClearAll() {
		return Utils.waitForElementPresence(driver, By.xpath("//a[contains(text(),\'CLEAR ALL\')]"), 5);
	}
	
	public WebElement getVArrow() {
		return Utils.waitForElementPresence(driver, By.xpath("//ul[@id=\'ct_filter_list_desktop\']/li/div/span/span/span/i"), 5);
	}
	
	public WebElement getMostPopular() {
		return Utils.waitForElementPresence(driver, By.xpath("//select[@id=\'ct_avail_sort\']"), 5);
	}
	
	public WebElement getSelectBtn() {
		return Utils.waitForElementPresence(driver, By.xpath(".//*[@id='ct_cars']/div/div[2]/div[1]/div/div/div[2]/div/div/div/div[2]/button"), 5);
	}
	
	public WebElement getFirstName() {
		return Utils.waitForElementPresence(driver, By.id("ct_firstname"), 5);
	}
	
	public void setFirstName(String firstname) {
		WebElement firstnameInput = getFirstName();
		firstnameInput.clear();
		firstnameInput.sendKeys(firstname);
	}
	
	public WebElement getLastName() {
		return Utils.waitForElementPresence(driver, By.id("ct_surname"), 5);
	}
	
	public void setLastName(String lastname) {
		WebElement lastnameInput = getLastName();
		lastnameInput.clear();
		lastnameInput.sendKeys(lastname);
	}
	
	public WebElement getEmail() {
		return Utils.waitForElementPresence(driver, By.id("ct_email_address"), 5);
	}
	
	public void setEmail(String email) {
		WebElement emailInput = getEmail();
		emailInput.clear();
		emailInput.sendKeys(email);
	}
	
	public WebElement getEmailConfirm() {
		return Utils.waitForElementPresence(driver, By.id("ct_email_address_confirm"), 5);
	}
	
	public void setEmailConfirm(String emailconfirm) {
		WebElement emailconfirmInput = getEmailConfirm();
		emailconfirmInput.clear();
		emailconfirmInput.sendKeys(emailconfirm);
	}
	
	public WebElement getPhone() {
		return Utils.waitForElementPresence(driver, By.id("ct_phone_no"), 5);
	}
	
	public void setPhone(String phone) {
		WebElement phoneInput = getPhone();
		phoneInput.clear();
		phoneInput.sendKeys(phone);
	}
	
	public WebElement getAddress1() {
		return Utils.waitForElementPresence(driver, By.id("ct_address_1"), 5);
	}
	
	public void setAddress1(String address) {
		WebElement addresseInput = getAddress1();
		addresseInput.clear();
		addresseInput.sendKeys(address);
	}
	
	public WebElement getCity() {
		return Utils.waitForElementPresence(driver, By.id("ct_city"), 5);
	}
	
	public void setCity(String city) {
		WebElement cityInput = getCity();
		cityInput.clear();
		cityInput.sendKeys(city);
	}
	
	public WebElement getPostalCode() {
		return Utils.waitForElementPresence(driver, By.id("ct_postal_code"), 5);
	}
	
	public void setPostalCode(String postalcode) {
		WebElement postalcodeInput = getPostalCode();
		postalcodeInput.clear();
		postalcodeInput.sendKeys(postalcode);
	}
	
	public WebElement getCountry() {
		return Utils.waitForElementPresence(driver, By.id("ct_country"), 5);
	}
	
	public void setCountry(String country) {
		WebElement countryInput = getCountry();
		countryInput.clear();
		countryInput.sendKeys(country);
	}
	
	public WebElement getDriverAge() {
		return Utils.waitForElementPresence(driver, By.id("ct_age"), 5);
	}
	
	public void setDriverAge(String driverage) {
		WebElement driverageInput = getDriverAge();
		driverageInput.clear();
		driverageInput.sendKeys(driverage);
	}
	
	public void driverdetails (String firstname, String lastname, String email, String emailconfirm, String phone,
			                   String address1, String city, String postalcode, String country, String driverage){
		setFirstName(firstname);
		setLastName(lastname);
		setEmail(email);
		setEmailConfirm(emailconfirm);
		setPhone(phone);
		setAddress1(address1);
		setCity(city);
		setPostalCode(postalcode);
		setCountry(country);
		setDriverAge(driverage);		
	}
	
	public Select getNumberOfPassengers() {
		return new Select(Utils.waitForElementPresence(driver, By.id("ct_passengers"), 5));
	}
	
	public WebElement getCheckBoxNews() {
		return Utils.waitForElementPresence(driver, By.xpath("//label[@id=\'ct_newsletter_label\']/span/i"), 5);
	}
	
	public Select getConPhoNumDropdown() {
		return new Select(Utils.waitForElementPresence(driver, By.xpath(".//*[@id='ct_phone_area_code']"), 5));
	}
	
	public Select getStateOfResidence() {
		return new Select(Utils.waitForElementPresence(driver, By.xpath("//select[@id=\'ct_s3_insurance_select\']"), 5));
	}
	
	public WebElement getConfirmBtn() {
		return Utils.waitForElementPresence(driver, By.xpath("//span[contains(.,\'Confirm reservation\')]"), 5);
	}
	
	public WebElement getConfirmBox() {
		return Utils.waitForElementPresence(driver, By.xpath(".//*[@id='ct_s3_Confirm_Conditions']/label/span/i"), 5);
	}
	
	public WebElement getNoinsure() {
		return Utils.waitForElementPresence(driver, By.xpath("//span[contains(.,\'No, don’t insure me.\')]"), 5);
	}
	
}