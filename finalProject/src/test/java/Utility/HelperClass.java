package Utility;

import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import StepDefintion.StepDefinitionLogin;
 
 
 
public class HelperClass {
	
	private static HelperClass helperClass;
	public static Logger log;
	private static WebDriver driver;
	private static WebDriverWait wait;
	public final static int TIMEOUT =10;
	
	HelperClass() {
		log = LogManager.getLogger(StepDefinitionLogin.class);
		driver = new ChromeDriver();
//		driver = new EdgeDriver();
//		wait = new WebDriverWait(driver, Duration.ofSeconds(TIMEOUT));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIMEOUT));
		log.info("Implicit wait applied");
		driver.manage().window().maximize();
	}
	
	public static void openPage(String url) {
		driver.get(url);
	}
	public static WebDriver getDriver() {
		return driver;
	}
	public static void setUpDriver() {
		if(helperClass==null) {
			helperClass=new HelperClass();
		}
	}
	
	public static void tearDown() {
		if(driver!=null) {
			driver.close();
			driver.quit();
			log.info("Quiting the driver");
		}
		helperClass=null;
		
	}
	
	
}