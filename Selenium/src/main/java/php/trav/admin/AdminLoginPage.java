package php.trav.admin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import proba.Utils;

public class AdminLoginPage {
	
	private WebDriver driver;
	
	public AdminLoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getEmail() {
		return Utils.waitForElementPresence(driver, By.name("email"), 5);
	}
	
	public void setEmail(String email) {
		WebElement emailInput = getEmail();
		emailInput.clear();
		emailInput.sendKeys(email);
	}
	
	public WebElement getPassword() {
		return Utils.waitForElementPresence(driver, By.name("password"), 5);
	}
	
	public void setPassword(String password) {
		WebElement passwordInput = getPassword();
		passwordInput.clear();
		passwordInput.sendKeys(password);
	}
	
	public WebElement getLoginBtn() {
		return Utils.waitForElementPresence(driver, By.xpath("//button[@type='submit']"), 5);
	}
	
	public WebElement getRememberMe() {
		return Utils.waitForElementPresence(driver, By.xpath("//ins"), 5);
	}
	
	public WebElement getForPass() {
		return Utils.waitForElementPresence(driver, By.xpath("//a[@id='link-forgot']/strong"), 5);
	}
	
	public WebElement getBackBtn() {
		return Utils.waitForElementPresence(driver, By.xpath("//button[@type='button']"), 5);
	}
	
	public WebElement getResetPass() {
		return Utils.waitForElementPresence(driver, By.xpath("//button[@id='btn-forgot']"), 5);
	}
	
	public WebElement getResetEmail() {
		return Utils.waitForElementPresence(driver, By.xpath("//input[@id='resetemail']"), 5);
	}
	
	public void setResetEmail(String resetemail) {
		WebElement resetemailInput = getResetEmail();
		resetemailInput.clear();
		resetemailInput.sendKeys(resetemail);
	}
	
	public void reset (String resetemail){
		setResetEmail(resetemail);
				
	}
	
	public void login(String email, String password) {
		setEmail(email);
		setPassword(password);
		
	}
}