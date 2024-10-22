// Generated by Selenium IDE
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.Duration;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SelecionarProdutoTest {
  private WebDriver driver;
  // private Map<String, Object> vars;
  JavascriptExecutor js;
  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

  @BeforeEach
  public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    // vars = new HashMap<String, Object>();
  }

  @AfterEach
  public void tearDown() {
    driver.quit();
  }
  
  @Test
  public void selecionarProduto() {
    driver.get("https://www.saucedemo.com/");
    driver.manage().window().setSize(new Dimension(1256, 795));
    driver.findElement(By.cssSelector("*[data-test=\"username\"]")).sendKeys("standard_user");
    driver.findElement(By.cssSelector("*[data-test=\"password\"]")).sendKeys("secret_sauce");
    driver.findElement(By.cssSelector("*[data-test=\"login-button\"]")).click();
    assertEquals(driver.findElement(By.cssSelector("*[data-test=\"title\"]")).getText(), "Products");
    driver.findElement(By.cssSelector("*[data-test=\"inventory-item-name\"]")).click();
    assertEquals(driver.findElement(By.cssSelector("*[data-test=\"back-to-products\"]")).getText(), "Back to products");
    assertEquals(driver.findElement(By.cssSelector("*[data-test=\"inventory-item-name\"]")).getText(), "Sauce Labs Backpack");
    assertEquals(driver.findElement(By.cssSelector("*[data-test=\"inventory-item-price\"]")).getText(), "$29.99");
    driver.findElement(By.cssSelector("*[data-test=\"add-to-cart\"]")).click();
    assertEquals(driver.findElement(By.cssSelector("*[data-test=\"shopping-cart-badge\"]")).getText(), "1");
    driver.findElement(By.cssSelector("*[data-test=\"shopping-cart-link\"]")).click();
    assertEquals(driver.findElement(By.cssSelector("*[data-test=\"title\"]")).getText(), "Your Cart");
    assertEquals(driver.findElement(By.cssSelector("*[data-test=\"item-quantity\"]")).getText(), "1");
    assertEquals(driver.findElement(By.cssSelector("*[data-test=\"inventory-item-name\"]")).getText(), "Sauce Labs Backpack");
    assertEquals(driver.findElement(By.cssSelector("*[data-test=\"inventory-item-price\"]")).getText(), "$29.99");
    driver.findElement(By.cssSelector("*[data-test=\"remove-sauce-labs-backpack\"]")).click();
    driver.findElement(By.id("react-burger-menu-btn")).click();

    //Add explicit wait
    // WebElement logoutLink = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("*[data-test=\"logout-sidebar-link\"]")));
    // logoutLink.click();

    try {
      Thread.sleep(10000);
    } catch (InterruptedException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }

    driver.findElement(By.cssSelector("*[data-test=\"logout-sidebar-link\"]")).click();
    driver.close();
  }
}
