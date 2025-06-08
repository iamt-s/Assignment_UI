package pages;


import org.openqa.selenium.*;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class HomePage {
  WebDriver driver;

  @FindBy(css = "img[src*='jlr-logo']") WebElement logo;
  @FindBy(css = "nav a") List<WebElement> navLinks;
  @FindBy(css = ".carousel-item img") WebElement heroBanner;
  @FindBy(css = "footer a") List<WebElement> footerLinks;

  public HomePage(WebDriver d) {
    this.driver = d;
    PageFactory.initElements(driver, this);
  }

  public String getTitle() { return driver.getTitle(); }
  public boolean isLogoVisible() { return logo.isDisplayed(); }
  public int navCount() { return navLinks.size(); }
  public boolean isBannerVisible() { 
	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	  WebElement banner = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".carousel-item img")));
	  return banner.isDisplayed(); }
  public int footerCount() { return footerLinks.size(); }
}

