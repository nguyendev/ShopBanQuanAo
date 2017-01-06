/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Selenium;

import dao.UsersDAO;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import tools.LibraryClass;

/**
 *
 * @author NguyenIT
 */
public class AccountTest {
    private static WebDriver driver;
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
   @Before
    public void setUp() {
        System.out.println("------------- Bat dau test -----------------");
        System.setProperty("webdriver.chrome.driver",LibraryClass.driverChrome);
        // Khởi tạo trình duyệt Firefox
        driver = new ChromeDriver();
    }
    @Test
    public void Test04_LoginSuccess() throws Exception {
        driver.get(LibraryClass.loginUrl);
        Thread.sleep(2000);
        /*Dang nhap*/
        // Input correct Username
        driver.findElement(By.name("email")).sendKeys("nguyen.nah76@gmail.com");
        // Input correct Password
        driver.findElement(By.name("pass")).sendKeys("123456");
        // Click Login button
        driver.findElement(By.name("command")).click();
        String result = driver.findElement(By.id("getUserEmail")).getText();
        Assert.assertEquals("nguyen.nah76@gmail.com", result);  
        System.out.println("------------- LoginSuccess -----------------");
    }
    @Test
    public void Test01_LoginWithEmptyEmailPassword() throws Exception {
        driver.get(LibraryClass.loginUrl);
        // Mở rộng cửa sổ trình duyệt lớn nhất
        //driver.manage().window().maximize();
        Thread.sleep(1000);
        // Click Login button
        driver.findElement(By.name("command")).click();
        Thread.sleep(2000);
        //Get error message at 'Email Address' field
        String error = driver.findElement(By.id("errormess")).getText();
        // Verify error message display correctly
        Assert.assertEquals("Sai tên người dùng hoặc mật khẩu!", error);
        System.out.println("------------- Test01_LoginWithEmptyEmailPassword -----------------");
    }
//    
    @Test
    public void Test02_LoginWithInvalidEmail() throws Exception {
        driver.get(LibraryClass.loginUrl);
        Thread.sleep(1000);
        // Input correct Username
        driver.findElement(By.name("email")).sendKeys("nguyen.nah76@gmail.com");
        // Click Login button
        driver.findElement(By.name("command")).click();
        Thread.sleep(2000);
        // Get error message is displayed
        String error = driver.findElement(By.id("errormess")).getText();
        // Verify error message display correctly
        Assert.assertEquals("Sai tên người dùng hoặc mật khẩu!", error);
         System.out.println("------------- Test02_LoginWithInvalidEmail -----------------");
    }
// 
    @Test
    public void Test03_LoginWithIncorectPassword() throws Exception {
        driver.get(LibraryClass.loginUrl);
        Thread.sleep(8000);
        // Input correct Username
        driver.findElement(By.name("email")).sendKeys("nguyen.nah76@gmail.com");
        // Input correct Password
        driver.findElement(By.name("pass")).sendKeys("123");
        // Click Login button
        driver.findElement(By.name("command")).click();
        Thread.sleep(3000);
        String error = driver.findElement(By.id("errormess")).getText();
        // Verify error message display correctly
        Assert.assertEquals("Sai tên người dùng hoặc mật khẩu!", error);
        System.out.println("------------- Test03_LoginWithIncorectPassword -----------------");
    }
    
    @Test
    public void Test05_RegisterSuccess() throws Exception {
        driver.get(LibraryClass.registerUrl);
        
        UsersDAO instance = new UsersDAO();
        boolean expResult = true;
        boolean result1 = instance.deleteUserFromEmail("RegisterSuccess@gmail.com");
 
        Thread.sleep(2000);
        // Input correct Username
        driver.findElement(By.name("email")).sendKeys("RegisterSuccess@gmail.com");
        // Input correct Password
        driver.findElement(By.name("pass")).sendKeys("123456");
        // Input Confirm Password
        driver.findElement(By.name("pass2")).sendKeys("123456");
        // Click Register button
        driver.findElement(By.name("command")).click();
        Thread.sleep(2000);
        String result = driver.getCurrentUrl();
        assertEquals(LibraryClass.userUrl, result);   
        
        //Delete user after test register
        result1 = instance.deleteUserFromEmail("RegisterSuccess@gmail.com");
        System.out.println("------------- Test05_RegisterSuccess -----------------");
    }
    
    @Test
    public void Test05_RegisterPassNotMatch() throws Exception {
        driver.get(LibraryClass.registerUrl);
        
        UsersDAO instance = new UsersDAO();
        boolean expResult = true;
        boolean result1 = instance.deleteUserFromEmail("RegisterSuccess@gmail.com");
 
        Thread.sleep(2000);
        // Input correct Username
        driver.findElement(By.name("email")).sendKeys("RegisterSuccess@gmail.com");
        // Input correct Password
        driver.findElement(By.name("pass")).sendKeys("1234567");
        // Input Confirm Password
        driver.findElement(By.name("pass2")).sendKeys("123456");
        // Click Register button  
        String result = driver.findElement(By.id("message")).getText();
        assertEquals("Not Matching", result);   
        //Delete user after test register
        result1 = instance.deleteUserFromEmail("RegisterSuccess@gmail.com");
        System.out.println("------------- Test05_RegisterSuccess -----------------");
    }
    
    
 
    @After
    public void tearDown() {
        System.out.println("------------- Ket thuc test -----------------");
        driver.quit();
    } 
    
    
}
