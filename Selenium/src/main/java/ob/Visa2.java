package ob;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import proba.Utils;

public class Visa2 {
	
	private WebDriver driver;
	
	public Visa2(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getFirstName() {
		return Utils.waitForElementPresence(driver, By.name("first_name"), 5);
	}
	
	public void setFirstName(String firstname) {
		WebElement firstnameInput = getFirstName();
		firstnameInput.clear();
		firstnameInput.sendKeys(firstname);
	}
	
	public WebElement getLastName() {
		return Utils.waitForElementPresence(driver, By.name("last_name"), 5);
	}
	
	public void setLastName(String lastname) {
		WebElement lastnameInput = getLastName();
		lastnameInput.clear();
		lastnameInput.sendKeys(lastname);
	}
	
	public WebElement getEmail() {
		return Utils.waitForElementPresence(driver, By.name("email"), 5);
	}
	
	public void setEmail(String email) {
		WebElement emailInput = getEmail();
		emailInput.clear();
		emailInput.sendKeys(email);
	}
	
	public WebElement getConfirmEmail() {
		return Utils.waitForElementPresence(driver, By.name("confirmemail"), 5);
	}
	
	public void setConfirmEmail(String confirmemail) {
		WebElement confirmemailInput = getConfirmEmail();
		confirmemailInput.clear();
		confirmemailInput.sendKeys(confirmemail);
	}
	
	public WebElement getPhone() {
		return Utils.waitForElementPresence(driver, By.name("phone"), 5);
	}
	
	public void setPhone(String phone) {
		WebElement phoneInput = getPhone();
		phoneInput.clear();
		phoneInput.sendKeys(phone);
	}
	
	public WebElement getDate() {
		return Utils.waitForElementPresence(driver, By.name("date"), 5);
	}
	
	public void setDate(String date) {
		WebElement dateInput = getDate();
		dateInput.clear();
		dateInput.sendKeys(date);
	}
	
	public void field(String firstname, String lastname, String email, String confirmemail,
			          String phone, String date) {
		setFirstName(firstname);
		setLastName(lastname);
		setEmail(email);
		setConfirmEmail(confirmemail);
		setPhone(phone);
		setDate(date);
		
	}
	
	public WebElement getBtn() {
		return Utils.waitForElementPresence(driver, By.xpath("//div/button"), 5);
	}
	
	public WebElement getCheckBox() {
		return Utils.waitForElementPresence(driver, By.xpath("//input[@type='checkbox']"), 5);
	}
	
	public WebElement getNotes() {
		return Utils.waitForElementPresence(driver, By.name("notes"), 5);
	}
	
	public void setNotes(String notes) {
		WebElement notesInput = getNotes();
		notesInput.clear();
		notesInput.sendKeys(notes);
	}
	
	public void  notesbox(String notes){
		setNotes(notes);
		
	}
	
	public WebElement getVisaSubmitted() {
		return Utils.waitForElementPresence(driver, By.xpath(".//*[@id='submi']/div/h4[1]/strong"), 5);
	}
	
	public WebElement getViewInvoice() {
		return Utils.waitForElementPresence(driver, By.xpath("//a[contains(text(),'View Invoice')]"), 5);
	}
	
	public WebElement getBackToHome() {
		return Utils.waitForElementPresence(driver, By.xpath("//a[contains(text(),'Go Back to Home')]"), 5);
	}
}