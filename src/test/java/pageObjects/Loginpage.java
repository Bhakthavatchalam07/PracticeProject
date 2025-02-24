package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Loginpage extends Basepage {
	WebDriver driver;
	public Loginpage(WebDriver driver){
		super(driver);
	}
	@FindBy(id="input-email")
	WebElement txtEmailAddrese;
	
	@FindBy(name="password")
	WebElement txtPassword;
	
	@FindBy(xpath="//input[@value='Login']")
	WebElement btnLogin;
	
	public void setEmail(String email) {
		txtEmailAddrese.sendKeys(email);
	}
    public void setPassword(String pwd) {
    	txtPassword.sendKeys(pwd);
    }
    
    public void cliclLogin() {
    	btnLogin.click();
    }
}
