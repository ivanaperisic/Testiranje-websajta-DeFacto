package Testovi;
import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;
import java.util.Map;

//Generated by Selenium IDE
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
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
public void loginPageTest() {
    driver.get("https://eu.defacto.com/account/login?return_url=%2Faccount");
    driver.manage().window().setSize(new Dimension(1054, 800));
    driver.findElement(By.id("CustomerEmail")).sendKeys("ivanaperisic84@gmail.com");
    driver.findElement(By.id("CustomerPassword")).click();
    driver.findElement(By.id("CustomerPassword")).sendKeys("Ivanap.00");
    driver.findElement(By.cssSelector(".btn--full")).click();
  }
}

