package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Homepage extends Basepage {
	WebDriver driver;
	public Homepage(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath="//span[text()='My Account']")
	WebElement myAccount;
	
    @FindBy(xpath="//a[text()='Register']")
    WebElement reg;
    
    @FindBy(xpath="//a[text()='Login']")
    WebElement clkLogin;
    
    public void clickMyAccount() {
    	myAccount.click();
    	
    }
    
    public void clickRegistration() {
    	reg.click();
    }
    public void clickLogin() {
    	clkLogin.click();
    }
    
    
	}

    
