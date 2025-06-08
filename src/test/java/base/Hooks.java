package base;

import driver.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;

public class Hooks {

	WebDriver driver;
    @Before
    public void setUp() {
    	 driver=DriverFactory.getDriver();
        
    }

    @After
    public void tearDown() {
        DriverFactory.quitDriver();
    }
}
