package ob;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import proba.Utils;

public class Tours2 {
	
	private WebDriver driver;
	
	public Tours2(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getDescription(){
		return Utils.waitForElementPresence(driver, By.xpath("//a[contains(text(),\'Description\')]"), 5);
	}
	
	public WebElement getGallery(){
		return Utils.waitForElementPresence(driver, By.xpath("//a[contains(text(),\'Gallery\')]"), 5);
	}
	
	public WebElement getLocation(){
		return Utils.waitForElementPresence(driver, By.xpath("//a[contains(text(),\'Location\')]"), 5);
	}
	
	public WebElement getPolicy(){
		return Utils.waitForElementPresence(driver, By.xpath("//a[contains(text(),\'Policy\')]"), 5);
	}
	
	public WebElement getReviews(){
		return Utils.waitForElementPresence(driver, By.xpath("//a[contains(text(),\'Reviews\')]"), 5);
	}
	
	public WebElement getAddToWishlist(){
		return Utils.waitForElementPresence(driver, By.xpath("//div[2]/span/span"), 5);
	}
	
	public WebElement getWriteReview(){
		return Utils.waitForElementPresence(driver, By.xpath("//div[7]/div[2]/button"), 5);
	}
	
	public WebElement getName() {
		return Utils.waitForElementPresence(driver, By.name("fullname"), 5);
	}
	
	public void setName(String name) {
		WebElement nameInput = getName();
		nameInput.clear();
		nameInput.sendKeys(name);
	}
	
	public WebElement getEmail() {
		return Utils.waitForElementPresence(driver, By.xpath("(//input[@name=\'email\'])[2]"), 5);
	}
	
	public void setEmail(String email) {
		WebElement emailInput = getEmail();
		emailInput.clear();
		emailInput.sendKeys(email);
	}
	
	public WebElement getComments() {
		return Utils.waitForElementPresence(driver, By.name("reviews_comments"), 5);
	}
	
	public void setComments(String comments) {
		WebElement commentsInput = getComments();
		commentsInput.clear();
		commentsInput.sendKeys(comments);
	}
	
	public void write(String name, String email, String comments) {
		setName(name);
		setEmail(email);
		setComments(comments);
		
	}
	
	public WebElement getSubmitBtn() {
		return Utils.waitForElementPresence(driver, By.id("26"), 5);
	}
	
	public WebElement getBookNowRed() {
		return Utils.waitForElementPresence(driver, By.xpath("(//button[@type=\'submit\'])[3]"), 5);
	}
	
	public WebElement getBookNowBlue() {
		return Utils.waitForElementPresence(driver, By.xpath("//a[contains(text(),\'BOOK\')]"), 5);
	}
	
	public WebElement getNamePopUp() {
		return Utils.waitForElementPresence(driver, By.name("firstname"), 5);
	}
	
	public void setNamePopUp(String firstname) {
		WebElement firstnameInput = getNamePopUp();
		firstnameInput.clear();
		firstnameInput.sendKeys(firstname);
	}
	
	public WebElement getEmailPopUp() {
		return Utils.waitForElementPresence(driver, By.name("email"), 5);
	}
	
	public void setEmailPopUp(String email) {
		WebElement emailInput = getEmailPopUp();
		emailInput.clear();
		emailInput.sendKeys(email);
	}
	
	public WebElement getPhonePopUp() {
		return Utils.waitForElementPresence(driver, By.name("phone"), 5);
	}
	
	public void setPhonePopUp(String phone) {
		WebElement phoneInput = getEmailPopUp();
		phoneInput.clear();
		phoneInput.sendKeys(phone);
	}
	
	public WebElement getAddress() {
		return Utils.waitForElementPresence(driver, By.name("address"), 5);
	}
	
	public void setAddress(String address) {
		WebElement addressInput = getAddress();
		addressInput.clear();
		addressInput.sendKeys(address);
	}
	
	public void popupwindow(String name, String email, String phone, String address){
		setNamePopUp(name);
		setEmailPopUp(email);
		setPhonePopUp(phone);
		setAddress(address);
			
	}
	
	public WebElement getBookNow() {
		return Utils.waitForElementPresence(driver, By.id("ClickMyButton"), 5);
	}
	
	public WebElement getClose() {
		return Utils.waitForElementPresence(driver, By.xpath("//div[3]/button"), 5);
	}
	
	public WebElement getCloseX() {
		return Utils.waitForElementPresence(driver, By.cssSelector(".close"), 5);
	}
	
	public WebElement getExtras(){
		return Utils.waitForElementPresence(driver, By.xpath("//label/span"), 5);
	}
	
	public WebElement getExtras2(){
		return Utils.waitForElementPresence(driver, By.xpath("//tr[2]/td[4]/label/span"), 5);
	}
	
	public WebElement getExtras3(){
		return Utils.waitForElementPresence(driver, By.xpath("//tr[3]/td[4]/label/span"), 5);
	}
	
	public WebElement getExtras4(){
		return Utils.waitForElementPresence(driver, By.xpath("//tr[4]/td[4]/label/span"), 5);
	}
	
	public WebElement getNameGuest() {
		return Utils.waitForElementPresence(driver, By.xpath("//input[@name=\'passport[1][name]\']"), 5);
	}
	
	public void setNameGuest(String nameguest) {
		WebElement nameguestInput = getNameGuest();
		nameguestInput.clear();
		nameguestInput.sendKeys(nameguest);
	}
	
	public WebElement getPassport() {
		return Utils.waitForElementPresence(driver, By.xpath("//input[@name=\'passport[1][passportnumber]\']"), 5);
	}
	
	public void setPassport(String passport) {
		WebElement passportInput = getPassport();
		passportInput.clear();
		passportInput.sendKeys(passport);
	}
	
	public WebElement getAge() {
		return Utils.waitForElementPresence(driver, By.xpath("//input[@name=\'passport[1][age]\']"), 5);
	}
	
	public void setAge(String age) {
		WebElement ageInput = getAge();
		ageInput.clear();
		ageInput.sendKeys(age);
	}
	
	public void guestinfo (String gname, String gpassport, String gage){
		setNameGuest(gname);
		setPassport(gpassport);
		setAge(gage);		
	}
	
	public WebElement getComfirm() {
		return Utils.waitForElementPresence(driver, By.xpath("//button[contains(.,\'CONFIRM THIS BOOKING\')]"), 5);
	}
	
	public WebElement getPayNow() {
		return Utils.waitForElementPresence(driver, By.xpath("//button[@type=\'button\']"), 5);
	}
	
	public Select getPaymentMethod() {
		return new Select(Utils.waitForElementPresence(driver, By.xpath("//span[contains(.,\'Select Payment Method\')]"), 5));
	}
	
	public WebElement getPayOnArrrival() {
		return Utils.waitForElementPresence(driver, By.id("43"), 5);
	}
	
	public WebElement getInovice() {
		return Utils.waitForElementPresence(driver, By.xpath("//a[contains(text(),\'Invoice\')]"), 5);
	}
}