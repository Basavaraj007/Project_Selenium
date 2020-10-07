package BasePkg;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Driver;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class BaseClass {
	
	public static WebDriver driver;
	public static Properties Pro ;
	public static FileInputStream Fis;
	
	  public void LaunchURL() throws IOException {
		  File source = new File("C:\\Users\\Basavaraj\\eclipse-workspace\\MavenPro\\ObjectReposetory.properties");
		  Fis = new FileInputStream(source);
	      Pro = new Properties();
	      Pro.load(Fis);
	      System.out.print("File Loaded");
          System.setProperty("Webdriver.chrome.driver","C:\\Users\\Basavaraj\\eclipse-workspace\\MavenPro\\chromedriver.exe");
          System.out.print("Chrome");
          
  }
	  @BeforeTest
	  public void EnvironmentSetup() throws IOException
	  {
		  LaunchURL();
	  }
	  
  
}
