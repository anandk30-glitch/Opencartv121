package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import TestBase.BaseClass;
import pageObjects.AccountRegistrationPage;
import pageObjects.HomePage;

public class TC001_AccountRegistrationTest2 extends BaseClass {
	
		
	@Test(groups={"Regression","Master"})
	public void verifyaccountregistration() throws InterruptedException
	{
		logger.info("******* Starting TC001_AccountRegistrationTest2 *******");
		try
		{
		HomePage hp=new HomePage(driver);
		Thread.sleep(2000);
		hp.clickMyAccount();
		logger.info("Clicked on MyAccount link");
		Thread.sleep(2000);
		hp.clickRegister();
		logger.info("Clicked on Register link");
			
		Thread.sleep(1000);
		
		AccountRegistrationPage regpage=new AccountRegistrationPage(driver);
		logger.info("Providing customer details.....");
		regpage.setFirstname(randomString().toUpperCase());
		regpage.setLastName(randomString().toUpperCase());
		regpage.setEmail(randomString()+"@gmail.com");
		regpage.setTelephone(randomNumber());
		
		String pwd=randomAlphaNumeric();
		regpage.setPassword(pwd);
		regpage.setConfirmpassword(pwd);
		regpage.setPrivacypolicy();
		regpage.clickContinue();
		
		logger.info("Validating expected message....");
		String confmsg=regpage.getConfirmationMsg();
		
		//if(confmsg.equals("Your Account Has Been Created!!!"))
		if(confmsg.equals("Your Account Has Been Created!"))
		{
			Assert.assertTrue(true);
		}
		
		else
		{
			logger.error("Test failed.....");
			logger.debug("Debug logs....");
			Assert.assertTrue(false);
		}
		
		//Assert.assertEquals(confmsg,"Your Account Has Been Created!!!");
		}
		catch(AssertionError e)
		{
			System.out.println("In the catch block.....");
			Assert.fail();
		}
		logger.info("*******Finished TC001_AccountRegistrationTest2 *******");
		
		
	}
	
	

}
