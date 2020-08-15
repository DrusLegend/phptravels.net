package ob;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import proba.Utils;

public class Flights {
	
	private WebDriver driver;
	
	public Flights(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getFliDateStart() {
		return Utils.waitForElementPresence(driver, By.id("FlightsDateStart"), 5);
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
		return Utils.waitForElementPresence(driver, By.xpath("//div[@id='datepickers-container']//div[9]//div[1]//div[1]//div[2]//div[contains(text(), '20')]"), 5);
	}
	
	// menjati 2020 u npr 2021 za drugu godinu
	public WebElement getYearSel(){
		return Utils.waitForElementPresence(driver, By.xpath("//div[@id='datepickers-container']/div[9]/div[1]/div[3]/div[1]//div[contains(text(), '2020')]"), 5);
	}
	
	public WebElement getRadioBtn1(){
		return Utils.waitForElementPresence(driver, By.cssSelector(".custom-control:nth-child(1) > .custom-control-label"), 5);
	}
	
	public WebElement getRadioBtn2(){
		return Utils.waitForElementPresence(driver, By.cssSelector(".custom-control:nth-child(2) > .custom-control-label"), 5);
	}
	
	public WebElement getDropDownMenu(){
		return Utils.waitForElementPresence(driver, By.xpath("//div[@id=\'flights\']/div/div/form/div/div/div[2]/div/div/a/div"), 5);
	}
	
	public WebElement getClassFirst(){
		return Utils.waitForElementPresence(driver, By.xpath("//li[contains(.,\'First\')]"), 5);
	}
	
	public WebElement getClassBusiness(){
		return Utils.waitForElementPresence(driver, By.xpath("//li[contains(.,\'Business\')]"), 5);
	}
	
	public WebElement getClassEconomy(){
		return Utils.waitForElementPresence(driver, By.xpath("//li[contains(.,\'Economy\')]"), 5);
	}
	
	public WebElement getClassAdultPlus(){
		return Utils.waitForElementPresence(driver, By.xpath("(//button[@type=\'button\'])[7]"), 5);
	}
	
	public WebElement getClassAdultMinus(){
		return Utils.waitForElementPresence(driver, By.xpath("(//button[@type=\'button\'])[8]"), 5);
	}
	
	public WebElement getClassChildPlus(){
		return Utils.waitForElementPresence(driver, By.xpath("(//button[@type=\'button\'])[9]"), 5);
	}
	
	public WebElement getClassChildMinus(){
		return Utils.waitForElementPresence(driver, By.xpath("(//button[@type=\'button\'])[10]"), 5);
	}
	
	public WebElement getClassInfantPlus(){
		return Utils.waitForElementPresence(driver, By.xpath("(//button[@type=\'button\'])[11]"), 5);
	}
	
	public WebElement getClassInfantMinus(){
		return Utils.waitForElementPresence(driver, By.xpath("(//button[@type=\'button\'])[12]"), 5);
	}
	
	public WebElement getClassRetYearMonth(){
		return Utils.waitForElementPresence(driver, By.xpath("//div[@id='datepickers-container']/div[9]/nav/div[2]"), 5);
	}
	
	public WebElement getClassRetYearSel(){
		return Utils.waitForElementPresence(driver, By.xpath("//div[@id='datepickers-container']/div[9]/nav/div[2]"), 5);
	}
	
	public WebElement getClassRetYear(){
		return Utils.waitForElementPresence(driver, By.xpath("//div[@id='datepickers-container']/div[9]/div/div[3]/div/div[2]"), 5);
	}
	
	public WebElement getClassRetMonth(){
		return Utils.waitForElementPresence(driver, By.xpath("//div[2]/div/div[6]"), 5);
	}
	
	public WebElement getClassRetDate(){
		return Utils.waitForElementPresence(driver, By.xpath("//div[@id='datepickers-container']/div[9]/div/div/div[2]/div[25]"), 5);
	}
	
	public WebElement getFliDateEnd() {
		return Utils.waitForElementPresence(driver, By.id("FlightsDateEnd"), 5);
	}
	
	public WebElement getBtn() {
		return Utils.waitForElementPresence(driver, By.xpath("(//button[@type='submit'])[2]"), 5);
	}
	
	public WebElement getField1() {
		return Utils.waitForElementPresence(driver, By.xpath("//div[@id=\'s2id_location_from\']/a"), 5);
	}
	
	public WebElement getField2() {
		return Utils.waitForElementPresence(driver, By.xpath("//div[@id=\'s2id_location_to\']/a"), 5);
	}
	
	public List<String> getFlightsBox1() {
        List<String> flightsBox1 = new ArrayList<String>();
        List<WebElement> flightsBox1WebElements = driver.findElements(By.xpath("//div[@class='select2-result-label']"));
        for(WebElement flightsBox1Element: flightsBox1WebElements) {
        	flightsBox1.add(flightsBox1Element.getText());
        }
        return flightsBox1;
    }
	
	public WebElement getFlightsTo() {
		return Utils.waitForElementPresence(driver, By.xpath("//div[@id=\'select2-drop\']/div/input"), 5);
	}
	
	public void setFlightsTo(String flightsto) {
		WebElement flightstoInput = getFlightsTo();
		flightstoInput.clear();
		flightstoInput.sendKeys(flightsto);
		flightstoInput.sendKeys(Keys.ENTER);
	}
	
	public void addFlightsTo(String flightsto) {
		setFlightsTo(flightsto);
		
	}
	
	public WebElement getFlightsFrom() {
		return Utils.waitForElementPresence(driver, By.xpath("//div[6]/div/input"), 5);
	}
	
	public void setFlightsFrom(String flightsfrom) {
		WebElement flightsfromInput = getFlightsFrom();
		flightsfromInput.clear();
		flightsfromInput.sendKeys(flightsfrom);
		flightsfromInput.sendKeys(Keys.ENTER);
	}
	
	public void addFlightsFrom(String flightsfrom) {
		setFlightsFrom(flightsfrom);
		
	}
}