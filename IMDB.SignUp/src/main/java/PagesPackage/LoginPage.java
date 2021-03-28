package PagesPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.Select;

import BasePackage.BaseClass;
import TestPackage.Select;

public class LoginPage extends BaseClass {

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "ap_email")
	public WebElement SigninEmail;

	@FindBy(id = "ap_password")
	public WebElement SigninPassword;

	@FindBy(id = "signInSubmit")
	public WebElement Submitbutton;
	
	@FindBy(id = "imdbHeader-navDrawerOpen--desktop")
	public WebElement MenuIcon;
	
	@FindBy(linkText = "Top Rated Movies")
	public WebElement TopRatedMovie;
	
	@FindBy(id = "lister-sort-by-options")
	public WebElement SortingList;
	
	@FindBy(linkText = "See more release dates")
	public WebElement GetReleaseDates;
	
	public void SignIn() {

		SigninEmail.sendKeys(prop.getProperty("ValidEmail"));
		SigninPassword.sendKeys(prop.getProperty("Validpassword"));
		Submitbutton.click();

	}

	public void SelectLastMovie() {
		MenuIcon.click();
		TopRatedMovie.click();
				try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Select SortBy = new Select(SortingList);
		SortBy.selectByVisibleText("Release Date");
		
		driver.findElement(By.xpath("//*[@id=\"main\"]/div/span/div/div/div[3]/table/tbody/tr[250]/td[2]/a")).click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String ReleaseDate= driver.findElement(By.xpath("//*[@id=\"title-overview-widget\"]/div[1]/div[2]/div/div[2]/div[2]/div/a[4]")).getText();
		
		System.out.println("Release Date of Sorted Movie : " + ReleaseDate);
		
	}

}
