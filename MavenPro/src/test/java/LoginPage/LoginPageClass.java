package LoginPage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import BasePkg.BaseClass;

public class LoginPageClass extends BaseClass {
		
	public LoginPageClass  ()
   { 
	   PageFactory.initElements(driver, this);
   }
	  @FindBy(id="email")
	 public WebElement Email;
	  
	  @FindBy(id="passwd")
	  public WebElement Passward;
	  
	  @FindBy(id="SubmitLogin")
	  public WebElement Submit;
	  
	  	  
	  	 public void Login() throws InterruptedException
  {  
	  System.out.print("User logging in");
	  Email.sendKeys(Pro.getProperty("EmailID"));
	  try {
			Thread.sleep(500);
		} catch (InterruptedException e) {			
			e.printStackTrace();
		}	
	  Passward.sendKeys(Pro.getProperty("PW"));
	  try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {			
			e.printStackTrace();
		}
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  Submit.click();
	    }
	  	  
	  }
	 