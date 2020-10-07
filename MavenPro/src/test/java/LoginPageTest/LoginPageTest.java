package LoginPageTest;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BasePkg.BaseClass;
import LoginPage.LoginPageClass;

public class LoginPageTest extends BaseClass {
	LoginPageClass LoginUser;
		
	@BeforeMethod
	 public void URLlaunch() throws IOException {
		  try {
		  System.out.print("Lunching");
		  WebDriver driver = new ChromeDriver();
         driver.manage().window().maximize();
         driver.get(Pro.getProperty("url"));
         driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		  }
	  
		  catch (Exception e) {
		      System.out.println("Something went wrong.");
		  }
	  }
	  
	@Test
  public void UserLogin() throws IOException {
		//BaseC.LaunchURL()
		try {
					
	        /// Login.URLlaunch();
	        System.out.print("Login");
	        LoginUser = new LoginPageClass();
	        System.out.print("LoginPageClass");
	        try {
				LoginUser.Login();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        System.out.print("Done");
		}
	        catch(NullPointerException e) {
				System.out.println("NullPointerException thrown!");
			}
		}
		
  }


