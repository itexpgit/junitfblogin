/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.com;

import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author Uma
 */
public class FacebookloginTest {
    
    private WebDriver driver;
    private String baseUrl;
    
    public FacebookloginTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver","c:\\data\\chromedriver.exe");
        driver = new ChromeDriver();
        baseUrl = "https://www.facebook.com/";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
    
    @After
    public void tearDown() {
         driver.quit();
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    
    
    @Test
   public void testFacebookLoginUsingKeyboard() throws Exception {
    driver.get("https://www.facebook.com/");
    driver.findElement(By.id("email")).clear();
    driver.findElement(By.id("email")).sendKeys("abc@abc.com");
    driver.findElement(By.id("pass")).clear();
    driver.findElement(By.id("pass")).sendKeys("1234");
    driver.findElement(By.id("pass")).sendKeys(Keys.ENTER);
    Thread.sleep(5000);

  }

    // @Test
    // public void hello() {}
}
