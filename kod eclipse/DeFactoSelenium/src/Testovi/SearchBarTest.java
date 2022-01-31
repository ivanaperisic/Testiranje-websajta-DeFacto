package Testovi;
import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;
import java.util.Map;
//Generated by Selenium IDE
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import junit.framework.Assert;
public class SearchBarTest {
	private WebDriver driver;
	private String
	exePath=
			  "C:\\Users\\HP\\OneDrive\\Desktop\\Testiranje DeFacto\\chromedriver.exe";
	  private Map<String, Object> vars;
	  JavascriptExecutor js;
	  @BeforeEach
	  public void setUp() {
		  System.setProperty("webdriver.chrome.driver", exePath);
	    driver = new ChromeDriver();
	    js = (JavascriptExecutor) driver;
	    vars = new HashMap<String, Object>();
	  }
	  @AfterEach
	  public void tearDown() {
	    driver.quit();
	  }
	  @Test
	  public void searchBar() {
	    driver.get("https://eu.defacto.com/pages/women");
	    driver.manage().window().setSize(new Dimension(1062, 800));
	    driver.findElement(By.id("uc-btn-accept-banner")).click();
	    {
	      WebElement element = driver.findElement(By.cssSelector(".flex-1"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element).clickAndHold().perform();
	    }
	    {
	      WebElement element = driver.findElement(By.cssSelector(".header-search-wrapper"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element).release().perform();
	    }
	    driver.findElement(By.cssSelector(".header-search-wrapper")).click();
	    driver.findElement(By.cssSelector(".flex-1")).sendKeys("dress");
	    driver.findElement(By.cssSelector(".flex-1")).sendKeys(Keys.ENTER);
	    assertTrue(driver.getCurrentUrl().contains("dress"));
	  }
	

}