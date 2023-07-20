package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegistrationPage extends BasePage {

	public AccountRegistrationPage(WebDriver driver) {
		super(driver);
	}
	@FindBy(name="firstname")
	WebElement txtFirstName;
	@FindBy(name = "lastname")
	WebElement txtLasttname;
    @FindBy(name="email")
    WebElement txtEmail;
    @FindBy(name="password")
    WebElement txtPassword;
    @FindBy(name = "agree")
	WebElement chkdPolicy;
    @FindBy(css="button[type='submit']")
    WebElement btnContinue;
    @FindBy(tagName="h1")
	WebElement msgConfirmation;
    
    public void setFirstName(String fname)
    {
    	txtFirstName.sendKeys(fname);
    }
    public void setLastName(String lname) {
		txtLasttname.sendKeys(lname);

	}
    public void setEmail(String email) {
    	txtEmail.sendKeys(email);
    }
    public void setPassword(String pwd) {
    	txtPassword.sendKeys(pwd);
    }
    public void setPrivacyPolicy() {
		chkdPolicy.click();
	}
    public void clickContinue() {
		btnContinue.click();
	}
    public String getConfirmationMsg() {
		try {
			return (msgConfirmation.getText());
		} catch (Exception e) {
			return (e.getMessage());

		}
    }
	
    
}
