package testCase;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.AccountRegistrationPage;
import pageObject.HomePage;
import testBase.BaseClass;

public class TC_001_AccountRegistrationTest extends BaseClass {
 @Test(groups= {"Regression","Master"})
 public void test_account_Registration() throws InterruptedException {
	 logger.info("****Starting TC_001_AccountRegistrationTest****");
	 try {
	   HomePage hp= new HomePage(driver);
	   hp.clickMyAccount();
	   logger.info("MyAccount");
	   hp.clickRegistration();
	   logger.info("Registration");
	   AccountRegistrationPage regpage=new AccountRegistrationPage(driver);
	   logger.info("AccountRegistrationPage");
	   regpage.setFirstName(randomeString());
	   logger.info("firstname");
	   regpage.setLastName(randomeString().toUpperCase());
	   logger.info("lastname");
	   regpage.setEmail(randomeString()+"@gmail.com");
	   logger.info("Email");
	   String password=randomeAlphaNumeric();
	   regpage.setPassword(password);
	   Thread.sleep(5000);
	   regpage.setPrivacyPolicy();
	   regpage.clickContinue();
	   logger.info("Click the button to continue");
	   Thread.sleep(5000);
	   String confmsg=regpage.getConfirmationMsg();
	   logger.info("Validating expected message");
	   Assert.assertEquals(confmsg, "Your Account Has Been Created!","TEST FAIELD");
	 }
	 catch(Exception e)
	 {
		 logger.error("test failed");
		 Assert.fail();
		 
	 }
	   logger.info("****FinishingTC_001_AccountRegistrationTest****");
 }
}
