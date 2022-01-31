// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class ProfileTudorsTest {
	private String
	exePath =
	"C:\\Users\\Darko\\Desktop\\Testiranje softvera seminarski\\chromedriver.exe";
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
	  System.setProperty("webdriver.chrome.driver", exePath);
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void profileTudors() {
	  driver.get("https://tudors.rs/login.php");
	  driver.manage().window().setSize(new Dimension(654, 672));
	  driver.findElement(By.name("EmailAddress")).click();
	  driver.findElement(By.name("EmailAddress")).sendKeys("redda999@gmail.com");
	  driver.findElement(By.name("Password")).click();
	  driver.findElement(By.name("Password")).sendKeys("031554806aA");
	  driver.findElement(By.cssSelector(".form-footer:nth-child(4) > .btn")).click();
	  assertTrue(driver.getPageSource().contains("redda999@gmail.com"));
  }
}
