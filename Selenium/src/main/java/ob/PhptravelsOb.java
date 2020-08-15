package ob;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import proba.Utils;

public class PhptravelsOb {
	
	private WebDriver driver;
	
	public PhptravelsOb(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getAccount() {
		return Utils.waitForElementPresence(driver, By.xpath("//li[3]/div/a"), 5);
	}
	
	public WebElement getLogin() {
		return Utils.waitForElementPresence(driver, By.xpath("//a[contains(text(),'Login')]"), 5);
	}
	
	public WebElement getUsername() {
		return Utils.waitForElementPresence(driver, By.name("username"), 5);
	}
	
	public void setUsername(String username) {
		WebElement usernameInput = getUsername();
		usernameInput.clear();
		usernameInput.sendKeys(username);
	}
	
	public WebElement getPassword() {
		return Utils.waitForElementPresence(driver, By.name("password"), 5);
	}
	
	public void setPassword(String password) {
		WebElement passwordInput = getPassword();
		passwordInput.clear();
		passwordInput.sendKeys(password);
	}
	
	public WebElement getSubmit() {
		return Utils.waitForElementPresence(driver, By.xpath("//button[@type='submit']"), 5);
	}
	
	public WebElement getDemo(){
		return Utils.waitForElementPresence(driver, By.xpath("(//a[@id='dropdownCurrency'])[2]"), 5);
	}
	
	public WebElement getLogout(){
		return Utils.waitForElementPresence(driver, By.xpath("//a[contains(text(),'Logout')]"), 5);
	}
	
	
	public WebElement getSingup(){
		return Utils.waitForElementPresence(driver, By.xpath("(//a[contains(text(),'Sign Up')])[2]"), 5);
	}
	
	public WebElement getForgetpass(){
		return Utils.waitForElementPresence(driver, By.xpath("//a[contains(text(),'Forget Password')]"), 5);
	}
	
	public WebElement getRemember(){
		return Utils.waitToBeClickable(driver, By.cssSelector(".custom-control-label"), 5);
	}
	
	public void login(String username, String password) {
		setUsername(username);
		setPassword(password);
	}
	
	public WebElement getAccount2(){
		return Utils.waitForElementPresence(driver, By.xpath("//a[contains(text(),\'Account\')]"), 5);
	}

}
