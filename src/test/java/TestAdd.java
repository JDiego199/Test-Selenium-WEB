/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import java.util.HashMap;
import java.util.Map;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

/**
 *
 * @author mota1
 */
public class TestAdd {
    
      private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
    public TestAdd() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
            System.setProperty("webdriver.edge.driver", "C:\\Users\\mota1\\Downloads\\edgedriver_win64\\msedgedriver.exe");
       driver = new EdgeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
    }
    
    @After
    public void tearDown() {
            driver.quit();
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
      @Test
  public void testAdd() {
    driver.get("http://localhost:4200/show");
    driver.manage().window().setSize(new Dimension(1936, 1048));
    driver.findElement(By.cssSelector(".btn-success")).click();
    driver.findElement(By.id("FirstName")).click();
    driver.findElement(By.id("FirstName")).sendKeys("123");
    driver.findElement(By.id("LastName")).click();
    driver.findElement(By.id("LastName")).sendKeys("Juan");
    driver.findElement(By.id("Email")).click();
    driver.findElement(By.id("Email")).sendKeys("3123123");
    driver.findElement(By.id("Address")).click();
    driver.findElement(By.id("Address")).sendKeys("22");
    driver.findElement(By.id("Phone")).click();
    driver.findElement(By.id("Phone")).sendKeys("5");
    driver.findElement(By.cssSelector(".table-footer > .btn")).click();

  }
}
