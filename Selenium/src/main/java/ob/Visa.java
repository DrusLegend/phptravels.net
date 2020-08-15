package ob;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import proba.Utils;

public class Visa {
	
	private WebDriver driver;
	
	public Visa(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getDropDown1() {
		return Utils.waitForElementPresence(driver, By.xpath("//div[@id=\'visa\']/div/div/form/div/div/div/div/div[2]/div/a"), 5);
	}
	// menjati naziv zemlje
	public WebElement getCountySelect() {
		return Utils.waitForElementPresence(driver, By.xpath("//li[contains(.,\'Australia\')]"), 5);
	}
	
	public WebElement getDropDown2() {
		return Utils.waitForElementPresence(driver, By.xpath("//div[@id=\'visa\']/div/div/form/div/div/div[2]/div/div[2]/div/a"), 5);
	}
	
	// menjati [7] u npr [8] itd
	public WebElement getCountySelect2() {
		return Utils.waitForElementPresence(driver, By.xpath("//div[2]/div/div[2]/div/div/ul/li[7]"), 5);
	}
	
	public WebElement getBtn() {
		return Utils.waitForElementPresence(driver, By.xpath("(//button[@type='submit'])[5]"), 5);
	}
	
	public WebElement getBox1() {
		return Utils.waitForElementPresence(driver, By.xpath("(//input[@type=\'text\'])[31]"), 5);
	}
	
	public void setBox1(String box1) {
		WebElement box1Input = getBox1();
		box1Input.clear();
		box1Input.sendKeys(box1);
	}
	
	public void addBox1(String box1) {
		setBox1(box1);
		
	}
	
	public WebElement getBox2() {
		return Utils.waitForElementPresence(driver, By.xpath("(//input[@type=\'text\'])[32]"), 5);
	}
	
	public void setBox2(String box2) {
		WebElement box2Input = getBox2();
		box2Input.clear();
		box2Input.sendKeys(box2);
	}
	
	public void addBox2(String box2) {
		setBox2(box2);		
	}
	
	public WebElement getDate() {
		return Utils.waitForElementPresence(driver, By.name("date"), 5);
	}
	
	public WebElement getRightArrow() {
		return Utils.waitForElementPresence(driver, By.cssSelector(".active .datepicker--nav-action:nth-child(3) > svg"), 5);
	}
	
	public WebElement getLeftArrow() {
		return Utils.waitForElementPresence(driver, By.cssSelector(".active .datepicker--nav-action:nth-child(1) > svg"), 5);
	}
	
	public WebElement getMonthYear() {
		return Utils.waitForElementPresence(driver, By.xpath("//div[@id=\'datepickers-container\']/div[3]/nav/div[2]"), 5);
	}
	
	public WebElement getYear() {
		return Utils.waitForElementPresence(driver, By.xpath("//div[@id=\'datepickers-container\']/div[3]/nav/div[2]"), 5);
	}
	//menjati [2] u npr. [3] za drugu godinu
	public WebElement getYearSel() {
		return Utils.waitForElementPresence(driver, By.xpath("//div[@id=\'datepickers-container\']/div[3]/div/div[3]/div/div[2]"), 5);
	}
	//menjati [7] u npr. [8] za drugi mesec
	public WebElement getMonthSel() {
		return Utils.waitForElementPresence(driver, By.xpath("//div[@id=\'datepickers-container\']/div[3]/div/div[2]/div/div[7]"), 5);
	}
	// menjati [8] u npr. [9] za drugi datum
	public WebElement getDateSel() {
		return Utils.waitForElementPresence(driver, By.xpath("//div[3]/div/div/div[2]/div[23]"), 5);
	}

}