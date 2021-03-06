package Testovi;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
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
public class ProfileTest {
private WebDriver driver;
private String
exePath=
"C:\\Users\\HP\\OneDrive\\Desktop\\Testiranje DeFacto\\chromedriver.exe";
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
public void loginPageTest() {
    driver.get("https://eu.defacto.com/account/login?return_url=%2Faccount");
    driver.manage().window().setSize(new Dimension(1054, 800));
    driver.findElement(By.id("uc-btn-accept-banner")).click();
    driver.findElement(By.id("CustomerEmail")).sendKeys("ivanaperisic84@gmail.com");
    driver.findElement(By.id("CustomerPassword")).click();
    driver.findElement(By.id("CustomerPassword")).sendKeys("Ivanap.00");
    driver.findElement(By.cssSelector(".btn--full")).click();
    try {
  		Thread.sleep(6500);
  	} catch (InterruptedException e) {
  		// TODO Auto-generated catch block
  		e.printStackTrace();
  	}
    driver.get("https://eu.defacto.com/account");
    assertTrue(driver.getPageSource().contains("ivanaperisic84@gmail.com"));
    
  }

}


