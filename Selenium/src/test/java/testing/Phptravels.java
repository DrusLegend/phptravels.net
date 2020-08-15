package testing;

import static org.testng.AssertJUnit.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import ob.PhptravelsOb;
import ob.PhptravelsUser;

@Test
public class Phptravels {
	
	private WebDriver driver;
	private String baseUrl;
	private PhptravelsOb phptravelsOb;
	private PhptravelsUser phptravelsUser;
	
	
	@BeforeSuite
	public void setupSelenium(){
		baseUrl = "https://www.phptravels.net/home";
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		//driver.manage().window().setSize(new Dimension(1024, 768));
		driver.navigate().to(baseUrl);
	}
	
	@BeforeTest
	private void setupPages() {
		
		phptravelsOb = new PhptravelsOb(driver);
		phptravelsUser = new PhptravelsUser(driver);
		
			}
	
	public void setup() throws InterruptedException {
		
		phptravelsOb.getAccount().click();
		assertEquals(true, phptravelsOb.getAccount().isDisplayed());
		phptravelsOb.getLogin().click();
		phptravelsOb.getRemember().click();
		assertEquals(true, phptravelsOb.getRemember().isEnabled());
		phptravelsOb.login("user@phptravels.com", "demouser");
		phptravelsOb.getSubmit().click();			
	}
	
	public void user(){
		
		phptravelsUser.getProf().click();
		phptravelsUser.MyProfile("user@phptravels.com", "123", "123", "R2, Avenue du Maroc", "new", "NS", "52000",
				                 "13456", "US");
		phptravelsUser.getSelContry().click();
		phptravelsUser.getContry().click();
		//phptravelsUser.getSubmitBtn().click();
		phptravelsUser.getWish().click();
		phptravelsUser.getNews().click();
		//phptravelsUser.getOnOff().click();
		Actions act = new Actions(driver);
		act.moveToElement(phptravelsUser.getHovBar()).perform();
				
	}
	
	public void logout(){
		
		phptravelsOb.getDemo().click();
		phptravelsOb.getLogout().click();		
	}
	
	@AfterSuite
	public void closeSelenium() {
		driver.quit();
	}
}