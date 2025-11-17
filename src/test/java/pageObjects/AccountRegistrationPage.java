package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegistrationPage extends BasePage{
	
	public AccountRegistrationPage(WebDriver driver)
	{
		
		super(driver);
	}
	
@FindBy(xpath="//input[@id='input-firstname']")
WebElement txtFirstname;

@FindBy(xpath="//input[@id='input-lastname']")
WebElement txtLastname;

@FindBy(xpath="//input[@id='input-email']")
WebElement txtEmail;

@FindBy(xpath="//input[@id='input-telephone']")
WebElement txtTelephone;

@FindBy(xpath="//input[@id='input-password']")
WebElement txtPassword;


@FindBy(xpath="//input[@id='input-confirm']")
WebElement txtConfirmpassword;

@FindBy(xpath="//input[@name='agree']")
WebElement chkdPolicy;

@FindBy(xpath="//input[@value='Continue']")
WebElement btnContinue;

@FindBy(xpath="//h1[normalize-space()='Your Account Has Been Created!']")
WebElement msgConfirmation;




/**
 * 
 */
public void setFirstname(String Firstname)
{
	txtFirstname.sendKeys(Firstname);
}

public void setLastName(String Lastname)
{
	txtLastname.sendKeys(Lastname);
}

public void setEmail(String Email)
{
	txtEmail.sendKeys(Email);
}

public void setTelephone(String Telephone)
{
	txtTelephone.sendKeys(Telephone);
}

public void setPassword(String Password)
{
	txtPassword.sendKeys(Password);
}

public void setConfirmpassword(String Confirmpassword)
{
	txtConfirmpassword.sendKeys(Confirmpassword);
	
}

public void setPrivacypolicy()
{
	chkdPolicy.click();
}

public void clickContinue()
{
	btnContinue.click();
}


public String getConfirmationMsg() {
	try {
		
		return(msgConfirmation.getText());
	}
	catch(Exception e)
	{
		return(e.getMessage());
	}
}





}
