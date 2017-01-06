/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Selenium;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import tools.LibraryClass;

/**
 *
 * @author NguyenIT
 */
public class CheckoutTest {
    private static WebDriver driver;
    
    @Before
    public void setUp(){
        System.out.println("------------- Bat dau test -----------------");
        System.setProperty("webdriver.chrome.driver",LibraryClass.driverChrome);
        // Khởi tạo trình duyệt Firefox
        driver = new ChromeDriver();
    }
    @Test
    public void Test04_CheckoutSuccess() throws Exception {
        driver.get(LibraryClass.loginUrl);
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
    @Test
    public void Test04_CannotCheckout_NoProductPicked() throws Exception {
        driver.get(LibraryClass.loginUrl);
        Thread.sleep(2000);

        /*Dang nhap*/
        // Input correct Username
        driver.findElement(By.name("email")).sendKeys("nguyen.nah76@gmail.com");
        // Input correct Password
        driver.findElement(By.name("pass")).sendKeys("123456");
        // Click Login button
        driver.findElement(By.name("command")).click();

        // vào mục cart
        Thread.sleep(1000);
        driver.findElement(By.id("cart")).click();
        String result =  driver.findElement(By.id("checkoutfalse")).getText();
        Assert.assertEquals("Quay lại đặt hàng", result);
    }
    
    @Test
    public void Test04_CannotCheckout_NoEmailInfo() throws Exception {
        driver.get(LibraryClass.loginUrl);
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
        // link hiện tại vẫn giữ nguyên
        Assert.assertEquals("http://localhost:8080/shop/checkout.jsp", driver.getCurrentUrl());
    }
    
    @Test
    public void Test04_CannotCheckout_NoFullnameInfo() throws Exception {
        driver.get(LibraryClass.loginUrl);
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
        driver.findElement(By.id("checkoutprovincial")).sendKeys("Hồ Chí Minh");
        driver.findElement(By.id("checkoutaddress")).sendKeys("Hồ Chí Minh");
        driver.findElement(By.id("checkoutaddress1")).sendKeys("Đồng Tháp");
        driver.findElement(By.id("checkoutphonenumber")).sendKeys("0968784717");
        driver.findElement(By.id("checkoutpayment")).sendKeys("Live");
        driver.findElement(By.id("checkoutmessage")).sendKeys("Kiểm tra");
        Thread.sleep(1000);
        driver.findElement(By.id("checkoutsubmit")).click();
        Thread.sleep(1000);
        // link hiện tại vẫn giữ nguyên
        Assert.assertEquals("http://localhost:8080/shop/checkout.jsp", driver.getCurrentUrl());
    }
    
    @Test
    public void Test04_CannotCheckout_NoAddress1Info() throws Exception {
        driver.get(LibraryClass.loginUrl);
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
        driver.findElement(By.id("checkoutaddress1")).sendKeys("Đồng Tháp");
        driver.findElement(By.id("checkoutphonenumber")).sendKeys("0968784717");
        driver.findElement(By.id("checkoutpayment")).sendKeys("Live");
        driver.findElement(By.id("checkoutmessage")).sendKeys("Kiểm tra");
        Thread.sleep(1000);
        driver.findElement(By.id("checkoutsubmit")).click();
        Thread.sleep(1000);
        Assert.assertEquals("http://localhost:8080/shop/checkout.jsp", driver.getCurrentUrl());
    
    }
    
    @Test
    public void Test04_CannotCheckout_NoPhoneNumber() throws Exception {
        driver.get(LibraryClass.loginUrl);
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
        driver.findElement(By.id("checkoutpayment")).sendKeys("Live");
        driver.findElement(By.id("checkoutmessage")).sendKeys("Kiểm tra");
        Thread.sleep(1000);
        driver.findElement(By.id("checkoutsubmit")).click();
        Thread.sleep(1000);
        String result =  driver.findElement(By.id("countItem")).getText();
        Assert.assertEquals("http://localhost:8080/shop/checkout.jsp", driver.getCurrentUrl());
    }
    @After
    public void tearDown() {
        System.out.println("------------- Ket thuc test -----------------");
        driver.quit();
    }
}
