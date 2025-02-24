package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.Homepage;
import pageObjects.Loginpage;
import pageObjects.MyAccountPage;
import testBase.Baseclass;
import utilites.DataProviders;

public class Tc2_LoginDDT extends Baseclass  {
@Test(dataProvider="LoginData",dataProviderClass=DataProviders.class,groups="Datadriver")
	
	public void verify_LoginDDT(String email,String pwd,String exp)
	{
		logger.info("*** LoginDDT test starting****");
		try {
		Homepage hm=new Homepage(driver);
		hm.clickMyAccount();
		hm.clickLogin();
		
		Loginpage lp=new Loginpage(driver);
		lp.setEmail(email);
		lp.setPassword(pwd);
		lp.cliclLogin();
		
		
		MyAccountPage macc=new MyAccountPage(driver);
		boolean targetpage = macc.isMyAccountPageExists();
		
		if(exp.equalsIgnoreCase("valid")) {
			if(targetpage==true) {
			  macc.clickLogout();
			  Assert.assertTrue(true);
			}
			else {
				Assert.assertTrue(false);
			}
		}
		if(exp.equalsIgnoreCase("invalid")) {
			if(targetpage==true) {
				macc.clickLogout();
				Assert.assertTrue(false);
			}
			else {
				Assert.assertTrue(true);
			}
		}
		}catch(Exception e) {
			Assert.fail();
		}
		logger.info("*** LoginDDT test is fineshed*****");
		}
}
