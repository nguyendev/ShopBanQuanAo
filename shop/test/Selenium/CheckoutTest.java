/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Selenium;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author NguyenIT
 */
public class CheckoutTest {
    private static WebDriver driver;
    
    @BeforeClass
    public static void setUp() {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\NguyenIT\\Downloads\\chromedriver_win32\\chromedriver.exe");
        // Khởi tạo trình duyệt Firefox
        driver = new ChromeDriver();
    }
    @Test
    public void Test04_CheckoutSuccess() throws Exception {
    driver.get("http://localhost:8080/shop/login.jsp");
    Thread.sleep(2000);
    
    /*Dang nhap*/
    // Input correct Username
    driver.findElement(By.name("email")).sendKeys("nguyen.nah76@gmail.com");
    // Input correct Password
    driver.findElement(By.name("pass")).sendKeys("123456");
    // Click Login button
    driver.findElement(By.name("command")).click();
    
    /* Mua hang */
    Thread.sleep(2000);
    driver.findElement(By.id("1")).click();
    Thread.sleep(1000);
    driver.findElement(By.id("cart")).click();
    Thread.sleep(1000);
    driver.findElement(By.id("checkoutsuccess")).click();
    Thread.sleep(1000);
    
    /* Thanh toan don hang */
    driver.findElement(By.id("checkoutemail")).sendKeys("nguyen.nah76@gmail.com");
    driver.findElement(By.id("checkoutname")).sendKeys("Nguyễn Văn An");
    driver.findElement(By.id("checkoutprovincial")).sendKeys("Hồ Chí Minh");
    driver.findElement(By.id("checkoutaddress")).sendKeys("Hồ Chí Minh");
    driver.findElement(By.id("checkoutaddress1")).sendKeys("Đồng Tháp");
    driver.findElement(By.id("checkoutphonenumber")).sendKeys("0968784717");
    driver.findElement(By.id("checkoutpayment")).sendKeys("Live");
    driver.findElement(By.id("checkoutmessage")).sendKeys("Kiểm tra");
    Thread.sleep(1000);
    driver.findElement(By.id("checkoutsubmit")).click();
    Thread.sleep(1000);
    String result =  driver.findElement(By.id("countItem")).getText();
    Assert.assertEquals("0", result);
    
    }
    @AfterClass
    public static void tearDown() {
        driver.quit();
    }
}
