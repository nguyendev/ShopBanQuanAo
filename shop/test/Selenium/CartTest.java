/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Selenium;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import tools.LibraryClass;

/**
 *
 * @author duy tung dao
 */
public class CartTest {
    private WebDriver driver;
    public CartTest() {
    }
    
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
    
    @After
    public void tearDown() {
        System.out.println("------------- Ket thuc test -----------------");
        driver.close();
    }
    @Test
    public void Test04_AddToCartSuccess() throws Exception {
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
        Thread.sleep(1000);
        driver.findElement(By.id("1")).click();
        Thread.sleep(1000);
        // lấy nội dung thẻ có tên là nameProduct, id là 1
        String inputName=null;
        for (WebElement product : driver.findElements(By.name("nameProduct"))) {
            // nếu product có id là 1 thì gán name vào
            if(product.getAttribute("id").equals("1"))
                 inputName = product.getText();
        }
       
        // check trong giỏ hàng xem có hàng có id là 1, tên đúng chưa
        Thread.sleep(1000);
        driver.findElement(By.id("cart")).click();
        Thread.sleep(1000);
        String resultName =  driver.findElement(By.id("1")).getText();
        Assert.assertEquals(inputName, resultName);
    }
    @Test
    public void Test04_RemoveFromCartSuccess() throws Exception {
        // thêm vào giỏ trước
        driver.get(LibraryClass.loginUrl);
        Thread.sleep(2000);

        /*Dang nhap*/
        // Input correct Username
        driver.findElement(By.name("email")).sendKeys("nguyen.nah76@gmail.com");
        // Input correct Password
        driver.findElement(By.name("pass")).sendKeys("123456");
        // Click Login button
        driver.findElement(By.name("command")).click();

        /* thêm vào giỏ hang */
        Thread.sleep(1000);
        driver.findElement(By.id("1")).click();
        // vào giỏ hàng
        Thread.sleep(1000);
        driver.findElement(By.id("cart")).click();
        Thread.sleep(1000);
        // Nhấn nút xóa
        for (WebElement delProductButton : driver.findElements(By.className("cart_quantity_delete"))) {
            // nếu product có id là 1 thì click vào
            if(delProductButton.getAttribute("id").equals("1"))
                 delProductButton.click();
        }
        Thread.sleep(1000);
        WebElement currentItem = null;
        for (WebElement delProductButton : driver.findElements(By.className("cart_quantity_delete"))) {
            // nếu product có id là 1 gán cho current item
            if(delProductButton.getAttribute("id").equals("1"))
                 currentItem = delProductButton;
        }
        // nếu không tồn tại current item đó nữa thì thành công
        assertNull(currentItem);
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
