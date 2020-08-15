package testing;

import static org.testng.AssertJUnit.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import ob.Booking;
import ob.Visa;
import ob.Visa2;

@Test
public class phptravelsVisa {
	
	private WebDriver driver;
	private String baseUrl;
	private Visa visa;
	private Visa2 visa2;
	private Booking booking;
	
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
		
		visa = new Visa(driver);
		visa2 = new Visa2(driver);
		booking = new Booking(driver);
	}
	
	public void setup() throws InterruptedException {
		
		booking.getVisa().click();
		assertEquals(true, booking.getVisa().isDisplayed());
		visa.getDropDown1().click();
		visa.addBox1("Australia");
		visa.getDropDown2().click();
		visa.addBox2("Spain");
		visa.getDate().click();
		visa.getDateSel().click();
		visa.getBtn().click();
		assertEquals(true, visa.getBtn().isSelected());

	}
	
	public void page(){
			
		visa2.field("123", "123","123@gmail.com","123@gmail.com", "555","18-07-2020");
		visa2.getCheckBox().click();
		visa2.notesbox("123456");
		visa2.getBtn().submit();
		assertEquals(true, visa2.getBtn().isSelected());
		visa2.getViewInvoice().click();
		assertEquals(true, visa2.getVisaSubmitted().isDisplayed());
		assertEquals(true, visa2.getViewInvoice().isDisplayed());
		
	}
	
	@AfterSuite
	public void closeSelenium() {
		driver.quit();
	}

}