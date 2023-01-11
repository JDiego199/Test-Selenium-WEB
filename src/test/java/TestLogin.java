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
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

/**
 *
 * @author mota1
 */
public class TestLogin {
    
     private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
    public TestLogin() {
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
      @Test
  public void testLogin() {
    driver.get("http://localhost:4200/");
    driver.manage().window().setSize(new Dimension(1109, 815));
    driver.findElement(By.id("usser")).click();
    driver.findElement(By.id("usser")).sendKeys("diego");
    driver.findElement(By.id("pass")).click();
    driver.findElement(By.id("pass")).sendKeys("123");
    driver.findElement(By.cssSelector(".btn")).click();
  }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
