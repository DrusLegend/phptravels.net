package testing;

import static org.testng.AssertJUnit.assertEquals;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import ob.Booking;
import ob.Flights;
import ob.Flights2;
import ob.PhptravelsOb;
import ob.PhptravelsUser;

@Test
public class phptravelsFlights {
	
	private WebDriver driver;
	private String baseUrl;
	private Booking booking;
	private PhptravelsOb phptravelsOb;
	private PhptravelsUser phptravelsUser;
	private Flights flights;
	private Flights2 flights2;
	
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

		booking = new Booking(driver);
		phptravelsOb = new PhptravelsOb(driver);
		phptravelsUser = new PhptravelsUser(driver);
		flights = new Flights(driver);
		flights2 = new Flights2(driver);
	}
	
	public void login() throws InterruptedException {
		
		phptravelsOb.getAccount().click();
		//assertEquals(true, phptravelsOb.getAccount().isDisplayed());
		phptravelsOb.getLogin().click();
		phptravelsOb.login("user@phptravels.com", "demouser");
		phptravelsOb.getSubmit().click();
		phptravelsUser.getHome().click();
		//assertEquals(true, phptravelsUser.getHome().isDisplayed());
	}
	
	public void flights () {
		
		booking.getFlights().click();
		Actions fieldone = new Actions(driver);
	    fieldone.moveToElement(flights.getField1()).click().perform();
	    flights.addFlightsFrom("Dubai");
	    List<String> flightsBox1 = flights.getFlightsBox1();
	    flights.getFlightsFrom().sendKeys(Keys.ENTER);	      
	    Actions field = new Actions(driver);
	    field.moveToElement(flights.getField2()).clickAndHold().perform();	      
	    flights.addFlightsTo("Dubai");
	    List<String> flightsBox2 = flights.getFlightsBox1();
	    flights.getFlightsTo().sendKeys(Keys.ENTER);
	    //flights.getFliDateStart().click();
	    //flights.getDate().click();
	    flights.getClassAdultPlus().click();
	    flights.getBtn().submit();
	}
	
	public void page (){
		
		Actions slider = new Actions(driver);
		slider.dragAndDropBy(flights2.getSliderBtn(), 10, 0).perform();
		Actions slider2 = new Actions(driver);
		slider2.dragAndDropBy(flights2.getSliderBtn2(), -50, 0).build().perform();
		flights2.getDirect().click();
		//assertEquals(true, flights2.getDirect().isSelected());
		flights2.getBookNow().click();
		//assertEquals(true, flights2.getBookNow().isDisplayed());
		
	}
	
	public void page2 (){
		
		flights2.info("abc", "20", "12456");
		flights2.getComfirmBook().click();
		assertEquals(true, flights2.getComfirmBook().isDisplayed());
		
	}
	
	public void page3 () {
		
		flights2.getPayNow().click();
		flights2.getPaymentMethod().selectByIndex(5);
		flights2.getPayOnArrrival().click();
		driver.switchTo().alert().accept();
	    //assertThat(driver.switchTo().alert().getText(), is("Are you sure you want to pay at arrival?"));
		
	}
	
	public void logout(){
		
		phptravelsOb.getDemo().click();
		phptravelsOb.getAccount2().click();
		//assertEquals(true, phptravelsOb.getAccount2().isDisplayed());
		phptravelsOb.getLogout().click();		
	}
	
	@AfterSuite
	public void closeSelenium() {
		driver.quit();
	}

}
