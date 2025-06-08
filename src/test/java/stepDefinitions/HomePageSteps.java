package stepDefinitions;

import base.Hooks;
import driver.DriverFactory;
import io.cucumber.java.en.*;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.HomePage;

public class HomePageSteps {
	HomePage home;
  WebDriver driver; 
  
  
  @Given("user is on the homePage")
  public void navigateHome() {
	  driver = DriverFactory.getDriver(); 
	  home=new HomePage(driver);
  }

  @Then("page title should contain {string}")
  public void verifyTitle(String expectedTitle) {
	  driver = DriverFactory.getDriver(); 
	  home=new HomePage(driver);
	  String actualTitle = home.getTitle();
      Assert.assertTrue(actualTitle.contains(expectedTitle), "Expected: " + expectedTitle + ", but got: " + actualTitle);
  }

  @Then("logo is displayed")
  public void logoVisible() {
	  driver = DriverFactory.getDriver(); 
	  home=new HomePage(driver);
    Assert.assertTrue(home.isLogoVisible());
  }

  @Then("header navigation links count is greater than {int}")
  public void navLinks(int min) {
	  driver = DriverFactory.getDriver(); 
	  home=new HomePage(driver);
    Assert.assertTrue(home.navCount() > min);
  }

  @Then("hero banner is displayed")
  public void bannerVisible() {
	  driver = DriverFactory.getDriver(); 
	  home=new HomePage(driver);
    Assert.assertTrue(home.isBannerVisible());
  }

  @Then("footer links count is greater than {int}")
  public void footerLinks(int min) {
	  driver = DriverFactory.getDriver(); 
	  home=new HomePage(driver);
    Assert.assertTrue(home.footerCount() > min);
  }
}