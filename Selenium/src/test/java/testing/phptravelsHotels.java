package testing;

import static org.testng.AssertJUnit.assertEquals;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import ob.Booking;
import ob.Hotels;
import ob.Hotels2;
import ob.PhptravelsOb;
import ob.PhptravelsUser;

    @Test
    public class phptravelsHotels {
	
	private WebDriver driver;
	private String baseUrl;
	private Booking booking;
	private Hotels2 hotels2;
	private Hotels hotels;
	private PhptravelsOb phptravelsOb;
	private PhptravelsUser phptravelsUser;
	
	@BeforeSuite
	public void setupSelenium(){
		baseUrl = "https://www.phptravels.net/home";
		driver = new FirefoxDriver();
		//driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		//driver.manage().window().setSize(new Dimension(1024, 768));
		driver.navigate().to(baseUrl);
	}
	
	@BeforeTest
	private void setupPages() {
		
		hotels = new Hotels(driver);
		hotels2 = new Hotels2(driver);
		booking = new Booking(driver);
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
		phptravelsUser.getHome().click();
		booking.getHotels().click();
		assertEquals(true, booking.getHotels().isDisplayed());
	}
	
	public void hot () {
		
		Actions builder = new Actions(driver);
		builder.moveToElement(hotels.getBuilder()).click().perform();
		hotels.addDestination("Dubai");
		List<String> hotelNames = hotels.getHotelNames();
		hotels.getDestination().sendKeys(Keys.ENTER);
		hotels.getDate().click();
		hotels.getDateCheckout().click();
		hotels.getSubmit().submit();
		assertEquals(true, hotels.getSubmit().isDisplayed());
	}
	
	public void page(){
		
		Actions act = new Actions(driver);
		act.dragAndDropBy(hotels2.getSliderBar(), 10, 0).perform();
	    act.dragAndDropBy(hotels2.getSliderBar2(), -50, 0).perform();
		hotels2.getStar4().click();
		hotels2.getViewMore().click();
		hotels2.getSpa().click();
		hotels2.getSwimmingPool().click();
		hotels2.getViewLess().click();
		hotels2.getModifySearch().click();
		hotels2.getSearchBtn().click();
		hotels2.getDetails().click();
		assertEquals(true, hotels2.getNewPage().isDisplayed());
	}
	
	public void details(){
		
		hotels2.getCheckBox().click();
		hotels2.getAvailableRooms().click();
		assertEquals(true, hotels2.getAvailableRooms().isDisplayed());
		hotels2.getCheckBox().click();
		hotels2.getAvailability().click();
		hotels2.getSelectDates().selectByIndex(2);
		hotels2.getWriteReview().click();
		assertEquals(true, hotels2.getWriteReview().isDisplayed());
		hotels2.addWrite("113", "www@gmail.com", "Nice");
		hotels2.getRevLocation().selectByVisibleText("8");
		hotels2.getComfor().selectByVisibleText("7");
		hotels2.getRevFacilities().selectByVisibleText("6");
		hotels2.getStaff().selectByVisibleText("10");
		hotels2.getRevFacilities().selectByVisibleText("9");
		hotels2.getBook().click();
		hotels2.getSearchBtn().click();
		assertEquals(true, hotels2.getSearchBtn().isDisplayed());
		hotels2.getComfirm().click();
		assertEquals(true, hotels2.getComfirm().isDisplayed());
		hotels2.getPayNow().click();
		hotels2.getPaymentMethod().selectByIndex(5);
		hotels2.getPayOnArrrival().click();
		assertEquals(true, hotels2.getPayOnArrrival().isSelected());
		driver.switchTo().alert().accept();
		phptravelsOb.getAccount2().click();
		assertEquals(true, phptravelsOb.getAccount2().isDisplayed());
		hotels2.getInovice().click();
		assertEquals(true, hotels2.getInovice().isDisplayed());

	}
	
	public void logout(){
		
		phptravelsOb.getDemo().click();
		phptravelsOb.getLogout().click();
		assertEquals(true, phptravelsOb.getLogout().isDisplayed());
	}
	
	@AfterSuite
	public void closeSelenium() {
		driver.quit();
	}
}