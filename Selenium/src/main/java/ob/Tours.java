package ob;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import proba.Utils;

public class Tours {
	
	private WebDriver driver;
	
	public Tours(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getField1() {
		return Utils.waitForElementPresence(driver, By.cssSelector("#s2id_autogen15 .select2-chosen"), 5);
	}
	
	public List<String> getToursBox1() {
        List<String> toursBox1 = new ArrayList<String>();
        List<WebElement> toursBox1WebElements = driver.findElements(By.xpath("//div[@class='select2-result-label']"));
        for(WebElement flightsBox1Element: toursBox1WebElements) {
        	toursBox1.add(flightsBox1Element.getText());
        }
        return toursBox1;
    }
	
	public WebElement getBox() {
		return Utils.waitForElementPresence(driver, By.xpath("(//input[@type=\'text\'])[32]"), 5);
	}
	
	public void setBox(String box) {
		WebElement boxtoInput = getBox();
		boxtoInput.clear();
		boxtoInput.sendKeys(box);
		boxtoInput.sendKeys(Keys.ENTER);
	}
	
	public void addBox(String box) {
		setBox(box);
		
	}
	
	public WebElement getBtn() {
		return Utils.waitForElementPresence(driver, By.xpath("(//button[@type=\'submit\'])[3]"), 5);
	}
	
	public WebElement getDateTours() {
		return Utils.waitForElementPresence(driver, By.xpath("//input[@id=\'DateTours\']"), 5);
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
		return Utils.waitForElementPresence(driver, By.xpath("//div[@class='datepicker--months datepicker--body active']//div[@class='datepicker--cells datepicker--cells-months']//div[contains(text(), 'Aug')]"), 5);
	}
	//menjati 20 u npr 22 za drugi datum
	public WebElement getDate(){
		return Utils.waitForElementPresence(driver, By.xpath("//div[@id='datepickers-container']/div[8]/div[1]/div[1]/div[2]//div[contains(text(), '20')]"), 5);
	}
	
	// menjati 2020 u npr 2021 za drugu godinu
	public WebElement getYearSel(){
		return Utils.waitForElementPresence(driver, By.xpath("//div[@id='datepickers-container']//div[8]//div[1]//div[3]//div[1]//div[contains(text(), '2020')]"), 5);
	}
	
		public WebElement getAdultsPlus() {
			return Utils.waitForElementPresence(driver, By.xpath("(//button[@type='button'])[13]"), 5);
		}
		
		public WebElement getAdultsMin(){
			return Utils.waitForElementPresence(driver, By.xpath("(//button[@type='button'])[14]"), 5);
		}
		
		public WebElement getToursSel2(){
			return Utils.waitForElementPresence(driver, By.xpath("//div[@id=\'tourtype_chosen\']/a"), 5);
		}
		
		public WebElement getToursSelEl(){
			return Utils.waitForElementPresence(driver, By.xpath(".//*[@id='tourtype_chosen']/div/ul/li[5]"), 5);
		}
		
		public Select getToureSel() {
			return new Select(Utils.waitForElementPresence(driver, By.xpath("//div[@id=\'tourtype_chosen\']/a"), 5));
		}
		
		public void setToureSelIst(ArrayList<String> toure) {
			Select toures = this.getToureSel();
			for (String toureselist : toure) {
				toures.selectByVisibleText(toureselist);
			}
		}
		
		public void SelToure (ArrayList toures) {
			setToureSelIst(toures);
			
		}
}