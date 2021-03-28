package TestPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BasePackage.BaseClass;
import PagesPackage.SignUpPage;

public class SignUpTest extends BaseClass {

	SignUpPage SignUp;

	@BeforeMethod
	public void LaunchURL() {

		driver.get(prop.getProperty("URL"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	}

	@Test
	public void Tests() throws InterruptedException {
		LaunchURL();
		MoveToSignUpPage();
		Thread.sleep(3000);
		System.out.println(prop.getProperty("UserName"));
		SignUp = new SignUpPage();
	    SignUp.UserSignUp();
	}

	public void MoveToSignUpPage() {
		driver.findElement(By.xpath(
				"//a[@class='ipc-button ipc-button--single-padding ipc-button--center-align-content ipc-button--default-height ipc-button--core-baseAlt ipc-button--theme-baseAlt ipc-button--on-textPrimary ipc-text-button imdb-header__signin-text']"))
				.click();

		System.out.println("clicked on sign-up");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//a[@class='list-group-item create-account ']")).click();
		System.out.println("clicked on Create New Account");
	}

}
