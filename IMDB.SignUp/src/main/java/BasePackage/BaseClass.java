package BasePackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	public static WebDriver driver;
	public static Properties prop;
	public static FileInputStream fis;

	public void Setup() {
		System.out.println("Testing");
		System.out.println("Testing123");///added new line
		try {
		///	fis = new FileInputStream("C:\\Users\\Basavaraj\\eclipse-workspace\\IMDB.SignUp\\src\\main\\java\\BasePackage\\DataFile.properties");
			
			fis = new FileInputStream("C:\\Users\\Basavaraj.maddani\\Project_Selenium\\IMDB.SignUp\\src\\main\\java\\BasePackage\\DataFile.properties");
			
			prop = new Properties();
			prop.load(fis);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		/*System.setProperty("webdriver.chrome.driver","D:\\Basavaraj.M\\chromedriver.exe");
		driver = new ChromeDriver();*/
		
		System.setProperty("webdriver.edge.driver", "D:\\Basavaraj.M\\Drivers\\msedgedriver.exe");
		
	    driver = new EdgeDriver();
	
		
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
