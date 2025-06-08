package pages;


import org.openqa.selenium.*;
import org.openqa.selenium.support.*;
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
  public boolean isBannerVisible() { return heroBanner.isDisplayed(); }
  public int footerCount() { return footerLinks.size(); }
}

