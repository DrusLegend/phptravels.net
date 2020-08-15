package admin.testing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import php.trav.admin.AdminLoginPage;

@Test
public class AdminTest {
	
	private WebDriver driver;
	private String baseUrl;
	private AdminLoginPage adminLoginPage;
	
	@BeforeSuite
	public void setupSelenium(){
		baseUrl = "https://www.phptravels.net/admin";
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		//driver.manage().window().setSize(new Dimension(1024, 768));
		driver.navigate().to(baseUrl);
	}
	
	@BeforeTest
	private void setupPages() {
		
		adminLoginPage = new AdminLoginPage (driver);
		
	}
	
	public void login() throws InterruptedException {
		
		//adminLoginPage.login("admin@phptravels.com", "demoadmin");
		//adminLoginPage.getLoginBtn().click();
		adminLoginPage.getForPass().click();
		adminLoginPage.getResetPass().click();
		Alert ale =driver.switchTo().alert();
		ale.accept();
		
	}

}
