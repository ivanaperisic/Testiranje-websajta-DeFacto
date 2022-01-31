// Generated by Selenium IDE
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
public class CartTudorsTest {
private WebDriver driver;
private String
exePath =
"C:\\Users\\Darko\\Desktop\\Testiranje softvera seminarski\\chromedriver.exe";
private Map<String, Object> vars;
JavascriptExecutor js;
@Before
public void setUp() {
	
	  System.setProperty("webdriver.chrome.driver", exePath);
	    driver = new ChromeDriver();
	    js = (JavascriptExecutor) driver;
	    vars = new HashMap<String, Object>();
	    js.executeScript("window.focus();");
}
@After
public void tearDown() {
 driver.quit();
}
@Test
public void cartTudors() {
 driver.manage().window().setSize(new Dimension(1280, 672));
 driver.get("https://tudors.rs/products.php?CategoryID=4&PriceRange=200.00:999.00");
 driver.findElements(By.className("acceptcookies")).get(0).click();
 driver.findElements(By.className("product-title")).get(0).click();
 driver.findElements(By.className("select-size")).get(0).click();
 driver.findElement(By.cssSelector(".btn > span")).click();
 driver.get("https://tudors.rs/products.php?CategoryID=2&Sleeve[]=Dugi%20Rukavi&Buttoning[]=Bez%20Raskop%C4%8Davanja");
 try {
	Thread.sleep(1000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
driver.findElements(By.className("product-title")).get(2).click();
 driver.findElements(By.className("select-size")).get(0).click();
 driver.findElement(By.cssSelector(".btn > span")).click();
 driver.get("https://tudors.rs/kosulje/slim-fit/sa-linijama/");
 try {
	Thread.sleep(1000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
 driver.findElements(By.className("product-title")).get(4).click();
 driver.findElements(By.className("select-size")).get(0).click();
 driver.findElement(By.cssSelector(".btn > span")).click();
 driver.get("https://tudors.rs/cart.php");
 try {
	Thread.sleep(2500);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
 assertEquals(driver.findElements(By.className("product-row")).size(), 3);
 
}

}