package PagesPackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import BasePackage.BaseClass;

public class SignUpPage extends BaseClass {

	public SignUpPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "ap_customer_name")
	public WebElement Name;

	@FindBy(id = "ap_email")
	public WebElement Email;

	@FindBy(id = "ap_password")
	public WebElement Password;

	@FindBy(id = "ap_password_check")
	public WebElement ReEnterPassword;
	
	@FindBy(id = "continue")
	public WebElement continuebutton;

	/// @FindBy (name="btnLogin")
	//// public WebElement submitBitton;

	public void UserSignUp() {
	
		/////Name.sendKeys("TestName");
		///System.out.println()
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {			
			e.printStackTrace();
		}
    ////   System.out.println(prop.getProperty("UserName"));
	///	Name.sendKeys("TestUser");
		Name.sendKeys(prop.getProperty("UserName"));
		Email.sendKeys(prop.getProperty("UserEmail"));
		Password.sendKeys(prop.getProperty("UserPassword"));
		ReEnterPassword.sendKeys(prop.getProperty("UserReEnterPassward"));
		continuebutton.click();
		

	}
}
