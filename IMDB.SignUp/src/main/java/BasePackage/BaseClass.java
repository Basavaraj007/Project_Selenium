package BasePackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PagesPackage.SignUpPage;

public class BaseClass {
	public static WebDriver driver;
	public static Properties prop;
	public static FileInputStream fis;

	public void Setup() {
		System.out.println("Testing");
		System.out.println("Testing123");///added new line
		try {
			fis = new FileInputStream("C:\\Users\\Basavaraj\\eclipse-workspace\\IMDB.SignUp\\src\\main\\java\\BasePackage\\DataFile.properties");
			prop = new Properties();
			prop.load(fis);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.setProperty("webdriver.chrome.driver","G:\\\\ChromeDriver\\\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@BeforeTest
	public void beforeTest() {
		Setup();
	}

	@AfterTest
	 public void tearDown(){
	driver.quit();
	 }

}
