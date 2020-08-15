package ob;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import proba.Utils;

public class Cars {
	
	private WebDriver driver;
	
	public Cars(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getDropOff() {
		return Utils.waitForElementPresence(driver, By.xpath("//div[@id=\'s2id_autogen7\']/a"), 5);
	}
	
	public WebElement getPickUp() {
		return Utils.waitForElementPresence(driver, By.xpath("//div[@id=\'s2id_autogen5\']/a"), 5);
	}
	
	public List<String> getCars() {
        List<String> cars = new ArrayList<String>();
        List<WebElement> carsWebElements = driver.findElements(By.xpath("//div[@class='select2-result-label']"));
        for(WebElement carsElement: carsWebElements) {
        	cars.add(carsElement.getText());
        }
        return cars;
    }
	
	public WebElement getBox() {
		return Utils.waitForElementPresence(driver, By.xpath("(//input[@type=\'text\'])[31]"), 5);
	}
	
	public void setBox(String box) {
		WebElement boxtoInput = getBox();
		boxtoInput.clear();
		boxtoInput.sendKeys(box);
	}
	
	public void addBox(String box) {
		setBox(box);
		
	}
	
	public WebElement getBtn() {
		return Utils.waitForElementPresence(driver, By.xpath("(//button[@type='submit'])[4]"), 5);
	}
	
	public WebElement getPickupDate() {
		return Utils.waitForElementPresence(driver, By.name("pickupdate"), 5);
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
	
	public WebElement getYear(){
		return Utils.waitForElementPresence(driver, By.cssSelector(".active .datepicker--nav-title"), 5);
	}
	
	// menjati aug u npr sep za drugi mesec
	public WebElement getMonthSel(){
		return Utils.waitForElementPresence(driver, By.xpath("//div[@class='datepicker--months datepicker--body active']//div[contains(text(), 'Aug')]"), 5);
	}
	//menjati 20 u npr 22 za drugi datum
	public WebElement getDate(){
		return Utils.waitForElementPresence(driver, By.xpath("//div[@id='datepickers-container']/div[4]/div[1]/div[1]/div[2]//div[contains(text(), '20')]"), 5);
	}
	
	// menjati 2020 u npr 2021 za drugu godinu
	public WebElement getYearSel(){
		return Utils.waitForElementPresence(driver, By.xpath("//div[@class='datepicker--cells datepicker--cells-years']//div[contains(text(), '2020')]"), 5);
	}
	
	public WebElement getDropOffDate() {
		return Utils.waitForElementPresence(driver, By.name("dropoffdate"), 5);
	}
	
	// menjati aug u npr sep za drugi mesec
	public WebElement getMonthSel2(){
		return Utils.waitForElementPresence(driver, By.xpath("//div[@class='datepicker--months datepicker--body active']//div[contains(text(), 'Aug')]"), 5);
	}
	//menjati 20 u npr 22 za drugi datum
	public WebElement getDate2(){
		return Utils.waitForElementPresence(driver, By.xpath("//div[@id='datepickers-container']/div[5]/div[1]/div[1]/div[2]//div[contains(text(), '20')]"), 5);
	}
	
	// menjati 2020 u npr 2021 za drugu godinu
	public WebElement getYearSel2(){
		return Utils.waitForElementPresence(driver, By.xpath("//div[@class='datepicker--years datepicker--body active']//div[contains(text(), '2020')]"), 5);
	}
	
	public WebElement getDepartTime(){
		return Utils.waitForElementPresence(driver, By.xpath("//div[@id='airDatepickerRange-flight']/div[2]/div/div/div/a"), 5);
	}
	
	public WebElement getTime() {
		return Utils.waitForElementPresence(driver, By.xpath("(//input[@type=\'text\'])[28]"), 5);
	}
	
	public void setTime(String time) {
		WebElement timeInput = getTime();
		timeInput.clear();
		timeInput.sendKeys(time);
	}
	
	public void addTime(String time) {
		setTime(time);
		
	}
	
	public WebElement getReturnTime(){
		return Utils.waitForElementPresence(driver, By.xpath("//div[4]/div/div/div[2]/div/div/div/a"), 5);
	}
	
	public WebElement getRetTime() {
		return Utils.waitForElementPresence(driver, By.xpath("(//input[@type=\'text\'])[29]"), 5);
	}
	
	public void setRetTime(String time) {
		WebElement timeInput = getRetTime();
		timeInput.clear();
		timeInput.sendKeys(time);
	}
	
	public void addRetTime(String time) {
		setRetTime(time);
		
	}
	
}