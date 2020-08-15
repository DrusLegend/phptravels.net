package php.trav.admin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import proba.Utils;


public class Messages {
	
	private WebDriver driver;
	
	public Messages(WebDriver driver) {
		this.driver = driver;
	}
	
	public String getMessages() {
		return Utils.waitForElementPresence(driver, By.xpath("//div[2]/form[1]/div[2]/div/p"), 5)
				.getText();
	}
	
	public String getMessagesEmailNotFound() {
		return Utils.waitForElementPresence(driver, By.xpath(".//*[@id='passresetfrm']/div[1]/div"), 5)
				.getText();
	}

}
