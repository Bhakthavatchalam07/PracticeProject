package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegistrationpage extends Basepage {
	WebDriver driver;
	public AccountRegistrationpage(WebDriver driver) {
		super(driver);
	}

	@FindBy(id="input-firstname")
	WebElement Ftname;
	@FindBy(id="input-lastname")
	WebElement Ltname;
	@FindBy(id="input-email")
	WebElement email;
	@FindBy(id="input-telephone")
	WebElement phnumber;
	@FindBy(id="input-password")
	WebElement pwd;
	@FindBy(id="input-confirm")
	WebElement conformpwd;
	@FindBy(name="agree")
	WebElement clickAgg;
	@FindBy(xpath="//input[@value='Continue']")
	WebElement clickCont;
	@FindBy(xpath="//h1[normalize-space()='Your Account Has Been Created!']")
	WebElement confirmMgs;
	
	public void setFristName(String Fname) {
		Ftname.sendKeys(Fname);
	}
	public void setLastName(String Lname) {
	Ltname.sendKeys(Lname);
	}
	public void setClickEmail(String Email) {
		email.sendKeys(Email);
	}
	public void setEnterPhno(String Phno) {
		phnumber.sendKeys(Phno);
	}
	public void setPassword(String PassWord) {
		pwd.sendKeys(PassWord);
	}
	public void setConPassword(String ConfirmPwd) {
		conformpwd.sendKeys(ConfirmPwd);
	}
	public void clickOnAgree() {
		clickAgg.click();
	}
	public void clickOnContinue() {
		clickCont.click();
	}
	public String getMgsconfirm() {
		try {
			return(confirmMgs.getText());
		}
		catch(Exception e) {
			return(e.getMessage());
		}
	
	}
}
