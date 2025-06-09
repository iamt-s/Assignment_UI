package pages;


import org.openqa.selenium.*;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class HomePage {
  WebDriver driver;
  WebDriverWait wait;
  @FindBy(css = "body > div.dialog-off-canvas-main-canvas > nav > a > img") WebElement logo;
  @FindBy(css = "nav a") List<WebElement> navLinks;
  @FindBy(css = "#block-jlr-corporate-2024-mainpagecontent > div.corporate.page-landing-page > div > div > div:nth-child(1) > div") WebElement heroBanner;
  @FindBy(css = "footer a") List<WebElement> footerLinks;
//WebElement banner = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#block-jlr-corporate-2024-mainpagecontent > div.corporate.page-landing-page > div > div > div:nth-child(1) > div")));
  public HomePage(WebDriver d) {
    this.driver = d;
    PageFactory.initElements(driver, this);
  }

  public String getTitle() { return driver.getTitle(); }
  public boolean isLogoVisible() { return logo.isDisplayed(); }
  public int navCount() { return navLinks.size(); }
  public boolean isBannerVisible() { 
	 wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	  return heroBanner.isDisplayed(); }
  public int footerCount() { return footerLinks.size(); }
}

