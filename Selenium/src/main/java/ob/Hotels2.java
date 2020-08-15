package ob;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import proba.Utils;

public class Hotels2 {
	
	
	private WebDriver driver;
	
	public Hotels2(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getSliderBar() {
		return Utils.waitForElementPresence(driver, By.xpath("//div[2]/span/span[6]"), 5);
	}
	
	public WebElement getSliderBar2() {
		return Utils.waitForElementPresence(driver, By.xpath("//div[2]/span/span[7]"), 5);
	}
	
	public WebElement getStar() {
		return Utils.waitForElementPresence(driver, By.xpath("//label[contains(.,\'      \')]"), 5);
	}
	
	public WebElement getStar2() {
		return Utils.waitForElementPresence(driver, By.xpath("//div[2]/label"), 5);
	}
	
	public WebElement getStar3() {
		return Utils.waitForElementPresence(driver, By.xpath("//div[3]/label"), 5);
	}
	
	public WebElement getStar4() {
		return Utils.waitForElementPresence(driver, By.xpath("//div[4]/label"), 5);
	}
	public WebElement getStar5() {
		return Utils.waitForElementPresence(driver, By.xpath("//div[5]/label"), 5);
	}
	
	public WebElement getViewMore() {
		return Utils.waitForElementPresence(driver, By.xpath("//span[@type=\'buttom\']"), 5);
	}
	
	public WebElement getViewLess() {
		return Utils.waitForElementPresence(driver, By.xpath("(//span[@type=\'buttom\'])[2]"), 5);
	}
	
	public WebElement getModifySearch() {
		return Utils.waitForElementPresence(driver, By.xpath("//div/div[2]/button"), 5);
	}
	
	public WebElement getDetails() {
		return Utils.waitForElementPresence(driver, By.xpath("//a[contains(text(),\'Details\')]"), 5);
	}
	
	public WebElement getSearchBtn() {
		return Utils.waitForElementPresence(driver, By.id("searchform"), 5);
	}
	
	public WebElement getNewPage() {
		return Utils.waitForElementPresence(driver, By.xpath("html/body"), 5);
	}
	
	public WebElement getHL() {
		return Utils.waitForElementPresence(driver, By.id("priceOrderDes"), 5);
	}
	
	public WebElement getLH() {
		return Utils.waitForElementPresence(driver, By.id("priceOrderAsc"), 5);
	}
	
	public WebElement getSpa() {
		return Utils.waitForElementPresence(driver, By.xpath("//label[contains(.,\' SPA\')]"), 5);
	}
	
	public WebElement getPetsAllowed() {
		return Utils.waitForElementPresence(driver, By.xpath("//label[contains(.,\' Pets Allowed\')]"), 5);
	}
	
	public WebElement getSwimmingPool() {
		return Utils.waitForElementPresence(driver, By.xpath("//label[contains(.,\' Swimming Pool\')]"), 5);
	}
	
	public WebElement getWiFi() {
		return Utils.waitForElementPresence(driver, By.xpath("//label[contains(.,\' Wi-Fi Internet\')]"), 5);
	}
	
	public WebElement getHotel() {
		return Utils.waitForElementPresence(driver, By.xpath("//label[contains(.,\'  Hotel\')]"), 5);
	}
	
	public WebElement getGallery() {
		return Utils.waitForElementPresence(driver, By.xpath("//a[contains(text(),\'Gallery\')]"), 5);
	}
	
	public WebElement getOverview() {
		return Utils.waitForElementPresence(driver, By.xpath("//a[contains(text(),\'Overview\')]"), 5);
	}
	
	public WebElement getAvailableRooms() {
		return Utils.waitForElementPresence(driver, By.xpath("//a[contains(text(),\'Available Rooms\')]"), 5);
	}
	
	public WebElement getLocation() {
		return Utils.waitForElementPresence(driver, By.xpath("//a[contains(text(),\'Location\')]"), 5);
	}
	
	public WebElement getFacilities() {
		return Utils.waitForElementPresence(driver, By.xpath("//a[contains(text(),\'Facilities\')]"), 5);
	}
	
	public WebElement getPolicy() {
		return Utils.waitForElementPresence(driver, By.xpath("//a[contains(text(),\'Policy\')]"), 5);
	}
	
	public WebElement getReviews() {
		return Utils.waitForElementPresence(driver, By.xpath("//a[contains(text(),\'Reviews\')]"), 5);
	}
	
	public WebElement getPriceandDate() {
		return Utils.waitForElementPresence(driver, By.xpath("//a[contains(text(),\'See price and date\')]"), 5);
	}
	
	public WebElement getModify() {
		return Utils.waitForElementPresence(driver, By.xpath("//button[@type=\'submit\']"), 5);
	}
	
	public WebElement getSave() {
		return Utils.waitForElementPresence(driver, By.xpath("//button[@onclick=\'copyToClipboard()\']"), 5);
	}
	
	public WebElement getWishlist() {
		return Utils.waitForElementPresence(driver, By.xpath("//div[2]/span/span"), 5);
	}
	
	public WebElement getWriteReview() {
		return Utils.waitForElementPresence(driver, By.xpath("//div[5]/div[2]/button"), 5);
	}
	
	public WebElement getName() {
		return Utils.waitForElementPresence(driver, By.name("fullname"), 5);
	}
	
	public void setName(String name) {
		WebElement name1Input = getName();
		name1Input.clear();
		name1Input.sendKeys(name);
	}
	
	public WebElement getEmail() {
		return Utils.waitForElementPresence(driver, By.name("email"), 5);
	}
	
	public void setEmail(String email) {
		WebElement email1Input = getName();
		email1Input.clear();
		email1Input.sendKeys(email);
	}
	
	public WebElement getComments() {
		return Utils.waitForElementPresence(driver, By.name("reviews_comments"), 5);
	}
	
	public void setComments(String comments) {
		WebElement comments1Input = getComments();
		comments1Input.clear();
		comments1Input.sendKeys(comments);
	}
	
	public void addWrite(String name, String email, String comments) {
		setName(name);
		setEmail(email);
		setComments(comments);
		
	}
	
	public Select getRevLocation() {
		return new Select(Utils.waitForElementPresence(driver, By.xpath("(//select[@id='38'])[2]"), 5));
	}
	
	public Select getComfor() {
		return new Select(Utils.waitForElementPresence(driver, By.xpath("(//select[@id='38'])[3]"), 5));
	}
	
	public Select getClean() {
		return new Select(Utils.waitForElementPresence(driver, By.xpath("//select[@id='38']"), 5));
	}
	
	public Select getRevFacilities() {
		return new Select(Utils.waitForElementPresence(driver, By.xpath("(//select[@id='38'])[4]"), 5));
	}
	
	public Select getStaff() {
		return new Select(Utils.waitForElementPresence(driver, By.xpath("(//select[@id='38'])[5]"), 5));
	}
	
	public WebElement getArrowLeft() {
		return Utils.waitForElementPresence(driver, By.xpath("(//button[@type=\'button\'])[7]"), 5);
	}
	
	public WebElement getArrowRight() {
		return Utils.waitForElementPresence(driver, By.xpath("(//button[@type=\'button\'])[8]"), 5);
	}
	
	public WebElement getMoreDet() {
		return Utils.waitForElementPresence(driver, By.xpath("(//button[@type=\'button\'])[9]"), 5);
	}
	
	public WebElement getMoreDet2() {
		return Utils.waitForElementPresence(driver, By.xpath("(//button[@type=\'button\'])[11]"), 5);
	}
	
	public WebElement getAvailability() {
		return Utils.waitForElementPresence(driver, By.xpath("(//button[@type=\'button\'])[10]"), 5);
	}
	
	public WebElement getAvailability2() {
		return Utils.waitForElementPresence(driver, By.xpath("(//button[@type=\'button\'])[12]"), 5);
	}
	
	public WebElement getCheckBox() {
		return Utils.waitForElementPresence(driver, By.xpath("//h5/div/label"), 5);
	}
	
	public WebElement getCheckBox2() {
		return Utils.waitForElementPresence(driver, By.xpath("//div[5]/div/div[2]/div/div[2]/h5/div/label"), 5);
	}
	
	public WebElement getDropDown() {
		return Utils.waitForElementPresence(driver, By.xpath("//select[@name=\'roomscount[44]\']"), 5);
	}
	
	public WebElement getDropDown2() {
		return Utils.waitForElementPresence(driver, By.xpath("//select[@name=\'roomscount[42]\']"), 5);
	}
	
	public Select getSelectDates() {
		return new Select(Utils.waitForElementPresence(driver, By.id("44"), 5));
	}
	
	public Select getSelectDates2() {
		return new Select(Utils.waitForElementPresence(driver, By.id("42"), 5));
	}
	
	public WebElement getBook() {
		return Utils.waitForElementPresence(driver, By.xpath("//form/div/button"), 5);
	}
	
	public WebElement getSwichBtn() {
		return Utils.waitForElementPresence(driver, By.xpath("//tr[3]/td[4]/label/span"), 5);
	}
	
	public WebElement getSwichBtn2() {
		return Utils.waitForElementPresence(driver, By.xpath("//tr[4]/td[4]/label/span"), 5);
	}
	
	public WebElement getComfirm() {
		return Utils.waitForElementPresence(driver, By.xpath("//button[contains(.,\'CONFIRM THIS BOOKING\')]"), 5);
	}
	
	public WebElement getPayNow() {
		return Utils.waitForElementPresence(driver, By.xpath("//button[@type=\'button\']"), 5);
	}
	
	public Select getPaymentMethod() {
		return new Select(Utils.waitForElementPresence(driver, By.xpath("//span[contains(.,\'Select Payment Method\')]"), 5));
	}
	
	public WebElement getPayOnArrrival() {
		return Utils.waitForElementPresence(driver, By.id("43"), 5);
	}
	
	public WebElement getInovice() {
		return Utils.waitForElementPresence(driver, By.xpath("//a[contains(text(),\'Invoice\')]"), 5);
	}
	
}