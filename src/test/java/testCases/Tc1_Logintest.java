package testCases;


import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.Homepage;
import pageObjects.Loginpage;
import pageObjects.MyAccountPage;
import testBase.Baseclass;

public class Tc1_Logintest extends Baseclass {
	
	@Test(groups= {"Sanity","Master"})
	
	public void verify_Login()
	{
		logger.info("*** Login test starting****");
		try {
		Homepage hm=new Homepage(driver);
		hm.clickMyAccount();
		hm.clickLogin();
		
		Loginpage lp=new Loginpage(driver);
		lp.setEmail(p.getProperty("email"));
		lp.setPassword(p.getProperty("password"));
		Thread.sleep(3000);
		lp.cliclLogin();
		
		
		MyAccountPage macc=new MyAccountPage(driver);
		boolean targetpage = macc.isMyAccountPageExists();
		Assert.assertTrue(targetpage);
		}
		catch(Exception e) {
			Assert.fail();
		}
		logger.info("**** Login test is fineshed*******");
	}

}
