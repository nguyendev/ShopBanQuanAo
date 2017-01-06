/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Selenium;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

/** 
 *
 * @author NguyenIT
 */

public class Tesst {
    private static WebDriver driver;
    
    @BeforeClass
    public static void setUp() {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\NguyenIT\\Downloads\\chromedriver_win32\\chromedriver.exe");
        // Khởi tạo trình duyệt Firefox
        driver = new ChromeDriver();
    }
    
//    @Test
//    public void Test01_LoginWithEmptyEmailPassword() throws Exception {
//        driver.get("http://localhost:8080/shop/login.jsp");
//        // Mở rộng cửa sổ trình duyệt lớn nhất
//        //driver.manage().window().maximize();
//        Thread.sleep(1000);
//        // Click Login button
//        driver.findElement(By.name("command")).click();
//        Thread.sleep(2000);
//        //Get error message at 'Email Address' field
//        String error = driver.findElement(By.id("error")).getText();
//        System.out.println(error);
//        // Verify error message display correctly
//        Assert.assertEquals("Sai tên người dùng hoặc mật khẩu!", error);
//
//    }
//    
//    @Test
//    public void Test02_LoginWithInvalidEmail() throws Exception {
//        driver.get("http://live.guru99.com/index.php/customer/account/login/");
//        Thread.sleep(8000);
//        // Input correct Username
//        driver.findElement(By.id("email")).sendKeys("123434234@12312.123123");
//        // Click Login button
//        driver.findElement(By.id("send2")).click();
//        Thread.sleep(5000);
//        // Get error message is displayed
//        String errorMessage = driver.findElement(By.id("advice-validate-email-email")).getText();
//        // Verify error message display correctly
//        Assert.assertEquals(errorMessage, "Please enter a valid email address. For example johndoe@domain.com.");
//    }
// 
//    @Test
//    public void Test03_LoginWithIncorectPassword() throws Exception {
//        driver.get("http://live.guru99.com/index.php/customer/account/login/");
//        Thread.sleep(8000);
//        // Input correct Username
//        driver.findElement(By.id("email")).sendKeys("automation@gmail.com");
//        // Input correct Password
//        driver.findElement(By.id("pass")).sendKeys("123");
//        // Click Login button
//        driver.findElement(By.id("send2")).click();
//        Thread.sleep(3000);
//        // Get error message at 'Password' field
//        String errorPassword = driver.findElement(By.id("advice-validate-password-pass")).getText();
//        // Verify message display correctly
//        Assert.assertEquals(errorPassword,
//        "Please enter 6 or more characters. Leading or trailing spaces will be ignored.");
//    }
// 
    @Test
    public void Test04_LoginWithCorrectEmailPassword() throws Exception {
    driver.get("http://localhost:8080/shop/login.jsp");
    Thread.sleep(5000);
    // Input correct Username
    driver.findElement(By.name("email")).sendKeys("nguyen.nah76@gmail.com");
    // Input correct Password
    driver.findElement(By.name("pass")).sendKeys("123456");
    // Click Login button
    driver.findElement(By.name("command")).click();
    Thread.sleep(5000);
    // Verify that 'Search' textbox display correctly
    
    }
// 
// @Test
// public void Test05_SearchAnItemSuccessfully() throws Exception {
// driver.get("http://live.guru99.com/index.php/customer/account/login/");
// Thread.sleep(5000);
// // Input data and click Search
// driver.findElement(By.id("search")).sendKeys("SAMSUNG GALAXY");
// driver.findElement(By.id("search")).sendKeys(Keys.ENTER);
// Thread.sleep(5000);
// // Verify that 'Samsung Galaxy' item display correctly
// driver.findElement(By.id("product-collection-image-3")).isDisplayed();
// }
//    
    /**
     *
     */
    @AfterClass
    public static void tearDown() {
        //driver.quit();
    }
}
