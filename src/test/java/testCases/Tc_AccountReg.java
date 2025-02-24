package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AccountRegistrationpage;
import pageObjects.Homepage;
import testBase.Baseclass;

public class Tc_AccountReg extends Baseclass {
   
	@Test(groups= {"Regration","Master"})
	public void verifyOnAccountRegistration() {
		
		logger.info("**** Starting from Tc_AccountReg *****");
		try
		{
		Homepage hp=new Homepage(driver);
		hp.clickMyAccount();
		
		logger.info("**** Click on MyAccount *****");

		
		hp.clickRegistration();
		logger.info("**** Click on AccountReg *****");

		AccountRegistrationpage ar=new AccountRegistrationpage(driver);
		logger.info("**** Proveding Customer Details *****");

		ar.setFristName(randomeString());
		ar.setLastName(randomeString());
		ar.setClickEmail(randomeString()+"@gmail.com");
		ar.setEnterPhno( randomeNumber());
		
	String	password=randomeAlphaNumaric();
		ar.setPassword(password);
		ar.setConPassword(password);
		ar.clickOnAgree();
		ar.clickOnContinue();
		
		logger.info("**** Validating Expected Msg *****");

		
		 String conMgs=ar.getMgsconfirm();
		 if(conMgs.equals("Your Account Has Been Created!")) {
			 Assert.assertTrue(true);
		 }
		 else {
				logger.error("Test fail");
				logger.debug("debug logs");
			 Assert.assertTrue(false);
		 }
		 
		 Assert.assertEquals(conMgs, "Your Account Has Been Created!");
		}
		catch(Exception e)
		{
			
			Assert.fail();
		}
		logger.info("*** my test is finesh*****");
		}
	
	
	
	}
	

