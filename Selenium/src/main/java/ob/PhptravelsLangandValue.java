package ob;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import proba.Utils;

public class PhptravelsLangandValue {
	
private WebDriver driver;
	
	public PhptravelsLangandValue(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getValue(){
		return Utils.waitForElementPresence(driver, By.id("dropdownCurrency"), 5);
	}
	
	public WebElement getEuro(){
		return Utils.waitForElementPresence(driver, By.xpath("//a[4]"), 5);
	}
	
	public WebElement getGbr(){
		return Utils.waitForElementPresence(driver, By.xpath("//a[contains(text(),'GBP')]"), 5);
	}
	
	public WebElement getSar(){
		return Utils.waitForElementPresence(driver, By.xpath("//a[contains(text(),'SAR')]"), 5);
	}
	
	public WebElement getPkr(){
		return Utils.waitForElementPresence(driver, By.xpath("//a[contains(text(),'PKR')]"), 5);
	}
	
	public WebElement getKwd(){
		return Utils.waitForElementPresence(driver, By.xpath("//a[contains(text(),'KWD')]"), 5);
	}
	
	public WebElement getJpy(){
		return Utils.waitForElementPresence(driver, By.xpath("//a[contains(text(),'JPY')]"), 5);
	}
	
	public WebElement getInr(){
		return Utils.waitForElementPresence(driver, By.xpath("//a[contains(text(),'INR')]"), 5);
	}
	
	public WebElement getCny(){
		return Utils.waitForElementPresence(driver, By.xpath("//a[contains(text(),'CNY')]"), 5);
	}
	
	public WebElement getTry(){
		return Utils.waitForElementPresence(driver, By.xpath("//a[contains(text(),'TRY')]"), 5);
	}
	
	public WebElement getRub(){
		return Utils.waitForElementPresence(driver, By.xpath("//a[contains(text(),'RUB')]"), 5);
	}
	
	public WebElement getUsd(){
		return Utils.waitForElementPresence(driver, By.xpath("//a[contains(text(),'USD')]"), 5);
	}
	
	public WebElement getLangMenu(){
		return Utils.waitForElementPresence(driver, By.id("dropdownLangauge"), 5);
	}
	
	public WebElement getGer(){
		return Utils.waitForElementPresence(driver, By.id("de"), 5);
	}
	
	public WebElement getRus(){
		return Utils.waitForElementPresence(driver, By.id("ru"), 5);
	}
	
	public WebElement getEng(){
		return Utils.waitForElementPresence(driver, By.id("en"), 5);
	}
	
	public WebElement getArabic(){
		return Utils.waitForElementPresence(driver, By.id("ar"), 5);
	}
	
	public WebElement getFar(){
		return Utils.waitForElementPresence(driver, By.id("fa"), 5);
	}
	
	public WebElement getTur(){
		return Utils.waitForElementPresence(driver, By.id("tr"), 5);
	}
	
	public WebElement getFra(){
		return Utils.waitForElementPresence(driver, By.id("fr"), 5);
	}
	
	public WebElement getSpa(){
		return Utils.waitForElementPresence(driver, By.id("es"), 5);
	}
	
	public WebElement getVie(){
		return Utils.waitForElementPresence(driver, By.id("vi"), 5);
	}
}