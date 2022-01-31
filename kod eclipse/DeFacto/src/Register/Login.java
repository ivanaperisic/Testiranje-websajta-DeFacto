package Register;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
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

public class Login {

	
		

		  private WebDriver driver;
		  private Map<String, Object> vars;
		  JavascriptExecutor js;
		  @Before
		  public void setUp() {
		    driver = new ChromeDriver();
		    js = (JavascriptExecutor) driver;
		    vars = new HashMap<String, Object>();
		  }
		  @After
		  public void tearDown() {
		    driver.quit();
		  }
		  @Test
		  public void login() {
		    driver.get("https://eu.defacto.com/account/register");
		    driver.manage().window().setSize(new Dimension(1536, 816));
		    driver.findElement(By.cssSelector(".small--hide > .icon")).click();
		    driver.findElement(By.id("customer_register_link")).click();
		    driver.findElement(By.id("FirstName")).sendKeys("Ivana");
		    driver.findElement(By.id("LastName")).click();
		    driver.findElement(By.id("LastName")).sendKeys("Perisic");
		    driver.findElement(By.id("Email")).click();
		    driver.findElement(By.id("Email")).sendKeys("ivanaperisic84@gmail.com");
		    driver.findElement(By.id("CreatePassword")).click();
		    driver.findElement(By.id("CreatePassword")).sendKeys("Ivanap.00");
		    driver.findElement(By.cssSelector(".btn--full")).click();
		  

	}

}

