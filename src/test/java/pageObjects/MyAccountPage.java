package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends Basepage {
	WebDriver driver;
	public MyAccountPage(WebDriver driver) {
	super(driver);
	}
	
	@FindBy(xpath="//h2[text()='My Account']")
	WebElement mgsHeading;
	
	@FindBy(xpath="//a[@class='list-group-item'][13]")
	WebElement lnkLogout;
	
	public boolean isMyAccountPageExists() {
		try {
			return(mgsHeading.isDisplayed());
		}
		catch(Exception e) {
			return false;
		}
	}
		public void clickLogout() {
			lnkLogout.click();
		}
	
}
