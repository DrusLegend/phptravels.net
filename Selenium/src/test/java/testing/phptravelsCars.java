package testing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

import java.util.List;

import ob.Booking;
import ob.Cars;
import ob.Cars2;

@Test
public class phptravelsCars {
	
	private WebDriver driver;
	private String baseUrl;
	private Booking booking;
	private Cars cars;
	private Cars2 cars2;
	
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
		cars = new Cars(driver);
		cars2 = new Cars2(driver);
	}
	
	public void setup() throws InterruptedException {
		
		booking.getCars().click();
		assertEquals(true, booking.getCars().isDisplayed());
		cars.getPickupDate().click();
		cars.getDate().click();
		cars.getDropOffDate().click();
		cars.getDate2().click();
		cars.getDepartTime().click();
		cars.addTime("08:30");
		cars.getReturnTime().click();
		cars.addRetTime("11:00");
		Actions el = new Actions(driver);
		el.moveToElement(cars.getPickUp()).click().perform();
		cars.addBox("Miami");
		List<String> carsbox = cars.getCars();
		cars.getBox().sendKeys(Keys.ENTER);
		Actions el2 = new Actions(driver);
		el2.moveToElement(cars.getDropOff()).clickAndHold().perform();
		cars.addBox("Miami");
		List<String> carsbox2 = cars.getCars();
		cars.getBox().sendKeys(Keys.DOWN);
		cars.getBox().sendKeys(Keys.DOWN);
		cars.getBox().sendKeys(Keys.DOWN);
		cars.getBox().sendKeys(Keys.ENTER);
		cars.getBtn().submit();
		assertEquals(true, cars.getBtn().isDisplayed());
	}
	
	public void page2 () {
		
		cars2.getEditSearch().click();
		cars2.getDropDownMoney().selectByIndex(0);
		cars2.getSelectBtn().click();
		assertEquals(true, cars2.getSelectBtn().isDisplayed());
		
	}
	
	public void page3 () {
		
		cars2.driverdetails("abc", "nnn", "qq@gmail.com", "qq@gmail.com", "1345", "bb", "bb", "123", "us", "99");
		cars2.getConPhoNumDropdown().selectByIndex(15);
		cars2.getNumberOfPassengers().selectByVisibleText("2");
		cars2.getCheckBoxNews().click();
		assertEquals(true, cars2.getCheckBoxNews().isEnabled());
		cars2.getStateOfResidence().selectByVisibleText("California");
		cars2.getConfirmBtn().click();
		cars2.getNoinsure().click();
		assertEquals(true, cars2.getNoinsure().isDisplayed());
		
	}
	
	@AfterSuite
	public void closeSelenium() {
		driver.quit();
	}

}