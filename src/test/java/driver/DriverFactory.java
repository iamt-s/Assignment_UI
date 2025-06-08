package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {
	  private static WebDriver driver;
	  public static WebDriver getDriver() {
	        if (driver == null) {
	            driver = new ChromeDriver();
	            driver.manage().window().maximize();
	            driver.get("https://www.jaguarlandrover.com/");
	        }
	        return driver;
	    }
	  
	    public static void quitDriver() {
	        if (driver != null) {
	            driver.quit();
	            driver = null;
	        }
	    }
	}
